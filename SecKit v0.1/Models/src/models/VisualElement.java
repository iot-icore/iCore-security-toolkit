/**
 */
package models;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visual Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link models.VisualElement#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see models.ModelsPackage#getVisualElement()
 * @model abstract="true"
 * @generated
 */
public interface VisualElement extends EObject {
    /**
     * Returns the value of the '<em><b>Element</b></em>' reference.
     * It is bidirectional and its opposite is '{@link models.Element#getVisualElements <em>Visual Elements</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Element</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Element</em>' reference.
     * @see #setElement(Element)
     * @see models.ModelsPackage#getVisualElement_Element()
     * @see models.Element#getVisualElements
     * @model opposite="visualElements"
     * @generated
     */
    Element getElement();

    /**
     * Sets the value of the '{@link models.VisualElement#getElement <em>Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Element</em>' reference.
     * @see #getElement()
     * @generated
     */
    void setElement(Element value);

} // VisualElement
