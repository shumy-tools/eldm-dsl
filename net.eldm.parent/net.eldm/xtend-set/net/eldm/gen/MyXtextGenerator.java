/**
 * Copyright (c) 2015, 2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package net.eldm.gen;

import com.google.common.collect.Iterables;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import net.eldm.gen.MyDefaultGeneratorModule;
import net.eldm.gen.MyLanguageModule;
import net.eldm.gen.MyMweIssues;
import org.apache.log4j.Logger;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.GeneratedMetamodel;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.XtextStandaloneSetup;
import org.eclipse.xtext.generator.CompositeGeneratorException;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.util.internal.Log;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xtext.generator.CodeConfig;
import org.eclipse.xtext.xtext.generator.IXtextGeneratorLanguage;
import org.eclipse.xtext.xtext.generator.XtextGeneratorLanguage;
import org.eclipse.xtext.xtext.generator.XtextGeneratorStandaloneSetup;
import org.eclipse.xtext.xtext.generator.XtextGeneratorTemplates;
import org.eclipse.xtext.xtext.generator.model.IXtextGeneratorFileSystemAccess;
import org.eclipse.xtext.xtext.generator.model.project.IXtextProjectConfig;

/**
 * The Xtext language infrastructure generator. Use the {@code configuration} block to add general
 * configuration for your Xtext project and the generated code, e.g.
 * <pre>
 * configuration = {
 *     project = model.project.StandardProjectConfig {
 *         baseName = "org.example.language"
 *         rootPath = ".."
 *     }
 *     code = {
 *         encoding = 'ISO-8859-1'
 *     }
 * }
 * </pre>
 * You can generate code for one or more Xtext languages within the same project. For each language,
 * add a {@code language} block, e.g.
 * <pre>
 * language = StandardLanguage {
 *     name = "org.example.language.MyExampleLanguage"
 * }
 * </pre>
 * 
 * @noextend This class should not be extended by clients.
 */
@Log
@SuppressWarnings("all")
public class MyXtextGenerator extends AbstractWorkflowComponent2 {
  @Accessors
  private MyDefaultGeneratorModule configuration = new MyDefaultGeneratorModule();
  
  @Accessors
  private final List<XtextGeneratorLanguage> languageConfigs = CollectionLiterals.<XtextGeneratorLanguage>newArrayList();
  
  @Accessors
  private XtextGeneratorStandaloneSetup standaloneSetup = new XtextGeneratorStandaloneSetup();
  
  @Accessors
  private String grammarEncoding;
  
  private Injector injector;
  
  @Inject
  private IXtextProjectConfig projectConfig;
  
  @Inject
  private XtextGeneratorTemplates templates;
  
