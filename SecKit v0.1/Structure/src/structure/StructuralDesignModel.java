/**
 */
package structure;

import models.Model;

import org.eclipse.emf.common.util.EList;

import structure.instantiation.EntityInstantiation;

import structure.type.EntityTypePackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Design Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.StructuralDesignModel#getEntityTypePackages <em>Entity Type Packages</em>}</li>
 *   <li>{@link structure.StructuralDesignModel#getAllowedEntityInstantiations <em>Allowed Entity Instantiations</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.StructurePackage#getStructuralDesignModel()
 * @model
 * @generated
 */
public interface StructuralDesignModel extends Model {
    /**
     * Returns the value of the '<em><b>Entity Type Packages</b></em>' containment reference list.
     * The list contents are of type {@link structure.type.EntityTypePackage}.
     * It is bidirectional and its opposite is '{@link structure.type.EntityTypePackage#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entity Type Packages</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entity Type Packages</em>' containment reference list.
     * @see structure.StructurePackage#getStructuralDesignModel_EntityTypePackages()
     * @see structure.type.EntityTypePackage#getModel
     * @model opposite="model" containment="true"
     * @generated
     */
    EList<EntityTypePackage> getEntityTypePackages();

    /**
     * Returns the value of the '<em><b>Allowed Entity Instantiations</b></em>' containment reference list.
     * The list contents are of type {@link structure.instantiation.EntityInstantiation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Allowed Entity Instantiations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Allowed Entity Instantiations</em>' containment reference list.
     * @see structure.StructurePackage#getStructuralDesignModel_AllowedEntityInstantiations()
     * @model containment="true"
     * @generated
     */
    EList<EntityInstantiation> getAllowedEntityInstantiations();

} // StructuralDesignModel
