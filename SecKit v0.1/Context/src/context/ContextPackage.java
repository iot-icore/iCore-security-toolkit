/**
 */
package context;

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
 * @see context.ContextFactory
 * @model kind="package"
 * @generated
 */
public interface ContextPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "context";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://context/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "context";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ContextPackage eINSTANCE = context.impl.ContextPackageImpl.init();

    /**
     * The meta object id for the '{@link context.impl.ContextDesignModelImpl <em>Design Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.impl.ContextDesignModelImpl
     * @see context.impl.ContextPackageImpl#getContextDesignModel()
     * @generated
     */
    int CONTEXT_DESIGN_MODEL = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_DESIGN_MODEL__VISUAL_ELEMENTS = ModelsPackage.MODEL__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_DESIGN_MODEL__ID = ModelsPackage.MODEL__ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_DESIGN_MODEL__DESCRIPTION = ModelsPackage.MODEL__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_DESIGN_MODEL__FILENAME = ModelsPackage.MODEL__FILENAME;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_DESIGN_MODEL__URI = ModelsPackage.MODEL__URI;

    /**
     * The feature id for the '<em><b>Packages</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_DESIGN_MODEL__PACKAGES = ModelsPackage.MODEL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Design Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_DESIGN_MODEL_FEATURE_COUNT = ModelsPackage.MODEL_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Design Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_DESIGN_MODEL_OPERATION_COUNT = ModelsPackage.MODEL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link context.impl.ContextRuntimeModelImpl <em>Runtime Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.impl.ContextRuntimeModelImpl
     * @see context.impl.ContextPackageImpl#getContextRuntimeModel()
     * @generated
     */
    int CONTEXT_RUNTIME_MODEL = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_RUNTIME_MODEL__VISUAL_ELEMENTS = ModelsPackage.MODEL__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_RUNTIME_MODEL__ID = ModelsPackage.MODEL__ID;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_RUNTIME_MODEL__DESCRIPTION = ModelsPackage.MODEL__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_RUNTIME_MODEL__FILENAME = ModelsPackage.MODEL__FILENAME;

    /**
     * The feature id for the '<em><b>Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_RUNTIME_MODEL__URI = ModelsPackage.MODEL__URI;

    /**
     * The feature id for the '<em><b>Situations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_RUNTIME_MODEL__SITUATIONS = ModelsPackage.MODEL_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Context</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_RUNTIME_MODEL__CONTEXT = ModelsPackage.MODEL_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Runtime Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_RUNTIME_MODEL_FEATURE_COUNT = ModelsPackage.MODEL_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Runtime Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_RUNTIME_MODEL_OPERATION_COUNT = ModelsPackage.MODEL_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link context.ContextDesignModel <em>Design Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Design Model</em>'.
     * @see context.ContextDesignModel
     * @generated
     */
    EClass getContextDesignModel();

    /**
     * Returns the meta object for the containment reference list '{@link context.ContextDesignModel#getPackages <em>Packages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Packages</em>'.
     * @see context.ContextDesignModel#getPackages()
     * @see #getContextDesignModel()
     * @generated
     */
    EReference getContextDesignModel_Packages();

    /**
     * Returns the meta object for class '{@link context.ContextRuntimeModel <em>Runtime Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Runtime Model</em>'.
     * @see context.ContextRuntimeModel
     * @generated
     */
    EClass getContextRuntimeModel();

    /**
     * Returns the meta object for the containment reference list '{@link context.ContextRuntimeModel#getSituations <em>Situations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Situations</em>'.
     * @see context.ContextRuntimeModel#getSituations()
     * @see #getContextRuntimeModel()
     * @generated
     */
    EReference getContextRuntimeModel_Situations();

    /**
     * Returns the meta object for the containment reference list '{@link context.ContextRuntimeModel#getContext <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Context</em>'.
     * @see context.ContextRuntimeModel#getContext()
     * @see #getContextRuntimeModel()
     * @generated
     */
    EReference getContextRuntimeModel_Context();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ContextFactory getContextFactory();

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
         * The meta object literal for the '{@link context.impl.ContextDesignModelImpl <em>Design Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.impl.ContextDesignModelImpl
         * @see context.impl.ContextPackageImpl#getContextDesignModel()
         * @generated
         */
        EClass CONTEXT_DESIGN_MODEL = eINSTANCE.getContextDesignModel();

        /**
         * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_DESIGN_MODEL__PACKAGES = eINSTANCE.getContextDesignModel_Packages();

        /**
         * The meta object literal for the '{@link context.impl.ContextRuntimeModelImpl <em>Runtime Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.impl.ContextRuntimeModelImpl
         * @see context.impl.ContextPackageImpl#getContextRuntimeModel()
         * @generated
         */
        EClass CONTEXT_RUNTIME_MODEL = eINSTANCE.getContextRuntimeModel();

        /**
         * The meta object literal for the '<em><b>Situations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_RUNTIME_MODEL__SITUATIONS = eINSTANCE.getContextRuntimeModel_Situations();

        /**
         * The meta object literal for the '<em><b>Context</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_RUNTIME_MODEL__CONTEXT = eINSTANCE.getContextRuntimeModel_Context();

    }

} //ContextPackage
