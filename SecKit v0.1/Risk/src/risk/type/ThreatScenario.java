/**
 */
package risk.type;

import models.Element;

import org.eclipse.emf.common.util.EList;

import trust.instance.LikelihoodLevel;
import trust.instance.LikelihoodMeasurement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threat Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link risk.type.ThreatScenario#getThreat <em>Threat</em>}</li>
 *   <li>{@link risk.type.ThreatScenario#getVulnerability <em>Vulnerability</em>}</li>
 *   <li>{@link risk.type.ThreatScenario#getUnwantedIncidents <em>Unwanted Incidents</em>}</li>
 *   <li>{@link risk.type.ThreatScenario#getRequiresScenario <em>Requires Scenario</em>}</li>
 *   <li>{@link risk.type.ThreatScenario#getEnablesScenario <em>Enables Scenario</em>}</li>
 *   <li>{@link risk.type.ThreatScenario#getDescription <em>Description</em>}</li>
 *   <li>{@link risk.type.ThreatScenario#getCountermeasures <em>Countermeasures</em>}</li>
 *   <li>{@link risk.type.ThreatScenario#getRefinementType <em>Refinement Type</em>}</li>
 *   <li>{@link risk.type.ThreatScenario#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link risk.type.ThreatScenario#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link risk.type.ThreatScenario#getLikelihoodMeasurement <em>Likelihood Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @see risk.type.TypePackage#getThreatScenario()
 * @model
 * @generated
 */
public interface ThreatScenario extends Element {
    /**
     * Returns the value of the '<em><b>Threat</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Threat</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Threat</em>' reference.
     * @see #setThreat(Threat)
     * @see risk.type.TypePackage#getThreatScenario_Threat()
     * @model required="true"
     * @generated
     */
    Threat getThreat();

    /**
     * Sets the value of the '{@link risk.type.ThreatScenario#getThreat <em>Threat</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Threat</em>' reference.
     * @see #getThreat()
     * @generated
     */
    void setThreat(Threat value);

    /**
     * Returns the value of the '<em><b>Vulnerability</b></em>' reference list.
     * The list contents are of type {@link risk.type.Vulnerability}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vulnerability</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vulnerability</em>' reference list.
     * @see risk.type.TypePackage#getThreatScenario_Vulnerability()
     * @model required="true"
     * @generated
     */
    EList<Vulnerability> getVulnerability();

    /**
     * Returns the value of the '<em><b>Unwanted Incidents</b></em>' reference list.
     * The list contents are of type {@link risk.type.IncidentType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unwanted Incidents</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unwanted Incidents</em>' reference list.
     * @see risk.type.TypePackage#getThreatScenario_UnwantedIncidents()
     * @model
     * @generated
     */
    EList<IncidentType> getUnwantedIncidents();

    /**
     * Returns the value of the '<em><b>Requires Scenario</b></em>' reference list.
     * The list contents are of type {@link risk.type.ThreatScenario}.
     * It is bidirectional and its opposite is '{@link risk.type.ThreatScenario#getEnablesScenario <em>Enables Scenario</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Requires Scenario</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Requires Scenario</em>' reference list.
     * @see risk.type.TypePackage#getThreatScenario_RequiresScenario()
     * @see risk.type.ThreatScenario#getEnablesScenario
     * @model opposite="enablesScenario"
     * @generated
     */
    EList<ThreatScenario> getRequiresScenario();

    /**
     * Returns the value of the '<em><b>Enables Scenario</b></em>' reference list.
     * The list contents are of type {@link risk.type.ThreatScenario}.
     * It is bidirectional and its opposite is '{@link risk.type.ThreatScenario#getRequiresScenario <em>Requires Scenario</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enables Scenario</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enables Scenario</em>' reference list.
     * @see risk.type.TypePackage#getThreatScenario_EnablesScenario()
     * @see risk.type.ThreatScenario#getRequiresScenario
     * @model opposite="requiresScenario"
     * @generated
     */
    EList<ThreatScenario> getEnablesScenario();

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see risk.type.TypePackage#getThreatScenario_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link risk.type.ThreatScenario#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

    /**
     * Returns the value of the '<em><b>Countermeasures</b></em>' reference list.
     * The list contents are of type {@link risk.type.Countermeasure}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Countermeasures</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Countermeasures</em>' reference list.
     * @see risk.type.TypePackage#getThreatScenario_Countermeasures()
     * @model
     * @generated
     */
    EList<Countermeasure> getCountermeasures();

    /**
     * Returns the value of the '<em><b>Refinement Type</b></em>' attribute.
     * The literals are from the enumeration {@link risk.type.RefinementType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refinement Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refinement Type</em>' attribute.
     * @see risk.type.RefinementType
     * @see #setRefinementType(RefinementType)
     * @see risk.type.TypePackage#getThreatScenario_RefinementType()
     * @model
     * @generated
     */
    RefinementType getRefinementType();

    /**
     * Sets the value of the '{@link risk.type.ThreatScenario#getRefinementType <em>Refinement Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refinement Type</em>' attribute.
     * @see risk.type.RefinementType
     * @see #getRefinementType()
     * @generated
     */
    void setRefinementType(RefinementType value);

    /**
     * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
     * The list contents are of type {@link risk.type.ThreatScenarioAttribute}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attributes</em>' containment reference list.
     * @see risk.type.TypePackage#getThreatScenario_Attributes()
     * @model containment="true"
     * @generated
     */
    EList<ThreatScenarioAttribute> getAttributes();

    /**
     * Returns the value of the '<em><b>Likelihood</b></em>' attribute.
     * The literals are from the enumeration {@link trust.instance.LikelihoodLevel}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Likelihood</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Likelihood</em>' attribute.
     * @see trust.instance.LikelihoodLevel
     * @see #setLikelihood(LikelihoodLevel)
     * @see risk.type.TypePackage#getThreatScenario_Likelihood()
     * @model
     * @generated
     */
    LikelihoodLevel getLikelihood();

    /**
     * Sets the value of the '{@link risk.type.ThreatScenario#getLikelihood <em>Likelihood</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Likelihood</em>' attribute.
     * @see trust.instance.LikelihoodLevel
     * @see #getLikelihood()
     * @generated
     */
    void setLikelihood(LikelihoodLevel value);

    /**
     * Returns the value of the '<em><b>Likelihood Measurement</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Likelihood Measurement</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Likelihood Measurement</em>' containment reference.
     * @see #setLikelihoodMeasurement(LikelihoodMeasurement)
     * @see risk.type.TypePackage#getThreatScenario_LikelihoodMeasurement()
     * @model containment="true"
     * @generated
     */
    LikelihoodMeasurement getLikelihoodMeasurement();

    /**
     * Sets the value of the '{@link risk.type.ThreatScenario#getLikelihoodMeasurement <em>Likelihood Measurement</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Likelihood Measurement</em>' containment reference.
     * @see #getLikelihoodMeasurement()
     * @generated
     */
    void setLikelihoodMeasurement(LikelihoodMeasurement value);

} // ThreatScenario
