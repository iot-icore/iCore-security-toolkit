/**
 */
package risk.type;

import models.Element;

import org.eclipse.emf.common.util.EList;

import structure.instantiation.EntityInstantiation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stakeholder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link risk.type.Stakeholder#getOwnedEntityInstantiations <em>Owned Entity Instantiations</em>}</li>
 *   <li>{@link risk.type.Stakeholder#getAssetsToProtect <em>Assets To Protect</em>}</li>
 *   <li>{@link risk.type.Stakeholder#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see risk.type.TypePackage#getStakeholder()
 * @model
 * @generated
 */
public interface Stakeholder extends Element {
    /**
     * Returns the value of the '<em><b>Owned Entity Instantiations</b></em>' reference list.
     * The list contents are of type {@link structure.instantiation.EntityInstantiation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Entity Instantiations</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned Entity Instantiations</em>' reference list.
     * @see risk.type.TypePackage#getStakeholder_OwnedEntityInstantiations()
     * @model
     * @generated
     */
    EList<EntityInstantiation> getOwnedEntityInstantiations();

    /**
     * Returns the value of the '<em><b>Assets To Protect</b></em>' reference list.
     * The list contents are of type {@link risk.type.Asset}.
     * It is bidirectional and its opposite is '{@link risk.type.Asset#getInterestedStakeholder <em>Interested Stakeholder</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Assets To Protect</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Assets To Protect</em>' reference list.
     * @see risk.type.TypePackage#getStakeholder_AssetsToProtect()
     * @see risk.type.Asset#getInterestedStakeholder
     * @model opposite="interestedStakeholder"
     * @generated
     */
    EList<Asset> getAssetsToProtect();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see risk.type.TypePackage#getStakeholder_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link risk.type.Stakeholder#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // Stakeholder
