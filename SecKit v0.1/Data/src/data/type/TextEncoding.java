/**
 */
package data.type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Encoding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.type.TextEncoding#getSingletons <em>Singletons</em>}</li>
 *   <li>{@link data.type.TextEncoding#getLeadUnits <em>Lead Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.type.TypePackage#getTextEncoding()
 * @model
 * @generated
 */
public interface TextEncoding extends Encoding {
    /**
     * Returns the value of the '<em><b>Singletons</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Singletons</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Singletons</em>' attribute.
     * @see #setSingletons(byte[])
     * @see data.type.TypePackage#getTextEncoding_Singletons()
     * @model
     * @generated
     */
    byte[] getSingletons();

    /**
     * Sets the value of the '{@link data.type.TextEncoding#getSingletons <em>Singletons</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Singletons</em>' attribute.
     * @see #getSingletons()
     * @generated
     */
    void setSingletons(byte[] value);

    /**
     * Returns the value of the '<em><b>Lead Units</b></em>' containment reference list.
     * The list contents are of type {@link data.type.LeadUnit}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lead Units</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lead Units</em>' containment reference list.
     * @see data.type.TypePackage#getTextEncoding_LeadUnits()
     * @model containment="true"
     * @generated
     */
    EList<LeadUnit> getLeadUnits();

} // TextEncoding
