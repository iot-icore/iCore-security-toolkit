/**
 */
package structure.type.world;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import structure.instantiation.EntityInstantiation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contained Type Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.type.world.ContainedTypeRole#getLevels <em>Levels</em>}</li>
 *   <li>{@link structure.type.world.ContainedTypeRole#getRooms <em>Rooms</em>}</li>
 *   <li>{@link structure.type.world.ContainedTypeRole#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.type.world.WorldPackage#getContainedTypeRole()
 * @model
 * @generated
 */
public interface ContainedTypeRole extends EObject {
    /**
     * Returns the value of the '<em><b>Levels</b></em>' containment reference list.
     * The list contents are of type {@link structure.instantiation.EntityInstantiation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Levels</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Levels</em>' containment reference list.
     * @see structure.type.world.WorldPackage#getContainedTypeRole_Levels()
     * @model containment="true"
     * @generated
     */
    EList<EntityInstantiation> getLevels();

    /**
     * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
     * The list contents are of type {@link structure.instantiation.EntityInstantiation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rooms</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rooms</em>' containment reference list.
     * @see structure.type.world.WorldPackage#getContainedTypeRole_Rooms()
     * @model containment="true"
     * @generated
     */
    EList<EntityInstantiation> getRooms();

    /**
     * Returns the value of the '<em><b>Role</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Role</em>' attribute.
     * @see #setRole(String)
     * @see structure.type.world.WorldPackage#getContainedTypeRole_Role()
     * @model
     * @generated
     */
    String getRole();

    /**
     * Sets the value of the '{@link structure.type.world.ContainedTypeRole#getRole <em>Role</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Role</em>' attribute.
     * @see #getRole()
     * @generated
     */
    void setRole(String value);

} // ContainedTypeRole
