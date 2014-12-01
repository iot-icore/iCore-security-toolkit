/**
 */
package behavior.type;

import behavior.instantiation.ActivityInstantiation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.type.ActivityType#getInstantiations <em>Instantiations</em>}</li>
 *   <li>{@link behavior.type.ActivityType#getSubTypes <em>Sub Types</em>}</li>
 *   <li>{@link behavior.type.ActivityType#getSuperTypes <em>Super Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.type.TypePackage#getActivityType()
 * @model abstract="true"
 * @generated
 */
public interface ActivityType extends DataProducerType {
    /**
     * Returns the value of the '<em><b>Instantiations</b></em>' reference list.
     * The list contents are of type {@link behavior.instantiation.ActivityInstantiation}.
     * It is bidirectional and its opposite is '{@link behavior.instantiation.ActivityInstantiation#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiations</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiations</em>' reference list.
     * @see behavior.type.TypePackage#getActivityType_Instantiations()
     * @see behavior.instantiation.ActivityInstantiation#getType
     * @model opposite="type"
     * @generated
     */
    EList<ActivityInstantiation> getInstantiations();

    /**
     * Returns the value of the '<em><b>Sub Types</b></em>' reference list.
     * The list contents are of type {@link behavior.type.ActivityType}.
     * It is bidirectional and its opposite is '{@link behavior.type.ActivityType#getSuperTypes <em>Super Types</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Types</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Types</em>' reference list.
     * @see behavior.type.TypePackage#getActivityType_SubTypes()
     * @see behavior.type.ActivityType#getSuperTypes
     * @model opposite="superTypes"
     * @generated
     */
    EList<ActivityType> getSubTypes();

    /**
     * Returns the value of the '<em><b>Super Types</b></em>' reference.
     * It is bidirectional and its opposite is '{@link behavior.type.ActivityType#getSubTypes <em>Sub Types</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Super Types</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Super Types</em>' reference.
     * @see #setSuperTypes(ActivityType)
     * @see behavior.type.TypePackage#getActivityType_SuperTypes()
     * @see behavior.type.ActivityType#getSubTypes
     * @model opposite="subTypes"
     * @generated
     */
    ActivityType getSuperTypes();

    /**
     * Sets the value of the '{@link behavior.type.ActivityType#getSuperTypes <em>Super Types</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Super Types</em>' reference.
     * @see #getSuperTypes()
     * @generated
     */
    void setSuperTypes(ActivityType value);

} // ActivityType
