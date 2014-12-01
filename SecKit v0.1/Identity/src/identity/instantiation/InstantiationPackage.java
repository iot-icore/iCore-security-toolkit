/**
 */
package identity.instantiation;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see identity.instantiation.InstantiationFactory
 * @model kind="package"
 * @generated
 */
public interface InstantiationPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "instantiation";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://identity/instantiation/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "identity-instantiation";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    InstantiationPackage eINSTANCE = identity.instantiation.impl.InstantiationPackageImpl.init();

    /**
     * The meta object id for the '{@link identity.instantiation.impl.IdentityInstantiationImpl <em>Identity Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.instantiation.impl.IdentityInstantiationImpl
     * @see identity.instantiation.impl.InstantiationPackageImpl#getIdentityInstantiation()
     * @generated
     */
    int IDENTITY_INSTANTIATION = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_INSTANTIATION__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_INSTANTIATION__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_INSTANTIATION__TYPE = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_INSTANTIATION__INSTANCES = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_INSTANTIATION__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Array</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_INSTANTIATION__ARRAY = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Identity Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_INSTANTIATION_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Identity Instantiation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_INSTANTIATION_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link identity.instantiation.IdentityInstantiation <em>Identity Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Identity Instantiation</em>'.
     * @see identity.instantiation.IdentityInstantiation
     * @generated
     */
    EClass getIdentityInstantiation();

    /**
     * Returns the meta object for the reference '{@link identity.instantiation.IdentityInstantiation#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see identity.instantiation.IdentityInstantiation#getType()
     * @see #getIdentityInstantiation()
     * @generated
     */
    EReference getIdentityInstantiation_Type();

    /**
     * Returns the meta object for the reference list '{@link identity.instantiation.IdentityInstantiation#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Instances</em>'.
     * @see identity.instantiation.IdentityInstantiation#getInstances()
     * @see #getIdentityInstantiation()
     * @generated
     */
    EReference getIdentityInstantiation_Instances();

    /**
     * Returns the meta object for the attribute '{@link identity.instantiation.IdentityInstantiation#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see identity.instantiation.IdentityInstantiation#getName()
     * @see #getIdentityInstantiation()
     * @generated
     */
    EAttribute getIdentityInstantiation_Name();

    /**
     * Returns the meta object for the attribute '{@link identity.instantiation.IdentityInstantiation#isArray <em>Array</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Array</em>'.
     * @see identity.instantiation.IdentityInstantiation#isArray()
     * @see #getIdentityInstantiation()
     * @generated
     */
    EAttribute getIdentityInstantiation_Array();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    InstantiationFactory getInstantiationFactory();

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
         * The meta object literal for the '{@link identity.instantiation.impl.IdentityInstantiationImpl <em>Identity Instantiation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.instantiation.impl.IdentityInstantiationImpl
         * @see identity.instantiation.impl.InstantiationPackageImpl#getIdentityInstantiation()
         * @generated
         */
        EClass IDENTITY_INSTANTIATION = eINSTANCE.getIdentityInstantiation();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IDENTITY_INSTANTIATION__TYPE = eINSTANCE.getIdentityInstantiation_Type();

        /**
         * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IDENTITY_INSTANTIATION__INSTANCES = eINSTANCE.getIdentityInstantiation_Instances();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IDENTITY_INSTANTIATION__NAME = eINSTANCE.getIdentityInstantiation_Name();

        /**
         * The meta object literal for the '<em><b>Array</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IDENTITY_INSTANTIATION__ARRAY = eINSTANCE.getIdentityInstantiation_Array();

    }

} //InstantiationPackage
