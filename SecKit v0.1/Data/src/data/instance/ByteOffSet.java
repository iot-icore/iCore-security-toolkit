/**
 */
package data.instance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Byte Off Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.instance.ByteOffSet#getStart <em>Start</em>}</li>
 *   <li>{@link data.instance.ByteOffSet#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.instance.InstancePackage#getByteOffSet()
 * @model abstract="true"
 * @generated
 */
public interface ByteOffSet extends PartialData {
    /**
     * Returns the value of the '<em><b>Start</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start</em>' attribute.
     * @see #setStart(long)
     * @see data.instance.InstancePackage#getByteOffSet_Start()
     * @model
     * @generated
     */
    long getStart();

    /**
     * Sets the value of the '{@link data.instance.ByteOffSet#getStart <em>Start</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start</em>' attribute.
     * @see #getStart()
     * @generated
     */
    void setStart(long value);

    /**
     * Returns the value of the '<em><b>End</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End</em>' attribute.
     * @see #setEnd(long)
     * @see data.instance.InstancePackage#getByteOffSet_End()
     * @model
     * @generated
     */
    long getEnd();

    /**
     * Sets the value of the '{@link data.instance.ByteOffSet#getEnd <em>End</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End</em>' attribute.
     * @see #getEnd()
     * @generated
     */
    void setEnd(long value);

} // ByteOffSet
