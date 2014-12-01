/**
 */
package behavior.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Producer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.type.DataProducerType#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.type.TypePackage#getDataProducerType()
 * @model abstract="true"
 * @generated
 */
public interface DataProducerType extends AbstractDataProducerType {
    /**
     * Returns the value of the '<em><b>Package</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link behavior.type.BehaviorTypePackage#getDataProducerTypes <em>Data Producer Types</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Package</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Package</em>' container reference.
     * @see #setPackage(BehaviorTypePackage)
     * @see behavior.type.TypePackage#getDataProducerType_Package()
     * @see behavior.type.BehaviorTypePackage#getDataProducerTypes
     * @model opposite="dataProducerTypes" required="true" transient="false"
     * @generated
     */
    BehaviorTypePackage getPackage();

    /**
     * Sets the value of the '{@link behavior.type.DataProducerType#getPackage <em>Package</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Package</em>' container reference.
     * @see #getPackage()
     * @generated
     */
    void setPackage(BehaviorTypePackage value);

} // DataProducerType
