/**
 */
package rule.condition.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rule.condition.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionFactoryImpl extends EFactoryImpl implements ConditionFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ConditionFactory init() {
        try {
            ConditionFactory theConditionFactory = (ConditionFactory)EPackage.Registry.INSTANCE.getEFactory(ConditionPackage.eNS_URI);
            if (theConditionFactory != null) {
                return theConditionFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ConditionFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConditionFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case ConditionPackage.CONSTANT: return createConstant();
            case ConditionPackage.FORMULA_TEMPLATE: return createFormulaTemplate();
            case ConditionPackage.FORMULA_INSTANTIATION: return createFormulaInstantiation();
            case ConditionPackage.EVENT_PATTERN: return createEventPattern();
            case ConditionPackage.TIME_STEP_EVENT_PATTERN: return createTimeStepEventPattern();
            case ConditionPackage.FORMULA_VARIABLE_REFERENCE: return createFormulaVariableReference();
            case ConditionPackage.FORMULA_ASSIGNMENT: return createFormulaAssignment();
            case ConditionPackage.FORMULA_VARIABLE: return createFormulaVariable();
            case ConditionPackage.PATTERN_OPERATOR: return createPatternOperator();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case ConditionPackage.TRUTH_VALUE:
                return createTruthValueFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case ConditionPackage.TRUTH_VALUE:
                return convertTruthValueToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Constant createConstant() {
        ConstantImpl constant = new ConstantImpl();
        return constant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FormulaTemplate createFormulaTemplate() {
        FormulaTemplateImpl formulaTemplate = new FormulaTemplateImpl();
        return formulaTemplate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FormulaInstantiation createFormulaInstantiation() {
        FormulaInstantiationImpl formulaInstantiation = new FormulaInstantiationImpl();
        return formulaInstantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventPattern createEventPattern() {
        EventPatternImpl eventPattern = new EventPatternImpl();
        return eventPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeStepEventPattern createTimeStepEventPattern() {
        TimeStepEventPatternImpl timeStepEventPattern = new TimeStepEventPatternImpl();
        return timeStepEventPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FormulaVariableReference createFormulaVariableReference() {
        FormulaVariableReferenceImpl formulaVariableReference = new FormulaVariableReferenceImpl();
        return formulaVariableReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FormulaAssignment createFormulaAssignment() {
        FormulaAssignmentImpl formulaAssignment = new FormulaAssignmentImpl();
        return formulaAssignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FormulaVariable createFormulaVariable() {
        FormulaVariableImpl formulaVariable = new FormulaVariableImpl();
        return formulaVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatternOperator createPatternOperator() {
        PatternOperatorImpl patternOperator = new PatternOperatorImpl();
        return patternOperator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TruthValue createTruthValueFromString(EDataType eDataType, String initialValue) {
        TruthValue result = TruthValue.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTruthValueToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConditionPackage getConditionPackage() {
        return (ConditionPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ConditionPackage getPackage() {
        return ConditionPackage.eINSTANCE;
    }

} //ConditionFactoryImpl
