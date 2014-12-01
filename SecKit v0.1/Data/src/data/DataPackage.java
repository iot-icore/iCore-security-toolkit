/**
 */
package data;

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
 * @see data.DataFactory
 * @model kind="package"
 * @generated
 */
public interface DataPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "data";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://data/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "data";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DataPackage eINSTANCE = data.impl.DataPackageImpl.init();

    /**
     * The meta object id for the '{@link data.impl.DataModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.impl.DataModelImpl
     * @see data.impl.DataPackageImpl#getDataModel()
     * @generated
     */
    int DATA_MODEL = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_MODEL__VISUAL_ELEMENTS = ModelsPackage.MODEL__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_MODEL__ID = ModelsPackage.MODEL__ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_MODEL__DESCRIPTION = ModelsPackage.MODEL__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_MODEL__FILENAME = ModelsPackage.MODEL__FILENAME;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_MODEL__URI = ModelsPackage.MODEL__URI;

    /**
     * The number of structural features of the '<em>Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_MODEL_FEATURE_COUNT = ModelsPackage.MODEL_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_MODEL_OPERATION_COUNT = ModelsPackage.MODEL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.impl.DataDesignModelImpl <em>Design Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.impl.DataDesignModelImpl
     * @see data.impl.DataPackageImpl#getDataDesignModel()
     * @generated
     */
    int DATA_DESIGN_MODEL = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_DESIGN_MODEL__VISUAL_ELEMENTS = DATA_MODEL__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_DESIGN_MODEL__ID = DATA_MODEL__ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_DESIGN_MODEL__DESCRIPTION = DATA_MODEL__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_DESIGN_MODEL__FILENAME = DATA_MODEL__FILENAME;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_DESIGN_MODEL__URI = DATA_MODEL__URI;

    /**
     * The feature id for the '<em><b>Packages</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_DESIGN_MODEL__PACKAGES = DATA_MODEL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Design Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_DESIGN_MODEL_FEATURE_COUNT = DATA_MODEL_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Design Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_DESIGN_MODEL_OPERATION_COUNT = DATA_MODEL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.impl.DataRuntimeModelImpl <em>Runtime Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.impl.DataRuntimeModelImpl
     * @see data.impl.DataPackageImpl#getDataRuntimeModel()
     * @generated
     */
    int DATA_RUNTIME_MODEL = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_RUNTIME_MODEL__VISUAL_ELEMENTS = DATA_MODEL__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_RUNTIME_MODEL__ID = DATA_MODEL__ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_RUNTIME_MODEL__DESCRIPTION = DATA_MODEL__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_RUNTIME_MODEL__FILENAME = DATA_MODEL__FILENAME;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_RUNTIME_MODEL__URI = DATA_MODEL__URI;

    /**
     * The feature id for the '<em><b>Data</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_RUNTIME_MODEL__DATA = DATA_MODEL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Runtime Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_RUNTIME_MODEL_FEATURE_COUNT = DATA_MODEL_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Runtime Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_RUNTIME_MODEL_OPERATION_COUNT = DATA_MODEL_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link data.DataModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Model</em>'.
     * @see data.DataModel
     * @generated
     */
    EClass getDataModel();

    /**
     * Returns the meta object for class '{@link data.DataDesignModel <em>Design Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Design Model</em>'.
     * @see data.DataDesignModel
     * @generated
     */
    EClass getDataDesignModel();

    /**
     * Returns the meta object for the containment reference list '{@link data.DataDesignModel#getPackages <em>Packages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Packages</em>'.
     * @see data.DataDesignModel#getPackages()
     * @see #getDataDesignModel()
     * @generated
     */
    EReference getDataDesignModel_Packages();

    /**
     * Returns the meta object for class '{@link data.DataRuntimeModel <em>Runtime Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Runtime Model</em>'.
     * @see data.DataRuntimeModel
     * @generated
     */
    EClass getDataRuntimeModel();

    /**
     * Returns the meta object for the containment reference list '{@link data.DataRuntimeModel#getData <em>Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data</em>'.
     * @see data.DataRuntimeModel#getData()
     * @see #getDataRuntimeModel()
     * @generated
     */
    EReference getDataRuntimeModel_Data();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    DataFactory getDataFactory();

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
         * The meta object literal for the '{@link data.impl.DataModelImpl <em>Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.impl.DataModelImpl
         * @see data.impl.DataPackageImpl#getDataModel()
         * @generated
         */
        EClass DATA_MODEL = eINSTANCE.getDataModel();

        /**
         * The meta object literal for the '{@link data.impl.DataDesignModelImpl <em>Design Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.impl.DataDesignModelImpl
         * @see data.impl.DataPackageImpl#getDataDesignModel()
         * @generated
         */
        EClass DATA_DESIGN_MODEL = eINSTANCE.getDataDesignModel();

        /**
         * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_DESIGN_MODEL__PACKAGES = eINSTANCE.getDataDesignModel_Packages();

        /**
         * The meta object literal for the '{@link data.impl.DataRuntimeModelImpl <em>Runtime Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.impl.DataRuntimeModelImpl
         * @see data.impl.DataPackageImpl#getDataRuntimeModel()
         * @generated
         */
        EClass DATA_RUNTIME_MODEL = eINSTANCE.getDataRuntimeModel();

        /**
         * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_RUNTIME_MODEL__DATA = eINSTANCE.getDataRuntimeModel_Data();

    }

} //DataPackage
