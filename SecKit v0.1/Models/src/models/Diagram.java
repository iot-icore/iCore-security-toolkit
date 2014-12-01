/**
 */
package models;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link models.Diagram#getShapes <em>Shapes</em>}</li>
 * </ul>
 * </p>
 *
 * @see models.ModelsPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends VisualElement {
    /**
     * Returns the value of the '<em><b>Shapes</b></em>' containment reference list.
     * The list contents are of type {@link models.Shape}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Shapes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Shapes</em>' containment reference list.
     * @see models.ModelsPackage#getDiagram_Shapes()
     * @model containment="true"
     * @generated
     */
    EList<Shape> getShapes();

} // Diagram
