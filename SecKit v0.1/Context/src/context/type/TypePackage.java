/**
 */
package context.type;

import models.ModelsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see context.type.TypeFactory
 * @model kind="package"
 * @generated
 */
public interface TypePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "type";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://context/type/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "context-type";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TypePackage eINSTANCE = context.type.impl.TypePackageImpl.init();

    /**
     * The meta object id for the '{@link context.type.impl.ContextSituationTypeImpl <em>Context Situation Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.type.impl.ContextSituationTypeImpl
     * @see context.type.impl.TypePackageImpl#getContextSituationType()
     * @generated
     */
    int CONTEXT_SITUATION_TYPE = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_TYPE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_TYPE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Entity Role Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_TYPE__ENTITY_ROLE_TYPES = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_TYPE__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Situation Rule</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_TYPE__SITUATION_RULE = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_TYPE__ATTRIBUTES = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_TYPE__PACKAGE = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Context Situation Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_TYPE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Context Situation Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_TYPE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link context.type.impl.ContextInformationTypeImpl <em>Context Information Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.type.impl.ContextInformationTypeImpl
     * @see context.type.impl.TypePackageImpl#getContextInformationType()
     * @generated
     */
    int CONTEXT_INFORMATION_TYPE = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_TYPE__VISUAL_ELEMENTS = data.type.TypePackage.DATA_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_TYPE__ID = data.type.TypePackage.DATA_TYPE__ID;

    /**
     * The feature id for the '<em><b>EType</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_TYPE__ETYPE = data.type.TypePackage.DATA_TYPE__ETYPE;

    /**
     * The feature id for the '<em><b>Instantiations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_TYPE__INSTANTIATIONS = data.type.TypePackage.DATA_TYPE__INSTANTIATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_TYPE__NAME = data.type.TypePackage.DATA_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Instances</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_TYPE__INSTANCES = data.type.TypePackage.DATA_TYPE__INSTANCES;

    /**
     * The feature id for the '<em><b>Origin Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_TYPE__ORIGIN_TYPE = data.type.TypePackage.DATA_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Situation Role Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_TYPE__SITUATION_ROLE_TYPES = data.type.TypePackage.DATA_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_TYPE__PACKAGE = data.type.TypePackage.DATA_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Context Information Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_TYPE_FEATURE_COUNT = data.type.TypePackage.DATA_TYPE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Context Information Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_TYPE_OPERATION_COUNT = data.type.TypePackage.DATA_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link context.type.impl.ContextTypePackageImpl <em>Context Type Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.type.impl.ContextTypePackageImpl
     * @see context.type.impl.TypePackageImpl#getContextTypePackage()
     * @generated
     */
    int CONTEXT_TYPE_PACKAGE = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_TYPE_PACKAGE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_TYPE_PACKAGE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Situation Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_TYPE_PACKAGE__SITUATION_TYPES = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Context Information Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_TYPE_PACKAGE__CONTEXT_INFORMATION_TYPES = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_TYPE_PACKAGE__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Context Type Package</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_TYPE_PACKAGE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Context Type Package</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_TYPE_PACKAGE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link context.type.impl.EntityRoleTypeImpl <em>Entity Role Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.type.impl.EntityRoleTypeImpl
     * @see context.type.impl.TypePackageImpl#getEntityRoleType()
     * @generated
     */
    int ENTITY_ROLE_TYPE = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_ROLE_TYPE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_ROLE_TYPE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_ROLE_TYPE__MULTIPLICITY = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Context Information Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_ROLE_TYPE__CONTEXT_INFORMATION_TYPES = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Context Situation Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_ROLE_TYPE__CONTEXT_SITUATION_TYPE = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_ROLE_TYPE__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Entity Role Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_ROLE_TYPE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Entity Role Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_ROLE_TYPE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link context.type.impl.CompositeContextSituationTypeImpl <em>Composite Context Situation Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.type.impl.CompositeContextSituationTypeImpl
     * @see context.type.impl.TypePackageImpl#getCompositeContextSituationType()
     * @generated
     */
    int COMPOSITE_CONTEXT_SITUATION_TYPE = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE_CONTEXT_SITUATION_TYPE__VISUAL_ELEMENTS = CONTEXT_SITUATION_TYPE__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE_CONTEXT_SITUATION_TYPE__ID = CONTEXT_SITUATION_TYPE__ID;

    /**
     * The feature id for the '<em><b>Entity Role Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE_CONTEXT_SITUATION_TYPE__ENTITY_ROLE_TYPES = CONTEXT_SITUATION_TYPE__ENTITY_ROLE_TYPES;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE_CONTEXT_SITUATION_TYPE__NAME = CONTEXT_SITUATION_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Situation Rule</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE_CONTEXT_SITUATION_TYPE__SITUATION_RULE = CONTEXT_SITUATION_TYPE__SITUATION_RULE;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE_CONTEXT_SITUATION_TYPE__ATTRIBUTES = CONTEXT_SITUATION_TYPE__ATTRIBUTES;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE_CONTEXT_SITUATION_TYPE__PACKAGE = CONTEXT_SITUATION_TYPE__PACKAGE;

    /**
     * The feature id for the '<em><b>Situation Role Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE_CONTEXT_SITUATION_TYPE__SITUATION_ROLE_TYPES = CONTEXT_SITUATION_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Composite Context Situation Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE_CONTEXT_SITUATION_TYPE_FEATURE_COUNT = CONTEXT_SITUATION_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Composite Context Situation Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPOSITE_CONTEXT_SITUATION_TYPE_OPERATION_COUNT = CONTEXT_SITUATION_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link context.type.impl.SituationRoleTypeImpl <em>Situation Role Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.type.impl.SituationRoleTypeImpl
     * @see context.type.impl.TypePackageImpl#getSituationRoleType()
     * @generated
     */
    int SITUATION_ROLE_TYPE = 5;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITUATION_ROLE_TYPE__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITUATION_ROLE_TYPE__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Context Situation Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITUATION_ROLE_TYPE__CONTEXT_SITUATION_TYPE = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITUATION_ROLE_TYPE__NAME = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITUATION_ROLE_TYPE__MULTIPLICITY = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Situation Role Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITUATION_ROLE_TYPE_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Situation Role Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SITUATION_ROLE_TYPE_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link context.type.OriginType <em>Origin Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.type.OriginType
     * @see context.type.impl.TypePackageImpl#getOriginType()
     * @generated
     */
    int ORIGIN_TYPE = 6;


    /**
     * Returns the meta object for class '{@link context.type.ContextSituationType <em>Context Situation Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Situation Type</em>'.
     * @see context.type.ContextSituationType
     * @generated
     */
    EClass getContextSituationType();

    /**
     * Returns the meta object for the containment reference list '{@link context.type.ContextSituationType#getEntityRoleTypes <em>Entity Role Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Entity Role Types</em>'.
     * @see context.type.ContextSituationType#getEntityRoleTypes()
     * @see #getContextSituationType()
     * @generated
     */
    EReference getContextSituationType_EntityRoleTypes();

    /**
     * Returns the meta object for the attribute '{@link context.type.ContextSituationType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see context.type.ContextSituationType#getName()
     * @see #getContextSituationType()
     * @generated
     */
    EAttribute getContextSituationType_Name();

    /**
     * Returns the meta object for the containment reference '{@link context.type.ContextSituationType#getSituationRule <em>Situation Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Situation Rule</em>'.
     * @see context.type.ContextSituationType#getSituationRule()
     * @see #getContextSituationType()
     * @generated
     */
    EReference getContextSituationType_SituationRule();

    /**
     * Returns the meta object for the containment reference list '{@link context.type.ContextSituationType#getAttributes <em>Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attributes</em>'.
     * @see context.type.ContextSituationType#getAttributes()
     * @see #getContextSituationType()
     * @generated
     */
    EReference getContextSituationType_Attributes();

    /**
     * Returns the meta object for the container reference '{@link context.type.ContextSituationType#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Package</em>'.
     * @see context.type.ContextSituationType#getPackage()
     * @see #getContextSituationType()
     * @generated
     */
    EReference getContextSituationType_Package();

    /**
     * Returns the meta object for class '{@link context.type.ContextInformationType <em>Context Information Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Information Type</em>'.
     * @see context.type.ContextInformationType
     * @generated
     */
    EClass getContextInformationType();

    /**
     * Returns the meta object for the attribute '{@link context.type.ContextInformationType#getOriginType <em>Origin Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Origin Type</em>'.
     * @see context.type.ContextInformationType#getOriginType()
     * @see #getContextInformationType()
     * @generated
     */
    EAttribute getContextInformationType_OriginType();

    /**
     * Returns the meta object for the reference list '{@link context.type.ContextInformationType#getSituationRoleTypes <em>Situation Role Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Situation Role Types</em>'.
     * @see context.type.ContextInformationType#getSituationRoleTypes()
     * @see #getContextInformationType()
     * @generated
     */
    EReference getContextInformationType_SituationRoleTypes();

    /**
     * Returns the meta object for the container reference '{@link context.type.ContextInformationType#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Package</em>'.
     * @see context.type.ContextInformationType#getPackage()
     * @see #getContextInformationType()
     * @generated
     */
    EReference getContextInformationType_Package();

    /**
     * Returns the meta object for class '{@link context.type.ContextTypePackage <em>Context Type Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Type Package</em>'.
     * @see context.type.ContextTypePackage
     * @generated
     */
    EClass getContextTypePackage();

    /**
     * Returns the meta object for the containment reference list '{@link context.type.ContextTypePackage#getSituationTypes <em>Situation Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Situation Types</em>'.
     * @see context.type.ContextTypePackage#getSituationTypes()
     * @see #getContextTypePackage()
     * @generated
     */
    EReference getContextTypePackage_SituationTypes();

    /**
     * Returns the meta object for the containment reference list '{@link context.type.ContextTypePackage#getContextInformationTypes <em>Context Information Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Context Information Types</em>'.
     * @see context.type.ContextTypePackage#getContextInformationTypes()
     * @see #getContextTypePackage()
     * @generated
     */
    EReference getContextTypePackage_ContextInformationTypes();

    /**
     * Returns the meta object for the attribute '{@link context.type.ContextTypePackage#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see context.type.ContextTypePackage#getName()
     * @see #getContextTypePackage()
     * @generated
     */
    EAttribute getContextTypePackage_Name();

    /**
     * Returns the meta object for class '{@link context.type.EntityRoleType <em>Entity Role Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entity Role Type</em>'.
     * @see context.type.EntityRoleType
     * @generated
     */
    EClass getEntityRoleType();

    /**
     * Returns the meta object for the containment reference '{@link context.type.EntityRoleType#getMultiplicity <em>Multiplicity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Multiplicity</em>'.
     * @see context.type.EntityRoleType#getMultiplicity()
     * @see #getEntityRoleType()
     * @generated
     */
    EReference getEntityRoleType_Multiplicity();

    /**
     * Returns the meta object for the reference list '{@link context.type.EntityRoleType#getContextInformationTypes <em>Context Information Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Context Information Types</em>'.
     * @see context.type.EntityRoleType#getContextInformationTypes()
     * @see #getEntityRoleType()
     * @generated
     */
    EReference getEntityRoleType_ContextInformationTypes();

    /**
     * Returns the meta object for the container reference '{@link context.type.EntityRoleType#getContextSituationType <em>Context Situation Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Context Situation Type</em>'.
     * @see context.type.EntityRoleType#getContextSituationType()
     * @see #getEntityRoleType()
     * @generated
     */
    EReference getEntityRoleType_ContextSituationType();

    /**
     * Returns the meta object for the attribute '{@link context.type.EntityRoleType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see context.type.EntityRoleType#getName()
     * @see #getEntityRoleType()
     * @generated
     */
    EAttribute getEntityRoleType_Name();

    /**
     * Returns the meta object for class '{@link context.type.CompositeContextSituationType <em>Composite Context Situation Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Composite Context Situation Type</em>'.
     * @see context.type.CompositeContextSituationType
     * @generated
     */
    EClass getCompositeContextSituationType();

    /**
     * Returns the meta object for the containment reference list '{@link context.type.CompositeContextSituationType#getSituationRoleTypes <em>Situation Role Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Situation Role Types</em>'.
     * @see context.type.CompositeContextSituationType#getSituationRoleTypes()
     * @see #getCompositeContextSituationType()
     * @generated
     */
    EReference getCompositeContextSituationType_SituationRoleTypes();

    /**
     * Returns the meta object for class '{@link context.type.SituationRoleType <em>Situation Role Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Situation Role Type</em>'.
     * @see context.type.SituationRoleType
     * @generated
     */
    EClass getSituationRoleType();

    /**
     * Returns the meta object for the reference '{@link context.type.SituationRoleType#getContextSituationType <em>Context Situation Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Context Situation Type</em>'.
     * @see context.type.SituationRoleType#getContextSituationType()
     * @see #getSituationRoleType()
     * @generated
     */
    EReference getSituationRoleType_ContextSituationType();

    /**
     * Returns the meta object for the attribute '{@link context.type.SituationRoleType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see context.type.SituationRoleType#getName()
     * @see #getSituationRoleType()
     * @generated
     */
    EAttribute getSituationRoleType_Name();

    /**
     * Returns the meta object for the containment reference '{@link context.type.SituationRoleType#getMultiplicity <em>Multiplicity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Multiplicity</em>'.
     * @see context.type.SituationRoleType#getMultiplicity()
     * @see #getSituationRoleType()
     * @generated
     */
    EReference getSituationRoleType_Multiplicity();

    /**
     * Returns the meta object for enum '{@link context.type.OriginType <em>Origin Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Origin Type</em>'.
     * @see context.type.OriginType
     * @generated
     */
    EEnum getOriginType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TypeFactory getTypeFactory();

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
         * The meta object literal for the '{@link context.type.impl.ContextSituationTypeImpl <em>Context Situation Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.type.impl.ContextSituationTypeImpl
         * @see context.type.impl.TypePackageImpl#getContextSituationType()
         * @generated
         */
        EClass CONTEXT_SITUATION_TYPE = eINSTANCE.getContextSituationType();

        /**
         * The meta object literal for the '<em><b>Entity Role Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_SITUATION_TYPE__ENTITY_ROLE_TYPES = eINSTANCE.getContextSituationType_EntityRoleTypes();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTEXT_SITUATION_TYPE__NAME = eINSTANCE.getContextSituationType_Name();

        /**
         * The meta object literal for the '<em><b>Situation Rule</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_SITUATION_TYPE__SITUATION_RULE = eINSTANCE.getContextSituationType_SituationRule();

        /**
         * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_SITUATION_TYPE__ATTRIBUTES = eINSTANCE.getContextSituationType_Attributes();

        /**
         * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_SITUATION_TYPE__PACKAGE = eINSTANCE.getContextSituationType_Package();

        /**
         * The meta object literal for the '{@link context.type.impl.ContextInformationTypeImpl <em>Context Information Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.type.impl.ContextInformationTypeImpl
         * @see context.type.impl.TypePackageImpl#getContextInformationType()
         * @generated
         */
        EClass CONTEXT_INFORMATION_TYPE = eINSTANCE.getContextInformationType();

        /**
         * The meta object literal for the '<em><b>Origin Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTEXT_INFORMATION_TYPE__ORIGIN_TYPE = eINSTANCE.getContextInformationType_OriginType();

        /**
         * The meta object literal for the '<em><b>Situation Role Types</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_INFORMATION_TYPE__SITUATION_ROLE_TYPES = eINSTANCE.getContextInformationType_SituationRoleTypes();

        /**
         * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_INFORMATION_TYPE__PACKAGE = eINSTANCE.getContextInformationType_Package();

        /**
         * The meta object literal for the '{@link context.type.impl.ContextTypePackageImpl <em>Context Type Package</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.type.impl.ContextTypePackageImpl
         * @see context.type.impl.TypePackageImpl#getContextTypePackage()
         * @generated
         */
        EClass CONTEXT_TYPE_PACKAGE = eINSTANCE.getContextTypePackage();

        /**
         * The meta object literal for the '<em><b>Situation Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_TYPE_PACKAGE__SITUATION_TYPES = eINSTANCE.getContextTypePackage_SituationTypes();

        /**
         * The meta object literal for the '<em><b>Context Information Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_TYPE_PACKAGE__CONTEXT_INFORMATION_TYPES = eINSTANCE.getContextTypePackage_ContextInformationTypes();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTEXT_TYPE_PACKAGE__NAME = eINSTANCE.getContextTypePackage_Name();

        /**
         * The meta object literal for the '{@link context.type.impl.EntityRoleTypeImpl <em>Entity Role Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.type.impl.EntityRoleTypeImpl
         * @see context.type.impl.TypePackageImpl#getEntityRoleType()
         * @generated
         */
        EClass ENTITY_ROLE_TYPE = eINSTANCE.getEntityRoleType();

        /**
         * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_ROLE_TYPE__MULTIPLICITY = eINSTANCE.getEntityRoleType_Multiplicity();

        /**
         * The meta object literal for the '<em><b>Context Information Types</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_ROLE_TYPE__CONTEXT_INFORMATION_TYPES = eINSTANCE.getEntityRoleType_ContextInformationTypes();

        /**
         * The meta object literal for the '<em><b>Context Situation Type</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_ROLE_TYPE__CONTEXT_SITUATION_TYPE = eINSTANCE.getEntityRoleType_ContextSituationType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENTITY_ROLE_TYPE__NAME = eINSTANCE.getEntityRoleType_Name();

        /**
         * The meta object literal for the '{@link context.type.impl.CompositeContextSituationTypeImpl <em>Composite Context Situation Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.type.impl.CompositeContextSituationTypeImpl
         * @see context.type.impl.TypePackageImpl#getCompositeContextSituationType()
         * @generated
         */
        EClass COMPOSITE_CONTEXT_SITUATION_TYPE = eINSTANCE.getCompositeContextSituationType();

        /**
         * The meta object literal for the '<em><b>Situation Role Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPOSITE_CONTEXT_SITUATION_TYPE__SITUATION_ROLE_TYPES = eINSTANCE.getCompositeContextSituationType_SituationRoleTypes();

        /**
         * The meta object literal for the '{@link context.type.impl.SituationRoleTypeImpl <em>Situation Role Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.type.impl.SituationRoleTypeImpl
         * @see context.type.impl.TypePackageImpl#getSituationRoleType()
         * @generated
         */
        EClass SITUATION_ROLE_TYPE = eINSTANCE.getSituationRoleType();

        /**
         * The meta object literal for the '<em><b>Context Situation Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SITUATION_ROLE_TYPE__CONTEXT_SITUATION_TYPE = eINSTANCE.getSituationRoleType_ContextSituationType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SITUATION_ROLE_TYPE__NAME = eINSTANCE.getSituationRoleType_Name();

        /**
         * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SITUATION_ROLE_TYPE__MULTIPLICITY = eINSTANCE.getSituationRoleType_Multiplicity();

        /**
         * The meta object literal for the '{@link context.type.OriginType <em>Origin Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.type.OriginType
         * @see context.type.impl.TypePackageImpl#getOriginType()
         * @generated
         */
        EEnum ORIGIN_TYPE = eINSTANCE.getOriginType();

    }

} //TypePackage
