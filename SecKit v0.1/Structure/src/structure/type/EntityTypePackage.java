/**
 */
package structure.type;

import models.Element;

import org.eclipse.emf.common.util.EList;

import structure.StructuralDesignModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Type Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link structure.type.EntityTypePackage#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link structure.type.EntityTypePackage#getEntityTypes <em>Entity Types</em>}</li>
 *   <li>{@link structure.type.EntityTypePackage#getName <em>Name</em>}</li>
 *   <li>{@link structure.type.EntityTypePackage#getLocationTypes <em>Location Types</em>}</li>
 *   <li>{@link structure.type.EntityTypePackage#getParticipationTypes <em>Participation Types</em>}</li>
 *   <li>{@link structure.type.EntityTypePackage#getActivityPointTypes <em>Activity Point Types</em>}</li>
 *   <li>{@link structure.type.EntityTypePackage#getSuperPackage <em>Super Package</em>}</li>
 *   <li>{@link structure.type.EntityTypePackage#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see structure.type.TypePackage#getEntityTypePackage()
 * @model
 * @generated
 */
public interface EntityTypePackage extends Element {
    /**
     * Returns the value of the '<em><b>Sub Packages</b></em>' containment reference list.
     * The list contents are of type {@link structure.type.EntityTypePackage}.
     * It is bidirectional and its opposite is '{@link structure.type.EntityTypePackage#getSuperPackage <em>Super Package</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Packages</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Packages</em>' containment reference list.
     * @see structure.type.TypePackage#getEntityTypePackage_SubPackages()
     * @see structure.type.EntityTypePackage#getSuperPackage
     * @model opposite="superPackage" containment="true"
     * @generated
     */
    EList<EntityTypePackage> getSubPackages();

    /**
     * Returns the value of the '<em><b>Entity Types</b></em>' containment reference list.
     * The list contents are of type {@link structure.type.EntityType}.
     * It is bidirectional and its opposite is '{@link structure.type.EntityType#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entity Types</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entity Types</em>' containment reference list.
     * @see structure.type.TypePackage#getEntityTypePackage_EntityTypes()
     * @see structure.type.EntityType#getPackage
     * @model opposite="package" containment="true"
     * @generated
     */
    EList<EntityType> getEntityTypes();

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
     * @see structure.type.TypePackage#getEntityTypePackage_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link structure.type.EntityTypePackage#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Location Types</b></em>' containment reference list.
     * The list contents are of type {@link structure.type.LocationType}.
     * It is bidirectional and its opposite is '{@link structure.type.LocationType#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Location Types</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Location Types</em>' containment reference list.
     * @see structure.type.TypePackage#getEntityTypePackage_LocationTypes()
     * @see structure.type.LocationType#getPackage
     * @model opposite="package" containment="true"
     * @generated
     */
    EList<LocationType> getLocationTypes();

    /**
     * Returns the value of the '<em><b>Participation Types</b></em>' containment reference list.
     * The list contents are of type {@link structure.type.InteractionPointParticipationType}.
     * It is bidirectional and its opposite is '{@link structure.type.InteractionPointParticipationType#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Participation Types</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Participation Types</em>' containment reference list.
     * @see structure.type.TypePackage#getEntityTypePackage_ParticipationTypes()
     * @see structure.type.InteractionPointParticipationType#getPackage
     * @model opposite="package" containment="true"
     * @generated
     */
    EList<InteractionPointParticipationType> getParticipationTypes();

    /**
     * Returns the value of the '<em><b>Activity Point Types</b></em>' containment reference list.
     * The list contents are of type {@link structure.type.ActivityPointType}.
     * It is bidirectional and its opposite is '{@link structure.type.ActivityPointType#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Activity Point Types</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Activity Point Types</em>' containment reference list.
     * @see structure.type.TypePackage#getEntityTypePackage_ActivityPointTypes()
     * @see structure.type.ActivityPointType#getPackage
     * @model opposite="package" containment="true"
     * @generated
     */
    EList<ActivityPointType> getActivityPointTypes();

    /**
     * Returns the value of the '<em><b>Super Package</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link structure.type.EntityTypePackage#getSubPackages <em>Sub Packages</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Super Package</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Super Package</em>' container reference.
     * @see #setSuperPackage(EntityTypePackage)
     * @see structure.type.TypePackage#getEntityTypePackage_SuperPackage()
     * @see structure.type.EntityTypePackage#getSubPackages
     * @model opposite="subPackages" transient="false"
     * @generated
     */
    EntityTypePackage getSuperPackage();

    /**
     * Sets the value of the '{@link structure.type.EntityTypePackage#getSuperPackage <em>Super Package</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Super Package</em>' container reference.
     * @see #getSuperPackage()
     * @generated
     */
    void setSuperPackage(EntityTypePackage value);

    /**
     * Returns the value of the '<em><b>Model</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link structure.StructuralDesignModel#getEntityTypePackages <em>Entity Type Packages</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model</em>' container reference.
     * @see #setModel(StructuralDesignModel)
     * @see structure.type.TypePackage#getEntityTypePackage_Model()
     * @see structure.StructuralDesignModel#getEntityTypePackages
     * @model opposite="entityTypePackages" transient="false"
     * @generated
     */
    StructuralDesignModel getModel();

    /**
     * Sets the value of the '{@link structure.type.EntityTypePackage#getModel <em>Model</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' container reference.
     * @see #getModel()
     * @generated
     */
    void setModel(StructuralDesignModel value);

} // EntityTypePackage
