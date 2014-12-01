/**
 */
package context.type;

import data.type.DataType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Information Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link context.type.ContextInformationType#getOriginType <em>Origin Type</em>}</li>
 *   <li>{@link context.type.ContextInformationType#getSituationRoleTypes <em>Situation Role Types</em>}</li>
 *   <li>{@link context.type.ContextInformationType#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see context.type.TypePackage#getContextInformationType()
 * @model
 * @generated
 */
public interface ContextInformationType extends DataType {
    /**
     * Returns the value of the '<em><b>Origin Type</b></em>' attribute.
     * The literals are from the enumeration {@link context.type.OriginType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Origin Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Origin Type</em>' attribute.
     * @see context.type.OriginType
     * @see #setOriginType(OriginType)
     * @see context.type.TypePackage#getContextInformationType_OriginType()
     * @model
     * @generated
     */
    OriginType getOriginType();

    /**
     * Sets the value of the '{@link context.type.ContextInformationType#getOriginType <em>Origin Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Origin Type</em>' attribute.
     * @see context.type.OriginType
     * @see #getOriginType()
     * @generated
     */
    void setOriginType(OriginType value);

    /**
     * Returns the value of the '<em><b>Situation Role Types</b></em>' reference list.
     * The list contents are of type {@link context.type.EntityRoleType}.
     * It is bidirectional and its opposite is '{@link context.type.EntityRoleType#getContextInformationTypes <em>Context Information Types</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Situation Role Types</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Situation Role Types</em>' reference list.
     * @see context.type.TypePackage#getContextInformationType_SituationRoleTypes()
     * @see context.type.EntityRoleType#getContextInformationTypes
     * @model opposite="contextInformationTypes"
     * @generated
     */
    EList<EntityRoleType> getSituationRoleTypes();

    /**
     * Returns the value of the '<em><b>Package</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link context.type.ContextTypePackage#getContextInformationTypes <em>Context Information Types</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Package</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Package</em>' container reference.
     * @see #setPackage(ContextTypePackage)
     * @see context.type.TypePackage#getContextInformationType_Package()
     * @see context.type.ContextTypePackage#getContextInformationTypes
     * @model opposite="contextInformationTypes" transient="false"
     * @generated
     */
    ContextTypePackage getPackage();

    /**
     * Sets the value of the '{@link context.type.ContextInformationType#getPackage <em>Package</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Package</em>' container reference.
     * @see #getPackage()
     * @generated
     */
    void setPackage(ContextTypePackage value);

} // ContextInformationType
