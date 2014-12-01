/**
 */
package structure;

import models.Model;

import org.eclipse.emf.common.util.EList;

import structure.instance.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Runtime Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.StructuralRuntimeModel#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.StructurePackage#getStructuralRuntimeModel()
 * @model
 * @generated
 */
public interface StructuralRuntimeModel extends Model {
    /**
     * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
     * The list contents are of type {@link structure.instance.Entity}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entities</em>' containment reference list.
     * @see structure.StructurePackage#getStructuralRuntimeModel_Entities()
     * @model containment="true"
     * @generated
     */
    EList<Entity> getEntities();

} // StructuralRuntimeModel
