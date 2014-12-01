/**
 */
package identity.instance;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see identity.instance.InstanceFactory
 * @model kind="package"
 * @generated
 */
public interface InstancePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "instance";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://identity/instance/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "identity-instance";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    InstancePackage eINSTANCE = identity.instance.impl.InstancePackageImpl.init();

    /**
     * The meta object id for the '{@link identity.instance.impl.AbstractIdentityImpl <em>Abstract Identity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.instance.impl.AbstractIdentityImpl
     * @see identity.instance.impl.InstancePackageImpl#getAbstractIdentity()
     * @generated
     */
    int ABSTRACT_IDENTITY = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_IDENTITY__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_IDENTITY__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_IDENTITY__ATTRIBUTES = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_IDENTITY__TYPE = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_IDENTITY__INSTANTIATION = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Subject</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_IDENTITY__SUBJECT = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Owner</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_IDENTITY__OWNER = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Abstract Identity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_IDENTITY_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Abstract Identity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_IDENTITY_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.instance.impl.SelfSignedIdentityImpl <em>Self Signed Identity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.instance.impl.SelfSignedIdentityImpl
     * @see identity.instance.impl.InstancePackageImpl#getSelfSignedIdentity()
     * @generated
     */
    int SELF_SIGNED_IDENTITY = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_SIGNED_IDENTITY__VISUAL_ELEMENTS = ABSTRACT_IDENTITY__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_SIGNED_IDENTITY__ID = ABSTRACT_IDENTITY__ID;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_SIGNED_IDENTITY__ATTRIBUTES = ABSTRACT_IDENTITY__ATTRIBUTES;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_SIGNED_IDENTITY__TYPE = ABSTRACT_IDENTITY__TYPE;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_SIGNED_IDENTITY__INSTANTIATION = ABSTRACT_IDENTITY__INSTANTIATION;

    /**
     * The feature id for the '<em><b>Subject</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_SIGNED_IDENTITY__SUBJECT = ABSTRACT_IDENTITY__SUBJECT;

    /**
     * The feature id for the '<em><b>Owner</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_SIGNED_IDENTITY__OWNER = ABSTRACT_IDENTITY__OWNER;

    /**
     * The number of structural features of the '<em>Self Signed Identity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_SIGNED_IDENTITY_FEATURE_COUNT = ABSTRACT_IDENTITY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Self Signed Identity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SELF_SIGNED_IDENTITY_OPERATION_COUNT = ABSTRACT_IDENTITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.instance.impl.DigitalIdentityImpl <em>Digital Identity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.instance.impl.DigitalIdentityImpl
     * @see identity.instance.impl.InstancePackageImpl#getDigitalIdentity()
     * @generated
     */
    int DIGITAL_IDENTITY = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIGITAL_IDENTITY__VISUAL_ELEMENTS = SELF_SIGNED_IDENTITY__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIGITAL_IDENTITY__ID = SELF_SIGNED_IDENTITY__ID;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIGITAL_IDENTITY__ATTRIBUTES = SELF_SIGNED_IDENTITY__ATTRIBUTES;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIGITAL_IDENTITY__TYPE = SELF_SIGNED_IDENTITY__TYPE;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIGITAL_IDENTITY__INSTANTIATION = SELF_SIGNED_IDENTITY__INSTANTIATION;

    /**
     * The feature id for the '<em><b>Subject</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIGITAL_IDENTITY__SUBJECT = SELF_SIGNED_IDENTITY__SUBJECT;

    /**
     * The feature id for the '<em><b>Owner</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIGITAL_IDENTITY__OWNER = SELF_SIGNED_IDENTITY__OWNER;

    /**
     * The feature id for the '<em><b>Issuer</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIGITAL_IDENTITY__ISSUER = SELF_SIGNED_IDENTITY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Authentication Credentials</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIGITAL_IDENTITY__AUTHENTICATION_CREDENTIALS = SELF_SIGNED_IDENTITY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Digital Identity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIGITAL_IDENTITY_FEATURE_COUNT = SELF_SIGNED_IDENTITY_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Digital Identity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIGITAL_IDENTITY_OPERATION_COUNT = SELF_SIGNED_IDENTITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.instance.impl.IdentityAttributeImpl <em>Identity Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.instance.impl.IdentityAttributeImpl
     * @see identity.instance.impl.InstancePackageImpl#getIdentityAttribute()
     * @generated
     */
    int IDENTITY_ATTRIBUTE = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE__VISUAL_ELEMENTS = data.instance.InstancePackage.DATA__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE__ID = data.instance.InstancePackage.DATA__ID;

    /**
     * The feature id for the '<em><b>String Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE__STRING_VALUE = data.instance.InstancePackage.DATA__STRING_VALUE;

    /**
     * The feature id for the '<em><b>Addresses</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE__ADDRESSES = data.instance.InstancePackage.DATA__ADDRESSES;

    /**
     * The feature id for the '<em><b>EObject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE__EOBJECT = data.instance.InstancePackage.DATA__EOBJECT;

    /**
     * The feature id for the '<em><b>Data Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE__DATA_SET = data.instance.InstancePackage.DATA__DATA_SET;

    /**
     * The feature id for the '<em><b>Location</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE__LOCATION = data.instance.InstancePackage.DATA__LOCATION;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE__INSTANTIATION = data.instance.InstancePackage.DATA__INSTANTIATION;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE__TYPE = data.instance.InstancePackage.DATA__TYPE;

    /**
     * The feature id for the '<em><b>Initial Representation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE__INITIAL_REPRESENTATION = data.instance.InstancePackage.DATA__INITIAL_REPRESENTATION;

    /**
     * The feature id for the '<em><b>Data Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE__DATA_ID = data.instance.InstancePackage.DATA__DATA_ID;

    /**
     * The feature id for the '<em><b>Verification Method</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE__VERIFICATION_METHOD = data.instance.InstancePackage.DATA_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Identity Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_FEATURE_COUNT = data.instance.InstancePackage.DATA_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Identity Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_OPERATION_COUNT = data.instance.InstancePackage.DATA_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.instance.impl.IdentityRealmImpl <em>Identity Realm</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.instance.impl.IdentityRealmImpl
     * @see identity.instance.impl.InstancePackageImpl#getIdentityRealm()
     * @generated
     */
    int IDENTITY_REALM = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_REALM__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_REALM__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_REALM__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Identities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_REALM__IDENTITIES = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Identity Realm</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_REALM_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Identity Realm</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_REALM_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.instance.impl.IdentityFederationImpl <em>Identity Federation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.instance.impl.IdentityFederationImpl
     * @see identity.instance.impl.InstancePackageImpl#getIdentityFederation()
     * @generated
     */
    int IDENTITY_FEDERATION = 5;

    /**
     * The number of structural features of the '<em>Identity Federation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_FEDERATION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Identity Federation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_FEDERATION_OPERATION_COUNT = 0;


    /**
     * The meta object id for the '{@link identity.instance.impl.IdentityOwnerImpl <em>Identity Owner</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.instance.impl.IdentityOwnerImpl
     * @see identity.instance.impl.InstancePackageImpl#getIdentityOwner()
     * @generated
     */
    int IDENTITY_OWNER = 6;

    /**
     * The feature id for the '<em><b>Identities</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_OWNER__IDENTITIES = 0;

    /**
     * The number of structural features of the '<em>Identity Owner</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_OWNER_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Identity Owner</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_OWNER_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link identity.instance.AbstractIdentity <em>Abstract Identity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Identity</em>'.
     * @see identity.instance.AbstractIdentity
     * @generated
     */
    EClass getAbstractIdentity();

    /**
     * Returns the meta object for the containment reference list '{@link identity.instance.AbstractIdentity#getAttributes <em>Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attributes</em>'.
     * @see identity.instance.AbstractIdentity#getAttributes()
     * @see #getAbstractIdentity()
     * @generated
     */
    EReference getAbstractIdentity_Attributes();

    /**
     * Returns the meta object for the reference '{@link identity.instance.AbstractIdentity#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see identity.instance.AbstractIdentity#getType()
     * @see #getAbstractIdentity()
     * @generated
     */
    EReference getAbstractIdentity_Type();

    /**
     * Returns the meta object for the reference '{@link identity.instance.AbstractIdentity#getInstantiation <em>Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Instantiation</em>'.
     * @see identity.instance.AbstractIdentity#getInstantiation()
     * @see #getAbstractIdentity()
     * @generated
     */
    EReference getAbstractIdentity_Instantiation();

    /**
     * Returns the meta object for the attribute '{@link identity.instance.AbstractIdentity#getSubject <em>Subject</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Subject</em>'.
     * @see identity.instance.AbstractIdentity#getSubject()
     * @see #getAbstractIdentity()
     * @generated
     */
    EAttribute getAbstractIdentity_Subject();

    /**
     * Returns the meta object for the reference '{@link identity.instance.AbstractIdentity#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Owner</em>'.
     * @see identity.instance.AbstractIdentity#getOwner()
     * @see #getAbstractIdentity()
     * @generated
     */
    EReference getAbstractIdentity_Owner();

    /**
     * Returns the meta object for class '{@link identity.instance.DigitalIdentity <em>Digital Identity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Digital Identity</em>'.
     * @see identity.instance.DigitalIdentity
     * @generated
     */
    EClass getDigitalIdentity();

    /**
     * Returns the meta object for the reference '{@link identity.instance.DigitalIdentity#getIssuer <em>Issuer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Issuer</em>'.
     * @see identity.instance.DigitalIdentity#getIssuer()
     * @see #getDigitalIdentity()
     * @generated
     */
    EReference getDigitalIdentity_Issuer();

    /**
     * Returns the meta object for the containment reference list '{@link identity.instance.DigitalIdentity#getAuthenticationCredentials <em>Authentication Credentials</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Authentication Credentials</em>'.
     * @see identity.instance.DigitalIdentity#getAuthenticationCredentials()
     * @see #getDigitalIdentity()
     * @generated
     */
    EReference getDigitalIdentity_AuthenticationCredentials();

    /**
     * Returns the meta object for class '{@link identity.instance.IdentityAttribute <em>Identity Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Identity Attribute</em>'.
     * @see identity.instance.IdentityAttribute
     * @generated
     */
    EClass getIdentityAttribute();

    /**
     * Returns the meta object for the reference list '{@link identity.instance.IdentityAttribute#getVerificationMethod <em>Verification Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Verification Method</em>'.
     * @see identity.instance.IdentityAttribute#getVerificationMethod()
     * @see #getIdentityAttribute()
     * @generated
     */
    EReference getIdentityAttribute_VerificationMethod();

    /**
     * Returns the meta object for class '{@link identity.instance.IdentityRealm <em>Identity Realm</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Identity Realm</em>'.
     * @see identity.instance.IdentityRealm
     * @generated
     */
    EClass getIdentityRealm();

    /**
     * Returns the meta object for the attribute '{@link identity.instance.IdentityRealm#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see identity.instance.IdentityRealm#getName()
     * @see #getIdentityRealm()
     * @generated
     */
    EAttribute getIdentityRealm_Name();

    /**
     * Returns the meta object for the containment reference list '{@link identity.instance.IdentityRealm#getIdentities <em>Identities</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Identities</em>'.
     * @see identity.instance.IdentityRealm#getIdentities()
     * @see #getIdentityRealm()
     * @generated
     */
    EReference getIdentityRealm_Identities();

    /**
     * Returns the meta object for class '{@link identity.instance.SelfSignedIdentity <em>Self Signed Identity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Self Signed Identity</em>'.
     * @see identity.instance.SelfSignedIdentity
     * @generated
     */
    EClass getSelfSignedIdentity();

    /**
     * Returns the meta object for class '{@link identity.instance.IdentityFederation <em>Identity Federation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Identity Federation</em>'.
     * @see identity.instance.IdentityFederation
     * @generated
     */
    EClass getIdentityFederation();

    /**
     * Returns the meta object for class '{@link identity.instance.IdentityOwner <em>Identity Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Identity Owner</em>'.
     * @see identity.instance.IdentityOwner
     * @generated
     */
    EClass getIdentityOwner();

    /**
     * Returns the meta object for the reference list '{@link identity.instance.IdentityOwner#getIdentities <em>Identities</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Identities</em>'.
     * @see identity.instance.IdentityOwner#getIdentities()
     * @see #getIdentityOwner()
     * @generated
     */
    EReference getIdentityOwner_Identities();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    InstanceFactory getInstanceFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link identity.instance.impl.AbstractIdentityImpl <em>Abstract Identity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.instance.impl.AbstractIdentityImpl
         * @see identity.instance.impl.InstancePackageImpl#getAbstractIdentity()
         * @generated
         */
        EClass ABSTRACT_IDENTITY = eINSTANCE.getAbstractIdentity();

        /**
         * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_IDENTITY__ATTRIBUTES = eINSTANCE.getAbstractIdentity_Attributes();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_IDENTITY__TYPE = eINSTANCE.getAbstractIdentity_Type();

        /**
         * The meta object literal for the '<em><b>Instantiation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_IDENTITY__INSTANTIATION = eINSTANCE.getAbstractIdentity_Instantiation();

        /**
         * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABSTRACT_IDENTITY__SUBJECT = eINSTANCE.getAbstractIdentity_Subject();

        /**
         * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABSTRACT_IDENTITY__OWNER = eINSTANCE.getAbstractIdentity_Owner();

        /**
         * The meta object literal for the '{@link identity.instance.impl.DigitalIdentityImpl <em>Digital Identity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.instance.impl.DigitalIdentityImpl
         * @see identity.instance.impl.InstancePackageImpl#getDigitalIdentity()
         * @generated
         */
        EClass DIGITAL_IDENTITY = eINSTANCE.getDigitalIdentity();

        /**
         * The meta object literal for the '<em><b>Issuer</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIGITAL_IDENTITY__ISSUER = eINSTANCE.getDigitalIdentity_Issuer();

        /**
         * The meta object literal for the '<em><b>Authentication Credentials</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIGITAL_IDENTITY__AUTHENTICATION_CREDENTIALS = eINSTANCE.getDigitalIdentity_AuthenticationCredentials();

        /**
         * The meta object literal for the '{@link identity.instance.impl.IdentityAttributeImpl <em>Identity Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.instance.impl.IdentityAttributeImpl
         * @see identity.instance.impl.InstancePackageImpl#getIdentityAttribute()
         * @generated
         */
        EClass IDENTITY_ATTRIBUTE = eINSTANCE.getIdentityAttribute();

        /**
         * The meta object literal for the '<em><b>Verification Method</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IDENTITY_ATTRIBUTE__VERIFICATION_METHOD = eINSTANCE.getIdentityAttribute_VerificationMethod();

        /**
         * The meta object literal for the '{@link identity.instance.impl.IdentityRealmImpl <em>Identity Realm</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.instance.impl.IdentityRealmImpl
         * @see identity.instance.impl.InstancePackageImpl#getIdentityRealm()
         * @generated
         */
        EClass IDENTITY_REALM = eINSTANCE.getIdentityRealm();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IDENTITY_REALM__NAME = eINSTANCE.getIdentityRealm_Name();

        /**
         * The meta object literal for the '<em><b>Identities</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IDENTITY_REALM__IDENTITIES = eINSTANCE.getIdentityRealm_Identities();

        /**
         * The meta object literal for the '{@link identity.instance.impl.SelfSignedIdentityImpl <em>Self Signed Identity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.instance.impl.SelfSignedIdentityImpl
         * @see identity.instance.impl.InstancePackageImpl#getSelfSignedIdentity()
         * @generated
         */
        EClass SELF_SIGNED_IDENTITY = eINSTANCE.getSelfSignedIdentity();

        /**
         * The meta object literal for the '{@link identity.instance.impl.IdentityFederationImpl <em>Identity Federation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.instance.impl.IdentityFederationImpl
         * @see identity.instance.impl.InstancePackageImpl#getIdentityFederation()
         * @generated
         */
        EClass IDENTITY_FEDERATION = eINSTANCE.getIdentityFederation();

        /**
         * The meta object literal for the '{@link identity.instance.impl.IdentityOwnerImpl <em>Identity Owner</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.instance.impl.IdentityOwnerImpl
         * @see identity.instance.impl.InstancePackageImpl#getIdentityOwner()
         * @generated
         */
        EClass IDENTITY_OWNER = eINSTANCE.getIdentityOwner();

        /**
         * The meta object literal for the '<em><b>Identities</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IDENTITY_OWNER__IDENTITIES = eINSTANCE.getIdentityOwner_Identities();

    }

} //InstancePackage
