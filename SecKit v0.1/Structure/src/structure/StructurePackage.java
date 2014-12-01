/**
 */
package structure;

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
 * @see structure.StructureFactory
 * @model kind="package"
 * @generated
 */
public interface StructurePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "structure";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://structure/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "structure";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    StructurePackage eINSTANCE = structure.impl.StructurePackageImpl.init();

    /**
     * The meta object id for the '{@link structure.impl.StructuralDesignModelImpl <em>Structural Design Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.impl.StructuralDesignModelImpl
     * @see structure.impl.StructurePackageImpl#getStructuralDesignModel()
     * @generated
     */
    int STRUCTURAL_DESIGN_MODEL = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_DESIGN_MODEL__VISUAL_ELEMENTS = ModelsPackage.MODEL__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_DESIGN_MODEL__ID = ModelsPackage.MODEL__ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_DESIGN_MODEL__DESCRIPTION = ModelsPackage.MODEL__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_DESIGN_MODEL__FILENAME = ModelsPackage.MODEL__FILENAME;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_DESIGN_MODEL__URI = ModelsPackage.MODEL__URI;

    /**
     * The feature id for the '<em><b>Entity Type Packages</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_DESIGN_MODEL__ENTITY_TYPE_PACKAGES = ModelsPackage.MODEL_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Allowed Entity Instantiations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_DESIGN_MODEL__ALLOWED_ENTITY_INSTANTIATIONS = ModelsPackage.MODEL_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Structural Design Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_DESIGN_MODEL_FEATURE_COUNT = ModelsPackage.MODEL_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Structural Design Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_DESIGN_MODEL_OPERATION_COUNT = ModelsPackage.MODEL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link structure.impl.StructuralRuntimeModelImpl <em>Structural Runtime Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see structure.impl.StructuralRuntimeModelImpl
     * @see structure.impl.StructurePackageImpl#getStructuralRuntimeModel()
     * @generated
     */
    int STRUCTURAL_RUNTIME_MODEL = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_RUNTIME_MODEL__VISUAL_ELEMENTS = ModelsPackage.MODEL__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_RUNTIME_MODEL__ID = ModelsPackage.MODEL__ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_RUNTIME_MODEL__DESCRIPTION = ModelsPackage.MODEL__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_RUNTIME_MODEL__FILENAME = ModelsPackage.MODEL__FILENAME;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_RUNTIME_MODEL__URI = ModelsPackage.MODEL__URI;

    /**
     * The feature id for the '<em><b>Entities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_RUNTIME_MODEL__ENTITIES = ModelsPackage.MODEL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Structural Runtime Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_RUNTIME_MODEL_FEATURE_COUNT = ModelsPackage.MODEL_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Structural Runtime Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_RUNTIME_MODEL_OPERATION_COUNT = ModelsPackage.MODEL_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link structure.StructuralDesignModel <em>Structural Design Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Structural Design Model</em>'.
     * @see structure.StructuralDesignModel
     * @generated
     */
    EClass getStructuralDesignModel();

    /**
     * Returns the meta object for the containment reference list '{@link structure.StructuralDesignModel#getEntityTypePackages <em>Entity Type Packages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Entity Type Packages</em>'.
     * @see structure.StructuralDesignModel#getEntityTypePackages()
     * @see #getStructuralDesignModel()
     * @generated
     */
    EReference getStructuralDesignModel_EntityTypePackages();

    /**
     * Returns the meta object for the containment reference list '{@link structure.StructuralDesignModel#getAllowedEntityInstantiations <em>Allowed Entity Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Allowed Entity Instantiations</em>'.
     * @see structure.StructuralDesignModel#getAllowedEntityInstantiations()
     * @see #getStructuralDesignModel()
     * @generated
     */
    EReference getStructuralDesignModel_AllowedEntityInstantiations();

    /**
     * Returns the meta object for class '{@link structure.StructuralRuntimeModel <em>Structural Runtime Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Structural Runtime Model</em>'.
     * @see structure.StructuralRuntimeModel
     * @generated
     */
    EClass getStructuralRuntimeModel();

    /**
     * Returns the meta object for the containment reference list '{@link structure.StructuralRuntimeModel#getEntities <em>Entities</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Entities</em>'.
     * @see structure.StructuralRuntimeModel#getEntities()
     * @see #getStructuralRuntimeModel()
     * @generated
     */
    EReference getStructuralRuntimeModel_Entities();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    StructureFactory getStructureFactory();

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
         * The meta object literal for the '{@link structure.impl.StructuralDesignModelImpl <em>Structural Design Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.impl.StructuralDesignModelImpl
         * @see structure.impl.StructurePackageImpl#getStructuralDesignModel()
         * @generated
         */
        EClass STRUCTURAL_DESIGN_MODEL = eINSTANCE.getStructuralDesignModel();

        /**
         * The meta object literal for the '<em><b>Entity Type Packages</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STRUCTURAL_DESIGN_MODEL__ENTITY_TYPE_PACKAGES = eINSTANCE.getStructuralDesignModel_EntityTypePackages();

        /**
         * The meta object literal for the '<em><b>Allowed Entity Instantiations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STRUCTURAL_DESIGN_MODEL__ALLOWED_ENTITY_INSTANTIATIONS = eINSTANCE.getStructuralDesignModel_AllowedEntityInstantiations();

        /**
         * The meta object literal for the '{@link structure.impl.StructuralRuntimeModelImpl <em>Structural Runtime Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see structure.impl.StructuralRuntimeModelImpl
         * @see structure.impl.StructurePackageImpl#getStructuralRuntimeModel()
         * @generated
         */
        EClass STRUCTURAL_RUNTIME_MODEL = eINSTANCE.getStructuralRuntimeModel();

        /**
         * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STRUCTURAL_RUNTIME_MODEL__ENTITIES = eINSTANCE.getStructuralRuntimeModel_Entities();

    }

} //StructurePackage
