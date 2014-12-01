/**
 */
package data.event;

import data.instance.Data;

import org.eclipse.emf.ecore.EClassifier;

import rule.event.Event;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link data.event.DataEvent#getEType <em>EType</em>}</li>
 *   <li>{@link data.event.DataEvent#getDataInstance <em>Data Instance</em>}</li>
 *   <li>{@link data.event.DataEvent#getLifecycle <em>Lifecycle</em>}</li>
 * </ul>
 * </p>
 *
 * @see data.event.EventPackage#getDataEvent()
 * @model
 * @generated
 */
public interface DataEvent extends Event {
    /**
     * Returns the value of the '<em><b>EType</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EType</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EType</em>' reference.
     * @see #setEType(EClassifier)
     * @see data.event.EventPackage#getDataEvent_EType()
     * @model
     * @generated
     */
    EClassifier getEType();

    /**
     * Sets the value of the '{@link data.event.DataEvent#getEType <em>EType</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EType</em>' reference.
     * @see #getEType()
     * @generated
     */
    void setEType(EClassifier value);

    /**
     * Returns the value of the '<em><b>Data Instance</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Instance</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Instance</em>' reference.
     * @see #setDataInstance(Data)
     * @see data.event.EventPackage#getDataEvent_DataInstance()
     * @model required="true"
     * @generated
     */
    Data getDataInstance();

    /**
     * Sets the value of the '{@link data.event.DataEvent#getDataInstance <em>Data Instance</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Instance</em>' reference.
     * @see #getDataInstance()
     * @generated
     */
    void setDataInstance(Data value);

    /**
     * Returns the value of the '<em><b>Lifecycle</b></em>' attribute.
     * The literals are from the enumeration {@link data.event.DataLifecycle}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lifecycle</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lifecycle</em>' attribute.
     * @see data.event.DataLifecycle
     * @see #setLifecycle(DataLifecycle)
     * @see data.event.EventPackage#getDataEvent_Lifecycle()
     * @model
     * @generated
     */
    DataLifecycle getLifecycle();

    /**
     * Sets the value of the '{@link data.event.DataEvent#getLifecycle <em>Lifecycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lifecycle</em>' attribute.
     * @see data.event.DataLifecycle
     * @see #getLifecycle()
     * @generated
     */
    void setLifecycle(DataLifecycle value);

} // DataEvent
