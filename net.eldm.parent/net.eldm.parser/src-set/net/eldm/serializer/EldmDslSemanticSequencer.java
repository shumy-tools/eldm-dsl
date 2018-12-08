/*
 * generated by Xtext 2.15.0
 */
package net.eldm.serializer;

import com.google.inject.Inject;
import java.util.Set;
import net.eldm.eldmDsl.BoolLiteral;
import net.eldm.eldmDsl.EldmDslPackage;
import net.eldm.eldmDsl.ElementTypeDef;
import net.eldm.eldmDsl.EnumDef;
import net.eldm.eldmDsl.EnumItemDef;
import net.eldm.eldmDsl.EnumLiteral;
import net.eldm.eldmDsl.ExternalDef;
import net.eldm.eldmDsl.FltLiteral;
import net.eldm.eldmDsl.Import;
import net.eldm.eldmDsl.IntLiteral;
import net.eldm.eldmDsl.LambdaDef;
import net.eldm.eldmDsl.ListDef;
import net.eldm.eldmDsl.ListLiteral;
import net.eldm.eldmDsl.Literal;
import net.eldm.eldmDsl.MapDef;
import net.eldm.eldmDsl.MapEntryDef;
import net.eldm.eldmDsl.MapEntryLiteral;
import net.eldm.eldmDsl.MapLiteral;
import net.eldm.eldmDsl.Operation;
import net.eldm.eldmDsl.OperationCall;
import net.eldm.eldmDsl.ParamDef;
import net.eldm.eldmDsl.PatternLiteral;
import net.eldm.eldmDsl.PlugDsl;
import net.eldm.eldmDsl.StrLiteral;
import net.eldm.eldmDsl.SubPath;
import net.eldm.eldmDsl.TypeDef;
import net.eldm.eldmDsl.ValueDef;
import net.eldm.eldmDsl.VariableDef;
import net.eldm.services.EldmDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class EldmDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EldmDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EldmDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EldmDslPackage.BOOL_LITERAL:
				sequence_BoolLiteral(context, (BoolLiteral) semanticObject); 
				return; 
			case EldmDslPackage.ELEMENT_TYPE_DEF:
				sequence_ElementTypeDef(context, (ElementTypeDef) semanticObject); 
				return; 
			case EldmDslPackage.ENUM_DEF:
				sequence_EnumDef(context, (EnumDef) semanticObject); 
				return; 
			case EldmDslPackage.ENUM_ITEM_DEF:
				sequence_EnumItemDef(context, (EnumItemDef) semanticObject); 
				return; 
			case EldmDslPackage.ENUM_LITERAL:
				sequence_EnumLiteral(context, (EnumLiteral) semanticObject); 
				return; 
			case EldmDslPackage.EXTERNAL_DEF:
				sequence_ExternalDef(context, (ExternalDef) semanticObject); 
				return; 
			case EldmDslPackage.FLT_LITERAL:
				sequence_FltLiteral(context, (FltLiteral) semanticObject); 
				return; 
			case EldmDslPackage.IMPORT:
				if (rule == grammarAccess.getImportDefinitionRule()) {
					sequence_ImportDefinition(context, (Import) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getImportRule()) {
					sequence_ImportDefinition_ImportOperation(context, (Import) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getImportOperationRule()) {
					sequence_ImportOperation(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case EldmDslPackage.INT_LITERAL:
				sequence_IntLiteral(context, (IntLiteral) semanticObject); 
				return; 
			case EldmDslPackage.LAMBDA_DEF:
				sequence_LambdaDef(context, (LambdaDef) semanticObject); 
				return; 
			case EldmDslPackage.LIST_DEF:
				sequence_ListDef(context, (ListDef) semanticObject); 
				return; 
			case EldmDslPackage.LIST_LITERAL:
				sequence_ListLiteral(context, (ListLiteral) semanticObject); 
				return; 
			case EldmDslPackage.LITERAL:
				sequence_Literal(context, (Literal) semanticObject); 
				return; 
			case EldmDslPackage.MAP_DEF:
				sequence_MapDef(context, (MapDef) semanticObject); 
				return; 
			case EldmDslPackage.MAP_ENTRY_DEF:
				sequence_MapEntryDef(context, (MapEntryDef) semanticObject); 
				return; 
			case EldmDslPackage.MAP_ENTRY_LITERAL:
				sequence_MapEntryLiteral(context, (MapEntryLiteral) semanticObject); 
				return; 
			case EldmDslPackage.MAP_LITERAL:
				sequence_MapLiteral(context, (MapLiteral) semanticObject); 
				return; 
			case EldmDslPackage.MODULE:
				sequence_Module(context, (net.eldm.eldmDsl.Module) semanticObject); 
				return; 
			case EldmDslPackage.OPERATION:
				sequence_Operation(context, (Operation) semanticObject); 
				return; 
			case EldmDslPackage.OPERATION_CALL:
				sequence_OperationCall(context, (OperationCall) semanticObject); 
				return; 
			case EldmDslPackage.PARAM_DEF:
				sequence_ParamDef(context, (ParamDef) semanticObject); 
				return; 
			case EldmDslPackage.PATTERN_LITERAL:
				sequence_PatternLiteral(context, (PatternLiteral) semanticObject); 
				return; 
			case EldmDslPackage.PLUG_DSL:
				sequence_PlugDsl(context, (PlugDsl) semanticObject); 
				return; 
			case EldmDslPackage.STR_LITERAL:
				sequence_StrLiteral(context, (StrLiteral) semanticObject); 
				return; 
			case EldmDslPackage.SUB_PATH:
				sequence_SubPath(context, (SubPath) semanticObject); 
				return; 
			case EldmDslPackage.TYPE_DEF:
				sequence_TypeDef(context, (TypeDef) semanticObject); 
				return; 
			case EldmDslPackage.VALUE_DEF:
				sequence_ValueDef(context, (ValueDef) semanticObject); 
				return; 
			case EldmDslPackage.VARIABLE_DEF:
				sequence_VariableDef(context, (VariableDef) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Literal returns BoolLiteral
	 *     BoolLiteral returns BoolLiteral
	 *
	 * Constraint:
	 *     isTrue?='true'?
	 */
	protected void sequence_BoolLiteral(ISerializationContext context, BoolLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ElementTypeDef returns ElementTypeDef
	 *
	 * Constraint:
	 *     ref=[Definition|ID]
	 */
	protected void sequence_ElementTypeDef(ISerializationContext context, ElementTypeDef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EldmDslPackage.Literals.ELEMENT_TYPE_DEF__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EldmDslPackage.Literals.ELEMENT_TYPE_DEF__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getElementTypeDefAccess().getRefDefinitionIDTerminalRuleCall_1_0_1(), semanticObject.eGet(EldmDslPackage.Literals.ELEMENT_TYPE_DEF__REF, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns EnumDef
	 *     EnumDef returns EnumDef
	 *
	 * Constraint:
	 *     (name=ID type=MapDef defs+=EnumItemDef+)
	 */
	protected void sequence_EnumDef(ISerializationContext context, EnumDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EnumItemDef returns EnumItemDef
	 *
	 * Constraint:
	 *     (name=ID value=MapLiteral)
	 */
	protected void sequence_EnumItemDef(ISerializationContext context, EnumItemDef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EldmDslPackage.Literals.ENUM_ITEM_DEF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EldmDslPackage.Literals.ENUM_ITEM_DEF__NAME));
			if (transientValues.isValueTransient(semanticObject, EldmDslPackage.Literals.ENUM_ITEM_DEF__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EldmDslPackage.Literals.ENUM_ITEM_DEF__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEnumItemDefAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEnumItemDefAccess().getValueMapLiteralParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns EnumLiteral
	 *     EnumLiteral returns EnumLiteral
	 *
	 * Constraint:
	 *     ref=[EnumItemDef|ID]
	 */
	protected void sequence_EnumLiteral(ISerializationContext context, EnumLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EldmDslPackage.Literals.ENUM_LITERAL__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EldmDslPackage.Literals.ENUM_LITERAL__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEnumLiteralAccess().getRefEnumItemDefIDTerminalRuleCall_1_0_1(), semanticObject.eGet(EldmDslPackage.Literals.ENUM_LITERAL__REF, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExternalDef returns ExternalDef
	 *     Definition returns ExternalDef
	 *
	 * Constraint:
	 *     ((ref=ID name=ID?) | name=ID)
	 */
	protected void sequence_ExternalDef(ISerializationContext context, ExternalDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns FltLiteral
	 *     FltLiteral returns FltLiteral
	 *
	 * Constraint:
	 *     value=FLOAT
	 */
	protected void sequence_FltLiteral(ISerializationContext context, FltLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EldmDslPackage.Literals.FLT_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EldmDslPackage.Literals.FLT_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFltLiteralAccess().getValueFLOATTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ImportDefinition returns Import
	 *
	 * Constraint:
	 *     (defs+=ExternalDef defs+=ExternalDef* ref=Path)
	 */
	protected void sequence_ImportDefinition(ISerializationContext context, Import semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     ((name=Path ref=Path) | (defs+=ExternalDef defs+=ExternalDef* ref=Path))
	 */
	protected void sequence_ImportDefinition_ImportOperation(ISerializationContext context, Import semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ImportOperation returns Import
	 *
	 * Constraint:
	 *     (name=Path ref=Path)
	 */
	protected void sequence_ImportOperation(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EldmDslPackage.Literals.IMPORT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EldmDslPackage.Literals.IMPORT__NAME));
			if (transientValues.isValueTransient(semanticObject, EldmDslPackage.Literals.IMPORT__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EldmDslPackage.Literals.IMPORT__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportOperationAccess().getNamePathParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getImportOperationAccess().getRefPathParserRuleCall_2_0(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns IntLiteral
	 *     IntLiteral returns IntLiteral
	 *
	 * Constraint:
	 *     value=NATURAL
	 */
	protected void sequence_IntLiteral(ISerializationContext context, IntLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EldmDslPackage.Literals.INT_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EldmDslPackage.Literals.INT_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntLiteralAccess().getValueNATURALTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LambdaDef returns LambdaDef
	 *
	 * Constraint:
	 *     (param=ElementTypeDef result=ElementTypeDef?)
	 */
	protected void sequence_LambdaDef(ISerializationContext context, LambdaDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ElementTypeDef returns ListDef
	 *     ValueDef returns ListDef
	 *     ListDef returns ListDef
	 *
	 * Constraint:
	 *     type=ElementTypeDef
	 */
	protected void sequence_ListDef(ISerializationContext context, ListDef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EldmDslPackage.Literals.LIST_DEF__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EldmDslPackage.Literals.LIST_DEF__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getListDefAccess().getTypeElementTypeDefParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns ListLiteral
	 *     ListLiteral returns ListLiteral
	 *
	 * Constraint:
	 *     (vals+=Literal vals+=Literal*)?
	 */
	protected void sequence_ListLiteral(ISerializationContext context, ListLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns Literal
	 *
	 * Constraint:
	 *     path=Path
	 */
	protected void sequence_Literal(ISerializationContext context, Literal semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EldmDslPackage.Literals.LITERAL__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EldmDslPackage.Literals.LITERAL__PATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLiteralAccess().getPathPathParserRuleCall_8_0(), semanticObject.getPath());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ElementTypeDef returns MapDef
	 *     ValueDef returns MapDef
	 *     MapDef returns MapDef
	 *
	 * Constraint:
	 *     ((defs+=MapEntryDef defs+=MapEntryDef*) | (defs+=MapEntryDef defs+=MapEntryDef*))?
	 */
	protected void sequence_MapDef(ISerializationContext context, MapDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MapEntryDef returns MapEntryDef
	 *
	 * Constraint:
	 *     (name=ID ((opt?='?'? type=ElementTypeDef) | (opt?='=' value=Literal)))
	 */
	protected void sequence_MapEntryDef(ISerializationContext context, MapEntryDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MapEntryLiteral returns MapEntryLiteral
	 *
	 * Constraint:
	 *     (name=ID value=Literal)
	 */
	protected void sequence_MapEntryLiteral(ISerializationContext context, MapEntryLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EldmDslPackage.Literals.MAP_ENTRY_LITERAL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EldmDslPackage.Literals.MAP_ENTRY_LITERAL__NAME));
			if (transientValues.isValueTransient(semanticObject, EldmDslPackage.Literals.MAP_ENTRY_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EldmDslPackage.Literals.MAP_ENTRY_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMapEntryLiteralAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMapEntryLiteralAccess().getValueLiteralParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns MapLiteral
	 *     MapLiteral returns MapLiteral
	 *
	 * Constraint:
	 *     ((entries+=MapEntryLiteral entries+=MapEntryLiteral*) | (entries+=MapEntryLiteral entries+=MapEntryLiteral*))?
	 */
	protected void sequence_MapLiteral(ISerializationContext context, MapLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Module returns Module
	 *
	 * Constraint:
	 *     (
	 *         name=Path 
	 *         imports+=Import* 
	 *         plugs+=PlugDsl* 
	 *         defs+=Definition* 
	 *         opers+=Operation* 
	 *         paths+=SubPath*
	 *     )
	 */
	protected void sequence_Module(ISerializationContext context, net.eldm.eldmDsl.Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OperationCall returns OperationCall
	 *
	 * Constraint:
	 *     (async?='async'? isGet?='get'? ref=[Operation|Path] param=MapExpression)
	 */
	protected void sequence_OperationCall(ISerializationContext context, OperationCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Operation
	 *
	 * Constraint:
	 *     (isGet?='get'? name=Path? param=ParamDef? result=ElementTypeDef? body=BlockExpression)
	 */
	protected void sequence_Operation(ISerializationContext context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParamDef returns ParamDef
	 *
	 * Constraint:
	 *     (def=MapDef | ref=[MapDef|ID])
	 */
	protected void sequence_ParamDef(ISerializationContext context, ParamDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns PatternLiteral
	 *     PatternLiteral returns PatternLiteral
	 *
	 * Constraint:
	 *     ((native=NativePatternDef | ref=[Definition|ID]) text=TEXT)
	 */
	protected void sequence_PatternLiteral(ISerializationContext context, PatternLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PlugDsl returns PlugDsl
	 *
	 * Constraint:
	 *     (name=ID adaptor=PatternLiteral)
	 */
	protected void sequence_PlugDsl(ISerializationContext context, PlugDsl semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EldmDslPackage.Literals.PLUG_DSL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EldmDslPackage.Literals.PLUG_DSL__NAME));
			if (transientValues.isValueTransient(semanticObject, EldmDslPackage.Literals.PLUG_DSL__ADAPTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EldmDslPackage.Literals.PLUG_DSL__ADAPTOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPlugDslAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPlugDslAccess().getAdaptorPatternLiteralParserRuleCall_2_0(), semanticObject.getAdaptor());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns StrLiteral
	 *     StrLiteral returns StrLiteral
	 *
	 * Constraint:
	 *     value=TEXT
	 */
	protected void sequence_StrLiteral(ISerializationContext context, StrLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EldmDslPackage.Literals.STR_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EldmDslPackage.Literals.STR_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStrLiteralAccess().getValueTEXTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SubPath returns SubPath
	 *
	 * Constraint:
	 *     (name=Path opers+=Operation+)
	 */
	protected void sequence_SubPath(ISerializationContext context, SubPath semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns TypeDef
	 *     TypeDef returns TypeDef
	 *
	 * Constraint:
	 *     (name=ID (((parser='regex' | parser='mask' | parser='return') code=TEXT) | type=ValueDef))
	 */
	protected void sequence_TypeDef(ISerializationContext context, TypeDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ElementTypeDef returns ValueDef
	 *     ValueDef returns ValueDef
	 *
	 * Constraint:
	 *     native=NativeDef
	 */
	protected void sequence_ValueDef(ISerializationContext context, ValueDef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EldmDslPackage.Literals.VALUE_DEF__NATIVE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EldmDslPackage.Literals.VALUE_DEF__NATIVE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getValueDefAccess().getNativeNativeDefParserRuleCall_0_0(), semanticObject.getNative());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VariableDef returns VariableDef
	 *
	 * Constraint:
	 *     ((name=ID type=ElementTypeDef? right=Expression) | (mut?='mut' name=ID type=ElementTypeDef? right=Expression?))
	 */
	protected void sequence_VariableDef(ISerializationContext context, VariableDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
