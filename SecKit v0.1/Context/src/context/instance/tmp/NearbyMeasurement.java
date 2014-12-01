/**
 */
package context.instance.tmp;

import context.instance.ContextSituation;

import identity.instance.AbstractIdentity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nearby Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link context.instance.tmp.NearbyMeasurement#getEntityA <em>Entity A</em>}</li>
 *   <li>{@link context.instance.tmp.NearbyMeasurement#getEntityB <em>Entity B</em>}</li>
 * </ul>
 * </p>
 *
 * @see context.instance.tmp.TmpPackage#getNearbyMeasurement()
 * @model abstract="true"
 * @generated
 */
public interface NearbyMeasurement extends ContextSituation {
    /**
     * Returns the value of the '<em><b>Entity A</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entity A</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entity A</em>' reference.
     * @see #setEntityA(AbstractIdentity)
     * @see context.instance.tmp.TmpPackage#getNearbyMeasurement_EntityA()
     * @model
     * @generated
     */
    AbstractIdentity getEntityA();

    /**
     * Sets the value of the '{@link context.instance.tmp.NearbyMeasurement#getEntityA <em>Entity A</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entity A</em>' reference.
     * @see #getEntityA()
     * @generated
     */
    void setEntityA(AbstractIdentity value);

    /**
     * Returns the value of the '<em><b>Entity B</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entity B</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entity B</em>' reference.
     * @see #setEntityB(AbstractIdentity)
     * @see context.instance.tmp.TmpPackage#getNearbyMeasurement_EntityB()
     * @model
     * @generated
     */
    AbstractIdentity getEntityB();

    /**
     * Sets the value of the '{@link context.instance.tmp.NearbyMeasurement#getEntityB <em>Entity B</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entity B</em>' reference.
     * @see #getEntityB()
     * @generated
     */
    void setEntityB(AbstractIdentity value);

} // NearbyMeasurement
