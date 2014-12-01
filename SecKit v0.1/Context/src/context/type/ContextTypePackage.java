/**
 */
package context.type;

import models.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Type Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link context.type.ContextTypePackage#getSituationTypes <em>Situation Types</em>}</li>
 *   <li>{@link context.type.ContextTypePackage#getContextInformationTypes <em>Context Information Types</em>}</li>
 *   <li>{@link context.type.ContextTypePackage#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see context.type.TypePackage#getContextTypePackage()
 * @model
 * @generated
 */
public interface ContextTypePackage extends Element {
    /**
     * Returns the value of the '<em><b>Situation Types</b></em>' containment reference list.
     * The list contents are of type {@link context.type.ContextSituationType}.
     * It is bidirectional and its opposite is '{@link context.type.ContextSituationType#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Situation Types</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Situation Types</em>' containment reference list.
     * @see context.type.TypePackage#getContextTypePackage_SituationTypes()
     * @see context.type.ContextSituationType#getPackage
     * @model opposite="package" containment="true"
     * @generated
     */
    EList<ContextSituationType> getSituationTypes();

    /**
     * Returns the value of the '<em><b>Context Information Types</b></em>' containment reference list.
     * The list contents are of type {@link context.type.ContextInformationType}.
     * It is bidirectional and its opposite is '{@link context.type.ContextInformationType#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context Information Types</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context Information Types</em>' containment reference list.
     * @see context.type.TypePackage#getContextTypePackage_ContextInformationTypes()
     * @see context.type.ContextInformationType#getPackage
     * @model opposite="package" containment="true"
     * @generated
     */
    EList<ContextInformationType> getContextInformationTypes();

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
     * @see context.type.TypePackage#getContextTypePackage_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link context.type.ContextTypePackage#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // ContextTypePackage
