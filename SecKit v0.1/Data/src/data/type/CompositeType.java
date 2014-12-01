/**
 */
package data.type;

import data.instantiation.DataInstantiation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.type.CompositeType#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.type.TypePackage#getCompositeType()
 * @model
 * @generated
 */
public interface CompositeType extends DataType {
    /**
     * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
     * The list contents are of type {@link data.instantiation.DataInstantiation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attributes</em>' containment reference list.
     * @see data.type.TypePackage#getCompositeType_Attributes()
     * @model containment="true"
     * @generated
     */
    EList<DataInstantiation> getAttributes();

} // CompositeType
