/**
 */
package behavior.instance;

import data.instance.Data;

import identity.instance.AbstractIdentity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Producer Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.instance.DataProducerInstance#getData <em>Data</em>}</li>
 *   <li>{@link behavior.instance.DataProducerInstance#getIdentities <em>Identities</em>}</li>
 *   <li>{@link behavior.instance.DataProducerInstance#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.instance.InstancePackage#getDataProducerInstance()
 * @model abstract="true"
 * @generated
 */
public interface DataProducerInstance extends EObject {
    /**
     * Returns the value of the '<em><b>Data</b></em>' reference list.
     * The list contents are of type {@link data.instance.Data}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data</em>' reference list.
     * @see behavior.instance.InstancePackage#getDataProducerInstance_Data()
     * @model
     * @generated
     */
    EList<Data> getData();

    /**
     * Returns the value of the '<em><b>Identities</b></em>' reference list.
     * The list contents are of type {@link identity.instance.AbstractIdentity}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Identities</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Identities</em>' reference list.
     * @see behavior.instance.InstancePackage#getDataProducerInstance_Identities()
     * @model
     * @generated
     */
    EList<AbstractIdentity> getIdentities();

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
     * @see behavior.instance.InstancePackage#getDataProducerInstance_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link behavior.instance.DataProducerInstance#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // DataProducerInstance
