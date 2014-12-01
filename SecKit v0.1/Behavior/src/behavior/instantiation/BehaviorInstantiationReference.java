/**
 */
package behavior.instantiation;

import models.InstantiationReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Instantiation Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.instantiation.BehaviorInstantiationReference#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.instantiation.InstantiationPackage#getBehaviorInstantiationReference()
 * @model abstract="true"
 * @generated
 */
public interface BehaviorInstantiationReference extends InstantiationReference {
    /**
     * Returns the value of the '<em><b>Child</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Child</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Child</em>' containment reference.
     * @see #setChild(BehaviorInstantiationReference)
     * @see behavior.instantiation.InstantiationPackage#getBehaviorInstantiationReference_Child()
     * @model containment="true"
     * @generated
     */
    BehaviorInstantiationReference getChild();

    /**
     * Sets the value of the '{@link behavior.instantiation.BehaviorInstantiationReference#getChild <em>Child</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Child</em>' containment reference.
     * @see #getChild()
     * @generated
     */
    void setChild(BehaviorInstantiationReference value);

} // BehaviorInstantiationReference
