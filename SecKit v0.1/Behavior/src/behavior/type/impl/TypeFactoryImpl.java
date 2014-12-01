/**
 */
package behavior.type.impl;

import behavior.type.*;

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
public class TypeFactoryImpl extends EFactoryImpl implements TypeFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TypeFactory init() {
        try {
            TypeFactory theTypeFactory = (TypeFactory)EPackage.Registry.INSTANCE.getEFactory(TypePackage.eNS_URI);
            if (theTypeFactory != null) {
                return theTypeFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new TypeFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeFactoryImpl() {
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
            case TypePackage.MONOLITHIC_BEHAVIOR_TYPE: return createMonolithicBehaviorType();
            case TypePackage.ACTION_TYPE: return createActionType();
            case TypePackage.INTERACTION_CONTRIBUTION_TYPE: return createInteractionContributionType();
            case TypePackage.INTERACTION_TYPE: return createInteractionType();
            case TypePackage.BEHAVIOR_TYPE_PACKAGE: return createBehaviorTypePackage();
            case TypePackage.ENTRY_POINT_TYPE: return createEntryPointType();
            case TypePackage.EXIT_POINT_TYPE: return createExitPointType();
            case TypePackage.BEHAVIOR_TYPE: return createBehaviorType();
            case TypePackage.STRUCTURED_BEHAVIOR_TYPE: return createStructuredBehaviorType();
            case TypePackage.DATA_PRODUCER_CHARACTERIZATION: return createDataProducerCharacterization();
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
            case TypePackage.INTERACTION_PATTERN_TYPE:
                return createInteractionPatternTypeFromString(eDataType, initialValue);
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
            case TypePackage.INTERACTION_PATTERN_TYPE:
                return convertInteractionPatternTypeToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MonolithicBehaviorType createMonolithicBehaviorType() {
        MonolithicBehaviorTypeImpl monolithicBehaviorType = new MonolithicBehaviorTypeImpl();
        return monolithicBehaviorType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionType createActionType() {
        ActionTypeImpl actionType = new ActionTypeImpl();
        return actionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionContributionType createInteractionContributionType() {
        InteractionContributionTypeImpl interactionContributionType = new InteractionContributionTypeImpl();
        return interactionContributionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionType createInteractionType() {
        InteractionTypeImpl interactionType = new InteractionTypeImpl();
        return interactionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorTypePackage createBehaviorTypePackage() {
        BehaviorTypePackageImpl behaviorTypePackage = new BehaviorTypePackageImpl();
        return behaviorTypePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntryPointType createEntryPointType() {
        EntryPointTypeImpl entryPointType = new EntryPointTypeImpl();
        return entryPointType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExitPointType createExitPointType() {
        ExitPointTypeImpl exitPointType = new ExitPointTypeImpl();
        return exitPointType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorType createBehaviorType() {
        BehaviorTypeImpl behaviorType = new BehaviorTypeImpl();
        return behaviorType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StructuredBehaviorType createStructuredBehaviorType() {
        StructuredBehaviorTypeImpl structuredBehaviorType = new StructuredBehaviorTypeImpl();
        return structuredBehaviorType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataProducerCharacterization createDataProducerCharacterization() {
        DataProducerCharacterizationImpl dataProducerCharacterization = new DataProducerCharacterizationImpl();
        return dataProducerCharacterization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionPatternType createInteractionPatternTypeFromString(EDataType eDataType, String initialValue) {
        InteractionPatternType result = InteractionPatternType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertInteractionPatternTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypePackage getTypePackage() {
        return (TypePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static TypePackage getPackage() {
        return TypePackage.eINSTANCE;
    }

} //TypeFactoryImpl
