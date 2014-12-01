/**
 */
package behavior.instance;

import behavior.type.InteractionType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.instance.Interaction#getType <em>Type</em>}</li>
 *   <li>{@link behavior.instance.Interaction#getContributions <em>Contributions</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.instance.InstancePackage#getInteraction()
 * @model
 * @generated
 */
public interface Interaction extends Activity {
    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link behavior.type.InteractionType#getInstances <em>Instances</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(InteractionType)
     * @see behavior.instance.InstancePackage#getInteraction_Type()
     * @see behavior.type.InteractionType#getInstances
     * @model opposite="instances" required="true"
     * @generated
     */
    InteractionType getType();

    /**
     * Sets the value of the '{@link behavior.instance.Interaction#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(InteractionType value);

    /**
     * Returns the value of the '<em><b>Contributions</b></em>' reference list.
     * The list contents are of type {@link behavior.instance.InteractionContribution}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contributions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contributions</em>' reference list.
     * @see behavior.instance.InstancePackage#getInteraction_Contributions()
     * @model
     * @generated
     */
    EList<InteractionContribution> getContributions();

} // Interaction
