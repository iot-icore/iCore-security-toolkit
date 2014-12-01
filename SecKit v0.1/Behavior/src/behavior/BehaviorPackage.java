/**
 */
package behavior;

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
 * @see behavior.BehaviorFactory
 * @model kind="package"
 * @generated
 */
public interface BehaviorPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "behavior";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://behavior/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "behavior";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    BehaviorPackage eINSTANCE = behavior.impl.BehaviorPackageImpl.init();

    /**
     * The meta object id for the '{@link behavior.impl.BehaviorDesignModelImpl <em>Design Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.impl.BehaviorDesignModelImpl
     * @see behavior.impl.BehaviorPackageImpl#getBehaviorDesignModel()
     * @generated
     */
    int BEHAVIOR_DESIGN_MODEL = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESIGN_MODEL__VISUAL_ELEMENTS = ModelsPackage.MODEL__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESIGN_MODEL__ID = ModelsPackage.MODEL__ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESIGN_MODEL__DESCRIPTION = ModelsPackage.MODEL__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESIGN_MODEL__FILENAME = ModelsPackage.MODEL__FILENAME;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESIGN_MODEL__URI = ModelsPackage.MODEL__URI;

    /**
     * The feature id for the '<em><b>Packages</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESIGN_MODEL__PACKAGES = ModelsPackage.MODEL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Design Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESIGN_MODEL_FEATURE_COUNT = ModelsPackage.MODEL_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Design Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESIGN_MODEL_OPERATION_COUNT = ModelsPackage.MODEL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link behavior.impl.BehaviorRuntimeModelImpl <em>Runtime Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see behavior.impl.BehaviorRuntimeModelImpl
     * @see behavior.impl.BehaviorPackageImpl#getBehaviorRuntimeModel()
     * @generated
     */
    int BEHAVIOR_RUNTIME_MODEL = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_RUNTIME_MODEL__VISUAL_ELEMENTS = ModelsPackage.MODEL__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_RUNTIME_MODEL__ID = ModelsPackage.MODEL__ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_RUNTIME_MODEL__DESCRIPTION = ModelsPackage.MODEL__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_RUNTIME_MODEL__FILENAME = ModelsPackage.MODEL__FILENAME;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_RUNTIME_MODEL__URI = ModelsPackage.MODEL__URI;

    /**
     * The feature id for the '<em><b>Instances</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_RUNTIME_MODEL__INSTANCES = ModelsPackage.MODEL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Runtime Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_RUNTIME_MODEL_FEATURE_COUNT = ModelsPackage.MODEL_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Runtime Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_RUNTIME_MODEL_OPERATION_COUNT = ModelsPackage.MODEL_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link behavior.BehaviorDesignModel <em>Design Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Design Model</em>'.
     * @see behavior.BehaviorDesignModel
     * @generated
     */
    EClass getBehaviorDesignModel();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.BehaviorDesignModel#getPackages <em>Packages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Packages</em>'.
     * @see behavior.BehaviorDesignModel#getPackages()
     * @see #getBehaviorDesignModel()
     * @generated
     */
    EReference getBehaviorDesignModel_Packages();

    /**
     * Returns the meta object for class '{@link behavior.BehaviorRuntimeModel <em>Runtime Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Runtime Model</em>'.
     * @see behavior.BehaviorRuntimeModel
     * @generated
     */
    EClass getBehaviorRuntimeModel();

    /**
     * Returns the meta object for the containment reference list '{@link behavior.BehaviorRuntimeModel#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Instances</em>'.
     * @see behavior.BehaviorRuntimeModel#getInstances()
     * @see #getBehaviorRuntimeModel()
     * @generated
     */
    EReference getBehaviorRuntimeModel_Instances();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    BehaviorFactory getBehaviorFactory();

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
         * The meta object literal for the '{@link behavior.impl.BehaviorDesignModelImpl <em>Design Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.impl.BehaviorDesignModelImpl
         * @see behavior.impl.BehaviorPackageImpl#getBehaviorDesignModel()
         * @generated
         */
        EClass BEHAVIOR_DESIGN_MODEL = eINSTANCE.getBehaviorDesignModel();

        /**
         * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR_DESIGN_MODEL__PACKAGES = eINSTANCE.getBehaviorDesignModel_Packages();

        /**
         * The meta object literal for the '{@link behavior.impl.BehaviorRuntimeModelImpl <em>Runtime Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behavior.impl.BehaviorRuntimeModelImpl
         * @see behavior.impl.BehaviorPackageImpl#getBehaviorRuntimeModel()
         * @generated
         */
        EClass BEHAVIOR_RUNTIME_MODEL = eINSTANCE.getBehaviorRuntimeModel();

        /**
         * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR_RUNTIME_MODEL__INSTANCES = eINSTANCE.getBehaviorRuntimeModel_Instances();

    }

} //BehaviorPackage
