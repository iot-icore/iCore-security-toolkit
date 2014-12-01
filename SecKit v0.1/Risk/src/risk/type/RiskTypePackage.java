/**
 */
package risk.type;

import models.Element;

import org.eclipse.emf.common.util.EList;

import risk.RiskDesignModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk Type Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link risk.type.RiskTypePackage#getStakeholders <em>Stakeholders</em>}</li>
 *   <li>{@link risk.type.RiskTypePackage#getAssets <em>Assets</em>}</li>
 *   <li>{@link risk.type.RiskTypePackage#getThreats <em>Threats</em>}</li>
 *   <li>{@link risk.type.RiskTypePackage#getVulnerabilities <em>Vulnerabilities</em>}</li>
 *   <li>{@link risk.type.RiskTypePackage#getUnwantedIncidents <em>Unwanted Incidents</em>}</li>
 *   <li>{@link risk.type.RiskTypePackage#getScenarios <em>Scenarios</em>}</li>
 *   <li>{@link risk.type.RiskTypePackage#getRiskAssessments <em>Risk Assessments</em>}</li>
 *   <li>{@link risk.type.RiskTypePackage#getCountermeasures <em>Countermeasures</em>}</li>
 *   <li>{@link risk.type.RiskTypePackage#getSuperPackage <em>Super Package</em>}</li>
 *   <li>{@link risk.type.RiskTypePackage#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link risk.type.RiskTypePackage#getName <em>Name</em>}</li>
 *   <li>{@link risk.type.RiskTypePackage#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see risk.type.TypePackage#getRiskTypePackage()
 * @model
 * @generated
 */
public interface RiskTypePackage extends Element {
    /**
     * Returns the value of the '<em><b>Stakeholders</b></em>' containment reference list.
     * The list contents are of type {@link risk.type.Stakeholder}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stakeholders</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stakeholders</em>' containment reference list.
     * @see risk.type.TypePackage#getRiskTypePackage_Stakeholders()
     * @model containment="true"
     * @generated
     */
    EList<Stakeholder> getStakeholders();

    /**
     * Returns the value of the '<em><b>Assets</b></em>' containment reference list.
     * The list contents are of type {@link risk.type.Asset}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Assets</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Assets</em>' containment reference list.
     * @see risk.type.TypePackage#getRiskTypePackage_Assets()
     * @model containment="true"
     * @generated
     */
    EList<Asset> getAssets();

    /**
     * Returns the value of the '<em><b>Threats</b></em>' containment reference list.
     * The list contents are of type {@link risk.type.Threat}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Threats</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Threats</em>' containment reference list.
     * @see risk.type.TypePackage#getRiskTypePackage_Threats()
     * @model containment="true"
     * @generated
     */
    EList<Threat> getThreats();

    /**
     * Returns the value of the '<em><b>Vulnerabilities</b></em>' containment reference list.
     * The list contents are of type {@link risk.type.Vulnerability}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vulnerabilities</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vulnerabilities</em>' containment reference list.
     * @see risk.type.TypePackage#getRiskTypePackage_Vulnerabilities()
     * @model containment="true"
     * @generated
     */
    EList<Vulnerability> getVulnerabilities();

    /**
     * Returns the value of the '<em><b>Unwanted Incidents</b></em>' containment reference list.
     * The list contents are of type {@link risk.type.IncidentType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unwanted Incidents</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unwanted Incidents</em>' containment reference list.
     * @see risk.type.TypePackage#getRiskTypePackage_UnwantedIncidents()
     * @model containment="true"
     * @generated
     */
    EList<IncidentType> getUnwantedIncidents();

    /**
     * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
     * The list contents are of type {@link risk.type.ThreatScenario}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scenarios</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scenarios</em>' containment reference list.
     * @see risk.type.TypePackage#getRiskTypePackage_Scenarios()
     * @model containment="true"
     * @generated
     */
    EList<ThreatScenario> getScenarios();

    /**
     * Returns the value of the '<em><b>Risk Assessments</b></em>' containment reference list.
     * The list contents are of type {@link risk.type.RiskAssessment}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Risk Assessments</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Risk Assessments</em>' containment reference list.
     * @see risk.type.TypePackage#getRiskTypePackage_RiskAssessments()
     * @model containment="true"
     * @generated
     */
    EList<RiskAssessment> getRiskAssessments();

    /**
     * Returns the value of the '<em><b>Countermeasures</b></em>' containment reference list.
     * The list contents are of type {@link risk.type.Countermeasure}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Countermeasures</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Countermeasures</em>' containment reference list.
     * @see risk.type.TypePackage#getRiskTypePackage_Countermeasures()
     * @model containment="true"
     * @generated
     */
    EList<Countermeasure> getCountermeasures();

    /**
     * Returns the value of the '<em><b>Super Package</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link risk.type.RiskTypePackage#getSubPackages <em>Sub Packages</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Super Package</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Super Package</em>' container reference.
     * @see #setSuperPackage(RiskTypePackage)
     * @see risk.type.TypePackage#getRiskTypePackage_SuperPackage()
     * @see risk.type.RiskTypePackage#getSubPackages
     * @model opposite="subPackages" transient="false"
     * @generated
     */
    RiskTypePackage getSuperPackage();

    /**
     * Sets the value of the '{@link risk.type.RiskTypePackage#getSuperPackage <em>Super Package</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Super Package</em>' container reference.
     * @see #getSuperPackage()
     * @generated
     */
    void setSuperPackage(RiskTypePackage value);

    /**
     * Returns the value of the '<em><b>Sub Packages</b></em>' containment reference list.
     * The list contents are of type {@link risk.type.RiskTypePackage}.
     * It is bidirectional and its opposite is '{@link risk.type.RiskTypePackage#getSuperPackage <em>Super Package</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Packages</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Packages</em>' containment reference list.
     * @see risk.type.TypePackage#getRiskTypePackage_SubPackages()
     * @see risk.type.RiskTypePackage#getSuperPackage
     * @model opposite="superPackage" containment="true"
     * @generated
     */
    EList<RiskTypePackage> getSubPackages();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see risk.type.TypePackage#getRiskTypePackage_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link risk.type.RiskTypePackage#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Model</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link risk.RiskDesignModel#getPackages <em>Packages</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model</em>' container reference.
     * @see #setModel(RiskDesignModel)
     * @see risk.type.TypePackage#getRiskTypePackage_Model()
     * @see risk.RiskDesignModel#getPackages
     * @model opposite="packages" transient="false"
     * @generated
     */
    RiskDesignModel getModel();

    /**
     * Sets the value of the '{@link risk.type.RiskTypePackage#getModel <em>Model</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' container reference.
     * @see #getModel()
     * @generated
     */
    void setModel(RiskDesignModel value);

} // RiskTypePackage
