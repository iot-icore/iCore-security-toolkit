/**
 */
package context.instance;

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
 * @see context.instance.InstanceFactory
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
    String eNS_URI = "http://context/instance/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "context-instance";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    InstancePackage eINSTANCE = context.instance.impl.InstancePackageImpl.init();

    /**
     * The meta object id for the '{@link context.instance.impl.ContextImpl <em>Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.instance.impl.ContextImpl
     * @see context.instance.impl.InstancePackageImpl#getContext()
     * @generated
     */
    int CONTEXT = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT__VISUAL_ELEMENTS = data.instance.InstancePackage.DATA__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT__ID = data.instance.InstancePackage.DATA__ID;

    /**
     * The feature id for the '<em><b>String Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT__STRING_VALUE = data.instance.InstancePackage.DATA__STRING_VALUE;

    /**
     * The feature id for the '<em><b>Addresses</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT__ADDRESSES = data.instance.InstancePackage.DATA__ADDRESSES;

    /**
     * The feature id for the '<em><b>EObject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT__EOBJECT = data.instance.InstancePackage.DATA__EOBJECT;

    /**
     * The feature id for the '<em><b>Data Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT__DATA_SET = data.instance.InstancePackage.DATA__DATA_SET;

    /**
     * The feature id for the '<em><b>Location</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT__LOCATION = data.instance.InstancePackage.DATA__LOCATION;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT__INSTANTIATION = data.instance.InstancePackage.DATA__INSTANTIATION;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT__TYPE = data.instance.InstancePackage.DATA__TYPE;

    /**
     * The feature id for the '<em><b>Initial Representation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT__INITIAL_REPRESENTATION = data.instance.InstancePackage.DATA__INITIAL_REPRESENTATION;

    /**
     * The feature id for the '<em><b>Data Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT__DATA_ID = data.instance.InstancePackage.DATA__DATA_ID;

    /**
     * The feature id for the '<em><b>Quality Of Context</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT__QUALITY_OF_CONTEXT = data.instance.InstancePackage.DATA_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT__TIMESTAMP = data.instance.InstancePackage.DATA_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Owner</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT__OWNER = data.instance.InstancePackage.DATA_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Context</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_FEATURE_COUNT = data.instance.InstancePackage.DATA_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Context</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_OPERATION_COUNT = data.instance.InstancePackage.DATA_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link context.instance.impl.ContextSituationImpl <em>Context Situation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.instance.impl.ContextSituationImpl
     * @see context.instance.impl.InstancePackageImpl#getContextSituation()
     * @generated
     */
    int CONTEXT_SITUATION = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION__TYPE = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Roles</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION__ROLES = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Time Interval</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION__TIME_INTERVAL = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Context</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION__CONTEXT = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Context Situation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Context Situation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link context.instance.impl.EntityRoleImpl <em>Entity Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.instance.impl.EntityRoleImpl
     * @see context.instance.impl.InstancePackageImpl#getEntityRole()
     * @generated
     */
    int ENTITY_ROLE = 2;

    /**
     * The feature id for the '<em><b>Role Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_ROLE__ROLE_TYPE = 0;

    /**
     * The feature id for the '<em><b>Identities</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_ROLE__IDENTITIES = 1;

    /**
     * The number of structural features of the '<em>Entity Role</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_ROLE_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Entity Role</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_ROLE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link context.instance.impl.PrecisionImpl <em>Precision</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.instance.impl.PrecisionImpl
     * @see context.instance.impl.InstancePackageImpl#getPrecision()
     * @generated
     */
    int PRECISION = 5;

    /**
     * The number of structural features of the '<em>Precision</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRECISION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Precision</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRECISION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link context.instance.impl.NumericPrecisionImpl <em>Numeric Precision</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.instance.impl.NumericPrecisionImpl
     * @see context.instance.impl.InstancePackageImpl#getNumericPrecision()
     * @generated
     */
    int NUMERIC_PRECISION = 3;

    /**
     * The feature id for the '<em><b>Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_PRECISION__UNIT = PRECISION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Significant Digits</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_PRECISION__SIGNIFICANT_DIGITS = PRECISION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Plus Minus Delta</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_PRECISION__PLUS_MINUS_DELTA = PRECISION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Numeric Precision</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_PRECISION_FEATURE_COUNT = PRECISION_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Numeric Precision</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_PRECISION_OPERATION_COUNT = PRECISION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link context.instance.impl.QualityOfContextImpl <em>Quality Of Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.instance.impl.QualityOfContextImpl
     * @see context.instance.impl.InstancePackageImpl#getQualityOfContext()
     * @generated
     */
    int QUALITY_OF_CONTEXT = 4;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_CONTEXT__VISUAL_ELEMENTS = ModelsPackage.ELEMENT__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_CONTEXT__ID = ModelsPackage.ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Declared Precision</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_CONTEXT__DECLARED_PRECISION = ModelsPackage.ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Implicit Precision</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_CONTEXT__IMPLICIT_PRECISION = ModelsPackage.ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Timestamp Precision</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_CONTEXT__TIMESTAMP_PRECISION = ModelsPackage.ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Refresh Rate</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_CONTEXT__REFRESH_RATE = ModelsPackage.ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Quality Of Context</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_CONTEXT_FEATURE_COUNT = ModelsPackage.ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Quality Of Context</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUALITY_OF_CONTEXT_OPERATION_COUNT = ModelsPackage.ELEMENT_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link context.instance.Context <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context</em>'.
     * @see context.instance.Context
     * @generated
     */
    EClass getContext();

    /**
     * Returns the meta object for the containment reference '{@link context.instance.Context#getQualityOfContext <em>Quality Of Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Quality Of Context</em>'.
     * @see context.instance.Context#getQualityOfContext()
     * @see #getContext()
     * @generated
     */
    EReference getContext_QualityOfContext();

    /**
     * Returns the meta object for the containment reference '{@link context.instance.Context#getTimestamp <em>Timestamp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Timestamp</em>'.
     * @see context.instance.Context#getTimestamp()
     * @see #getContext()
     * @generated
     */
    EReference getContext_Timestamp();

    /**
     * Returns the meta object for the reference '{@link context.instance.Context#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Owner</em>'.
     * @see context.instance.Context#getOwner()
     * @see #getContext()
     * @generated
     */
    EReference getContext_Owner();

    /**
     * Returns the meta object for class '{@link context.instance.ContextSituation <em>Context Situation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Situation</em>'.
     * @see context.instance.ContextSituation
     * @generated
     */
    EClass getContextSituation();

    /**
     * Returns the meta object for the reference '{@link context.instance.ContextSituation#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see context.instance.ContextSituation#getType()
     * @see #getContextSituation()
     * @generated
     */
    EReference getContextSituation_Type();

    /**
     * Returns the meta object for the containment reference '{@link context.instance.ContextSituation#getRoles <em>Roles</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Roles</em>'.
     * @see context.instance.ContextSituation#getRoles()
     * @see #getContextSituation()
     * @generated
     */
    EReference getContextSituation_Roles();

    /**
     * Returns the meta object for the containment reference '{@link context.instance.ContextSituation#getTimeInterval <em>Time Interval</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Time Interval</em>'.
     * @see context.instance.ContextSituation#getTimeInterval()
     * @see #getContextSituation()
     * @generated
     */
    EReference getContextSituation_TimeInterval();

    /**
     * Returns the meta object for the reference list '{@link context.instance.ContextSituation#getContext <em>Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Context</em>'.
     * @see context.instance.ContextSituation#getContext()
     * @see #getContextSituation()
     * @generated
     */
    EReference getContextSituation_Context();

    /**
     * Returns the meta object for class '{@link context.instance.EntityRole <em>Entity Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entity Role</em>'.
     * @see context.instance.EntityRole
     * @generated
     */
    EClass getEntityRole();

    /**
     * Returns the meta object for the reference '{@link context.instance.EntityRole#getRoleType <em>Role Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Role Type</em>'.
     * @see context.instance.EntityRole#getRoleType()
     * @see #getEntityRole()
     * @generated
     */
    EReference getEntityRole_RoleType();

    /**
     * Returns the meta object for the reference list '{@link context.instance.EntityRole#getIdentities <em>Identities</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Identities</em>'.
     * @see context.instance.EntityRole#getIdentities()
     * @see #getEntityRole()
     * @generated
     */
    EReference getEntityRole_Identities();

    /**
     * Returns the meta object for class '{@link context.instance.NumericPrecision <em>Numeric Precision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Numeric Precision</em>'.
     * @see context.instance.NumericPrecision
     * @generated
     */
    EClass getNumericPrecision();

    /**
     * Returns the meta object for the attribute '{@link context.instance.NumericPrecision#getUnit <em>Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Unit</em>'.
     * @see context.instance.NumericPrecision#getUnit()
     * @see #getNumericPrecision()
     * @generated
     */
    EAttribute getNumericPrecision_Unit();

    /**
     * Returns the meta object for the attribute '{@link context.instance.NumericPrecision#getSignificantDigits <em>Significant Digits</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Significant Digits</em>'.
     * @see context.instance.NumericPrecision#getSignificantDigits()
     * @see #getNumericPrecision()
     * @generated
     */
    EAttribute getNumericPrecision_SignificantDigits();

    /**
     * Returns the meta object for the attribute '{@link context.instance.NumericPrecision#getPlusMinusDelta <em>Plus Minus Delta</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Plus Minus Delta</em>'.
     * @see context.instance.NumericPrecision#getPlusMinusDelta()
     * @see #getNumericPrecision()
     * @generated
     */
    EAttribute getNumericPrecision_PlusMinusDelta();

    /**
     * Returns the meta object for class '{@link context.instance.QualityOfContext <em>Quality Of Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Quality Of Context</em>'.
     * @see context.instance.QualityOfContext
     * @generated
     */
    EClass getQualityOfContext();

    /**
     * Returns the meta object for the containment reference '{@link context.instance.QualityOfContext#getDeclaredPrecision <em>Declared Precision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Declared Precision</em>'.
     * @see context.instance.QualityOfContext#getDeclaredPrecision()
     * @see #getQualityOfContext()
     * @generated
     */
    EReference getQualityOfContext_DeclaredPrecision();

    /**
     * Returns the meta object for the containment reference '{@link context.instance.QualityOfContext#getImplicitPrecision <em>Implicit Precision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Implicit Precision</em>'.
     * @see context.instance.QualityOfContext#getImplicitPrecision()
     * @see #getQualityOfContext()
     * @generated
     */
    EReference getQualityOfContext_ImplicitPrecision();

    /**
     * Returns the meta object for the containment reference '{@link context.instance.QualityOfContext#getTimestampPrecision <em>Timestamp Precision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Timestamp Precision</em>'.
     * @see context.instance.QualityOfContext#getTimestampPrecision()
     * @see #getQualityOfContext()
     * @generated
     */
    EReference getQualityOfContext_TimestampPrecision();

    /**
     * Returns the meta object for the containment reference '{@link context.instance.QualityOfContext#getRefreshRate <em>Refresh Rate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Refresh Rate</em>'.
     * @see context.instance.QualityOfContext#getRefreshRate()
     * @see #getQualityOfContext()
     * @generated
     */
    EReference getQualityOfContext_RefreshRate();

    /**
     * Returns the meta object for class '{@link context.instance.Precision <em>Precision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Precision</em>'.
     * @see context.instance.Precision
     * @generated
     */
    EClass getPrecision();

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
         * The meta object literal for the '{@link context.instance.impl.ContextImpl <em>Context</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.instance.impl.ContextImpl
         * @see context.instance.impl.InstancePackageImpl#getContext()
         * @generated
         */
        EClass CONTEXT = eINSTANCE.getContext();

        /**
         * The meta object literal for the '<em><b>Quality Of Context</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT__QUALITY_OF_CONTEXT = eINSTANCE.getContext_QualityOfContext();

        /**
         * The meta object literal for the '<em><b>Timestamp</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT__TIMESTAMP = eINSTANCE.getContext_Timestamp();

        /**
         * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT__OWNER = eINSTANCE.getContext_Owner();

        /**
         * The meta object literal for the '{@link context.instance.impl.ContextSituationImpl <em>Context Situation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.instance.impl.ContextSituationImpl
         * @see context.instance.impl.InstancePackageImpl#getContextSituation()
         * @generated
         */
        EClass CONTEXT_SITUATION = eINSTANCE.getContextSituation();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_SITUATION__TYPE = eINSTANCE.getContextSituation_Type();

        /**
         * The meta object literal for the '<em><b>Roles</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_SITUATION__ROLES = eINSTANCE.getContextSituation_Roles();

        /**
         * The meta object literal for the '<em><b>Time Interval</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_SITUATION__TIME_INTERVAL = eINSTANCE.getContextSituation_TimeInterval();

        /**
         * The meta object literal for the '<em><b>Context</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_SITUATION__CONTEXT = eINSTANCE.getContextSituation_Context();

        /**
         * The meta object literal for the '{@link context.instance.impl.EntityRoleImpl <em>Entity Role</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.instance.impl.EntityRoleImpl
         * @see context.instance.impl.InstancePackageImpl#getEntityRole()
         * @generated
         */
        EClass ENTITY_ROLE = eINSTANCE.getEntityRole();

        /**
         * The meta object literal for the '<em><b>Role Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_ROLE__ROLE_TYPE = eINSTANCE.getEntityRole_RoleType();

        /**
         * The meta object literal for the '<em><b>Identities</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_ROLE__IDENTITIES = eINSTANCE.getEntityRole_Identities();

        /**
         * The meta object literal for the '{@link context.instance.impl.NumericPrecisionImpl <em>Numeric Precision</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.instance.impl.NumericPrecisionImpl
         * @see context.instance.impl.InstancePackageImpl#getNumericPrecision()
         * @generated
         */
        EClass NUMERIC_PRECISION = eINSTANCE.getNumericPrecision();

        /**
         * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NUMERIC_PRECISION__UNIT = eINSTANCE.getNumericPrecision_Unit();

        /**
         * The meta object literal for the '<em><b>Significant Digits</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NUMERIC_PRECISION__SIGNIFICANT_DIGITS = eINSTANCE.getNumericPrecision_SignificantDigits();

        /**
         * The meta object literal for the '<em><b>Plus Minus Delta</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NUMERIC_PRECISION__PLUS_MINUS_DELTA = eINSTANCE.getNumericPrecision_PlusMinusDelta();

        /**
         * The meta object literal for the '{@link context.instance.impl.QualityOfContextImpl <em>Quality Of Context</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.instance.impl.QualityOfContextImpl
         * @see context.instance.impl.InstancePackageImpl#getQualityOfContext()
         * @generated
         */
        EClass QUALITY_OF_CONTEXT = eINSTANCE.getQualityOfContext();

        /**
         * The meta object literal for the '<em><b>Declared Precision</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference QUALITY_OF_CONTEXT__DECLARED_PRECISION = eINSTANCE.getQualityOfContext_DeclaredPrecision();

        /**
         * The meta object literal for the '<em><b>Implicit Precision</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference QUALITY_OF_CONTEXT__IMPLICIT_PRECISION = eINSTANCE.getQualityOfContext_ImplicitPrecision();

        /**
         * The meta object literal for the '<em><b>Timestamp Precision</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference QUALITY_OF_CONTEXT__TIMESTAMP_PRECISION = eINSTANCE.getQualityOfContext_TimestampPrecision();

        /**
         * The meta object literal for the '<em><b>Refresh Rate</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference QUALITY_OF_CONTEXT__REFRESH_RATE = eINSTANCE.getQualityOfContext_RefreshRate();

        /**
         * The meta object literal for the '{@link context.instance.impl.PrecisionImpl <em>Precision</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.instance.impl.PrecisionImpl
         * @see context.instance.impl.InstancePackageImpl#getPrecision()
         * @generated
         */
        EClass PRECISION = eINSTANCE.getPrecision();

    }

} //InstancePackage
