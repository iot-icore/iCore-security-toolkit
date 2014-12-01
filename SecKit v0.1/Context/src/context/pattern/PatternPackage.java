/**
 */
package context.pattern;

import models.ModelsPackage;

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
 * @see context.pattern.PatternFactory
 * @model kind="package"
 * @generated
 */
public interface PatternPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "pattern";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://context/pattern/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "context-pattern";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    PatternPackage eINSTANCE = context.pattern.impl.PatternPackageImpl.init();

    /**
     * The meta object id for the '{@link context.pattern.impl.ContextSituationPatternImpl <em>Context Situation Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.pattern.impl.ContextSituationPatternImpl
     * @see context.pattern.impl.PatternPackageImpl#getContextSituationPattern()
     * @generated
     */
    int CONTEXT_SITUATION_PATTERN = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_PATTERN__VISUAL_ELEMENTS = ModelsPackage.PATTERN__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_PATTERN__ID = ModelsPackage.PATTERN__ID;

    /**
     * The feature id for the '<em><b>Entity Role Patterns</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_PATTERN__ENTITY_ROLE_PATTERNS = ModelsPackage.PATTERN_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_PATTERN__TYPE = ModelsPackage.PATTERN_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Context Situation Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_PATTERN_FEATURE_COUNT = ModelsPackage.PATTERN_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Context Situation Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_SITUATION_PATTERN_OPERATION_COUNT = ModelsPackage.PATTERN_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link context.pattern.impl.ContextInformationPatternImpl <em>Context Information Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.pattern.impl.ContextInformationPatternImpl
     * @see context.pattern.impl.PatternPackageImpl#getContextInformationPattern()
     * @generated
     */
    int CONTEXT_INFORMATION_PATTERN = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_PATTERN__VISUAL_ELEMENTS = ModelsPackage.PATTERN__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_PATTERN__ID = ModelsPackage.PATTERN__ID;

    /**
     * The feature id for the '<em><b>Owner</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_PATTERN__OWNER = ModelsPackage.PATTERN_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Quality Of Context</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_PATTERN__QUALITY_OF_CONTEXT = ModelsPackage.PATTERN_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_PATTERN__TYPE = ModelsPackage.PATTERN_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Context Information Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_PATTERN_FEATURE_COUNT = ModelsPackage.PATTERN_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Context Information Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTEXT_INFORMATION_PATTERN_OPERATION_COUNT = ModelsPackage.PATTERN_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link context.pattern.impl.EntityRolePatternImpl <em>Entity Role Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see context.pattern.impl.EntityRolePatternImpl
     * @see context.pattern.impl.PatternPackageImpl#getEntityRolePattern()
     * @generated
     */
    int ENTITY_ROLE_PATTERN = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_ROLE_PATTERN__VISUAL_ELEMENTS = ModelsPackage.PATTERN__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_ROLE_PATTERN__ID = ModelsPackage.PATTERN__ID;

    /**
     * The feature id for the '<em><b>Identity Pattern</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_ROLE_PATTERN__IDENTITY_PATTERN = ModelsPackage.PATTERN_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Entity Role Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_ROLE_PATTERN__ENTITY_ROLE_TYPE = ModelsPackage.PATTERN_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Entity Role Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_ROLE_PATTERN_FEATURE_COUNT = ModelsPackage.PATTERN_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Entity Role Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_ROLE_PATTERN_OPERATION_COUNT = ModelsPackage.PATTERN_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link context.pattern.ContextSituationPattern <em>Context Situation Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Situation Pattern</em>'.
     * @see context.pattern.ContextSituationPattern
     * @generated
     */
    EClass getContextSituationPattern();

    /**
     * Returns the meta object for the containment reference list '{@link context.pattern.ContextSituationPattern#getEntityRolePatterns <em>Entity Role Patterns</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Entity Role Patterns</em>'.
     * @see context.pattern.ContextSituationPattern#getEntityRolePatterns()
     * @see #getContextSituationPattern()
     * @generated
     */
    EReference getContextSituationPattern_EntityRolePatterns();

    /**
     * Returns the meta object for the reference '{@link context.pattern.ContextSituationPattern#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see context.pattern.ContextSituationPattern#getType()
     * @see #getContextSituationPattern()
     * @generated
     */
    EReference getContextSituationPattern_Type();

    /**
     * Returns the meta object for class '{@link context.pattern.ContextInformationPattern <em>Context Information Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Context Information Pattern</em>'.
     * @see context.pattern.ContextInformationPattern
     * @generated
     */
    EClass getContextInformationPattern();

    /**
     * Returns the meta object for the containment reference '{@link context.pattern.ContextInformationPattern#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Owner</em>'.
     * @see context.pattern.ContextInformationPattern#getOwner()
     * @see #getContextInformationPattern()
     * @generated
     */
    EReference getContextInformationPattern_Owner();

    /**
     * Returns the meta object for the containment reference '{@link context.pattern.ContextInformationPattern#getQualityOfContext <em>Quality Of Context</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Quality Of Context</em>'.
     * @see context.pattern.ContextInformationPattern#getQualityOfContext()
     * @see #getContextInformationPattern()
     * @generated
     */
    EReference getContextInformationPattern_QualityOfContext();

    /**
     * Returns the meta object for the reference '{@link context.pattern.ContextInformationPattern#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see context.pattern.ContextInformationPattern#getType()
     * @see #getContextInformationPattern()
     * @generated
     */
    EReference getContextInformationPattern_Type();

    /**
     * Returns the meta object for class '{@link context.pattern.EntityRolePattern <em>Entity Role Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entity Role Pattern</em>'.
     * @see context.pattern.EntityRolePattern
     * @generated
     */
    EClass getEntityRolePattern();

    /**
     * Returns the meta object for the containment reference list '{@link context.pattern.EntityRolePattern#getIdentityPattern <em>Identity Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Identity Pattern</em>'.
     * @see context.pattern.EntityRolePattern#getIdentityPattern()
     * @see #getEntityRolePattern()
     * @generated
     */
    EReference getEntityRolePattern_IdentityPattern();

    /**
     * Returns the meta object for the reference '{@link context.pattern.EntityRolePattern#getEntityRoleType <em>Entity Role Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Entity Role Type</em>'.
     * @see context.pattern.EntityRolePattern#getEntityRoleType()
     * @see #getEntityRolePattern()
     * @generated
     */
    EReference getEntityRolePattern_EntityRoleType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    PatternFactory getPatternFactory();

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
         * The meta object literal for the '{@link context.pattern.impl.ContextSituationPatternImpl <em>Context Situation Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.pattern.impl.ContextSituationPatternImpl
         * @see context.pattern.impl.PatternPackageImpl#getContextSituationPattern()
         * @generated
         */
        EClass CONTEXT_SITUATION_PATTERN = eINSTANCE.getContextSituationPattern();

        /**
         * The meta object literal for the '<em><b>Entity Role Patterns</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_SITUATION_PATTERN__ENTITY_ROLE_PATTERNS = eINSTANCE.getContextSituationPattern_EntityRolePatterns();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_SITUATION_PATTERN__TYPE = eINSTANCE.getContextSituationPattern_Type();

        /**
         * The meta object literal for the '{@link context.pattern.impl.ContextInformationPatternImpl <em>Context Information Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.pattern.impl.ContextInformationPatternImpl
         * @see context.pattern.impl.PatternPackageImpl#getContextInformationPattern()
         * @generated
         */
        EClass CONTEXT_INFORMATION_PATTERN = eINSTANCE.getContextInformationPattern();

        /**
         * The meta object literal for the '<em><b>Owner</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_INFORMATION_PATTERN__OWNER = eINSTANCE.getContextInformationPattern_Owner();

        /**
         * The meta object literal for the '<em><b>Quality Of Context</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_INFORMATION_PATTERN__QUALITY_OF_CONTEXT = eINSTANCE.getContextInformationPattern_QualityOfContext();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTEXT_INFORMATION_PATTERN__TYPE = eINSTANCE.getContextInformationPattern_Type();

        /**
         * The meta object literal for the '{@link context.pattern.impl.EntityRolePatternImpl <em>Entity Role Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see context.pattern.impl.EntityRolePatternImpl
         * @see context.pattern.impl.PatternPackageImpl#getEntityRolePattern()
         * @generated
         */
        EClass ENTITY_ROLE_PATTERN = eINSTANCE.getEntityRolePattern();

        /**
         * The meta object literal for the '<em><b>Identity Pattern</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_ROLE_PATTERN__IDENTITY_PATTERN = eINSTANCE.getEntityRolePattern_IdentityPattern();

        /**
         * The meta object literal for the '<em><b>Entity Role Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_ROLE_PATTERN__ENTITY_ROLE_TYPE = eINSTANCE.getEntityRolePattern_EntityRoleType();

    }

} //PatternPackage
