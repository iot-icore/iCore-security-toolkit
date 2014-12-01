/**
 */
package behavior.quality;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Of Data Provisioning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.quality.QualityOfDataProvisioning#getTimestampPrecision <em>Timestamp Precision</em>}</li>
 *   <li>{@link behavior.quality.QualityOfDataProvisioning#getMaxPrecision <em>Max Precision</em>}</li>
 *   <li>{@link behavior.quality.QualityOfDataProvisioning#getRefreshRate <em>Refresh Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.quality.QualityPackage#getQualityOfDataProvisioning()
 * @model
 * @generated
 */
public interface QualityOfDataProvisioning extends Quantitative {
    /**
     * Returns the value of the '<em><b>Timestamp Precision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Timestamp Precision</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Timestamp Precision</em>' attribute.
     * @see #setTimestampPrecision(String)
     * @see behavior.quality.QualityPackage#getQualityOfDataProvisioning_TimestampPrecision()
     * @model
     * @generated
     */
    String getTimestampPrecision();

    /**
     * Sets the value of the '{@link behavior.quality.QualityOfDataProvisioning#getTimestampPrecision <em>Timestamp Precision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Timestamp Precision</em>' attribute.
     * @see #getTimestampPrecision()
     * @generated
     */
    void setTimestampPrecision(String value);

    /**
     * Returns the value of the '<em><b>Max Precision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Precision</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Precision</em>' attribute.
     * @see #setMaxPrecision(String)
     * @see behavior.quality.QualityPackage#getQualityOfDataProvisioning_MaxPrecision()
     * @model
     * @generated
     */
    String getMaxPrecision();

    /**
     * Sets the value of the '{@link behavior.quality.QualityOfDataProvisioning#getMaxPrecision <em>Max Precision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Precision</em>' attribute.
     * @see #getMaxPrecision()
     * @generated
     */
    void setMaxPrecision(String value);

    /**
     * Returns the value of the '<em><b>Refresh Rate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refresh Rate</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refresh Rate</em>' attribute.
     * @see #setRefreshRate(String)
     * @see behavior.quality.QualityPackage#getQualityOfDataProvisioning_RefreshRate()
     * @model
     * @generated
     */
    String getRefreshRate();

    /**
     * Sets the value of the '{@link behavior.quality.QualityOfDataProvisioning#getRefreshRate <em>Refresh Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refresh Rate</em>' attribute.
     * @see #getRefreshRate()
     * @generated
     */
    void setRefreshRate(String value);

} // QualityOfDataProvisioning
