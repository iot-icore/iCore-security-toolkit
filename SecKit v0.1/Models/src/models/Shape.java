/**
 */
package models;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link models.Shape#getLabel <em>Label</em>}</li>
 *   <li>{@link models.Shape#getWidth <em>Width</em>}</li>
 *   <li>{@link models.Shape#getHeight <em>Height</em>}</li>
 *   <li>{@link models.Shape#getX <em>X</em>}</li>
 *   <li>{@link models.Shape#getY <em>Y</em>}</li>
 *   <li>{@link models.Shape#getContainedShapes <em>Contained Shapes</em>}</li>
 *   <li>{@link models.Shape#getColor <em>Color</em>}</li>
 *   <li>{@link models.Shape#getContainerShape <em>Container Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see models.ModelsPackage#getShape()
 * @model
 * @generated
 */
public interface Shape extends VisualElement {
    /**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see models.ModelsPackage#getShape_Label()
     * @model
     * @generated
     */
    String getLabel();

    /**
     * Sets the value of the '{@link models.Shape#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
    void setLabel(String value);

    /**
     * Returns the value of the '<em><b>Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Width</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Width</em>' attribute.
     * @see #setWidth(long)
     * @see models.ModelsPackage#getShape_Width()
     * @model
     * @generated
     */
    long getWidth();

    /**
     * Sets the value of the '{@link models.Shape#getWidth <em>Width</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Width</em>' attribute.
     * @see #getWidth()
     * @generated
     */
    void setWidth(long value);

    /**
     * Returns the value of the '<em><b>Height</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Height</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Height</em>' attribute.
     * @see #setHeight(long)
     * @see models.ModelsPackage#getShape_Height()
     * @model
     * @generated
     */
    long getHeight();

    /**
     * Sets the value of the '{@link models.Shape#getHeight <em>Height</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Height</em>' attribute.
     * @see #getHeight()
     * @generated
     */
    void setHeight(long value);

    /**
     * Returns the value of the '<em><b>X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>X</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>X</em>' attribute.
     * @see #setX(long)
     * @see models.ModelsPackage#getShape_X()
     * @model
     * @generated
     */
    long getX();

    /**
     * Sets the value of the '{@link models.Shape#getX <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X</em>' attribute.
     * @see #getX()
     * @generated
     */
    void setX(long value);

    /**
     * Returns the value of the '<em><b>Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Y</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Y</em>' attribute.
     * @see #setY(long)
     * @see models.ModelsPackage#getShape_Y()
     * @model
     * @generated
     */
    long getY();

    /**
     * Sets the value of the '{@link models.Shape#getY <em>Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Y</em>' attribute.
     * @see #getY()
     * @generated
     */
    void setY(long value);

    /**
     * Returns the value of the '<em><b>Contained Shapes</b></em>' containment reference list.
     * The list contents are of type {@link models.Shape}.
     * It is bidirectional and its opposite is '{@link models.Shape#getContainerShape <em>Container Shape</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contained Shapes</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contained Shapes</em>' containment reference list.
     * @see models.ModelsPackage#getShape_ContainedShapes()
     * @see models.Shape#getContainerShape
     * @model opposite="containerShape" containment="true"
     * @generated
     */
    EList<Shape> getContainedShapes();

    /**
     * Returns the value of the '<em><b>Color</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Color</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Color</em>' attribute.
     * @see #setColor(String)
     * @see models.ModelsPackage#getShape_Color()
     * @model
     * @generated
     */
    String getColor();

    /**
     * Sets the value of the '{@link models.Shape#getColor <em>Color</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Color</em>' attribute.
     * @see #getColor()
     * @generated
     */
    void setColor(String value);

    /**
     * Returns the value of the '<em><b>Container Shape</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link models.Shape#getContainedShapes <em>Contained Shapes</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Container Shape</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Container Shape</em>' container reference.
     * @see #setContainerShape(Shape)
     * @see models.ModelsPackage#getShape_ContainerShape()
     * @see models.Shape#getContainedShapes
     * @model opposite="containedShapes" transient="false"
     * @generated
     */
    Shape getContainerShape();

    /**
     * Sets the value of the '{@link models.Shape#getContainerShape <em>Container Shape</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Container Shape</em>' container reference.
     * @see #getContainerShape()
     * @generated
     */
    void setContainerShape(Shape value);

} // Shape
