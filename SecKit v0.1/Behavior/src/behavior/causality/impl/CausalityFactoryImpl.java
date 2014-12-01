/**
 */
package behavior.causality.impl;

import behavior.causality.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CausalityFactoryImpl extends EFactoryImpl implements CausalityFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static CausalityFactory init() {
        try {
            CausalityFactory theCausalityFactory = (CausalityFactory)EPackage.Registry.INSTANCE.getEFactory(CausalityPackage.eNS_URI);
            if (theCausalityFactory != null) {
                return theCausalityFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new CausalityFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CausalityFactoryImpl() {
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
            case CausalityPackage.EXIT_POINT_CONDITION: return createExitPointCondition();
            case CausalityPackage.ENTRY_POINT_CONDITION: return createEntryPointCondition();
            case CausalityPackage.OR_CONDITION: return createOrCondition();
            case CausalityPackage.AND_CONDITION: return createAndCondition();
            case CausalityPackage.CAUSALITY_CONDITION: return createCausalityCondition();
            case CausalityPackage.CAUSALITY_RELATION: return createCausalityRelation();
            case CausalityPackage.START_CONDITION: return createStartCondition();
            case CausalityPackage.DISABLING_CONDITION: return createDisablingCondition();
            case CausalityPackage.ENABLING_CONDITION: return createEnablingCondition();
            case CausalityPackage.SYNCHRONIZATION_CONDITION: return createSynchronizationCondition();
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
            case CausalityPackage.UNCERTAINTY:
                return createUncertaintyFromString(eDataType, initialValue);
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
            case CausalityPackage.UNCERTAINTY:
                return convertUncertaintyToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExitPointCondition createExitPointCondition() {
        ExitPointConditionImpl exitPointCondition = new ExitPointConditionImpl();
        return exitPointCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntryPointCondition createEntryPointCondition() {
        EntryPointConditionImpl entryPointCondition = new EntryPointConditionImpl();
        return entryPointCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OrCondition createOrCondition() {
        OrConditionImpl orCondition = new OrConditionImpl();
        return orCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AndCondition createAndCondition() {
        AndConditionImpl andCondition = new AndConditionImpl();
        return andCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CausalityCondition createCausalityCondition() {
        CausalityConditionImpl causalityCondition = new CausalityConditionImpl();
        return causalityCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CausalityRelation createCausalityRelation() {
        CausalityRelationImpl causalityRelation = new CausalityRelationImpl();
        return causalityRelation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StartCondition createStartCondition() {
        StartConditionImpl startCondition = new StartConditionImpl();
        return startCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DisablingCondition createDisablingCondition() {
        DisablingConditionImpl disablingCondition = new DisablingConditionImpl();
        return disablingCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EnablingCondition createEnablingCondition() {
        EnablingConditionImpl enablingCondition = new EnablingConditionImpl();
        return enablingCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SynchronizationCondition createSynchronizationCondition() {
        SynchronizationConditionImpl synchronizationCondition = new SynchronizationConditionImpl();
        return synchronizationCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Uncertainty createUncertaintyFromString(EDataType eDataType, String initialValue) {
        Uncertainty result = Uncertainty.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUncertaintyToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CausalityPackage getCausalityPackage() {
        return (CausalityPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static CausalityPackage getPackage() {
        return CausalityPackage.eINSTANCE;
    }

} //CausalityFactoryImpl
