/**
 */
package structure.event;

import rule.condition.EventPattern;
import structure.pattern.EntityPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Event Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.event.EntityEventPattern#getEntityPattern <em>Entity Pattern</em>}</li>
 *   <li>{@link structure.event.EntityEventPattern#getLifecycle <em>Lifecycle</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.event.EventPackage#getEntityEventPattern()
 * @model
 * @generated
 */
public interface EntityEventPattern extends EventPattern {
    /**
     * Returns the value of the '<em><b>Entity Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entity Pattern</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entity Pattern</em>' containment reference.
     * @see #setEntityPattern(EntityPattern)
     * @see structure.event.EventPackage#getEntityEventPattern_EntityPattern()
     * @model containment="true"
     * @generated
     */
    EntityPattern getEntityPattern();

    /**
     * Sets the value of the '{@link structure.event.EntityEventPattern#getEntityPattern <em>Entity Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entity Pattern</em>' containment reference.
     * @see #getEntityPattern()
     * @generated
     */
    void setEntityPattern(EntityPattern value);

    /**
     * Returns the value of the '<em><b>Lifecycle</b></em>' attribute.
     * The literals are from the enumeration {@link structure.event.EntityLifecycle}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lifecycle</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lifecycle</em>' attribute.
     * @see structure.event.EntityLifecycle
     * @see #setLifecycle(EntityLifecycle)
     * @see structure.event.EventPackage#getEntityEventPattern_Lifecycle()
     * @model
     * @generated
     */
    EntityLifecycle getLifecycle();

    /**
     * Sets the value of the '{@link structure.event.EntityEventPattern#getLifecycle <em>Lifecycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lifecycle</em>' attribute.
     * @see structure.event.EntityLifecycle
     * @see #getLifecycle()
     * @generated
     */
    void setLifecycle(EntityLifecycle value);

} // EntityEventPattern
