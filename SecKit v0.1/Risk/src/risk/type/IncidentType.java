/**
 */
package risk.type;

import models.Element;

import org.eclipse.emf.common.util.EList;

import trust.instance.LikelihoodLevel;
import trust.instance.LikelihoodMeasurement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Incident Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link risk.type.IncidentType#getDescription <em>Description</em>}</li>
 *   <li>{@link risk.type.IncidentType#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link risk.type.IncidentType#getEnables <em>Enables</em>}</li>
 *   <li>{@link risk.type.IncidentType#getNegativeConsequences <em>Negative Consequences</em>}</li>
 *   <li>{@link risk.type.IncidentType#getLikelihoodMeasurement <em>Likelihood Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @see risk.type.TypePackage#getIncidentType()
 * @model
 * @generated
 */
public interface IncidentType extends Element, UndesiredEventType {
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
     * @see risk.type.TypePackage#getIncidentType_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link risk.type.IncidentType#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

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
     * @see risk.type.TypePackage#getIncidentType_Likelihood()
     * @model
     * @generated
     */
    LikelihoodLevel getLikelihood();

    /**
     * Sets the value of the '{@link risk.type.IncidentType#getLikelihood <em>Likelihood</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Likelihood</em>' attribute.
     * @see trust.instance.LikelihoodLevel
     * @see #getLikelihood()
     * @generated
     */
    void setLikelihood(LikelihoodLevel value);

    /**
     * Returns the value of the '<em><b>Enables</b></em>' reference list.
     * The list contents are of type {@link risk.type.IncidentType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enables</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enables</em>' reference list.
     * @see risk.type.TypePackage#getIncidentType_Enables()
     * @model
     * @generated
     */
    EList<IncidentType> getEnables();

    /**
     * Returns the value of the '<em><b>Negative Consequences</b></em>' containment reference list.
     * The list contents are of type {@link risk.type.NegativeConsequence}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Negative Consequences</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Negative Consequences</em>' containment reference list.
     * @see risk.type.TypePackage#getIncidentType_NegativeConsequences()
     * @model containment="true"
     * @generated
     */
    EList<NegativeConsequence> getNegativeConsequences();

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
     * @see risk.type.TypePackage#getIncidentType_LikelihoodMeasurement()
     * @model containment="true"
     * @generated
     */
    LikelihoodMeasurement getLikelihoodMeasurement();

    /**
     * Sets the value of the '{@link risk.type.IncidentType#getLikelihoodMeasurement <em>Likelihood Measurement</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Likelihood Measurement</em>' containment reference.
     * @see #getLikelihoodMeasurement()
     * @generated
     */
    void setLikelihoodMeasurement(LikelihoodMeasurement value);

} // IncidentType
