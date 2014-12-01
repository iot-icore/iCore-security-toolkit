/**
 */
package identity;

import models.ModelsPackage;

import models.variable.VariablePackage;

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
 * @see identity.IdentityFactory
 * @model kind="package"
 * @generated
 */
public interface IdentityPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "identity";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://identity/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "identity";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    IdentityPackage eINSTANCE = identity.impl.IdentityPackageImpl.init();

    /**
     * The meta object id for the '{@link identity.impl.IdentityDesignModelImpl <em>Design Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.impl.IdentityDesignModelImpl
     * @see identity.impl.IdentityPackageImpl#getIdentityDesignModel()
     * @generated
     */
    int IDENTITY_DESIGN_MODEL = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_DESIGN_MODEL__VISUAL_ELEMENTS = ModelsPackage.MODEL__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_DESIGN_MODEL__ID = ModelsPackage.MODEL__ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_DESIGN_MODEL__DESCRIPTION = ModelsPackage.MODEL__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_DESIGN_MODEL__FILENAME = ModelsPackage.MODEL__FILENAME;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_DESIGN_MODEL__URI = ModelsPackage.MODEL__URI;

    /**
     * The feature id for the '<em><b>Packages</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_DESIGN_MODEL__PACKAGES = ModelsPackage.MODEL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Design Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_DESIGN_MODEL_FEATURE_COUNT = ModelsPackage.MODEL_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Design Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_DESIGN_MODEL_OPERATION_COUNT = ModelsPackage.MODEL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.impl.IdentityRuntimeModelImpl <em>Runtime Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.impl.IdentityRuntimeModelImpl
     * @see identity.impl.IdentityPackageImpl#getIdentityRuntimeModel()
     * @generated
     */
    int IDENTITY_RUNTIME_MODEL = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_RUNTIME_MODEL__VISUAL_ELEMENTS = ModelsPackage.MODEL__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_RUNTIME_MODEL__ID = ModelsPackage.MODEL__ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_RUNTIME_MODEL__DESCRIPTION = ModelsPackage.MODEL__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_RUNTIME_MODEL__FILENAME = ModelsPackage.MODEL__FILENAME;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_RUNTIME_MODEL__URI = ModelsPackage.MODEL__URI;

    /**
     * The feature id for the '<em><b>Identity Realms</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_RUNTIME_MODEL__IDENTITY_REALMS = ModelsPackage.MODEL_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Verification Methods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_RUNTIME_MODEL__VERIFICATION_METHODS = ModelsPackage.MODEL_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Identities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_RUNTIME_MODEL__IDENTITIES = ModelsPackage.MODEL_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Runtime Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_RUNTIME_MODEL_FEATURE_COUNT = ModelsPackage.MODEL_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Runtime Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_RUNTIME_MODEL_OPERATION_COUNT = ModelsPackage.MODEL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.impl.IdentityVariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.impl.IdentityVariableImpl
     * @see identity.impl.IdentityPackageImpl#getIdentityVariable()
     * @generated
     */
    int IDENTITY_VARIABLE = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_VARIABLE__VISUAL_ELEMENTS = VariablePackage.VARIABLE_DECLARATION__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_VARIABLE__ID = VariablePackage.VARIABLE_DECLARATION__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_VARIABLE__NAME = VariablePackage.VARIABLE_DECLARATION__NAME;

    /**
     * The number of structural features of the '<em>Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_VARIABLE_FEATURE_COUNT = VariablePackage.VARIABLE_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_VARIABLE_OPERATION_COUNT = VariablePackage.VARIABLE_DECLARATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.impl.IdentityInstanceVariableImpl <em>Instance Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.impl.IdentityInstanceVariableImpl
     * @see identity.impl.IdentityPackageImpl#getIdentityInstanceVariable()
     * @generated
     */
    int IDENTITY_INSTANCE_VARIABLE = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_INSTANCE_VARIABLE__VISUAL_ELEMENTS = IDENTITY_VARIABLE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_INSTANCE_VARIABLE__ID = IDENTITY_VARIABLE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_INSTANCE_VARIABLE__NAME = IDENTITY_VARIABLE__NAME;

    /**
     * The number of structural features of the '<em>Instance Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_INSTANCE_VARIABLE_FEATURE_COUNT = IDENTITY_VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Instance Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_INSTANCE_VARIABLE_OPERATION_COUNT = IDENTITY_VARIABLE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.impl.IdentityAttributeVariableImpl <em>Attribute Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.impl.IdentityAttributeVariableImpl
     * @see identity.impl.IdentityPackageImpl#getIdentityAttributeVariable()
     * @generated
     */
    int IDENTITY_ATTRIBUTE_VARIABLE = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_VARIABLE__VISUAL_ELEMENTS = IDENTITY_VARIABLE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_VARIABLE__ID = IDENTITY_VARIABLE__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_VARIABLE__NAME = IDENTITY_VARIABLE__NAME;

    /**
     * The number of structural features of the '<em>Attribute Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_VARIABLE_FEATURE_COUNT = IDENTITY_VARIABLE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Attribute Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_VARIABLE_OPERATION_COUNT = IDENTITY_VARIABLE_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link identity.IdentityDesignModel <em>Design Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Design Model</em>'.
     * @see identity.IdentityDesignModel
     * @generated
     */
    EClass getIdentityDesignModel();

    /**
     * Returns the meta object for the containment reference list '{@link identity.IdentityDesignModel#getPackages <em>Packages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Packages</em>'.
     * @see identity.IdentityDesignModel#getPackages()
     * @see #getIdentityDesignModel()
     * @generated
     */
    EReference getIdentityDesignModel_Packages();

    /**
     * Returns the meta object for class '{@link identity.IdentityRuntimeModel <em>Runtime Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Runtime Model</em>'.
     * @see identity.IdentityRuntimeModel
     * @generated
     */
    EClass getIdentityRuntimeModel();

    /**
     * Returns the meta object for the containment reference list '{@link identity.IdentityRuntimeModel#getIdentityRealms <em>Identity Realms</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Identity Realms</em>'.
     * @see identity.IdentityRuntimeModel#getIdentityRealms()
     * @see #getIdentityRuntimeModel()
     * @generated
     */
    EReference getIdentityRuntimeModel_IdentityRealms();

    /**
     * Returns the meta object for the containment reference list '{@link identity.IdentityRuntimeModel#getVerificationMethods <em>Verification Methods</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Verification Methods</em>'.
     * @see identity.IdentityRuntimeModel#getVerificationMethods()
     * @see #getIdentityRuntimeModel()
     * @generated
     */
    EReference getIdentityRuntimeModel_VerificationMethods();

    /**
     * Returns the meta object for the containment reference list '{@link identity.IdentityRuntimeModel#getIdentities <em>Identities</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Identities</em>'.
     * @see identity.IdentityRuntimeModel#getIdentities()
     * @see #getIdentityRuntimeModel()
     * @generated
     */
    EReference getIdentityRuntimeModel_Identities();

    /**
     * Returns the meta object for class '{@link identity.IdentityVariable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Variable</em>'.
     * @see identity.IdentityVariable
     * @generated
     */
    EClass getIdentityVariable();

    /**
     * Returns the meta object for class '{@link identity.IdentityInstanceVariable <em>Instance Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Instance Variable</em>'.
     * @see identity.IdentityInstanceVariable
     * @generated
     */
    EClass getIdentityInstanceVariable();

    /**
     * Returns the meta object for class '{@link identity.IdentityAttributeVariable <em>Attribute Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute Variable</em>'.
     * @see identity.IdentityAttributeVariable
     * @generated
     */
    EClass getIdentityAttributeVariable();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    IdentityFactory getIdentityFactory();

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
         * The meta object literal for the '{@link identity.impl.IdentityDesignModelImpl <em>Design Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.impl.IdentityDesignModelImpl
         * @see identity.impl.IdentityPackageImpl#getIdentityDesignModel()
         * @generated
         */
        EClass IDENTITY_DESIGN_MODEL = eINSTANCE.getIdentityDesignModel();

        /**
         * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IDENTITY_DESIGN_MODEL__PACKAGES = eINSTANCE.getIdentityDesignModel_Packages();

        /**
         * The meta object literal for the '{@link identity.impl.IdentityRuntimeModelImpl <em>Runtime Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.impl.IdentityRuntimeModelImpl
         * @see identity.impl.IdentityPackageImpl#getIdentityRuntimeModel()
         * @generated
         */
        EClass IDENTITY_RUNTIME_MODEL = eINSTANCE.getIdentityRuntimeModel();

        /**
         * The meta object literal for the '<em><b>Identity Realms</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IDENTITY_RUNTIME_MODEL__IDENTITY_REALMS = eINSTANCE.getIdentityRuntimeModel_IdentityRealms();

        /**
         * The meta object literal for the '<em><b>Verification Methods</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IDENTITY_RUNTIME_MODEL__VERIFICATION_METHODS = eINSTANCE.getIdentityRuntimeModel_VerificationMethods();

        /**
         * The meta object literal for the '<em><b>Identities</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IDENTITY_RUNTIME_MODEL__IDENTITIES = eINSTANCE.getIdentityRuntimeModel_Identities();

        /**
         * The meta object literal for the '{@link identity.impl.IdentityVariableImpl <em>Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.impl.IdentityVariableImpl
         * @see identity.impl.IdentityPackageImpl#getIdentityVariable()
         * @generated
         */
        EClass IDENTITY_VARIABLE = eINSTANCE.getIdentityVariable();

        /**
         * The meta object literal for the '{@link identity.impl.IdentityInstanceVariableImpl <em>Instance Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.impl.IdentityInstanceVariableImpl
         * @see identity.impl.IdentityPackageImpl#getIdentityInstanceVariable()
         * @generated
         */
        EClass IDENTITY_INSTANCE_VARIABLE = eINSTANCE.getIdentityInstanceVariable();

        /**
         * The meta object literal for the '{@link identity.impl.IdentityAttributeVariableImpl <em>Attribute Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.impl.IdentityAttributeVariableImpl
         * @see identity.impl.IdentityPackageImpl#getIdentityAttributeVariable()
         * @generated
         */
        EClass IDENTITY_ATTRIBUTE_VARIABLE = eINSTANCE.getIdentityAttributeVariable();

    }

} //IdentityPackage
