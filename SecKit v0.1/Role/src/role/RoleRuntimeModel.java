/**
 */
package role;

import models.Model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link role.RoleRuntimeModel#getRoleMap <em>Role Map</em>}</li>
 *   <li>{@link role.RoleRuntimeModel#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see role.RolePackage#getRoleRuntimeModel()
 * @model
 * @generated
 */
public interface RoleRuntimeModel extends Model {
    /**
     * Returns the value of the '<em><b>Role Map</b></em>' map.
     * The key is of type {@link role.RoleType},
     * and the value is of type {@link role.RoleAssignment},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role Map</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Role Map</em>' map.
     * @see role.RolePackage#getRoleRuntimeModel_RoleMap()
     * @model mapType="role.RoleAssignmentMap<role.RoleType, role.RoleAssignment>"
     * @generated
     */
    EMap<RoleType, RoleAssignment> getRoleMap();

    /**
     * Returns the value of the '<em><b>Assignments</b></em>' containment reference list.
     * The list contents are of type {@link role.RoleAssignment}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Assignments</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Assignments</em>' containment reference list.
     * @see role.RolePackage#getRoleRuntimeModel_Assignments()
     * @model containment="true"
     * @generated
     */
    EList<RoleAssignment> getAssignments();

} // RoleRuntimeModel
