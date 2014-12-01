/**
 */
package trust.instance;

import identity.instance.AbstractIdentity;

import models.Element;

import org.eclipse.emf.common.util.EList;
import time.Timestamp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trust Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link trust.instance.TrustRelationship#getAspect <em>Aspect</em>}</li>
 *   <li>{@link trust.instance.TrustRelationship#getDegree <em>Degree</em>}</li>
 *   <li>{@link trust.instance.TrustRelationship#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link trust.instance.TrustRelationship#getTrusteeScope <em>Trustee Scope</em>}</li>
 *   <li>{@link trust.instance.TrustRelationship#getTrustor <em>Trustor</em>}</li>
 *   <li>{@link trust.instance.TrustRelationship#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see trust.instance.InstancePackage#getTrustRelationship()
 * @model abstract="true"
 * @generated
 */
public interface TrustRelationship extends Element {
  /**
   * Returns the value of the '<em><b>Aspect</b></em>' reference list.
   * The list contents are of type {@link trust.instance.TrustAspect}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aspect</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aspect</em>' reference list.
   * @see trust.instance.InstancePackage#getTrustRelationship_Aspect()
   * @model required="true"
   * @generated
   */
  EList<TrustAspect> getAspect();

  /**
   * Returns the value of the '<em><b>Degree</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Degree</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Degree</em>' containment reference.
   * @see #setDegree(LikelihoodMeasurement)
   * @see trust.instance.InstancePackage#getTrustRelationship_Degree()
   * @model containment="true" required="true"
   * @generated
   */
  LikelihoodMeasurement getDegree();

  /**
   * Sets the value of the '{@link trust.instance.TrustRelationship#getDegree <em>Degree</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Degree</em>' containment reference.
   * @see #getDegree()
   * @generated
   */
  void setDegree(LikelihoodMeasurement value);

  /**
   * Returns the value of the '<em><b>Timestamp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Timestamp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timestamp</em>' containment reference.
   * @see #setTimestamp(Timestamp)
   * @see trust.instance.InstancePackage#getTrustRelationship_Timestamp()
   * @model containment="true"
   * @generated
   */
  Timestamp getTimestamp();

  /**
   * Sets the value of the '{@link trust.instance.TrustRelationship#getTimestamp <em>Timestamp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Timestamp</em>' containment reference.
   * @see #getTimestamp()
   * @generated
   */
  void setTimestamp(Timestamp value);

  /**
   * Returns the value of the '<em><b>Trustee Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trustee Scope</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trustee Scope</em>' containment reference.
   * @see #setTrusteeScope(TrusteeScope)
   * @see trust.instance.InstancePackage#getTrustRelationship_TrusteeScope()
   * @model containment="true" required="true"
   * @generated
   */
  TrusteeScope getTrusteeScope();

  /**
   * Sets the value of the '{@link trust.instance.TrustRelationship#getTrusteeScope <em>Trustee Scope</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trustee Scope</em>' containment reference.
   * @see #getTrusteeScope()
   * @generated
   */
  void setTrusteeScope(TrusteeScope value);

  /**
   * Returns the value of the '<em><b>Trustor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trustor</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trustor</em>' reference.
   * @see #setTrustor(AbstractIdentity)
   * @see trust.instance.InstancePackage#getTrustRelationship_Trustor()
   * @model required="true"
   * @generated
   */
  AbstractIdentity getTrustor();

  /**
   * Sets the value of the '{@link trust.instance.TrustRelationship#getTrustor <em>Trustor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trustor</em>' reference.
   * @see #getTrustor()
   * @generated
   */
  void setTrustor(AbstractIdentity value);

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
   * @see trust.instance.InstancePackage#getTrustRelationship_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link trust.instance.TrustRelationship#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // TrustRelationship
