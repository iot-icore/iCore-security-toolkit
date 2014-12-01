/**
 */
package role;

import models.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link role.RoleTypePackage#getRoleTypes <em>Role Types</em>}</li>
 *   <li>{@link role.RoleTypePackage#getName <em>Name</em>}</li>
 *   <li>{@link role.RoleTypePackage#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link role.RoleTypePackage#getSuperPackage <em>Super Package</em>}</li>
 *   <li>{@link role.RoleTypePackage#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see role.RolePackage#getRoleTypePackage()
 * @model
 * @generated
 */
public interface RoleTypePackage extends Element {
    /**
     * Returns the value of the '<em><b>Role Types</b></em>' containment reference list.
     * The list contents are of type {@link role.RoleType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role Types</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Role Types</em>' containment reference list.
     * @see role.RolePackage#getRoleTypePackage_RoleTypes()
     * @model containment="true"
     * @generated
     */
    EList<RoleType> getRoleTypes();

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
     * @see role.RolePackage#getRoleTypePackage_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link role.RoleTypePackage#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Sub Packages</b></em>' containment reference list.
     * The list contents are of type {@link role.RoleTypePackage}.
     * It is bidirectional and its opposite is '{@link role.RoleTypePackage#getSuperPackage <em>Super Package</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Packages</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Packages</em>' containment reference list.
     * @see role.RolePackage#getRoleTypePackage_SubPackages()
     * @see role.RoleTypePackage#getSuperPackage
     * @model opposite="superPackage" containment="true"
     * @generated
     */
    EList<RoleTypePackage> getSubPackages();

    /**
     * Returns the value of the '<em><b>Super Package</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link role.RoleTypePackage#getSubPackages <em>Sub Packages</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Super Package</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Super Package</em>' container reference.
     * @see #setSuperPackage(RoleTypePackage)
     * @see role.RolePackage#getRoleTypePackage_SuperPackage()
     * @see role.RoleTypePackage#getSubPackages
     * @model opposite="subPackages" transient="false"
     * @generated
     */
    RoleTypePackage getSuperPackage();

    /**
     * Sets the value of the '{@link role.RoleTypePackage#getSuperPackage <em>Super Package</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Super Package</em>' container reference.
     * @see #getSuperPackage()
     * @generated
     */
    void setSuperPackage(RoleTypePackage value);

    /**
     * Returns the value of the '<em><b>Model</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link role.RoleDesignModel#getPackages <em>Packages</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model</em>' container reference.
     * @see #setModel(RoleDesignModel)
     * @see role.RolePackage#getRoleTypePackage_Model()
     * @see role.RoleDesignModel#getPackages
     * @model opposite="packages" transient="false"
     * @generated
     */
    RoleDesignModel getModel();

    /**
     * Sets the value of the '{@link role.RoleTypePackage#getModel <em>Model</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' container reference.
     * @see #getModel()
     * @generated
     */
    void setModel(RoleDesignModel value);

} // RoleTypePackage
