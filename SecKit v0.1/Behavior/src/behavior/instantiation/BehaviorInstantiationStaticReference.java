/**
 */
package behavior.instantiation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Instantiation Static Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.instantiation.BehaviorInstantiationStaticReference#getInstantiation <em>Instantiation</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.instantiation.InstantiationPackage#getBehaviorInstantiationStaticReference()
 * @model
 * @generated
 */
public interface BehaviorInstantiationStaticReference extends BehaviorInstantiationReference {
    /**
     * Returns the value of the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiation</em>' reference.
     * @see #setInstantiation(BehaviorInstantiation)
     * @see behavior.instantiation.InstantiationPackage#getBehaviorInstantiationStaticReference_Instantiation()
     * @model required="true"
     * @generated
     */
    BehaviorInstantiation getInstantiation();

    /**
     * Sets the value of the '{@link behavior.instantiation.BehaviorInstantiationStaticReference#getInstantiation <em>Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instantiation</em>' reference.
     * @see #getInstantiation()
     * @generated
     */
    void setInstantiation(BehaviorInstantiation value);

} // BehaviorInstantiationStaticReference
