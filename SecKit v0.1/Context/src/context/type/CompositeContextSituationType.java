/**
 */
package context.type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Context Situation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link context.type.CompositeContextSituationType#getSituationRoleTypes <em>Situation Role Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see context.type.TypePackage#getCompositeContextSituationType()
 * @model
 * @generated
 */
public interface CompositeContextSituationType extends ContextSituationType {
    /**
     * Returns the value of the '<em><b>Situation Role Types</b></em>' containment reference list.
     * The list contents are of type {@link context.type.SituationRoleType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Situation Role Types</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Situation Role Types</em>' containment reference list.
     * @see context.type.TypePackage#getCompositeContextSituationType_SituationRoleTypes()
     * @model containment="true"
     * @generated
     */
    EList<SituationRoleType> getSituationRoleTypes();

} // CompositeContextSituationType
