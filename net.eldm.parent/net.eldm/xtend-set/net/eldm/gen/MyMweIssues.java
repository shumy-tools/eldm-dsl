package net.eldm.gen;

import net.eldm.gen.MyXtextGenerator;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xtext.generator.Issues;

@FinalFieldsConstructor
@SuppressWarnings("all")
public class MyMweIssues implements Issues {
  @Accessors
  private final MyXtextGenerator owner;
  
  @Accessors
  private final org.eclipse.emf.mwe.core.issues.Issues delegate;
  
  @Override
  public void addError(final String message) {
    this.delegate.addError(this.owner, message);
  }
  
  @Override
  public void addError(final String message, final Object source) {
    this.delegate.addError(this.owner, message, source);
  }
  
  @Override
  public void addWarning(final String message) {
    this.delegate.addWarning(this.owner, message);
  }
  
  @Override
  public void addWarning(final String message, final Object source) {
    this.delegate.addWarning(this.owner, message, source);
  }
  
  public MyMweIssues(final MyXtextGenerator owner, final org.eclipse.emf.mwe.core.issues.Issues delegate) {
    super();
    this.owner = owner;
    this.delegate = delegate;
  }
  
  @Pure
  public MyXtextGenerator getOwner() {
    return this.owner;
  }
  
  @Pure
  public org.eclipse.emf.mwe.core.issues.Issues getDelegate() {
    return this.delegate;
  }
}
