/**
 */
package structure.trust;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resistance To Tampering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.trust.ResistanceToTampering#isIsTpmEnabled <em>Is Tpm Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.trust.TrustPackage#getResistanceToTampering()
 * @model
 * @generated
 */
public interface ResistanceToTampering extends StructuralQuality {
    /**
     * Returns the value of the '<em><b>Is Tpm Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Tpm Enabled</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Tpm Enabled</em>' attribute.
     * @see #setIsTpmEnabled(boolean)
     * @see structure.trust.TrustPackage#getResistanceToTampering_IsTpmEnabled()
     * @model
     * @generated
     */
    boolean isIsTpmEnabled();

    /**
     * Sets the value of the '{@link structure.trust.ResistanceToTampering#isIsTpmEnabled <em>Is Tpm Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Tpm Enabled</em>' attribute.
     * @see #isIsTpmEnabled()
     * @generated
     */
    void setIsTpmEnabled(boolean value);

} // ResistanceToTampering