  public MyXtextGenerator() {
    new XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
  
  /**
   * Add a language configuration to be included in the code generation process.
   */
  public void addLanguage(final XtextGeneratorLanguage language) {
    this.languageConfigs.add(language);
  }
  
  @Override
  protected void checkConfigurationInternal(final Issues issues) {
    this.initialize();
    final MyMweIssues generatorIssues = new MyMweIssues(this, issues);
    this.configuration.checkConfiguration(generatorIssues);
    final HashMap<String, Grammar> uris = new HashMap<String, Grammar>();
    for (final XtextGeneratorLanguage language : this.languageConfigs) {
      {
        language.checkConfiguration(generatorIssues);
        Iterable<GeneratedMetamodel> _filter = Iterables.<GeneratedMetamodel>filter(language.getGrammar().getMetamodelDeclarations(), GeneratedMetamodel.class);
        for (final GeneratedMetamodel generatedMetamodel : _filter) {
          {
            final String nsURI = generatedMetamodel.getEPackage().getNsURI();
            boolean _containsKey = uris.containsKey(nsURI);
            if (_containsKey) {
              String _name = uris.get(nsURI).getName();
              String _plus = ((("Duplicate generated grammar with nsURI \'" + nsURI) + "\' in ") + _name);
              String _plus_1 = (_plus + " and ");
              String _name_1 = language.getGrammar().getName();
              String _plus_2 = (_plus_1 + _name_1);
              generatorIssues.addError(_plus_2);
            } else {
              uris.put(nsURI, language.getGrammar());
            }
          }
        }
      }
    }
  }
  
  public void initialize() {
    if ((this.injector == null)) {
      MyXtextGenerator.LOG.info("Initializing Xtext generator");
      new StandaloneSetup().addRegisterGeneratedEPackage("org.eclipse.xtext.common.types.TypesPackage");
      this.initializeEncoding();
      this.injector = this.createInjector();
      this.injector.injectMembers(this);
      CodeConfig _instance = this.injector.<CodeConfig>getInstance(CodeConfig.class);
      final Procedure1<CodeConfig> _function = (CodeConfig it) -> {
        it.initialize(this.injector);
      };
      ObjectExtensions.<CodeConfig>operator_doubleArrow(_instance, _function);
      this.projectConfig.initialize(this.injector);
      this.standaloneSetup.initialize(this.injector);
      for (final XtextGeneratorLanguage language : this.languageConfigs) {
        {
          final Injector languageInjector = this.createLanguageInjector(this.injector, language);
          language.initialize(languageInjector);
        }
      }
    }
  }
  
  protected void initializeEncoding() {
    final IResourceServiceProvider.Registry serviceProviderRegistry = IResourceServiceProvider.Registry.INSTANCE;
    Object _get = serviceProviderRegistry.getExtensionToFactoryMap().get("xtext");
    final IResourceServiceProvider serviceProvider = ((IResourceServiceProvider) _get);
    String _elvis = null;
    if (this.grammarEncoding != null) {
      _elvis = this.grammarEncoding;
    } else {
      String _encoding = this.configuration.getCode().getEncoding();
      _elvis = _encoding;
    }
    final String encoding = _elvis;
    if (((serviceProvider != null) && (encoding != null))) {
      final IEncodingProvider encodingProvider = serviceProvider.<IEncodingProvider>get(IEncodingProvider.class);
      if ((encodingProvider instanceof IEncodingProvider.Runtime)) {
        ((IEncodingProvider.Runtime)encodingProvider).setDefaultEncoding(encoding);
      }
    }
  }
  
  protected Injector createInjector() {
    return Guice.createInjector(this.configuration);
  }
  
  protected Injector createLanguageInjector(final Injector parent, final XtextGeneratorLanguage language) {
    MyLanguageModule _myLanguageModule = new MyLanguageModule(language);
    return parent.createChildInjector(_myLanguageModule);
  }
  
  @Override
  protected void invokeInternal(final WorkflowContext ctx, final ProgressMonitor monitor, final Issues issues) {
    this.initialize();
    try {
      for (final XtextGeneratorLanguage language : this.languageConfigs) {
        try {
          String _name = language.getGrammar().getName();
          String _plus = ("Generating " + _name);
          MyXtextGenerator.LOG.info(_plus);
          language.generate();
          this.generateSetups(language);
          this.generateModules(language);
          this.generateExecutableExtensionFactory(language);
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            final Exception e = (Exception)_t;
            this.handleException(e, issues);
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
      MyXtextGenerator.LOG.info("Generating common infrastructure");
    } catch (final Throwable _t_1) {
      if (_t_1 instanceof Exception) {
        final Exception e_1 = (Exception)_t_1;
        this.handleException(e_1, issues);
      } else {
        throw Exceptions.sneakyThrow(_t_1);
      }
    }
  }
  
  private void handleException(final Exception ex, final Issues issues) {
    if ((ex instanceof CompositeGeneratorException)) {
      final Consumer<Exception> _function = (Exception it) -> {
        this.handleException(it, issues);
      };
      ((CompositeGeneratorException)ex).getExceptions().forEach(_function);
    } else {
      issues.addError(this, "GeneratorException: ", null, ex, null);
    }
  }
  
  protected void generateSetups(final IXtextGeneratorLanguage language) {
    this.templates.createRuntimeGenSetup(language).writeTo(this.projectConfig.getRuntime().getSrcGen());
    this.templates.createRuntimeSetup(language).writeTo(this.projectConfig.getRuntime().getSrc());
    this.templates.createIdeSetup(language).writeTo(this.projectConfig.getGenericIde().getSrc());
    this.templates.createWebSetup(language).writeTo(this.projectConfig.getWeb().getSrc());
  }
  
  protected void generateModules(final IXtextGeneratorLanguage language) {
    this.templates.createRuntimeGenModule(language).writeTo(this.projectConfig.getRuntime().getSrcGen());
    this.templates.createRuntimeModule(language).writeTo(this.projectConfig.getRuntime().getSrc());
    this.templates.createIdeModule(language).writeTo(this.projectConfig.getGenericIde().getSrc());
    this.templates.createIdeGenModule(language).writeTo(this.projectConfig.getGenericIde().getSrcGen());
    this.templates.createEclipsePluginGenModule(language).writeTo(this.projectConfig.getEclipsePlugin().getSrcGen());
    this.templates.createEclipsePluginModule(language).writeTo(this.projectConfig.getEclipsePlugin().getSrc());
    this.templates.createIdeaGenModule(language).writeTo(this.projectConfig.getIdeaPlugin().getSrcGen());
    this.templates.createIdeaModule(language).writeTo(this.projectConfig.getIdeaPlugin().getSrc());
    this.templates.createWebGenModule(language).writeTo(this.projectConfig.getWeb().getSrcGen());
    this.templates.createWebModule(language).writeTo(this.projectConfig.getWeb().getSrc());
  }
  
  protected void generateExecutableExtensionFactory(final IXtextGeneratorLanguage language) {
    IXtextGeneratorFileSystemAccess _srcGen = this.projectConfig.getEclipsePlugin().getSrcGen();
    boolean _tripleNotEquals = (_srcGen != null);
    if (_tripleNotEquals) {
      this.templates.createEclipsePluginExecutableExtensionFactory(language, IterableExtensions.<XtextGeneratorLanguage>head(this.languageConfigs)).writeTo(this.projectConfig.getEclipsePlugin().getSrcGen());
    }
  }
  
  private final static Logger LOG = Logger.getLogger(MyXtextGenerator.class);
  
  @Pure
  public MyDefaultGeneratorModule getConfiguration() {
    return this.configuration;
  }
  
  public void setConfiguration(final MyDefaultGeneratorModule configuration) {
    this.configuration = configuration;
  }
  
  @Pure
  public List<XtextGeneratorLanguage> getLanguageConfigs() {
    return this.languageConfigs;
  }
  
  @Pure
  public XtextGeneratorStandaloneSetup getStandaloneSetup() {
    return this.standaloneSetup;
  }
  
  public void setStandaloneSetup(final XtextGeneratorStandaloneSetup standaloneSetup) {
    this.standaloneSetup = standaloneSetup;
  }
  
  @Pure
  public String getGrammarEncoding() {
    return this.grammarEncoding;
  }
  
  public void setGrammarEncoding(final String grammarEncoding) {
    this.grammarEncoding = grammarEncoding;
  }
}
