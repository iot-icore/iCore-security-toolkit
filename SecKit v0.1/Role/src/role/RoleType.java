/**
 */
package role;

import models.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link role.RoleType#getSubRoles <em>Sub Roles</em>}</li>
 *   <li>{@link role.RoleType#getSuperRoles <em>Super Roles</em>}</li>
 *   <li>{@link role.RoleType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see role.RolePackage#getRoleType()
 * @model
 * @generated
 */
public interface RoleType extends Element {
    /**
     * Returns the value of the '<em><b>Sub Roles</b></em>' reference list.
     * The list contents are of type {@link role.RoleType}.
     * It is bidirectional and its opposite is '{@link role.RoleType#getSuperRoles <em>Super Roles</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Roles</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Roles</em>' reference list.
     * @see role.RolePackage#getRoleType_SubRoles()
     * @see role.RoleType#getSuperRoles
     * @model opposite="superRoles"
     * @generated
     */
    EList<RoleType> getSubRoles();

    /**
     * Returns the value of the '<em><b>Super Roles</b></em>' reference list.
     * The list contents are of type {@link role.RoleType}.
     * It is bidirectional and its opposite is '{@link role.RoleType#getSubRoles <em>Sub Roles</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Super Roles</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Super Roles</em>' reference list.
     * @see role.RolePackage#getRoleType_SuperRoles()
     * @see role.RoleType#getSubRoles
     * @model opposite="subRoles"
     * @generated
     */
    EList<RoleType> getSuperRoles();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see role.RolePackage#getRoleType_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link role.RoleType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // RoleType
