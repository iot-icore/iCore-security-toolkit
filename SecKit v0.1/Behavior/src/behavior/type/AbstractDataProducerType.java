/**
 */
package behavior.type;

import behavior.constraint.Constraint;

import data.instantiation.DataInstantiation;

import identity.instantiation.IdentityInstantiation;

import models.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Data Producer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.type.AbstractDataProducerType#getDataInstantiations <em>Data Instantiations</em>}</li>
 *   <li>{@link behavior.type.AbstractDataProducerType#getIdentityInstantiations <em>Identity Instantiations</em>}</li>
 *   <li>{@link behavior.type.AbstractDataProducerType#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link behavior.type.AbstractDataProducerType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.type.TypePackage#getAbstractDataProducerType()
 * @model abstract="true"
 * @generated
 */
public interface AbstractDataProducerType extends Element {
    /**
     * Returns the value of the '<em><b>Data Instantiations</b></em>' containment reference list.
     * The list contents are of type {@link data.instantiation.DataInstantiation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Instantiations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Instantiations</em>' containment reference list.
     * @see behavior.type.TypePackage#getAbstractDataProducerType_DataInstantiations()
     * @model containment="true"
     * @generated
     */
    EList<DataInstantiation> getDataInstantiations();

    /**
     * Returns the value of the '<em><b>Identity Instantiations</b></em>' containment reference list.
     * The list contents are of type {@link identity.instantiation.IdentityInstantiation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Identity Instantiations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Identity Instantiations</em>' containment reference list.
     * @see behavior.type.TypePackage#getAbstractDataProducerType_IdentityInstantiations()
     * @model containment="true"
     * @generated
     */
    EList<IdentityInstantiation> getIdentityInstantiations();

    /**
     * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
     * The list contents are of type {@link behavior.constraint.Constraint}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Constraints</em>' containment reference list.
     * @see behavior.type.TypePackage#getAbstractDataProducerType_Constraints()
     * @model containment="true"
     * @generated
     */
    EList<Constraint> getConstraints();

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
     * @see behavior.type.TypePackage#getAbstractDataProducerType_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link behavior.type.AbstractDataProducerType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // AbstractDataProducerType
