/**
 */
package behavior.type;

import behavior.BehaviorDesignModel;

import models.Element;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Type Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.type.BehaviorTypePackage#getBehaviorTypes <em>Behavior Types</em>}</li>
 *   <li>{@link behavior.type.BehaviorTypePackage#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link behavior.type.BehaviorTypePackage#getDataProducerTypes <em>Data Producer Types</em>}</li>
 *   <li>{@link behavior.type.BehaviorTypePackage#getName <em>Name</em>}</li>
 *   <li>{@link behavior.type.BehaviorTypePackage#getSuperPackage <em>Super Package</em>}</li>
 *   <li>{@link behavior.type.BehaviorTypePackage#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.type.TypePackage#getBehaviorTypePackage()
 * @model
 * @generated
 */
public interface BehaviorTypePackage extends Element {
    /**
     * Returns the value of the '<em><b>Behavior Types</b></em>' containment reference list.
     * The list contents are of type {@link behavior.type.AbstractBehaviorType}.
     * It is bidirectional and its opposite is '{@link behavior.type.AbstractBehaviorType#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Behavior Types</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Behavior Types</em>' containment reference list.
     * @see behavior.type.TypePackage#getBehaviorTypePackage_BehaviorTypes()
     * @see behavior.type.AbstractBehaviorType#getPackage
     * @model opposite="package" containment="true"
     * @generated
     */
    EList<AbstractBehaviorType> getBehaviorTypes();

    /**
     * Returns the value of the '<em><b>Sub Packages</b></em>' containment reference list.
     * The list contents are of type {@link behavior.type.BehaviorTypePackage}.
     * It is bidirectional and its opposite is '{@link behavior.type.BehaviorTypePackage#getSuperPackage <em>Super Package</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Packages</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Packages</em>' containment reference list.
     * @see behavior.type.TypePackage#getBehaviorTypePackage_SubPackages()
     * @see behavior.type.BehaviorTypePackage#getSuperPackage
     * @model opposite="superPackage" containment="true"
     * @generated
     */
    EList<BehaviorTypePackage> getSubPackages();

    /**
     * Returns the value of the '<em><b>Data Producer Types</b></em>' containment reference list.
     * The list contents are of type {@link behavior.type.DataProducerType}.
     * It is bidirectional and its opposite is '{@link behavior.type.DataProducerType#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Producer Types</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Producer Types</em>' containment reference list.
     * @see behavior.type.TypePackage#getBehaviorTypePackage_DataProducerTypes()
     * @see behavior.type.DataProducerType#getPackage
     * @model opposite="package" containment="true"
     * @generated
     */
    EList<DataProducerType> getDataProducerTypes();

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
     * @see behavior.type.TypePackage#getBehaviorTypePackage_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link behavior.type.BehaviorTypePackage#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Super Package</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link behavior.type.BehaviorTypePackage#getSubPackages <em>Sub Packages</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Super Package</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Super Package</em>' container reference.
     * @see #setSuperPackage(BehaviorTypePackage)
     * @see behavior.type.TypePackage#getBehaviorTypePackage_SuperPackage()
     * @see behavior.type.BehaviorTypePackage#getSubPackages
     * @model opposite="subPackages" transient="false"
     * @generated
     */
    BehaviorTypePackage getSuperPackage();

    /**
     * Sets the value of the '{@link behavior.type.BehaviorTypePackage#getSuperPackage <em>Super Package</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Super Package</em>' container reference.
     * @see #getSuperPackage()
     * @generated
     */
    void setSuperPackage(BehaviorTypePackage value);

    /**
     * Returns the value of the '<em><b>Model</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link behavior.BehaviorDesignModel#getPackages <em>Packages</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model</em>' container reference.
     * @see #setModel(BehaviorDesignModel)
     * @see behavior.type.TypePackage#getBehaviorTypePackage_Model()
     * @see behavior.BehaviorDesignModel#getPackages
     * @model opposite="packages" transient="false"
     * @generated
     */
    BehaviorDesignModel getModel();

    /**
     * Sets the value of the '{@link behavior.type.BehaviorTypePackage#getModel <em>Model</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' container reference.
     * @see #getModel()
     * @generated
     */
    void setModel(BehaviorDesignModel value);

} // BehaviorTypePackage
