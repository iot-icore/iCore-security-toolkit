/**
 */
package seckit;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Viewpoints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link seckit.SystemViewpoints#getDesign <em>Design</em>}</li>
 *   <li>{@link seckit.SystemViewpoints#getRuntime <em>Runtime</em>}</li>
 * </ul>
 * </p>
 *
 * @see seckit.SeckitPackage#getSystemViewpoints()
 * @model
 * @generated
 */
public interface SystemViewpoints extends EObject {
    /**
     * Returns the value of the '<em><b>Design</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Design</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Design</em>' containment reference.
     * @see #setDesign(SystemDesignViewpoint)
     * @see seckit.SeckitPackage#getSystemViewpoints_Design()
     * @model containment="true"
     * @generated
     */
    SystemDesignViewpoint getDesign();

    /**
     * Sets the value of the '{@link seckit.SystemViewpoints#getDesign <em>Design</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Design</em>' containment reference.
     * @see #getDesign()
     * @generated
     */
    void setDesign(SystemDesignViewpoint value);

    /**
     * Returns the value of the '<em><b>Runtime</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Runtime</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Runtime</em>' containment reference.
     * @see #setRuntime(SystemRuntimeViewpoint)
     * @see seckit.SeckitPackage#getSystemViewpoints_Runtime()
     * @model containment="true"
     * @generated
     */
    SystemRuntimeViewpoint getRuntime();

    /**
     * Sets the value of the '{@link seckit.SystemViewpoints#getRuntime <em>Runtime</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Runtime</em>' containment reference.
     * @see #getRuntime()
     * @generated
     */
    void setRuntime(SystemRuntimeViewpoint value);

} // SystemViewpoints
