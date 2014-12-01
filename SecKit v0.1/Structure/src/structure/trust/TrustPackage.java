/**
 */
package structure.trust;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import trust.instance.InstancePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see structure.trust.TrustFactory
 * @model kind="package"
 * @generated
 */
public interface TrustPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "trust";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://structure/trust/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "structure-trust";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TrustPackage eINSTANCE = structure.trust.impl.TrustPackageImpl.init();

    /**
     * The meta object id for the '{@link structure.trust.impl.StructuralQualityImpl <em>Structural Quality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.trust.impl.StructuralQualityImpl
     * @see structure.trust.impl.TrustPackageImpl#getStructuralQuality()
     * @generated
     */
    int STRUCTURAL_QUALITY = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_QUALITY__VISUAL_ELEMENTS = InstancePackage.TRUST_ASPECT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_QUALITY__ID = InstancePackage.TRUST_ASPECT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_QUALITY__NAME = InstancePackage.TRUST_ASPECT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_QUALITY__DESCRIPTION = InstancePackage.TRUST_ASPECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Entity Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_QUALITY__ENTITY_TYPE = InstancePackage.TRUST_ASPECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Activity Point Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_QUALITY__ACTIVITY_POINT_TYPE = InstancePackage.TRUST_ASPECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Structural Quality</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_QUALITY_FEATURE_COUNT = InstancePackage.TRUST_ASPECT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Structural Quality</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_QUALITY_OPERATION_COUNT = InstancePackage.TRUST_ASPECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.trust.impl.ResistanceToTamperingImpl <em>Resistance To Tampering</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.trust.impl.ResistanceToTamperingImpl
     * @see structure.trust.impl.TrustPackageImpl#getResistanceToTampering()
     * @generated
     */
    int RESISTANCE_TO_TAMPERING = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESISTANCE_TO_TAMPERING__VISUAL_ELEMENTS = STRUCTURAL_QUALITY__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESISTANCE_TO_TAMPERING__ID = STRUCTURAL_QUALITY__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESISTANCE_TO_TAMPERING__NAME = STRUCTURAL_QUALITY__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESISTANCE_TO_TAMPERING__DESCRIPTION = STRUCTURAL_QUALITY__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Entity Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESISTANCE_TO_TAMPERING__ENTITY_TYPE = STRUCTURAL_QUALITY__ENTITY_TYPE;

    /**
     * The feature id for the '<em><b>Activity Point Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESISTANCE_TO_TAMPERING__ACTIVITY_POINT_TYPE = STRUCTURAL_QUALITY__ACTIVITY_POINT_TYPE;

    /**
     * The feature id for the '<em><b>Is Tpm Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESISTANCE_TO_TAMPERING__IS_TPM_ENABLED = STRUCTURAL_QUALITY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Resistance To Tampering</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESISTANCE_TO_TAMPERING_FEATURE_COUNT = STRUCTURAL_QUALITY_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Resistance To Tampering</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESISTANCE_TO_TAMPERING_OPERATION_COUNT = STRUCTURAL_QUALITY_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link structure.trust.StructuralQuality <em>Structural Quality</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Structural Quality</em>'.
     * @see structure.trust.StructuralQuality
     * @generated
     */
    EClass getStructuralQuality();

    /**
     * Returns the meta object for the reference '{@link structure.trust.StructuralQuality#getEntityType <em>Entity Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Entity Type</em>'.
     * @see structure.trust.StructuralQuality#getEntityType()
     * @see #getStructuralQuality()
     * @generated
     */
    EReference getStructuralQuality_EntityType();

    /**
     * Returns the meta object for the reference '{@link structure.trust.StructuralQuality#getActivityPointType <em>Activity Point Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Activity Point Type</em>'.
     * @see structure.trust.StructuralQuality#getActivityPointType()
     * @see #getStructuralQuality()
     * @generated
     */
    EReference getStructuralQuality_ActivityPointType();

    /**
     * Returns the meta object for class '{@link structure.trust.ResistanceToTampering <em>Resistance To Tampering</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Resistance To Tampering</em>'.
     * @see structure.trust.ResistanceToTampering
     * @generated
     */
    EClass getResistanceToTampering();

    /**
     * Returns the meta object for the attribute '{@link structure.trust.ResistanceToTampering#isIsTpmEnabled <em>Is Tpm Enabled</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Tpm Enabled</em>'.
     * @see structure.trust.ResistanceToTampering#isIsTpmEnabled()
     * @see #getResistanceToTampering()
     * @generated
     */
    EAttribute getResistanceToTampering_IsTpmEnabled();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TrustFactory getTrustFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link structure.trust.impl.StructuralQualityImpl <em>Structural Quality</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.trust.impl.StructuralQualityImpl
         * @see structure.trust.impl.TrustPackageImpl#getStructuralQuality()
         * @generated
         */
        EClass STRUCTURAL_QUALITY = eINSTANCE.getStructuralQuality();

        /**
         * The meta object literal for the '<em><b>Entity Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STRUCTURAL_QUALITY__ENTITY_TYPE = eINSTANCE.getStructuralQuality_EntityType();

        /**
         * The meta object literal for the '<em><b>Activity Point Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STRUCTURAL_QUALITY__ACTIVITY_POINT_TYPE = eINSTANCE.getStructuralQuality_ActivityPointType();

        /**
         * The meta object literal for the '{@link structure.trust.impl.ResistanceToTamperingImpl <em>Resistance To Tampering</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.trust.impl.ResistanceToTamperingImpl
         * @see structure.trust.impl.TrustPackageImpl#getResistanceToTampering()
         * @generated
         */
        EClass RESISTANCE_TO_TAMPERING = eINSTANCE.getResistanceToTampering();

        /**
         * The meta object literal for the '<em><b>Is Tpm Enabled</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESISTANCE_TO_TAMPERING__IS_TPM_ENABLED = eINSTANCE.getResistanceToTampering_IsTpmEnabled();

    }

} //TrustPackage
