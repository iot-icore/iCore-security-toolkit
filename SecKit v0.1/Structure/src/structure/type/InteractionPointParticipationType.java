/**
 */
package structure.type;

import models.Element;

import org.eclipse.emf.common.util.EList;

import structure.instantiation.InteractionPointParticipationInstantiation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Point Participation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.type.InteractionPointParticipationType#getName <em>Name</em>}</li>
 *   <li>{@link structure.type.InteractionPointParticipationType#getInstantiations <em>Instantiations</em>}</li>
 *   <li>{@link structure.type.InteractionPointParticipationType#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.type.TypePackage#getInteractionPointParticipationType()
 * @model
 * @generated
 */
public interface InteractionPointParticipationType extends Element, LocalizableType {
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
     * @see structure.type.TypePackage#getInteractionPointParticipationType_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link structure.type.InteractionPointParticipationType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Instantiations</b></em>' reference list.
     * The list contents are of type {@link structure.instantiation.InteractionPointParticipationInstantiation}.
     * It is bidirectional and its opposite is '{@link structure.instantiation.InteractionPointParticipationInstantiation#getParticipationType <em>Participation Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instantiations</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instantiations</em>' reference list.
     * @see structure.type.TypePackage#getInteractionPointParticipationType_Instantiations()
     * @see structure.instantiation.InteractionPointParticipationInstantiation#getParticipationType
     * @model opposite="participationType"
     * @generated
     */
    EList<InteractionPointParticipationInstantiation> getInstantiations();

    /**
     * Returns the value of the '<em><b>Package</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link structure.type.EntityTypePackage#getParticipationTypes <em>Participation Types</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Package</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Package</em>' container reference.
     * @see #setPackage(EntityTypePackage)
     * @see structure.type.TypePackage#getInteractionPointParticipationType_Package()
     * @see structure.type.EntityTypePackage#getParticipationTypes
     * @model opposite="participationTypes" required="true" transient="false"
     * @generated
     */
    EntityTypePackage getPackage();

    /**
     * Sets the value of the '{@link structure.type.InteractionPointParticipationType#getPackage <em>Package</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Package</em>' container reference.
     * @see #getPackage()
     * @generated
     */
    void setPackage(EntityTypePackage value);

} // InteractionPointParticipationType
