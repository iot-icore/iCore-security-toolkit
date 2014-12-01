/**
 */
package risk.type;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see risk.type.TypeFactory
 * @model kind="package"
 * @generated
 */
public interface TypePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "type";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://risk/type/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "risk-type";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TypePackage eINSTANCE = risk.type.impl.TypePackageImpl.init();

    /**
     * The meta object id for the '{@link risk.type.impl.AssetImpl <em>Asset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.AssetImpl
     * @see risk.type.impl.TypePackageImpl#getAsset()
     * @generated
     */
    int ASSET = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSET__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSET__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSET__VALUE = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Interested Stakeholder</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSET__INTERESTED_STAKEHOLDER = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Indirectly Impacts</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSET__INDIRECTLY_IMPACTS = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSET__DESCRIPTION = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Asset</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSET_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Asset</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSET_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.ThreatScenarioImpl <em>Threat Scenario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.ThreatScenarioImpl
     * @see risk.type.impl.TypePackageImpl#getThreatScenario()
     * @generated
     */
    int THREAT_SCENARIO = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAT_SCENARIO__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAT_SCENARIO__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Threat</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAT_SCENARIO__THREAT = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Vulnerability</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAT_SCENARIO__VULNERABILITY = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Unwanted Incidents</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAT_SCENARIO__UNWANTED_INCIDENTS = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Requires Scenario</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAT_SCENARIO__REQUIRES_SCENARIO = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Enables Scenario</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAT_SCENARIO__ENABLES_SCENARIO = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAT_SCENARIO__DESCRIPTION = ModelsPackage.ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Countermeasures</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAT_SCENARIO__COUNTERMEASURES = ModelsPackage.ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAT_SCENARIO__REFINEMENT_TYPE = ModelsPackage.ELEMENT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAT_SCENARIO__ATTRIBUTES = ModelsPackage.ELEMENT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Likelihood</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAT_SCENARIO__LIKELIHOOD = ModelsPackage.ELEMENT_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Likelihood Measurement</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAT_SCENARIO__LIKELIHOOD_MEASUREMENT = ModelsPackage.ELEMENT_FEATURE_COUNT + 10;

    /**
     * The number of structural features of the '<em>Threat Scenario</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAT_SCENARIO_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 11;

    /**
     * The number of operations of the '<em>Threat Scenario</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAT_SCENARIO_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.ThreatImpl <em>Threat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.ThreatImpl
     * @see risk.type.impl.TypePackageImpl#getThreat()
     * @generated
     */
    int THREAT = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAT__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAT__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAT__DESCRIPTION = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Entity Instantiation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAT__ENTITY_INSTANTIATION = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Threat</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAT_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Threat</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAT_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.VulnerabilityImpl <em>Vulnerability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.VulnerabilityImpl
     * @see risk.type.impl.TypePackageImpl#getVulnerability()
     * @generated
     */
    int VULNERABILITY = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VULNERABILITY__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VULNERABILITY__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VULNERABILITY__DESCRIPTION = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Countermeasures</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VULNERABILITY__COUNTERMEASURES = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Entity Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VULNERABILITY__ENTITY_INSTANTIATION = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Vulnerability</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VULNERABILITY_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Vulnerability</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VULNERABILITY_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.IncidentTypeImpl <em>Incident Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.IncidentTypeImpl
     * @see risk.type.impl.TypePackageImpl#getIncidentType()
     * @generated
     */
    int INCIDENT_TYPE = 4;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCIDENT_TYPE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCIDENT_TYPE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCIDENT_TYPE__DESCRIPTION = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Likelihood</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCIDENT_TYPE__LIKELIHOOD = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Enables</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCIDENT_TYPE__ENABLES = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Negative Consequences</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCIDENT_TYPE__NEGATIVE_CONSEQUENCES = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Likelihood Measurement</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCIDENT_TYPE__LIKELIHOOD_MEASUREMENT = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Incident Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCIDENT_TYPE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Incident Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INCIDENT_TYPE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.ResponseImpl <em>Response</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.ResponseImpl
     * @see risk.type.impl.TypePackageImpl#getResponse()
     * @generated
     */
    int RESPONSE = 5;

    /**
     * The number of structural features of the '<em>Response</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Response</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link risk.type.impl.CountermeasureImpl <em>Countermeasure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.CountermeasureImpl
     * @see risk.type.impl.TypePackageImpl#getCountermeasure()
     * @generated
     */
    int COUNTERMEASURE = 6;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNTERMEASURE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNTERMEASURE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Cost</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNTERMEASURE__COST = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNTERMEASURE__DESCRIPTION = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Rule Templates</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNTERMEASURE__RULE_TEMPLATES = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Countermeasure</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNTERMEASURE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Countermeasure</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COUNTERMEASURE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.MonetaryAmountImpl <em>Monetary Amount</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.MonetaryAmountImpl
     * @see risk.type.impl.TypePackageImpl#getMonetaryAmount()
     * @generated
     */
    int MONETARY_AMOUNT = 7;

    /**
     * The number of structural features of the '<em>Monetary Amount</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONETARY_AMOUNT_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Monetary Amount</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MONETARY_AMOUNT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link risk.type.impl.ConsequenceImpl <em>Consequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.ConsequenceImpl
     * @see risk.type.impl.TypePackageImpl#getConsequence()
     * @generated
     */
    int CONSEQUENCE = 8;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSEQUENCE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSEQUENCE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Affected Asset</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSEQUENCE__AFFECTED_ASSET = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSEQUENCE__DESCRIPTION = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Consequence</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSEQUENCE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Consequence</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSEQUENCE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.ReputationImpl <em>Reputation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.ReputationImpl
     * @see risk.type.impl.TypePackageImpl#getReputation()
     * @generated
     */
    int REPUTATION = 9;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPUTATION__ID = ASSET__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPUTATION__VISUAL_ELEMENTS = ASSET__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPUTATION__VALUE = ASSET__VALUE;

    /**
     * The feature id for the '<em><b>Interested Stakeholder</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPUTATION__INTERESTED_STAKEHOLDER = ASSET__INTERESTED_STAKEHOLDER;

    /**
     * The feature id for the '<em><b>Indirectly Impacts</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPUTATION__INDIRECTLY_IMPACTS = ASSET__INDIRECTLY_IMPACTS;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPUTATION__DESCRIPTION = ASSET__DESCRIPTION;

    /**
     * The number of structural features of the '<em>Reputation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPUTATION_FEATURE_COUNT = ASSET_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Reputation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPUTATION_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.StructuralAssetImpl <em>Structural Asset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.StructuralAssetImpl
     * @see risk.type.impl.TypePackageImpl#getStructuralAsset()
     * @generated
     */
    int STRUCTURAL_ASSET = 10;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_ASSET__ID = ASSET__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_ASSET__VISUAL_ELEMENTS = ASSET__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_ASSET__VALUE = ASSET__VALUE;

    /**
     * The feature id for the '<em><b>Interested Stakeholder</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_ASSET__INTERESTED_STAKEHOLDER = ASSET__INTERESTED_STAKEHOLDER;

    /**
     * The feature id for the '<em><b>Indirectly Impacts</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_ASSET__INDIRECTLY_IMPACTS = ASSET__INDIRECTLY_IMPACTS;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_ASSET__DESCRIPTION = ASSET__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Entity Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_ASSET__ENTITY_INSTANTIATION = ASSET_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Structural Asset</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_ASSET_FEATURE_COUNT = ASSET_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Structural Asset</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_ASSET_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.CompetitiveAdvantageImpl <em>Competitive Advantage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.CompetitiveAdvantageImpl
     * @see risk.type.impl.TypePackageImpl#getCompetitiveAdvantage()
     * @generated
     */
    int COMPETITIVE_ADVANTAGE = 11;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPETITIVE_ADVANTAGE__ID = ASSET__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPETITIVE_ADVANTAGE__VISUAL_ELEMENTS = ASSET__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPETITIVE_ADVANTAGE__VALUE = ASSET__VALUE;

    /**
     * The feature id for the '<em><b>Interested Stakeholder</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPETITIVE_ADVANTAGE__INTERESTED_STAKEHOLDER = ASSET__INTERESTED_STAKEHOLDER;

    /**
     * The feature id for the '<em><b>Indirectly Impacts</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPETITIVE_ADVANTAGE__INDIRECTLY_IMPACTS = ASSET__INDIRECTLY_IMPACTS;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPETITIVE_ADVANTAGE__DESCRIPTION = ASSET__DESCRIPTION;

    /**
     * The number of structural features of the '<em>Competitive Advantage</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPETITIVE_ADVANTAGE_FEATURE_COUNT = ASSET_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Competitive Advantage</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPETITIVE_ADVANTAGE_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.StakeholderImpl <em>Stakeholder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.StakeholderImpl
     * @see risk.type.impl.TypePackageImpl#getStakeholder()
     * @generated
     */
    int STAKEHOLDER = 12;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STAKEHOLDER__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STAKEHOLDER__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Owned Entity Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STAKEHOLDER__OWNED_ENTITY_INSTANTIATIONS = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Assets To Protect</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STAKEHOLDER__ASSETS_TO_PROTECT = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STAKEHOLDER__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Stakeholder</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STAKEHOLDER_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Stakeholder</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STAKEHOLDER_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.DataAssetImpl <em>Data Asset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.DataAssetImpl
     * @see risk.type.impl.TypePackageImpl#getDataAsset()
     * @generated
     */
    int DATA_ASSET = 13;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ASSET__ID = ASSET__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ASSET__VISUAL_ELEMENTS = ASSET__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ASSET__VALUE = ASSET__VALUE;

    /**
     * The feature id for the '<em><b>Interested Stakeholder</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ASSET__INTERESTED_STAKEHOLDER = ASSET__INTERESTED_STAKEHOLDER;

    /**
     * The feature id for the '<em><b>Indirectly Impacts</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ASSET__INDIRECTLY_IMPACTS = ASSET__INDIRECTLY_IMPACTS;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ASSET__DESCRIPTION = ASSET__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Data Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ASSET__DATA_INSTANTIATION = ASSET_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Data Asset</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ASSET_FEATURE_COUNT = ASSET_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Data Asset</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ASSET_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.IdentityAssetImpl <em>Identity Asset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.IdentityAssetImpl
     * @see risk.type.impl.TypePackageImpl#getIdentityAsset()
     * @generated
     */
    int IDENTITY_ASSET = 14;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ASSET__ID = ASSET__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ASSET__VISUAL_ELEMENTS = ASSET__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ASSET__VALUE = ASSET__VALUE;

    /**
     * The feature id for the '<em><b>Interested Stakeholder</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ASSET__INTERESTED_STAKEHOLDER = ASSET__INTERESTED_STAKEHOLDER;

    /**
     * The feature id for the '<em><b>Indirectly Impacts</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ASSET__INDIRECTLY_IMPACTS = ASSET__INDIRECTLY_IMPACTS;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ASSET__DESCRIPTION = ASSET__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Identity Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ASSET__IDENTITY_INSTANTIATION = ASSET_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Identity Asset</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ASSET_FEATURE_COUNT = ASSET_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Identity Asset</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ASSET_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.DeliberateThreatImpl <em>Deliberate Threat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.DeliberateThreatImpl
     * @see risk.type.impl.TypePackageImpl#getDeliberateThreat()
     * @generated
     */
    int DELIBERATE_THREAT = 15;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIBERATE_THREAT__ID = THREAT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIBERATE_THREAT__VISUAL_ELEMENTS = THREAT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIBERATE_THREAT__DESCRIPTION = THREAT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Entity Instantiation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIBERATE_THREAT__ENTITY_INSTANTIATION = THREAT__ENTITY_INSTANTIATION;

    /**
     * The number of structural features of the '<em>Deliberate Threat</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIBERATE_THREAT_FEATURE_COUNT = THREAT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Deliberate Threat</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELIBERATE_THREAT_OPERATION_COUNT = THREAT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.AccidentalThreatImpl <em>Accidental Threat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.AccidentalThreatImpl
     * @see risk.type.impl.TypePackageImpl#getAccidentalThreat()
     * @generated
     */
    int ACCIDENTAL_THREAT = 16;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCIDENTAL_THREAT__ID = THREAT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCIDENTAL_THREAT__VISUAL_ELEMENTS = THREAT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCIDENTAL_THREAT__DESCRIPTION = THREAT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Entity Instantiation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCIDENTAL_THREAT__ENTITY_INSTANTIATION = THREAT__ENTITY_INSTANTIATION;

    /**
     * The number of structural features of the '<em>Accidental Threat</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCIDENTAL_THREAT_FEATURE_COUNT = THREAT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Accidental Threat</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCIDENTAL_THREAT_OPERATION_COUNT = THREAT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.NegativeConsequenceImpl <em>Negative Consequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.NegativeConsequenceImpl
     * @see risk.type.impl.TypePackageImpl#getNegativeConsequence()
     * @generated
     */
    int NEGATIVE_CONSEQUENCE = 17;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEGATIVE_CONSEQUENCE__ID = CONSEQUENCE__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEGATIVE_CONSEQUENCE__VISUAL_ELEMENTS = CONSEQUENCE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Affected Asset</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEGATIVE_CONSEQUENCE__AFFECTED_ASSET = CONSEQUENCE__AFFECTED_ASSET;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEGATIVE_CONSEQUENCE__DESCRIPTION = CONSEQUENCE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Likelihood</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEGATIVE_CONSEQUENCE__LIKELIHOOD = CONSEQUENCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Severity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEGATIVE_CONSEQUENCE__SEVERITY = CONSEQUENCE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Negative Consequence</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEGATIVE_CONSEQUENCE_FEATURE_COUNT = CONSEQUENCE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Negative Consequence</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEGATIVE_CONSEQUENCE_OPERATION_COUNT = CONSEQUENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.LossImpl <em>Loss</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.LossImpl
     * @see risk.type.impl.TypePackageImpl#getLoss()
     * @generated
     */
    int LOSS = 18;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOSS__ID = NEGATIVE_CONSEQUENCE__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOSS__VISUAL_ELEMENTS = NEGATIVE_CONSEQUENCE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Affected Asset</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOSS__AFFECTED_ASSET = NEGATIVE_CONSEQUENCE__AFFECTED_ASSET;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOSS__DESCRIPTION = NEGATIVE_CONSEQUENCE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Likelihood</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOSS__LIKELIHOOD = NEGATIVE_CONSEQUENCE__LIKELIHOOD;

    /**
     * The feature id for the '<em><b>Severity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOSS__SEVERITY = NEGATIVE_CONSEQUENCE__SEVERITY;

    /**
     * The number of structural features of the '<em>Loss</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOSS_FEATURE_COUNT = NEGATIVE_CONSEQUENCE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Loss</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOSS_OPERATION_COUNT = NEGATIVE_CONSEQUENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.PositiveConsequenceImpl <em>Positive Consequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.PositiveConsequenceImpl
     * @see risk.type.impl.TypePackageImpl#getPositiveConsequence()
     * @generated
     */
    int POSITIVE_CONSEQUENCE = 19;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIVE_CONSEQUENCE__ID = CONSEQUENCE__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIVE_CONSEQUENCE__VISUAL_ELEMENTS = CONSEQUENCE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Affected Asset</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIVE_CONSEQUENCE__AFFECTED_ASSET = CONSEQUENCE__AFFECTED_ASSET;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIVE_CONSEQUENCE__DESCRIPTION = CONSEQUENCE__DESCRIPTION;

    /**
     * The number of structural features of the '<em>Positive Consequence</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIVE_CONSEQUENCE_FEATURE_COUNT = CONSEQUENCE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Positive Consequence</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITIVE_CONSEQUENCE_OPERATION_COUNT = CONSEQUENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.GainBenefitImpl <em>Gain Benefit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.GainBenefitImpl
     * @see risk.type.impl.TypePackageImpl#getGainBenefit()
     * @generated
     */
    int GAIN_BENEFIT = 20;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GAIN_BENEFIT__ID = POSITIVE_CONSEQUENCE__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GAIN_BENEFIT__VISUAL_ELEMENTS = POSITIVE_CONSEQUENCE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Affected Asset</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GAIN_BENEFIT__AFFECTED_ASSET = POSITIVE_CONSEQUENCE__AFFECTED_ASSET;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GAIN_BENEFIT__DESCRIPTION = POSITIVE_CONSEQUENCE__DESCRIPTION;

    /**
     * The number of structural features of the '<em>Gain Benefit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GAIN_BENEFIT_FEATURE_COUNT = POSITIVE_CONSEQUENCE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Gain Benefit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GAIN_BENEFIT_OPERATION_COUNT = POSITIVE_CONSEQUENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.RiskAssessmentImpl <em>Risk Assessment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.RiskAssessmentImpl
     * @see risk.type.impl.TypePackageImpl#getRiskAssessment()
     * @generated
     */
    int RISK_ASSESSMENT = 28;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_ASSESSMENT__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_ASSESSMENT__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_ASSESSMENT__DESCRIPTION = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Risk Assessment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_ASSESSMENT_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Risk Assessment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_ASSESSMENT_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.PerceivedRiskImpl <em>Perceived Risk</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.PerceivedRiskImpl
     * @see risk.type.impl.TypePackageImpl#getPerceivedRisk()
     * @generated
     */
    int PERCEIVED_RISK = 21;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERCEIVED_RISK__ID = RISK_ASSESSMENT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERCEIVED_RISK__VISUAL_ELEMENTS = RISK_ASSESSMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERCEIVED_RISK__DESCRIPTION = RISK_ASSESSMENT__DESCRIPTION;

    /**
     * The number of structural features of the '<em>Perceived Risk</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERCEIVED_RISK_FEATURE_COUNT = RISK_ASSESSMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Perceived Risk</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERCEIVED_RISK_OPERATION_COUNT = RISK_ASSESSMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.RealRiskImpl <em>Real Risk</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.RealRiskImpl
     * @see risk.type.impl.TypePackageImpl#getRealRisk()
     * @generated
     */
    int REAL_RISK = 22;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REAL_RISK__ID = RISK_ASSESSMENT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REAL_RISK__VISUAL_ELEMENTS = RISK_ASSESSMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REAL_RISK__DESCRIPTION = RISK_ASSESSMENT__DESCRIPTION;

    /**
     * The number of structural features of the '<em>Real Risk</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REAL_RISK_FEATURE_COUNT = RISK_ASSESSMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Real Risk</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REAL_RISK_OPERATION_COUNT = RISK_ASSESSMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.PrivacyImpl <em>Privacy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.PrivacyImpl
     * @see risk.type.impl.TypePackageImpl#getPrivacy()
     * @generated
     */
    int PRIVACY = 23;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY__ID = ASSET__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY__VISUAL_ELEMENTS = ASSET__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY__VALUE = ASSET__VALUE;

    /**
     * The feature id for the '<em><b>Interested Stakeholder</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY__INTERESTED_STAKEHOLDER = ASSET__INTERESTED_STAKEHOLDER;

    /**
     * The feature id for the '<em><b>Indirectly Impacts</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY__INDIRECTLY_IMPACTS = ASSET__INDIRECTLY_IMPACTS;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY__DESCRIPTION = ASSET__DESCRIPTION;

    /**
     * The number of structural features of the '<em>Privacy</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_FEATURE_COUNT = ASSET_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Privacy</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.LossOfControlImpl <em>Loss Of Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.LossOfControlImpl
     * @see risk.type.impl.TypePackageImpl#getLossOfControl()
     * @generated
     */
    int LOSS_OF_CONTROL = 24;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOSS_OF_CONTROL__ID = ASSET__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOSS_OF_CONTROL__VISUAL_ELEMENTS = ASSET__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOSS_OF_CONTROL__VALUE = ASSET__VALUE;

    /**
     * The feature id for the '<em><b>Interested Stakeholder</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOSS_OF_CONTROL__INTERESTED_STAKEHOLDER = ASSET__INTERESTED_STAKEHOLDER;

    /**
     * The feature id for the '<em><b>Indirectly Impacts</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOSS_OF_CONTROL__INDIRECTLY_IMPACTS = ASSET__INDIRECTLY_IMPACTS;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOSS_OF_CONTROL__DESCRIPTION = ASSET__DESCRIPTION;

    /**
     * The number of structural features of the '<em>Loss Of Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOSS_OF_CONTROL_FEATURE_COUNT = ASSET_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Loss Of Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOSS_OF_CONTROL_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.AdvertisementRevenueImpl <em>Advertisement Revenue</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.AdvertisementRevenueImpl
     * @see risk.type.impl.TypePackageImpl#getAdvertisementRevenue()
     * @generated
     */
    int ADVERTISEMENT_REVENUE = 25;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERTISEMENT_REVENUE__ID = ASSET__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERTISEMENT_REVENUE__VISUAL_ELEMENTS = ASSET__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERTISEMENT_REVENUE__VALUE = ASSET__VALUE;

    /**
     * The feature id for the '<em><b>Interested Stakeholder</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERTISEMENT_REVENUE__INTERESTED_STAKEHOLDER = ASSET__INTERESTED_STAKEHOLDER;

    /**
     * The feature id for the '<em><b>Indirectly Impacts</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERTISEMENT_REVENUE__INDIRECTLY_IMPACTS = ASSET__INDIRECTLY_IMPACTS;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERTISEMENT_REVENUE__DESCRIPTION = ASSET__DESCRIPTION;

    /**
     * The number of structural features of the '<em>Advertisement Revenue</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERTISEMENT_REVENUE_FEATURE_COUNT = ASSET_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Advertisement Revenue</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADVERTISEMENT_REVENUE_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.PrivacyViolationIncidentImpl <em>Privacy Violation Incident</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.PrivacyViolationIncidentImpl
     * @see risk.type.impl.TypePackageImpl#getPrivacyViolationIncident()
     * @generated
     */
    int PRIVACY_VIOLATION_INCIDENT = 26;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_VIOLATION_INCIDENT__ID = INCIDENT_TYPE__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_VIOLATION_INCIDENT__VISUAL_ELEMENTS = INCIDENT_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_VIOLATION_INCIDENT__DESCRIPTION = INCIDENT_TYPE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Likelihood</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_VIOLATION_INCIDENT__LIKELIHOOD = INCIDENT_TYPE__LIKELIHOOD;

    /**
     * The feature id for the '<em><b>Enables</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_VIOLATION_INCIDENT__ENABLES = INCIDENT_TYPE__ENABLES;

    /**
     * The feature id for the '<em><b>Negative Consequences</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_VIOLATION_INCIDENT__NEGATIVE_CONSEQUENCES = INCIDENT_TYPE__NEGATIVE_CONSEQUENCES;

    /**
     * The feature id for the '<em><b>Likelihood Measurement</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_VIOLATION_INCIDENT__LIKELIHOOD_MEASUREMENT = INCIDENT_TYPE__LIKELIHOOD_MEASUREMENT;

    /**
     * The number of structural features of the '<em>Privacy Violation Incident</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_VIOLATION_INCIDENT_FEATURE_COUNT = INCIDENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Privacy Violation Incident</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVACY_VIOLATION_INCIDENT_OPERATION_COUNT = INCIDENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.DataLeakImpl <em>Data Leak</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.DataLeakImpl
     * @see risk.type.impl.TypePackageImpl#getDataLeak()
     * @generated
     */
    int DATA_LEAK = 27;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_LEAK__ID = INCIDENT_TYPE__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_LEAK__VISUAL_ELEMENTS = INCIDENT_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_LEAK__DESCRIPTION = INCIDENT_TYPE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Likelihood</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_LEAK__LIKELIHOOD = INCIDENT_TYPE__LIKELIHOOD;

    /**
     * The feature id for the '<em><b>Enables</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_LEAK__ENABLES = INCIDENT_TYPE__ENABLES;

    /**
     * The feature id for the '<em><b>Negative Consequences</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_LEAK__NEGATIVE_CONSEQUENCES = INCIDENT_TYPE__NEGATIVE_CONSEQUENCES;

    /**
     * The feature id for the '<em><b>Likelihood Measurement</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_LEAK__LIKELIHOOD_MEASUREMENT = INCIDENT_TYPE__LIKELIHOOD_MEASUREMENT;

    /**
     * The number of structural features of the '<em>Data Leak</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_LEAK_FEATURE_COUNT = INCIDENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Data Leak</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_LEAK_OPERATION_COUNT = INCIDENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.RiskTypePackageImpl <em>Risk Type Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.RiskTypePackageImpl
     * @see risk.type.impl.TypePackageImpl#getRiskTypePackage()
     * @generated
     */
    int RISK_TYPE_PACKAGE = 29;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_TYPE_PACKAGE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_TYPE_PACKAGE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Stakeholders</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_TYPE_PACKAGE__STAKEHOLDERS = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Assets</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_TYPE_PACKAGE__ASSETS = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Threats</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_TYPE_PACKAGE__THREATS = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Vulnerabilities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_TYPE_PACKAGE__VULNERABILITIES = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Unwanted Incidents</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_TYPE_PACKAGE__UNWANTED_INCIDENTS = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_TYPE_PACKAGE__SCENARIOS = ModelsPackage.ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Risk Assessments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_TYPE_PACKAGE__RISK_ASSESSMENTS = ModelsPackage.ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Countermeasures</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_TYPE_PACKAGE__COUNTERMEASURES = ModelsPackage.ELEMENT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Super Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_TYPE_PACKAGE__SUPER_PACKAGE = ModelsPackage.ELEMENT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Sub Packages</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_TYPE_PACKAGE__SUB_PACKAGES = ModelsPackage.ELEMENT_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_TYPE_PACKAGE__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_TYPE_PACKAGE__MODEL = ModelsPackage.ELEMENT_FEATURE_COUNT + 11;

    /**
     * The number of structural features of the '<em>Risk Type Package</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_TYPE_PACKAGE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 12;

    /**
     * The number of operations of the '<em>Risk Type Package</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RISK_TYPE_PACKAGE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.MisuseCaseImpl <em>Misuse Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.MisuseCaseImpl
     * @see risk.type.impl.TypePackageImpl#getMisuseCase()
     * @generated
     */
    int MISUSE_CASE = 30;

    /**
     * The number of structural features of the '<em>Misuse Case</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MISUSE_CASE_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Misuse Case</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MISUSE_CASE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link risk.type.impl.AttackScenarioImpl <em>Attack Scenario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.AttackScenarioImpl
     * @see risk.type.impl.TypePackageImpl#getAttackScenario()
     * @generated
     */
    int ATTACK_SCENARIO = 31;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACK_SCENARIO__ID = THREAT_SCENARIO__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACK_SCENARIO__VISUAL_ELEMENTS = THREAT_SCENARIO__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Threat</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACK_SCENARIO__THREAT = THREAT_SCENARIO__THREAT;

    /**
     * The feature id for the '<em><b>Vulnerability</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACK_SCENARIO__VULNERABILITY = THREAT_SCENARIO__VULNERABILITY;

    /**
     * The feature id for the '<em><b>Unwanted Incidents</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACK_SCENARIO__UNWANTED_INCIDENTS = THREAT_SCENARIO__UNWANTED_INCIDENTS;

    /**
     * The feature id for the '<em><b>Requires Scenario</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACK_SCENARIO__REQUIRES_SCENARIO = THREAT_SCENARIO__REQUIRES_SCENARIO;

    /**
     * The feature id for the '<em><b>Enables Scenario</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACK_SCENARIO__ENABLES_SCENARIO = THREAT_SCENARIO__ENABLES_SCENARIO;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACK_SCENARIO__DESCRIPTION = THREAT_SCENARIO__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Countermeasures</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACK_SCENARIO__COUNTERMEASURES = THREAT_SCENARIO__COUNTERMEASURES;

    /**
     * The feature id for the '<em><b>Refinement Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACK_SCENARIO__REFINEMENT_TYPE = THREAT_SCENARIO__REFINEMENT_TYPE;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACK_SCENARIO__ATTRIBUTES = THREAT_SCENARIO__ATTRIBUTES;

    /**
     * The feature id for the '<em><b>Likelihood</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACK_SCENARIO__LIKELIHOOD = THREAT_SCENARIO__LIKELIHOOD;

    /**
     * The feature id for the '<em><b>Likelihood Measurement</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACK_SCENARIO__LIKELIHOOD_MEASUREMENT = THREAT_SCENARIO__LIKELIHOOD_MEASUREMENT;

    /**
     * The number of structural features of the '<em>Attack Scenario</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACK_SCENARIO_FEATURE_COUNT = THREAT_SCENARIO_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Attack Scenario</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACK_SCENARIO_OPERATION_COUNT = THREAT_SCENARIO_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.ThreatScenarioAttributeImpl <em>Threat Scenario Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.ThreatScenarioAttributeImpl
     * @see risk.type.impl.TypePackageImpl#getThreatScenarioAttribute()
     * @generated
     */
    int THREAT_SCENARIO_ATTRIBUTE = 33;

    /**
     * The feature id for the '<em><b>Modality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAT_SCENARIO_ATTRIBUTE__MODALITY = 0;

    /**
     * The number of structural features of the '<em>Threat Scenario Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAT_SCENARIO_ATTRIBUTE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Threat Scenario Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAT_SCENARIO_ATTRIBUTE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link risk.type.impl.SpecialEquipmentImpl <em>Special Equipment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.SpecialEquipmentImpl
     * @see risk.type.impl.TypePackageImpl#getSpecialEquipment()
     * @generated
     */
    int SPECIAL_EQUIPMENT = 32;

    /**
     * The feature id for the '<em><b>Modality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIAL_EQUIPMENT__MODALITY = THREAT_SCENARIO_ATTRIBUTE__MODALITY;

    /**
     * The number of structural features of the '<em>Special Equipment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIAL_EQUIPMENT_FEATURE_COUNT = THREAT_SCENARIO_ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Special Equipment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIAL_EQUIPMENT_OPERATION_COUNT = THREAT_SCENARIO_ATTRIBUTE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.CostImpl <em>Cost</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.CostImpl
     * @see risk.type.impl.TypePackageImpl#getCost()
     * @generated
     */
    int COST = 34;

    /**
     * The feature id for the '<em><b>Modality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COST__MODALITY = THREAT_SCENARIO_ATTRIBUTE__MODALITY;

    /**
     * The number of structural features of the '<em>Cost</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COST_FEATURE_COUNT = THREAT_SCENARIO_ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Cost</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COST_OPERATION_COUNT = THREAT_SCENARIO_ATTRIBUTE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.SkillImpl <em>Skill</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.SkillImpl
     * @see risk.type.impl.TypePackageImpl#getSkill()
     * @generated
     */
    int SKILL = 35;

    /**
     * The feature id for the '<em><b>Modality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL__MODALITY = THREAT_SCENARIO_ATTRIBUTE__MODALITY;

    /**
     * The number of structural features of the '<em>Skill</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_FEATURE_COUNT = THREAT_SCENARIO_ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Skill</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_OPERATION_COUNT = THREAT_SCENARIO_ATTRIBUTE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.PhysicalDamageImpl <em>Physical Damage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.PhysicalDamageImpl
     * @see risk.type.impl.TypePackageImpl#getPhysicalDamage()
     * @generated
     */
    int PHYSICAL_DAMAGE = 36;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DAMAGE__ID = NEGATIVE_CONSEQUENCE__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DAMAGE__VISUAL_ELEMENTS = NEGATIVE_CONSEQUENCE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Affected Asset</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DAMAGE__AFFECTED_ASSET = NEGATIVE_CONSEQUENCE__AFFECTED_ASSET;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DAMAGE__DESCRIPTION = NEGATIVE_CONSEQUENCE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Likelihood</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DAMAGE__LIKELIHOOD = NEGATIVE_CONSEQUENCE__LIKELIHOOD;

    /**
     * The feature id for the '<em><b>Severity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DAMAGE__SEVERITY = NEGATIVE_CONSEQUENCE__SEVERITY;

    /**
     * The number of structural features of the '<em>Physical Damage</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DAMAGE_FEATURE_COUNT = NEGATIVE_CONSEQUENCE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Physical Damage</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DAMAGE_OPERATION_COUNT = NEGATIVE_CONSEQUENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.EconomicDamageImpl <em>Economic Damage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.EconomicDamageImpl
     * @see risk.type.impl.TypePackageImpl#getEconomicDamage()
     * @generated
     */
    int ECONOMIC_DAMAGE = 37;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECONOMIC_DAMAGE__ID = NEGATIVE_CONSEQUENCE__ID;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECONOMIC_DAMAGE__VISUAL_ELEMENTS = NEGATIVE_CONSEQUENCE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Affected Asset</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECONOMIC_DAMAGE__AFFECTED_ASSET = NEGATIVE_CONSEQUENCE__AFFECTED_ASSET;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECONOMIC_DAMAGE__DESCRIPTION = NEGATIVE_CONSEQUENCE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Likelihood</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECONOMIC_DAMAGE__LIKELIHOOD = NEGATIVE_CONSEQUENCE__LIKELIHOOD;

    /**
     * The feature id for the '<em><b>Severity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECONOMIC_DAMAGE__SEVERITY = NEGATIVE_CONSEQUENCE__SEVERITY;

    /**
     * The number of structural features of the '<em>Economic Damage</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECONOMIC_DAMAGE_FEATURE_COUNT = NEGATIVE_CONSEQUENCE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Economic Damage</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECONOMIC_DAMAGE_OPERATION_COUNT = NEGATIVE_CONSEQUENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.UndesiredEventTypeImpl <em>Undesired Event Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.UndesiredEventTypeImpl
     * @see risk.type.impl.TypePackageImpl#getUndesiredEventType()
     * @generated
     */
    int UNDESIRED_EVENT_TYPE = 40;

    /**
     * The number of structural features of the '<em>Undesired Event Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNDESIRED_EVENT_TYPE_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Undesired Event Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNDESIRED_EVENT_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link risk.type.impl.NearMissTypeImpl <em>Near Miss Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.NearMissTypeImpl
     * @see risk.type.impl.TypePackageImpl#getNearMissType()
     * @generated
     */
    int NEAR_MISS_TYPE = 38;

    /**
     * The number of structural features of the '<em>Near Miss Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEAR_MISS_TYPE_FEATURE_COUNT = UNDESIRED_EVENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Near Miss Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEAR_MISS_TYPE_OPERATION_COUNT = UNDESIRED_EVENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.impl.AccidentTypeImpl <em>Accident Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.impl.AccidentTypeImpl
     * @see risk.type.impl.TypePackageImpl#getAccidentType()
     * @generated
     */
    int ACCIDENT_TYPE = 39;

    /**
     * The number of structural features of the '<em>Accident Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCIDENT_TYPE_FEATURE_COUNT = UNDESIRED_EVENT_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Accident Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCIDENT_TYPE_OPERATION_COUNT = UNDESIRED_EVENT_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link risk.type.SeverityLevel <em>Severity Level</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.SeverityLevel
     * @see risk.type.impl.TypePackageImpl#getSeverityLevel()
     * @generated
     */
    int SEVERITY_LEVEL = 41;

    /**
     * The meta object id for the '{@link risk.type.SeverityLevelCORAS <em>Severity Level CORAS</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.SeverityLevelCORAS
     * @see risk.type.impl.TypePackageImpl#getSeverityLevelCORAS()
     * @generated
     */
    int SEVERITY_LEVEL_CORAS = 42;

    /**
     * The meta object id for the '{@link risk.type.RefinementType <em>Refinement Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.RefinementType
     * @see risk.type.impl.TypePackageImpl#getRefinementType()
     * @generated
     */
    int REFINEMENT_TYPE = 43;

    /**
     * The meta object id for the '{@link risk.type.AttributeModality <em>Attribute Modality</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see risk.type.AttributeModality
     * @see risk.type.impl.TypePackageImpl#getAttributeModality()
     * @generated
     */
    int ATTRIBUTE_MODALITY = 44;


    /**
     * Returns the meta object for class '{@link risk.type.Asset <em>Asset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Asset</em>'.
     * @see risk.type.Asset
     * @generated
     */
    EClass getAsset();

    /**
     * Returns the meta object for the containment reference '{@link risk.type.Asset#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value</em>'.
     * @see risk.type.Asset#getValue()
     * @see #getAsset()
     * @generated
     */
    EReference getAsset_Value();

    /**
     * Returns the meta object for the reference list '{@link risk.type.Asset#getInterestedStakeholder <em>Interested Stakeholder</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Interested Stakeholder</em>'.
     * @see risk.type.Asset#getInterestedStakeholder()
     * @see #getAsset()
     * @generated
     */
    EReference getAsset_InterestedStakeholder();

    /**
     * Returns the meta object for the reference list '{@link risk.type.Asset#getIndirectlyImpacts <em>Indirectly Impacts</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Indirectly Impacts</em>'.
     * @see risk.type.Asset#getIndirectlyImpacts()
     * @see #getAsset()
     * @generated
     */
    EReference getAsset_IndirectlyImpacts();

    /**
     * Returns the meta object for the attribute '{@link risk.type.Asset#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see risk.type.Asset#getDescription()
     * @see #getAsset()
     * @generated
     */
    EAttribute getAsset_Description();

    /**
     * Returns the meta object for class '{@link risk.type.ThreatScenario <em>Threat Scenario</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Threat Scenario</em>'.
     * @see risk.type.ThreatScenario
     * @generated
     */
    EClass getThreatScenario();

    /**
     * Returns the meta object for the reference '{@link risk.type.ThreatScenario#getThreat <em>Threat</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Threat</em>'.
     * @see risk.type.ThreatScenario#getThreat()
     * @see #getThreatScenario()
     * @generated
     */
    EReference getThreatScenario_Threat();

    /**
     * Returns the meta object for the reference list '{@link risk.type.ThreatScenario#getVulnerability <em>Vulnerability</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Vulnerability</em>'.
     * @see risk.type.ThreatScenario#getVulnerability()
     * @see #getThreatScenario()
     * @generated
     */
    EReference getThreatScenario_Vulnerability();

    /**
     * Returns the meta object for the reference list '{@link risk.type.ThreatScenario#getUnwantedIncidents <em>Unwanted Incidents</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Unwanted Incidents</em>'.
     * @see risk.type.ThreatScenario#getUnwantedIncidents()
     * @see #getThreatScenario()
     * @generated
     */
    EReference getThreatScenario_UnwantedIncidents();

    /**
     * Returns the meta object for the reference list '{@link risk.type.ThreatScenario#getRequiresScenario <em>Requires Scenario</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Requires Scenario</em>'.
     * @see risk.type.ThreatScenario#getRequiresScenario()
     * @see #getThreatScenario()
     * @generated
     */
    EReference getThreatScenario_RequiresScenario();

    /**
     * Returns the meta object for the reference list '{@link risk.type.ThreatScenario#getEnablesScenario <em>Enables Scenario</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Enables Scenario</em>'.
     * @see risk.type.ThreatScenario#getEnablesScenario()
     * @see #getThreatScenario()
     * @generated
     */
    EReference getThreatScenario_EnablesScenario();

    /**
     * Returns the meta object for the attribute '{@link risk.type.ThreatScenario#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see risk.type.ThreatScenario#getDescription()
     * @see #getThreatScenario()
     * @generated
     */
    EAttribute getThreatScenario_Description();

    /**
     * Returns the meta object for the reference list '{@link risk.type.ThreatScenario#getCountermeasures <em>Countermeasures</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Countermeasures</em>'.
     * @see risk.type.ThreatScenario#getCountermeasures()
     * @see #getThreatScenario()
     * @generated
     */
    EReference getThreatScenario_Countermeasures();

    /**
     * Returns the meta object for the attribute '{@link risk.type.ThreatScenario#getRefinementType <em>Refinement Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Refinement Type</em>'.
     * @see risk.type.ThreatScenario#getRefinementType()
     * @see #getThreatScenario()
     * @generated
     */
    EAttribute getThreatScenario_RefinementType();

    /**
     * Returns the meta object for the containment reference list '{@link risk.type.ThreatScenario#getAttributes <em>Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attributes</em>'.
     * @see risk.type.ThreatScenario#getAttributes()
     * @see #getThreatScenario()
     * @generated
     */
    EReference getThreatScenario_Attributes();

    /**
     * Returns the meta object for the attribute '{@link risk.type.ThreatScenario#getLikelihood <em>Likelihood</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Likelihood</em>'.
     * @see risk.type.ThreatScenario#getLikelihood()
     * @see #getThreatScenario()
     * @generated
     */
    EAttribute getThreatScenario_Likelihood();

    /**
     * Returns the meta object for the containment reference '{@link risk.type.ThreatScenario#getLikelihoodMeasurement <em>Likelihood Measurement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Likelihood Measurement</em>'.
     * @see risk.type.ThreatScenario#getLikelihoodMeasurement()
     * @see #getThreatScenario()
     * @generated
     */
    EReference getThreatScenario_LikelihoodMeasurement();

    /**
     * Returns the meta object for class '{@link risk.type.Threat <em>Threat</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Threat</em>'.
     * @see risk.type.Threat
     * @generated
     */
    EClass getThreat();

    /**
     * Returns the meta object for the attribute '{@link risk.type.Threat#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see risk.type.Threat#getDescription()
     * @see #getThreat()
     * @generated
     */
    EAttribute getThreat_Description();

    /**
     * Returns the meta object for the containment reference '{@link risk.type.Threat#getEntityInstantiation <em>Entity Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Entity Instantiation</em>'.
     * @see risk.type.Threat#getEntityInstantiation()
     * @see #getThreat()
     * @generated
     */
    EReference getThreat_EntityInstantiation();

    /**
     * Returns the meta object for class '{@link risk.type.Vulnerability <em>Vulnerability</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Vulnerability</em>'.
     * @see risk.type.Vulnerability
     * @generated
     */
    EClass getVulnerability();

    /**
     * Returns the meta object for the attribute '{@link risk.type.Vulnerability#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see risk.type.Vulnerability#getDescription()
     * @see #getVulnerability()
     * @generated
     */
    EAttribute getVulnerability_Description();

    /**
     * Returns the meta object for the reference list '{@link risk.type.Vulnerability#getCountermeasures <em>Countermeasures</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Countermeasures</em>'.
     * @see risk.type.Vulnerability#getCountermeasures()
     * @see #getVulnerability()
     * @generated
     */
    EReference getVulnerability_Countermeasures();

    /**
     * Returns the meta object for the reference '{@link risk.type.Vulnerability#getEntityInstantiation <em>Entity Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Entity Instantiation</em>'.
     * @see risk.type.Vulnerability#getEntityInstantiation()
     * @see #getVulnerability()
     * @generated
     */
    EReference getVulnerability_EntityInstantiation();

    /**
     * Returns the meta object for class '{@link risk.type.IncidentType <em>Incident Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Incident Type</em>'.
     * @see risk.type.IncidentType
     * @generated
     */
    EClass getIncidentType();

    /**
     * Returns the meta object for the attribute '{@link risk.type.IncidentType#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see risk.type.IncidentType#getDescription()
     * @see #getIncidentType()
     * @generated
     */
    EAttribute getIncidentType_Description();

    /**
     * Returns the meta object for the attribute '{@link risk.type.IncidentType#getLikelihood <em>Likelihood</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Likelihood</em>'.
     * @see risk.type.IncidentType#getLikelihood()
     * @see #getIncidentType()
     * @generated
     */
    EAttribute getIncidentType_Likelihood();

    /**
     * Returns the meta object for the reference list '{@link risk.type.IncidentType#getEnables <em>Enables</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Enables</em>'.
     * @see risk.type.IncidentType#getEnables()
     * @see #getIncidentType()
     * @generated
     */
    EReference getIncidentType_Enables();

    /**
     * Returns the meta object for the containment reference list '{@link risk.type.IncidentType#getNegativeConsequences <em>Negative Consequences</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Negative Consequences</em>'.
     * @see risk.type.IncidentType#getNegativeConsequences()
     * @see #getIncidentType()
     * @generated
     */
    EReference getIncidentType_NegativeConsequences();

    /**
     * Returns the meta object for the containment reference '{@link risk.type.IncidentType#getLikelihoodMeasurement <em>Likelihood Measurement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Likelihood Measurement</em>'.
     * @see risk.type.IncidentType#getLikelihoodMeasurement()
     * @see #getIncidentType()
     * @generated
     */
    EReference getIncidentType_LikelihoodMeasurement();

    /**
     * Returns the meta object for class '{@link risk.type.Response <em>Response</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Response</em>'.
     * @see risk.type.Response
     * @generated
     */
    EClass getResponse();

    /**
     * Returns the meta object for class '{@link risk.type.Countermeasure <em>Countermeasure</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Countermeasure</em>'.
     * @see risk.type.Countermeasure
     * @generated
     */
    EClass getCountermeasure();

    /**
     * Returns the meta object for the containment reference '{@link risk.type.Countermeasure#getCost <em>Cost</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Cost</em>'.
     * @see risk.type.Countermeasure#getCost()
     * @see #getCountermeasure()
     * @generated
     */
    EReference getCountermeasure_Cost();

    /**
     * Returns the meta object for the attribute '{@link risk.type.Countermeasure#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see risk.type.Countermeasure#getDescription()
     * @see #getCountermeasure()
     * @generated
     */
    EAttribute getCountermeasure_Description();

    /**
     * Returns the meta object for the reference list '{@link risk.type.Countermeasure#getRuleTemplates <em>Rule Templates</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Rule Templates</em>'.
     * @see risk.type.Countermeasure#getRuleTemplates()
     * @see #getCountermeasure()
     * @generated
     */
    EReference getCountermeasure_RuleTemplates();

    /**
     * Returns the meta object for class '{@link risk.type.MonetaryAmount <em>Monetary Amount</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Monetary Amount</em>'.
     * @see risk.type.MonetaryAmount
     * @generated
     */
    EClass getMonetaryAmount();

    /**
     * Returns the meta object for class '{@link risk.type.Consequence <em>Consequence</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Consequence</em>'.
     * @see risk.type.Consequence
     * @generated
     */
    EClass getConsequence();

    /**
     * Returns the meta object for the reference '{@link risk.type.Consequence#getAffectedAsset <em>Affected Asset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Affected Asset</em>'.
     * @see risk.type.Consequence#getAffectedAsset()
     * @see #getConsequence()
     * @generated
     */
    EReference getConsequence_AffectedAsset();

    /**
     * Returns the meta object for the attribute '{@link risk.type.Consequence#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see risk.type.Consequence#getDescription()
     * @see #getConsequence()
     * @generated
     */
    EAttribute getConsequence_Description();

    /**
     * Returns the meta object for class '{@link risk.type.Reputation <em>Reputation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Reputation</em>'.
     * @see risk.type.Reputation
     * @generated
     */
    EClass getReputation();

    /**
     * Returns the meta object for class '{@link risk.type.StructuralAsset <em>Structural Asset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Structural Asset</em>'.
     * @see risk.type.StructuralAsset
     * @generated
     */
    EClass getStructuralAsset();

    /**
     * Returns the meta object for the reference '{@link risk.type.StructuralAsset#getEntityInstantiation <em>Entity Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Entity Instantiation</em>'.
     * @see risk.type.StructuralAsset#getEntityInstantiation()
     * @see #getStructuralAsset()
     * @generated
     */
    EReference getStructuralAsset_EntityInstantiation();

    /**
     * Returns the meta object for class '{@link risk.type.CompetitiveAdvantage <em>Competitive Advantage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Competitive Advantage</em>'.
     * @see risk.type.CompetitiveAdvantage
     * @generated
     */
    EClass getCompetitiveAdvantage();

    /**
     * Returns the meta object for class '{@link risk.type.Stakeholder <em>Stakeholder</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Stakeholder</em>'.
     * @see risk.type.Stakeholder
     * @generated
     */
    EClass getStakeholder();

    /**
     * Returns the meta object for the reference list '{@link risk.type.Stakeholder#getOwnedEntityInstantiations <em>Owned Entity Instantiations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Owned Entity Instantiations</em>'.
     * @see risk.type.Stakeholder#getOwnedEntityInstantiations()
     * @see #getStakeholder()
     * @generated
     */
    EReference getStakeholder_OwnedEntityInstantiations();

    /**
     * Returns the meta object for the reference list '{@link risk.type.Stakeholder#getAssetsToProtect <em>Assets To Protect</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Assets To Protect</em>'.
     * @see risk.type.Stakeholder#getAssetsToProtect()
     * @see #getStakeholder()
     * @generated
     */
    EReference getStakeholder_AssetsToProtect();

    /**
     * Returns the meta object for the attribute '{@link risk.type.Stakeholder#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see risk.type.Stakeholder#getName()
     * @see #getStakeholder()
     * @generated
     */
    EAttribute getStakeholder_Name();

    /**
     * Returns the meta object for class '{@link risk.type.DataAsset <em>Data Asset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Asset</em>'.
     * @see risk.type.DataAsset
     * @generated
     */
    EClass getDataAsset();

    /**
     * Returns the meta object for the reference '{@link risk.type.DataAsset#getDataInstantiation <em>Data Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Data Instantiation</em>'.
     * @see risk.type.DataAsset#getDataInstantiation()
     * @see #getDataAsset()
     * @generated
     */
    EReference getDataAsset_DataInstantiation();

    /**
     * Returns the meta object for class '{@link risk.type.IdentityAsset <em>Identity Asset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Identity Asset</em>'.
     * @see risk.type.IdentityAsset
     * @generated
     */
    EClass getIdentityAsset();

    /**
     * Returns the meta object for the reference '{@link risk.type.IdentityAsset#getIdentityInstantiation <em>Identity Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Identity Instantiation</em>'.
     * @see risk.type.IdentityAsset#getIdentityInstantiation()
     * @see #getIdentityAsset()
     * @generated
     */
    EReference getIdentityAsset_IdentityInstantiation();

    /**
     * Returns the meta object for class '{@link risk.type.DeliberateThreat <em>Deliberate Threat</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Deliberate Threat</em>'.
     * @see risk.type.DeliberateThreat
     * @generated
     */
    EClass getDeliberateThreat();

    /**
     * Returns the meta object for class '{@link risk.type.AccidentalThreat <em>Accidental Threat</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Accidental Threat</em>'.
     * @see risk.type.AccidentalThreat
     * @generated
     */
    EClass getAccidentalThreat();

    /**
     * Returns the meta object for class '{@link risk.type.NegativeConsequence <em>Negative Consequence</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Negative Consequence</em>'.
     * @see risk.type.NegativeConsequence
     * @generated
     */
    EClass getNegativeConsequence();

    /**
     * Returns the meta object for the attribute '{@link risk.type.NegativeConsequence#getLikelihood <em>Likelihood</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Likelihood</em>'.
     * @see risk.type.NegativeConsequence#getLikelihood()
     * @see #getNegativeConsequence()
     * @generated
     */
    EAttribute getNegativeConsequence_Likelihood();

    /**
     * Returns the meta object for the attribute '{@link risk.type.NegativeConsequence#getSeverity <em>Severity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Severity</em>'.
     * @see risk.type.NegativeConsequence#getSeverity()
     * @see #getNegativeConsequence()
     * @generated
     */
    EAttribute getNegativeConsequence_Severity();

    /**
     * Returns the meta object for class '{@link risk.type.Loss <em>Loss</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Loss</em>'.
     * @see risk.type.Loss
     * @generated
     */
    EClass getLoss();

    /**
     * Returns the meta object for class '{@link risk.type.PositiveConsequence <em>Positive Consequence</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Positive Consequence</em>'.
     * @see risk.type.PositiveConsequence
     * @generated
     */
    EClass getPositiveConsequence();

    /**
     * Returns the meta object for class '{@link risk.type.GainBenefit <em>Gain Benefit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Gain Benefit</em>'.
     * @see risk.type.GainBenefit
     * @generated
     */
    EClass getGainBenefit();

    /**
     * Returns the meta object for class '{@link risk.type.PerceivedRisk <em>Perceived Risk</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Perceived Risk</em>'.
     * @see risk.type.PerceivedRisk
     * @generated
     */
    EClass getPerceivedRisk();

    /**
     * Returns the meta object for class '{@link risk.type.RealRisk <em>Real Risk</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Real Risk</em>'.
     * @see risk.type.RealRisk
     * @generated
     */
    EClass getRealRisk();

    /**
     * Returns the meta object for class '{@link risk.type.Privacy <em>Privacy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Privacy</em>'.
     * @see risk.type.Privacy
     * @generated
     */
    EClass getPrivacy();

    /**
     * Returns the meta object for class '{@link risk.type.LossOfControl <em>Loss Of Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Loss Of Control</em>'.
     * @see risk.type.LossOfControl
     * @generated
     */
    EClass getLossOfControl();

    /**
     * Returns the meta object for class '{@link risk.type.AdvertisementRevenue <em>Advertisement Revenue</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Advertisement Revenue</em>'.
     * @see risk.type.AdvertisementRevenue
     * @generated
     */
    EClass getAdvertisementRevenue();

    /**
     * Returns the meta object for class '{@link risk.type.PrivacyViolationIncident <em>Privacy Violation Incident</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Privacy Violation Incident</em>'.
     * @see risk.type.PrivacyViolationIncident
     * @generated
     */
    EClass getPrivacyViolationIncident();

    /**
     * Returns the meta object for class '{@link risk.type.DataLeak <em>Data Leak</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Leak</em>'.
     * @see risk.type.DataLeak
     * @generated
     */
    EClass getDataLeak();

    /**
     * Returns the meta object for class '{@link risk.type.RiskAssessment <em>Risk Assessment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Risk Assessment</em>'.
     * @see risk.type.RiskAssessment
     * @generated
     */
    EClass getRiskAssessment();

    /**
     * Returns the meta object for the attribute '{@link risk.type.RiskAssessment#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see risk.type.RiskAssessment#getDescription()
     * @see #getRiskAssessment()
     * @generated
     */
    EAttribute getRiskAssessment_Description();

    /**
     * Returns the meta object for class '{@link risk.type.RiskTypePackage <em>Risk Type Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Risk Type Package</em>'.
     * @see risk.type.RiskTypePackage
     * @generated
     */
    EClass getRiskTypePackage();

    /**
     * Returns the meta object for the containment reference list '{@link risk.type.RiskTypePackage#getStakeholders <em>Stakeholders</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Stakeholders</em>'.
     * @see risk.type.RiskTypePackage#getStakeholders()
     * @see #getRiskTypePackage()
     * @generated
     */
    EReference getRiskTypePackage_Stakeholders();

    /**
     * Returns the meta object for the containment reference list '{@link risk.type.RiskTypePackage#getAssets <em>Assets</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Assets</em>'.
     * @see risk.type.RiskTypePackage#getAssets()
     * @see #getRiskTypePackage()
     * @generated
     */
    EReference getRiskTypePackage_Assets();

    /**
     * Returns the meta object for the containment reference list '{@link risk.type.RiskTypePackage#getThreats <em>Threats</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Threats</em>'.
     * @see risk.type.RiskTypePackage#getThreats()
     * @see #getRiskTypePackage()
     * @generated
     */
    EReference getRiskTypePackage_Threats();

    /**
     * Returns the meta object for the containment reference list '{@link risk.type.RiskTypePackage#getVulnerabilities <em>Vulnerabilities</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Vulnerabilities</em>'.
     * @see risk.type.RiskTypePackage#getVulnerabilities()
     * @see #getRiskTypePackage()
     * @generated
     */
    EReference getRiskTypePackage_Vulnerabilities();

    /**
     * Returns the meta object for the containment reference list '{@link risk.type.RiskTypePackage#getUnwantedIncidents <em>Unwanted Incidents</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Unwanted Incidents</em>'.
     * @see risk.type.RiskTypePackage#getUnwantedIncidents()
     * @see #getRiskTypePackage()
     * @generated
     */
    EReference getRiskTypePackage_UnwantedIncidents();

    /**
     * Returns the meta object for the containment reference list '{@link risk.type.RiskTypePackage#getScenarios <em>Scenarios</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Scenarios</em>'.
     * @see risk.type.RiskTypePackage#getScenarios()
     * @see #getRiskTypePackage()
     * @generated
     */
    EReference getRiskTypePackage_Scenarios();

    /**
     * Returns the meta object for the containment reference list '{@link risk.type.RiskTypePackage#getRiskAssessments <em>Risk Assessments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Risk Assessments</em>'.
     * @see risk.type.RiskTypePackage#getRiskAssessments()
     * @see #getRiskTypePackage()
     * @generated
     */
    EReference getRiskTypePackage_RiskAssessments();

    /**
     * Returns the meta object for the containment reference list '{@link risk.type.RiskTypePackage#getCountermeasures <em>Countermeasures</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Countermeasures</em>'.
     * @see risk.type.RiskTypePackage#getCountermeasures()
     * @see #getRiskTypePackage()
     * @generated
     */
    EReference getRiskTypePackage_Countermeasures();

    /**
     * Returns the meta object for the container reference '{@link risk.type.RiskTypePackage#getSuperPackage <em>Super Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Super Package</em>'.
     * @see risk.type.RiskTypePackage#getSuperPackage()
     * @see #getRiskTypePackage()
     * @generated
     */
    EReference getRiskTypePackage_SuperPackage();

    /**
     * Returns the meta object for the containment reference list '{@link risk.type.RiskTypePackage#getSubPackages <em>Sub Packages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Packages</em>'.
     * @see risk.type.RiskTypePackage#getSubPackages()
     * @see #getRiskTypePackage()
     * @generated
     */
    EReference getRiskTypePackage_SubPackages();

    /**
     * Returns the meta object for the attribute '{@link risk.type.RiskTypePackage#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see risk.type.RiskTypePackage#getName()
     * @see #getRiskTypePackage()
     * @generated
     */
    EAttribute getRiskTypePackage_Name();

    /**
     * Returns the meta object for the container reference '{@link risk.type.RiskTypePackage#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Model</em>'.
     * @see risk.type.RiskTypePackage#getModel()
     * @see #getRiskTypePackage()
     * @generated
     */
    EReference getRiskTypePackage_Model();

    /**
     * Returns the meta object for class '{@link risk.type.MisuseCase <em>Misuse Case</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Misuse Case</em>'.
     * @see risk.type.MisuseCase
     * @generated
     */
    EClass getMisuseCase();

    /**
     * Returns the meta object for class '{@link risk.type.AttackScenario <em>Attack Scenario</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attack Scenario</em>'.
     * @see risk.type.AttackScenario
     * @generated
     */
    EClass getAttackScenario();

    /**
     * Returns the meta object for class '{@link risk.type.SpecialEquipment <em>Special Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Special Equipment</em>'.
     * @see risk.type.SpecialEquipment
     * @generated
     */
    EClass getSpecialEquipment();

    /**
     * Returns the meta object for class '{@link risk.type.ThreatScenarioAttribute <em>Threat Scenario Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Threat Scenario Attribute</em>'.
     * @see risk.type.ThreatScenarioAttribute
     * @generated
     */
    EClass getThreatScenarioAttribute();

    /**
     * Returns the meta object for the attribute '{@link risk.type.ThreatScenarioAttribute#getModality <em>Modality</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Modality</em>'.
     * @see risk.type.ThreatScenarioAttribute#getModality()
     * @see #getThreatScenarioAttribute()
     * @generated
     */
    EAttribute getThreatScenarioAttribute_Modality();

    /**
     * Returns the meta object for class '{@link risk.type.Cost <em>Cost</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cost</em>'.
     * @see risk.type.Cost
     * @generated
     */
    EClass getCost();

    /**
     * Returns the meta object for class '{@link risk.type.Skill <em>Skill</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Skill</em>'.
     * @see risk.type.Skill
     * @generated
     */
    EClass getSkill();

    /**
     * Returns the meta object for class '{@link risk.type.PhysicalDamage <em>Physical Damage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Physical Damage</em>'.
     * @see risk.type.PhysicalDamage
     * @generated
     */
    EClass getPhysicalDamage();

    /**
     * Returns the meta object for class '{@link risk.type.EconomicDamage <em>Economic Damage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Economic Damage</em>'.
     * @see risk.type.EconomicDamage
     * @generated
     */
    EClass getEconomicDamage();

    /**
     * Returns the meta object for class '{@link risk.type.NearMissType <em>Near Miss Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Near Miss Type</em>'.
     * @see risk.type.NearMissType
     * @generated
     */
    EClass getNearMissType();

    /**
     * Returns the meta object for class '{@link risk.type.AccidentType <em>Accident Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Accident Type</em>'.
     * @see risk.type.AccidentType
     * @generated
     */
    EClass getAccidentType();

    /**
     * Returns the meta object for class '{@link risk.type.UndesiredEventType <em>Undesired Event Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Undesired Event Type</em>'.
     * @see risk.type.UndesiredEventType
     * @generated
     */
    EClass getUndesiredEventType();

    /**
     * Returns the meta object for enum '{@link risk.type.SeverityLevel <em>Severity Level</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Severity Level</em>'.
     * @see risk.type.SeverityLevel
     * @generated
     */
    EEnum getSeverityLevel();

    /**
     * Returns the meta object for enum '{@link risk.type.SeverityLevelCORAS <em>Severity Level CORAS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Severity Level CORAS</em>'.
     * @see risk.type.SeverityLevelCORAS
     * @generated
     */
    EEnum getSeverityLevelCORAS();

    /**
     * Returns the meta object for enum '{@link risk.type.RefinementType <em>Refinement Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Refinement Type</em>'.
     * @see risk.type.RefinementType
     * @generated
     */
    EEnum getRefinementType();

    /**
     * Returns the meta object for enum '{@link risk.type.AttributeModality <em>Attribute Modality</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Attribute Modality</em>'.
     * @see risk.type.AttributeModality
     * @generated
     */
    EEnum getAttributeModality();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TypeFactory getTypeFactory();

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
         * The meta object literal for the '{@link risk.type.impl.AssetImpl <em>Asset</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.AssetImpl
         * @see risk.type.impl.TypePackageImpl#getAsset()
         * @generated
         */
        EClass ASSET = eINSTANCE.getAsset();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSET__VALUE = eINSTANCE.getAsset_Value();

        /**
         * The meta object literal for the '<em><b>Interested Stakeholder</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSET__INTERESTED_STAKEHOLDER = eINSTANCE.getAsset_InterestedStakeholder();

        /**
         * The meta object literal for the '<em><b>Indirectly Impacts</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ASSET__INDIRECTLY_IMPACTS = eINSTANCE.getAsset_IndirectlyImpacts();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSET__DESCRIPTION = eINSTANCE.getAsset_Description();

        /**
         * The meta object literal for the '{@link risk.type.impl.ThreatScenarioImpl <em>Threat Scenario</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.ThreatScenarioImpl
         * @see risk.type.impl.TypePackageImpl#getThreatScenario()
         * @generated
         */
        EClass THREAT_SCENARIO = eINSTANCE.getThreatScenario();

        /**
         * The meta object literal for the '<em><b>Threat</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference THREAT_SCENARIO__THREAT = eINSTANCE.getThreatScenario_Threat();

        /**
         * The meta object literal for the '<em><b>Vulnerability</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference THREAT_SCENARIO__VULNERABILITY = eINSTANCE.getThreatScenario_Vulnerability();

        /**
         * The meta object literal for the '<em><b>Unwanted Incidents</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference THREAT_SCENARIO__UNWANTED_INCIDENTS = eINSTANCE.getThreatScenario_UnwantedIncidents();

        /**
         * The meta object literal for the '<em><b>Requires Scenario</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference THREAT_SCENARIO__REQUIRES_SCENARIO = eINSTANCE.getThreatScenario_RequiresScenario();

        /**
         * The meta object literal for the '<em><b>Enables Scenario</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference THREAT_SCENARIO__ENABLES_SCENARIO = eINSTANCE.getThreatScenario_EnablesScenario();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute THREAT_SCENARIO__DESCRIPTION = eINSTANCE.getThreatScenario_Description();

        /**
         * The meta object literal for the '<em><b>Countermeasures</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference THREAT_SCENARIO__COUNTERMEASURES = eINSTANCE.getThreatScenario_Countermeasures();

        /**
         * The meta object literal for the '<em><b>Refinement Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute THREAT_SCENARIO__REFINEMENT_TYPE = eINSTANCE.getThreatScenario_RefinementType();

        /**
         * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference THREAT_SCENARIO__ATTRIBUTES = eINSTANCE.getThreatScenario_Attributes();

        /**
         * The meta object literal for the '<em><b>Likelihood</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute THREAT_SCENARIO__LIKELIHOOD = eINSTANCE.getThreatScenario_Likelihood();

        /**
         * The meta object literal for the '<em><b>Likelihood Measurement</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference THREAT_SCENARIO__LIKELIHOOD_MEASUREMENT = eINSTANCE.getThreatScenario_LikelihoodMeasurement();

        /**
         * The meta object literal for the '{@link risk.type.impl.ThreatImpl <em>Threat</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.ThreatImpl
         * @see risk.type.impl.TypePackageImpl#getThreat()
         * @generated
         */
        EClass THREAT = eINSTANCE.getThreat();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute THREAT__DESCRIPTION = eINSTANCE.getThreat_Description();

        /**
         * The meta object literal for the '<em><b>Entity Instantiation</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference THREAT__ENTITY_INSTANTIATION = eINSTANCE.getThreat_EntityInstantiation();

        /**
         * The meta object literal for the '{@link risk.type.impl.VulnerabilityImpl <em>Vulnerability</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.VulnerabilityImpl
         * @see risk.type.impl.TypePackageImpl#getVulnerability()
         * @generated
         */
        EClass VULNERABILITY = eINSTANCE.getVulnerability();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VULNERABILITY__DESCRIPTION = eINSTANCE.getVulnerability_Description();

        /**
         * The meta object literal for the '<em><b>Countermeasures</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VULNERABILITY__COUNTERMEASURES = eINSTANCE.getVulnerability_Countermeasures();

        /**
         * The meta object literal for the '<em><b>Entity Instantiation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VULNERABILITY__ENTITY_INSTANTIATION = eINSTANCE.getVulnerability_EntityInstantiation();

        /**
         * The meta object literal for the '{@link risk.type.impl.IncidentTypeImpl <em>Incident Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.IncidentTypeImpl
         * @see risk.type.impl.TypePackageImpl#getIncidentType()
         * @generated
         */
        EClass INCIDENT_TYPE = eINSTANCE.getIncidentType();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INCIDENT_TYPE__DESCRIPTION = eINSTANCE.getIncidentType_Description();

        /**
         * The meta object literal for the '<em><b>Likelihood</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INCIDENT_TYPE__LIKELIHOOD = eINSTANCE.getIncidentType_Likelihood();

        /**
         * The meta object literal for the '<em><b>Enables</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INCIDENT_TYPE__ENABLES = eINSTANCE.getIncidentType_Enables();

        /**
         * The meta object literal for the '<em><b>Negative Consequences</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INCIDENT_TYPE__NEGATIVE_CONSEQUENCES = eINSTANCE.getIncidentType_NegativeConsequences();

        /**
         * The meta object literal for the '<em><b>Likelihood Measurement</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INCIDENT_TYPE__LIKELIHOOD_MEASUREMENT = eINSTANCE.getIncidentType_LikelihoodMeasurement();

        /**
         * The meta object literal for the '{@link risk.type.impl.ResponseImpl <em>Response</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.ResponseImpl
         * @see risk.type.impl.TypePackageImpl#getResponse()
         * @generated
         */
        EClass RESPONSE = eINSTANCE.getResponse();

        /**
         * The meta object literal for the '{@link risk.type.impl.CountermeasureImpl <em>Countermeasure</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.CountermeasureImpl
         * @see risk.type.impl.TypePackageImpl#getCountermeasure()
         * @generated
         */
        EClass COUNTERMEASURE = eINSTANCE.getCountermeasure();

        /**
         * The meta object literal for the '<em><b>Cost</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COUNTERMEASURE__COST = eINSTANCE.getCountermeasure_Cost();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COUNTERMEASURE__DESCRIPTION = eINSTANCE.getCountermeasure_Description();

        /**
         * The meta object literal for the '<em><b>Rule Templates</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COUNTERMEASURE__RULE_TEMPLATES = eINSTANCE.getCountermeasure_RuleTemplates();

        /**
         * The meta object literal for the '{@link risk.type.impl.MonetaryAmountImpl <em>Monetary Amount</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.MonetaryAmountImpl
         * @see risk.type.impl.TypePackageImpl#getMonetaryAmount()
         * @generated
         */
        EClass MONETARY_AMOUNT = eINSTANCE.getMonetaryAmount();

        /**
         * The meta object literal for the '{@link risk.type.impl.ConsequenceImpl <em>Consequence</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.ConsequenceImpl
         * @see risk.type.impl.TypePackageImpl#getConsequence()
         * @generated
         */
        EClass CONSEQUENCE = eINSTANCE.getConsequence();

        /**
         * The meta object literal for the '<em><b>Affected Asset</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONSEQUENCE__AFFECTED_ASSET = eINSTANCE.getConsequence_AffectedAsset();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONSEQUENCE__DESCRIPTION = eINSTANCE.getConsequence_Description();

        /**
         * The meta object literal for the '{@link risk.type.impl.ReputationImpl <em>Reputation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.ReputationImpl
         * @see risk.type.impl.TypePackageImpl#getReputation()
         * @generated
         */
        EClass REPUTATION = eINSTANCE.getReputation();

        /**
         * The meta object literal for the '{@link risk.type.impl.StructuralAssetImpl <em>Structural Asset</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.StructuralAssetImpl
         * @see risk.type.impl.TypePackageImpl#getStructuralAsset()
         * @generated
         */
        EClass STRUCTURAL_ASSET = eINSTANCE.getStructuralAsset();

        /**
         * The meta object literal for the '<em><b>Entity Instantiation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STRUCTURAL_ASSET__ENTITY_INSTANTIATION = eINSTANCE.getStructuralAsset_EntityInstantiation();

        /**
         * The meta object literal for the '{@link risk.type.impl.CompetitiveAdvantageImpl <em>Competitive Advantage</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.CompetitiveAdvantageImpl
         * @see risk.type.impl.TypePackageImpl#getCompetitiveAdvantage()
         * @generated
         */
        EClass COMPETITIVE_ADVANTAGE = eINSTANCE.getCompetitiveAdvantage();

        /**
         * The meta object literal for the '{@link risk.type.impl.StakeholderImpl <em>Stakeholder</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.StakeholderImpl
         * @see risk.type.impl.TypePackageImpl#getStakeholder()
         * @generated
         */
        EClass STAKEHOLDER = eINSTANCE.getStakeholder();

        /**
         * The meta object literal for the '<em><b>Owned Entity Instantiations</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STAKEHOLDER__OWNED_ENTITY_INSTANTIATIONS = eINSTANCE.getStakeholder_OwnedEntityInstantiations();

        /**
         * The meta object literal for the '<em><b>Assets To Protect</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STAKEHOLDER__ASSETS_TO_PROTECT = eINSTANCE.getStakeholder_AssetsToProtect();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STAKEHOLDER__NAME = eINSTANCE.getStakeholder_Name();

        /**
         * The meta object literal for the '{@link risk.type.impl.DataAssetImpl <em>Data Asset</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.DataAssetImpl
         * @see risk.type.impl.TypePackageImpl#getDataAsset()
         * @generated
         */
        EClass DATA_ASSET = eINSTANCE.getDataAsset();

        /**
         * The meta object literal for the '<em><b>Data Instantiation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_ASSET__DATA_INSTANTIATION = eINSTANCE.getDataAsset_DataInstantiation();

        /**
         * The meta object literal for the '{@link risk.type.impl.IdentityAssetImpl <em>Identity Asset</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.IdentityAssetImpl
         * @see risk.type.impl.TypePackageImpl#getIdentityAsset()
         * @generated
         */
        EClass IDENTITY_ASSET = eINSTANCE.getIdentityAsset();

        /**
         * The meta object literal for the '<em><b>Identity Instantiation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IDENTITY_ASSET__IDENTITY_INSTANTIATION = eINSTANCE.getIdentityAsset_IdentityInstantiation();

        /**
         * The meta object literal for the '{@link risk.type.impl.DeliberateThreatImpl <em>Deliberate Threat</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.DeliberateThreatImpl
         * @see risk.type.impl.TypePackageImpl#getDeliberateThreat()
         * @generated
         */
        EClass DELIBERATE_THREAT = eINSTANCE.getDeliberateThreat();

        /**
         * The meta object literal for the '{@link risk.type.impl.AccidentalThreatImpl <em>Accidental Threat</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.AccidentalThreatImpl
         * @see risk.type.impl.TypePackageImpl#getAccidentalThreat()
         * @generated
         */
        EClass ACCIDENTAL_THREAT = eINSTANCE.getAccidentalThreat();

        /**
         * The meta object literal for the '{@link risk.type.impl.NegativeConsequenceImpl <em>Negative Consequence</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.NegativeConsequenceImpl
         * @see risk.type.impl.TypePackageImpl#getNegativeConsequence()
         * @generated
         */
        EClass NEGATIVE_CONSEQUENCE = eINSTANCE.getNegativeConsequence();

        /**
         * The meta object literal for the '<em><b>Likelihood</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NEGATIVE_CONSEQUENCE__LIKELIHOOD = eINSTANCE.getNegativeConsequence_Likelihood();

        /**
         * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NEGATIVE_CONSEQUENCE__SEVERITY = eINSTANCE.getNegativeConsequence_Severity();

        /**
         * The meta object literal for the '{@link risk.type.impl.LossImpl <em>Loss</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.LossImpl
         * @see risk.type.impl.TypePackageImpl#getLoss()
         * @generated
         */
        EClass LOSS = eINSTANCE.getLoss();

        /**
         * The meta object literal for the '{@link risk.type.impl.PositiveConsequenceImpl <em>Positive Consequence</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.PositiveConsequenceImpl
         * @see risk.type.impl.TypePackageImpl#getPositiveConsequence()
         * @generated
         */
        EClass POSITIVE_CONSEQUENCE = eINSTANCE.getPositiveConsequence();

        /**
         * The meta object literal for the '{@link risk.type.impl.GainBenefitImpl <em>Gain Benefit</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.GainBenefitImpl
         * @see risk.type.impl.TypePackageImpl#getGainBenefit()
         * @generated
         */
        EClass GAIN_BENEFIT = eINSTANCE.getGainBenefit();

        /**
         * The meta object literal for the '{@link risk.type.impl.PerceivedRiskImpl <em>Perceived Risk</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.PerceivedRiskImpl
         * @see risk.type.impl.TypePackageImpl#getPerceivedRisk()
         * @generated
         */
        EClass PERCEIVED_RISK = eINSTANCE.getPerceivedRisk();

        /**
         * The meta object literal for the '{@link risk.type.impl.RealRiskImpl <em>Real Risk</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.RealRiskImpl
         * @see risk.type.impl.TypePackageImpl#getRealRisk()
         * @generated
         */
        EClass REAL_RISK = eINSTANCE.getRealRisk();

        /**
         * The meta object literal for the '{@link risk.type.impl.PrivacyImpl <em>Privacy</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.PrivacyImpl
         * @see risk.type.impl.TypePackageImpl#getPrivacy()
         * @generated
         */
        EClass PRIVACY = eINSTANCE.getPrivacy();

        /**
         * The meta object literal for the '{@link risk.type.impl.LossOfControlImpl <em>Loss Of Control</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.LossOfControlImpl
         * @see risk.type.impl.TypePackageImpl#getLossOfControl()
         * @generated
         */
        EClass LOSS_OF_CONTROL = eINSTANCE.getLossOfControl();

        /**
         * The meta object literal for the '{@link risk.type.impl.AdvertisementRevenueImpl <em>Advertisement Revenue</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.AdvertisementRevenueImpl
         * @see risk.type.impl.TypePackageImpl#getAdvertisementRevenue()
         * @generated
         */
        EClass ADVERTISEMENT_REVENUE = eINSTANCE.getAdvertisementRevenue();

        /**
         * The meta object literal for the '{@link risk.type.impl.PrivacyViolationIncidentImpl <em>Privacy Violation Incident</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.PrivacyViolationIncidentImpl
         * @see risk.type.impl.TypePackageImpl#getPrivacyViolationIncident()
         * @generated
         */
        EClass PRIVACY_VIOLATION_INCIDENT = eINSTANCE.getPrivacyViolationIncident();

        /**
         * The meta object literal for the '{@link risk.type.impl.DataLeakImpl <em>Data Leak</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.DataLeakImpl
         * @see risk.type.impl.TypePackageImpl#getDataLeak()
         * @generated
         */
        EClass DATA_LEAK = eINSTANCE.getDataLeak();

        /**
         * The meta object literal for the '{@link risk.type.impl.RiskAssessmentImpl <em>Risk Assessment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.RiskAssessmentImpl
         * @see risk.type.impl.TypePackageImpl#getRiskAssessment()
         * @generated
         */
        EClass RISK_ASSESSMENT = eINSTANCE.getRiskAssessment();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RISK_ASSESSMENT__DESCRIPTION = eINSTANCE.getRiskAssessment_Description();

        /**
         * The meta object literal for the '{@link risk.type.impl.RiskTypePackageImpl <em>Risk Type Package</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.RiskTypePackageImpl
         * @see risk.type.impl.TypePackageImpl#getRiskTypePackage()
         * @generated
         */
        EClass RISK_TYPE_PACKAGE = eINSTANCE.getRiskTypePackage();

        /**
         * The meta object literal for the '<em><b>Stakeholders</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RISK_TYPE_PACKAGE__STAKEHOLDERS = eINSTANCE.getRiskTypePackage_Stakeholders();

        /**
         * The meta object literal for the '<em><b>Assets</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RISK_TYPE_PACKAGE__ASSETS = eINSTANCE.getRiskTypePackage_Assets();

        /**
         * The meta object literal for the '<em><b>Threats</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RISK_TYPE_PACKAGE__THREATS = eINSTANCE.getRiskTypePackage_Threats();

        /**
         * The meta object literal for the '<em><b>Vulnerabilities</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RISK_TYPE_PACKAGE__VULNERABILITIES = eINSTANCE.getRiskTypePackage_Vulnerabilities();

        /**
         * The meta object literal for the '<em><b>Unwanted Incidents</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RISK_TYPE_PACKAGE__UNWANTED_INCIDENTS = eINSTANCE.getRiskTypePackage_UnwantedIncidents();

        /**
         * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RISK_TYPE_PACKAGE__SCENARIOS = eINSTANCE.getRiskTypePackage_Scenarios();

        /**
         * The meta object literal for the '<em><b>Risk Assessments</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RISK_TYPE_PACKAGE__RISK_ASSESSMENTS = eINSTANCE.getRiskTypePackage_RiskAssessments();

        /**
         * The meta object literal for the '<em><b>Countermeasures</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RISK_TYPE_PACKAGE__COUNTERMEASURES = eINSTANCE.getRiskTypePackage_Countermeasures();

        /**
         * The meta object literal for the '<em><b>Super Package</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RISK_TYPE_PACKAGE__SUPER_PACKAGE = eINSTANCE.getRiskTypePackage_SuperPackage();

        /**
         * The meta object literal for the '<em><b>Sub Packages</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RISK_TYPE_PACKAGE__SUB_PACKAGES = eINSTANCE.getRiskTypePackage_SubPackages();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RISK_TYPE_PACKAGE__NAME = eINSTANCE.getRiskTypePackage_Name();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RISK_TYPE_PACKAGE__MODEL = eINSTANCE.getRiskTypePackage_Model();

        /**
         * The meta object literal for the '{@link risk.type.impl.MisuseCaseImpl <em>Misuse Case</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.MisuseCaseImpl
         * @see risk.type.impl.TypePackageImpl#getMisuseCase()
         * @generated
         */
        EClass MISUSE_CASE = eINSTANCE.getMisuseCase();

        /**
         * The meta object literal for the '{@link risk.type.impl.AttackScenarioImpl <em>Attack Scenario</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.AttackScenarioImpl
         * @see risk.type.impl.TypePackageImpl#getAttackScenario()
         * @generated
         */
        EClass ATTACK_SCENARIO = eINSTANCE.getAttackScenario();

        /**
         * The meta object literal for the '{@link risk.type.impl.SpecialEquipmentImpl <em>Special Equipment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.SpecialEquipmentImpl
         * @see risk.type.impl.TypePackageImpl#getSpecialEquipment()
         * @generated
         */
        EClass SPECIAL_EQUIPMENT = eINSTANCE.getSpecialEquipment();

        /**
         * The meta object literal for the '{@link risk.type.impl.ThreatScenarioAttributeImpl <em>Threat Scenario Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.ThreatScenarioAttributeImpl
         * @see risk.type.impl.TypePackageImpl#getThreatScenarioAttribute()
         * @generated
         */
        EClass THREAT_SCENARIO_ATTRIBUTE = eINSTANCE.getThreatScenarioAttribute();

        /**
         * The meta object literal for the '<em><b>Modality</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute THREAT_SCENARIO_ATTRIBUTE__MODALITY = eINSTANCE.getThreatScenarioAttribute_Modality();

        /**
         * The meta object literal for the '{@link risk.type.impl.CostImpl <em>Cost</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.CostImpl
         * @see risk.type.impl.TypePackageImpl#getCost()
         * @generated
         */
        EClass COST = eINSTANCE.getCost();

        /**
         * The meta object literal for the '{@link risk.type.impl.SkillImpl <em>Skill</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.SkillImpl
         * @see risk.type.impl.TypePackageImpl#getSkill()
         * @generated
         */
        EClass SKILL = eINSTANCE.getSkill();

        /**
         * The meta object literal for the '{@link risk.type.impl.PhysicalDamageImpl <em>Physical Damage</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.PhysicalDamageImpl
         * @see risk.type.impl.TypePackageImpl#getPhysicalDamage()
         * @generated
         */
        EClass PHYSICAL_DAMAGE = eINSTANCE.getPhysicalDamage();

        /**
         * The meta object literal for the '{@link risk.type.impl.EconomicDamageImpl <em>Economic Damage</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.EconomicDamageImpl
         * @see risk.type.impl.TypePackageImpl#getEconomicDamage()
         * @generated
         */
        EClass ECONOMIC_DAMAGE = eINSTANCE.getEconomicDamage();

        /**
         * The meta object literal for the '{@link risk.type.impl.NearMissTypeImpl <em>Near Miss Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.NearMissTypeImpl
         * @see risk.type.impl.TypePackageImpl#getNearMissType()
         * @generated
         */
        EClass NEAR_MISS_TYPE = eINSTANCE.getNearMissType();

        /**
         * The meta object literal for the '{@link risk.type.impl.AccidentTypeImpl <em>Accident Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.AccidentTypeImpl
         * @see risk.type.impl.TypePackageImpl#getAccidentType()
         * @generated
         */
        EClass ACCIDENT_TYPE = eINSTANCE.getAccidentType();

        /**
         * The meta object literal for the '{@link risk.type.impl.UndesiredEventTypeImpl <em>Undesired Event Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.impl.UndesiredEventTypeImpl
         * @see risk.type.impl.TypePackageImpl#getUndesiredEventType()
         * @generated
         */
        EClass UNDESIRED_EVENT_TYPE = eINSTANCE.getUndesiredEventType();

        /**
         * The meta object literal for the '{@link risk.type.SeverityLevel <em>Severity Level</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.SeverityLevel
         * @see risk.type.impl.TypePackageImpl#getSeverityLevel()
         * @generated
         */
        EEnum SEVERITY_LEVEL = eINSTANCE.getSeverityLevel();

        /**
         * The meta object literal for the '{@link risk.type.SeverityLevelCORAS <em>Severity Level CORAS</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.SeverityLevelCORAS
         * @see risk.type.impl.TypePackageImpl#getSeverityLevelCORAS()
         * @generated
         */
        EEnum SEVERITY_LEVEL_CORAS = eINSTANCE.getSeverityLevelCORAS();

        /**
         * The meta object literal for the '{@link risk.type.RefinementType <em>Refinement Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.RefinementType
         * @see risk.type.impl.TypePackageImpl#getRefinementType()
         * @generated
         */
        EEnum REFINEMENT_TYPE = eINSTANCE.getRefinementType();

        /**
         * The meta object literal for the '{@link risk.type.AttributeModality <em>Attribute Modality</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see risk.type.AttributeModality
         * @see risk.type.impl.TypePackageImpl#getAttributeModality()
         * @generated
         */
        EEnum ATTRIBUTE_MODALITY = eINSTANCE.getAttributeModality();

    }

} //TypePackage
