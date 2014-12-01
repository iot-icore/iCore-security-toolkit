/**
 */
package risk.type;

import models.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link risk.type.Asset#getValue <em>Value</em>}</li>
 *   <li>{@link risk.type.Asset#getInterestedStakeholder <em>Interested Stakeholder</em>}</li>
 *   <li>{@link risk.type.Asset#getIndirectlyImpacts <em>Indirectly Impacts</em>}</li>
 *   <li>{@link risk.type.Asset#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see risk.type.TypePackage#getAsset()
 * @model
 * @generated
 */
public interface Asset extends Element {
    /**
     * Returns the value of the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' containment reference.
     * @see #setValue(MonetaryAmount)
     * @see risk.type.TypePackage#getAsset_Value()
     * @model containment="true"
     * @generated
     */
    MonetaryAmount getValue();

    /**
     * Sets the value of the '{@link risk.type.Asset#getValue <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' containment reference.
     * @see #getValue()
     * @generated
     */
    void setValue(MonetaryAmount value);

    /**
     * Returns the value of the '<em><b>Interested Stakeholder</b></em>' reference list.
     * The list contents are of type {@link risk.type.Stakeholder}.
     * It is bidirectional and its opposite is '{@link risk.type.Stakeholder#getAssetsToProtect <em>Assets To Protect</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interested Stakeholder</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interested Stakeholder</em>' reference list.
     * @see risk.type.TypePackage#getAsset_InterestedStakeholder()
     * @see risk.type.Stakeholder#getAssetsToProtect
     * @model opposite="assetsToProtect"
     * @generated
     */
    EList<Stakeholder> getInterestedStakeholder();

    /**
     * Returns the value of the '<em><b>Indirectly Impacts</b></em>' reference list.
     * The list contents are of type {@link risk.type.Asset}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Indirectly Impacts</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Indirectly Impacts</em>' reference list.
     * @see risk.type.TypePackage#getAsset_IndirectlyImpacts()
     * @model
     * @generated
     */
    EList<Asset> getIndirectlyImpacts();

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see risk.type.TypePackage#getAsset_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link risk.type.Asset#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

} // Asset
