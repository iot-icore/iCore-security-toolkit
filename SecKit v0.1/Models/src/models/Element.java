/**
 */
package models;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link models.Element#getId <em>Id</em>}</li>
 *   <li>{@link models.Element#getVisualElements <em>Visual Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see models.ModelsPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see models.ModelsPackage#getElement_Id()
     * @model id="true"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link models.Element#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Visual Elements</b></em>' reference list.
     * The list contents are of type {@link models.VisualElement}.
     * It is bidirectional and its opposite is '{@link models.VisualElement#getElement <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Visual Elements</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Visual Elements</em>' reference list.
     * @see models.ModelsPackage#getElement_VisualElements()
     * @see models.VisualElement#getElement
     * @model opposite="element"
     * @generated
     */
    EList<VisualElement> getVisualElements();

} // Element
