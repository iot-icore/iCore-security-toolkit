/**
 */
package structure.pattern;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see structure.pattern.PatternFactory
 * @model kind="package"
 * @generated
 */
public interface PatternPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "pattern";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://structure/pattern/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "structure-pattern";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    PatternPackage eINSTANCE = structure.pattern.impl.PatternPackageImpl.init();

    /**
     * The meta object id for the '{@link structure.pattern.impl.EntityPatternImpl <em>Entity Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.pattern.impl.EntityPatternImpl
     * @see structure.pattern.impl.PatternPackageImpl#getEntityPattern()
     * @generated
     */
    int ENTITY_PATTERN = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_PATTERN__VISUAL_ELEMENTS = ModelsPackage.PATTERN__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_PATTERN__ID = ModelsPackage.PATTERN__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_PATTERN__TYPE = ModelsPackage.PATTERN_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Instantiation Hierarchy</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_PATTERN__INSTANTIATION_HIERARCHY = ModelsPackage.PATTERN_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Variables</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_PATTERN__VARIABLES = ModelsPackage.PATTERN_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Identity Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_PATTERN__IDENTITY_PATTERN = ModelsPackage.PATTERN_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Role Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_PATTERN__ROLE_PATTERN = ModelsPackage.PATTERN_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Container Entity Pattern</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_PATTERN__CONTAINER_ENTITY_PATTERN = ModelsPackage.PATTERN_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Trust Pattern</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_PATTERN__TRUST_PATTERN = ModelsPackage.PATTERN_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Entity Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_PATTERN_FEATURE_COUNT = ModelsPackage.PATTERN_FEATURE_COUNT + 7;

    /**
     * The number of operations of the '<em>Entity Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_PATTERN_OPERATION_COUNT = ModelsPackage.PATTERN_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link structure.pattern.EntityPattern <em>Entity Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entity Pattern</em>'.
     * @see structure.pattern.EntityPattern
     * @generated
     */
    EClass getEntityPattern();

    /**
     * Returns the meta object for the reference '{@link structure.pattern.EntityPattern#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see structure.pattern.EntityPattern#getType()
     * @see #getEntityPattern()
     * @generated
     */
    EReference getEntityPattern_Type();

    /**
     * Returns the meta object for the reference '{@link structure.pattern.EntityPattern#getInstantiationHierarchy <em>Instantiation Hierarchy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Instantiation Hierarchy</em>'.
     * @see structure.pattern.EntityPattern#getInstantiationHierarchy()
     * @see #getEntityPattern()
     * @generated
     */
    EReference getEntityPattern_InstantiationHierarchy();

    /**
     * Returns the meta object for the reference list '{@link structure.pattern.EntityPattern#getVariables <em>Variables</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Variables</em>'.
     * @see structure.pattern.EntityPattern#getVariables()
     * @see #getEntityPattern()
     * @generated
     */
    EReference getEntityPattern_Variables();

    /**
     * Returns the meta object for the containment reference '{@link structure.pattern.EntityPattern#getIdentityPattern <em>Identity Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Identity Pattern</em>'.
     * @see structure.pattern.EntityPattern#getIdentityPattern()
     * @see #getEntityPattern()
     * @generated
     */
    EReference getEntityPattern_IdentityPattern();

    /**
     * Returns the meta object for the containment reference '{@link structure.pattern.EntityPattern#getRolePattern <em>Role Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Role Pattern</em>'.
     * @see structure.pattern.EntityPattern#getRolePattern()
     * @see #getEntityPattern()
     * @generated
     */
    EReference getEntityPattern_RolePattern();

    /**
     * Returns the meta object for the reference '{@link structure.pattern.EntityPattern#getContainerEntityPattern <em>Container Entity Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Container Entity Pattern</em>'.
     * @see structure.pattern.EntityPattern#getContainerEntityPattern()
     * @see #getEntityPattern()
     * @generated
     */
    EReference getEntityPattern_ContainerEntityPattern();

    /**
     * Returns the meta object for the containment reference list '{@link structure.pattern.EntityPattern#getTrustPattern <em>Trust Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Trust Pattern</em>'.
     * @see structure.pattern.EntityPattern#getTrustPattern()
     * @see #getEntityPattern()
     * @generated
     */
    EReference getEntityPattern_TrustPattern();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    PatternFactory getPatternFactory();

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
         * The meta object literal for the '{@link structure.pattern.impl.EntityPatternImpl <em>Entity Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.pattern.impl.EntityPatternImpl
         * @see structure.pattern.impl.PatternPackageImpl#getEntityPattern()
         * @generated
         */
        EClass ENTITY_PATTERN = eINSTANCE.getEntityPattern();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_PATTERN__TYPE = eINSTANCE.getEntityPattern_Type();

        /**
         * The meta object literal for the '<em><b>Instantiation Hierarchy</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_PATTERN__INSTANTIATION_HIERARCHY = eINSTANCE.getEntityPattern_InstantiationHierarchy();

        /**
         * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_PATTERN__VARIABLES = eINSTANCE.getEntityPattern_Variables();

        /**
         * The meta object literal for the '<em><b>Identity Pattern</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_PATTERN__IDENTITY_PATTERN = eINSTANCE.getEntityPattern_IdentityPattern();

        /**
         * The meta object literal for the '<em><b>Role Pattern</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_PATTERN__ROLE_PATTERN = eINSTANCE.getEntityPattern_RolePattern();

        /**
         * The meta object literal for the '<em><b>Container Entity Pattern</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_PATTERN__CONTAINER_ENTITY_PATTERN = eINSTANCE.getEntityPattern_ContainerEntityPattern();

        /**
         * The meta object literal for the '<em><b>Trust Pattern</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_PATTERN__TRUST_PATTERN = eINSTANCE.getEntityPattern_TrustPattern();

    }

} //PatternPackage
