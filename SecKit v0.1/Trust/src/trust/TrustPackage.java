/**
 */
package trust;

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
 * @see trust.TrustFactory
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
  String eNS_URI = "http://trust/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "trust";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TrustPackage eINSTANCE = trust.impl.TrustPackageImpl.init();

  /**
   * The meta object id for the '{@link trust.impl.TrustRuntimeModelImpl <em>Runtime Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.impl.TrustRuntimeModelImpl
   * @see trust.impl.TrustPackageImpl#getTrustRuntimeModel()
   * @generated
   */
  int TRUST_RUNTIME_MODEL = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RUNTIME_MODEL__ID = ModelsPackage.MODEL__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RUNTIME_MODEL__VISUAL_ELEMENTS = ModelsPackage.MODEL__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RUNTIME_MODEL__DESCRIPTION = ModelsPackage.MODEL__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Filename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RUNTIME_MODEL__FILENAME = ModelsPackage.MODEL__FILENAME;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RUNTIME_MODEL__URI = ModelsPackage.MODEL__URI;

  /**
   * The feature id for the '<em><b>Trust Recommendations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RUNTIME_MODEL__TRUST_RECOMMENDATIONS = ModelsPackage.MODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Trust Relationships</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RUNTIME_MODEL__TRUST_RELATIONSHIPS = ModelsPackage.MODEL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Evidence</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RUNTIME_MODEL__EVIDENCE = ModelsPackage.MODEL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Runtime Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RUNTIME_MODEL_FEATURE_COUNT = ModelsPackage.MODEL_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Runtime Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_RUNTIME_MODEL_OPERATION_COUNT = ModelsPackage.MODEL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link trust.impl.TrustDesignModelImpl <em>Design Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see trust.impl.TrustDesignModelImpl
   * @see trust.impl.TrustPackageImpl#getTrustDesignModel()
   * @generated
   */
  int TRUST_DESIGN_MODEL = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_DESIGN_MODEL__ID = ModelsPackage.MODEL__ID;

  /**
   * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_DESIGN_MODEL__VISUAL_ELEMENTS = ModelsPackage.MODEL__VISUAL_ELEMENTS;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_DESIGN_MODEL__DESCRIPTION = ModelsPackage.MODEL__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Filename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_DESIGN_MODEL__FILENAME = ModelsPackage.MODEL__FILENAME;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_DESIGN_MODEL__URI = ModelsPackage.MODEL__URI;

  /**
   * The feature id for the '<em><b>Trust Aspects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_DESIGN_MODEL__TRUST_ASPECTS = ModelsPackage.MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Design Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_DESIGN_MODEL_FEATURE_COUNT = ModelsPackage.MODEL_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Design Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUST_DESIGN_MODEL_OPERATION_COUNT = ModelsPackage.MODEL_OPERATION_COUNT + 0;


  /**
   * Returns the meta object for class '{@link trust.TrustRuntimeModel <em>Runtime Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Runtime Model</em>'.
   * @see trust.TrustRuntimeModel
   * @generated
   */
  EClass getTrustRuntimeModel();

  /**
   * Returns the meta object for the containment reference list '{@link trust.TrustRuntimeModel#getTrustRecommendations <em>Trust Recommendations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Trust Recommendations</em>'.
   * @see trust.TrustRuntimeModel#getTrustRecommendations()
   * @see #getTrustRuntimeModel()
   * @generated
   */
  EReference getTrustRuntimeModel_TrustRecommendations();

  /**
   * Returns the meta object for the containment reference list '{@link trust.TrustRuntimeModel#getTrustRelationships <em>Trust Relationships</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Trust Relationships</em>'.
   * @see trust.TrustRuntimeModel#getTrustRelationships()
   * @see #getTrustRuntimeModel()
   * @generated
   */
  EReference getTrustRuntimeModel_TrustRelationships();

  /**
   * Returns the meta object for the containment reference list '{@link trust.TrustRuntimeModel#getEvidence <em>Evidence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Evidence</em>'.
   * @see trust.TrustRuntimeModel#getEvidence()
   * @see #getTrustRuntimeModel()
   * @generated
   */
  EReference getTrustRuntimeModel_Evidence();

  /**
   * Returns the meta object for class '{@link trust.TrustDesignModel <em>Design Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Design Model</em>'.
   * @see trust.TrustDesignModel
   * @generated
   */
  EClass getTrustDesignModel();

  /**
   * Returns the meta object for the containment reference list '{@link trust.TrustDesignModel#getTrustAspects <em>Trust Aspects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Trust Aspects</em>'.
   * @see trust.TrustDesignModel#getTrustAspects()
   * @see #getTrustDesignModel()
   * @generated
   */
  EReference getTrustDesignModel_TrustAspects();

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
     * The meta object literal for the '{@link trust.impl.TrustRuntimeModelImpl <em>Runtime Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.impl.TrustRuntimeModelImpl
     * @see trust.impl.TrustPackageImpl#getTrustRuntimeModel()
     * @generated
     */
    EClass TRUST_RUNTIME_MODEL = eINSTANCE.getTrustRuntimeModel();

    /**
     * The meta object literal for the '<em><b>Trust Recommendations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRUST_RUNTIME_MODEL__TRUST_RECOMMENDATIONS = eINSTANCE.getTrustRuntimeModel_TrustRecommendations();

    /**
     * The meta object literal for the '<em><b>Trust Relationships</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRUST_RUNTIME_MODEL__TRUST_RELATIONSHIPS = eINSTANCE.getTrustRuntimeModel_TrustRelationships();

    /**
     * The meta object literal for the '<em><b>Evidence</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRUST_RUNTIME_MODEL__EVIDENCE = eINSTANCE.getTrustRuntimeModel_Evidence();

    /**
     * The meta object literal for the '{@link trust.impl.TrustDesignModelImpl <em>Design Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see trust.impl.TrustDesignModelImpl
     * @see trust.impl.TrustPackageImpl#getTrustDesignModel()
     * @generated
     */
    EClass TRUST_DESIGN_MODEL = eINSTANCE.getTrustDesignModel();

    /**
     * The meta object literal for the '<em><b>Trust Aspects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRUST_DESIGN_MODEL__TRUST_ASPECTS = eINSTANCE.getTrustDesignModel_TrustAspects();

  }

} //TrustPackage
