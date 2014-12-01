/**
 */
package structure.trust;

import structure.type.ActivityPointType;
import structure.type.EntityType;

import trust.instance.TrustAspect;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Quality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.trust.StructuralQuality#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link structure.trust.StructuralQuality#getActivityPointType <em>Activity Point Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.trust.TrustPackage#getStructuralQuality()
 * @model
 * @generated
 */
public interface StructuralQuality extends TrustAspect {
    /**
     * Returns the value of the '<em><b>Entity Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entity Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entity Type</em>' reference.
     * @see #setEntityType(EntityType)
     * @see structure.trust.TrustPackage#getStructuralQuality_EntityType()
     * @model
     * @generated
     */
    EntityType getEntityType();

    /**
     * Sets the value of the '{@link structure.trust.StructuralQuality#getEntityType <em>Entity Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entity Type</em>' reference.
     * @see #getEntityType()
     * @generated
     */
    void setEntityType(EntityType value);

    /**
     * Returns the value of the '<em><b>Activity Point Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Activity Point Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Activity Point Type</em>' reference.
     * @see #setActivityPointType(ActivityPointType)
     * @see structure.trust.TrustPackage#getStructuralQuality_ActivityPointType()
     * @model
     * @generated
     */
    ActivityPointType getActivityPointType();

    /**
     * Sets the value of the '{@link structure.trust.StructuralQuality#getActivityPointType <em>Activity Point Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Activity Point Type</em>' reference.
     * @see #getActivityPointType()
     * @generated
     */
    void setActivityPointType(ActivityPointType value);

} // StructuralQuality
