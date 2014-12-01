/**
 */
package identity.pattern;

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
 * @see identity.pattern.PatternFactory
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
    String eNS_URI = "http://identity/pattern/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "identity-pattern";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    PatternPackage eINSTANCE = identity.pattern.impl.PatternPackageImpl.init();

    /**
     * The meta object id for the '{@link identity.pattern.impl.IdentityPatternImpl <em>Identity Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.pattern.impl.IdentityPatternImpl
     * @see identity.pattern.impl.PatternPackageImpl#getIdentityPattern()
     * @generated
     */
    int IDENTITY_PATTERN = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_PATTERN__VISUAL_ELEMENTS = ModelsPackage.PATTERN__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_PATTERN__ID = ModelsPackage.PATTERN__ID;

    /**
     * The feature id for the '<em><b>Attribute Patterns</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_PATTERN__ATTRIBUTE_PATTERNS = ModelsPackage.PATTERN_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Issuer Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_PATTERN__ISSUER_PATTERN = ModelsPackage.PATTERN_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Subject</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_PATTERN__SUBJECT = ModelsPackage.PATTERN_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Variables</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_PATTERN__VARIABLES = ModelsPackage.PATTERN_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_PATTERN__INSTANTIATION = ModelsPackage.PATTERN_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_PATTERN__TYPE = ModelsPackage.PATTERN_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Subject Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_PATTERN__SUBJECT_PATTERN = ModelsPackage.PATTERN_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Identity Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_PATTERN_FEATURE_COUNT = ModelsPackage.PATTERN_FEATURE_COUNT + 7;

    /**
     * The number of operations of the '<em>Identity Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_PATTERN_OPERATION_COUNT = ModelsPackage.PATTERN_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link identity.pattern.impl.IdentityAttributePatternImpl <em>Identity Attribute Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see identity.pattern.impl.IdentityAttributePatternImpl
     * @see identity.pattern.impl.PatternPackageImpl#getIdentityAttributePattern()
     * @generated
     */
    int IDENTITY_ATTRIBUTE_PATTERN = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_PATTERN__VISUAL_ELEMENTS = data.pattern.PatternPackage.DATA_PATTERN__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_PATTERN__ID = data.pattern.PatternPackage.DATA_PATTERN__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_PATTERN__TYPE = data.pattern.PatternPackage.DATA_PATTERN__TYPE;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_PATTERN__INSTANTIATION = data.pattern.PatternPackage.DATA_PATTERN__INSTANTIATION;

    /**
     * The feature id for the '<em><b>Variables</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_PATTERN__VARIABLES = data.pattern.PatternPackage.DATA_PATTERN__VARIABLES;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_PATTERN__VALUE = data.pattern.PatternPackage.DATA_PATTERN__VALUE;

    /**
     * The feature id for the '<em><b>Variable</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_PATTERN__VARIABLE = data.pattern.PatternPackage.DATA_PATTERN_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Identity Attribute Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_PATTERN_FEATURE_COUNT = data.pattern.PatternPackage.DATA_PATTERN_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Identity Attribute Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTITY_ATTRIBUTE_PATTERN_OPERATION_COUNT = data.pattern.PatternPackage.DATA_PATTERN_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link identity.pattern.IdentityPattern <em>Identity Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Identity Pattern</em>'.
     * @see identity.pattern.IdentityPattern
     * @generated
     */
    EClass getIdentityPattern();

    /**
     * Returns the meta object for the containment reference list '{@link identity.pattern.IdentityPattern#getAttributePatterns <em>Attribute Patterns</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attribute Patterns</em>'.
     * @see identity.pattern.IdentityPattern#getAttributePatterns()
     * @see #getIdentityPattern()
     * @generated
     */
    EReference getIdentityPattern_AttributePatterns();

    /**
     * Returns the meta object for the containment reference '{@link identity.pattern.IdentityPattern#getIssuerPattern <em>Issuer Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Issuer Pattern</em>'.
     * @see identity.pattern.IdentityPattern#getIssuerPattern()
     * @see #getIdentityPattern()
     * @generated
     */
    EReference getIdentityPattern_IssuerPattern();

    /**
     * Returns the meta object for the attribute '{@link identity.pattern.IdentityPattern#getSubject <em>Subject</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Subject</em>'.
     * @see identity.pattern.IdentityPattern#getSubject()
     * @see #getIdentityPattern()
     * @generated
     */
    EAttribute getIdentityPattern_Subject();

    /**
     * Returns the meta object for the reference list '{@link identity.pattern.IdentityPattern#getVariables <em>Variables</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Variables</em>'.
     * @see identity.pattern.IdentityPattern#getVariables()
     * @see #getIdentityPattern()
     * @generated
     */
    EReference getIdentityPattern_Variables();

    /**
     * Returns the meta object for the reference '{@link identity.pattern.IdentityPattern#getInstantiation <em>Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Instantiation</em>'.
     * @see identity.pattern.IdentityPattern#getInstantiation()
     * @see #getIdentityPattern()
     * @generated
     */
    EReference getIdentityPattern_Instantiation();

    /**
     * Returns the meta object for the reference '{@link identity.pattern.IdentityPattern#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see identity.pattern.IdentityPattern#getType()
     * @see #getIdentityPattern()
     * @generated
     */
    EReference getIdentityPattern_Type();

    /**
     * Returns the meta object for the containment reference '{@link identity.pattern.IdentityPattern#getSubjectPattern <em>Subject Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Subject Pattern</em>'.
     * @see identity.pattern.IdentityPattern#getSubjectPattern()
     * @see #getIdentityPattern()
     * @generated
     */
    EReference getIdentityPattern_SubjectPattern();

    /**
     * Returns the meta object for class '{@link identity.pattern.IdentityAttributePattern <em>Identity Attribute Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Identity Attribute Pattern</em>'.
     * @see identity.pattern.IdentityAttributePattern
     * @generated
     */
    EClass getIdentityAttributePattern();

    /**
     * Returns the meta object for the reference '{@link identity.pattern.IdentityAttributePattern#getVariable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Variable</em>'.
     * @see identity.pattern.IdentityAttributePattern#getVariable()
     * @see #getIdentityAttributePattern()
     * @generated
     */
    EReference getIdentityAttributePattern_Variable();

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
         * The meta object literal for the '{@link identity.pattern.impl.IdentityPatternImpl <em>Identity Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.pattern.impl.IdentityPatternImpl
         * @see identity.pattern.impl.PatternPackageImpl#getIdentityPattern()
         * @generated
         */
        EClass IDENTITY_PATTERN = eINSTANCE.getIdentityPattern();

        /**
         * The meta object literal for the '<em><b>Attribute Patterns</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IDENTITY_PATTERN__ATTRIBUTE_PATTERNS = eINSTANCE.getIdentityPattern_AttributePatterns();

        /**
         * The meta object literal for the '<em><b>Issuer Pattern</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IDENTITY_PATTERN__ISSUER_PATTERN = eINSTANCE.getIdentityPattern_IssuerPattern();

        /**
         * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IDENTITY_PATTERN__SUBJECT = eINSTANCE.getIdentityPattern_Subject();

        /**
         * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IDENTITY_PATTERN__VARIABLES = eINSTANCE.getIdentityPattern_Variables();

        /**
         * The meta object literal for the '<em><b>Instantiation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IDENTITY_PATTERN__INSTANTIATION = eINSTANCE.getIdentityPattern_Instantiation();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IDENTITY_PATTERN__TYPE = eINSTANCE.getIdentityPattern_Type();

        /**
         * The meta object literal for the '<em><b>Subject Pattern</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IDENTITY_PATTERN__SUBJECT_PATTERN = eINSTANCE.getIdentityPattern_SubjectPattern();

        /**
         * The meta object literal for the '{@link identity.pattern.impl.IdentityAttributePatternImpl <em>Identity Attribute Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see identity.pattern.impl.IdentityAttributePatternImpl
         * @see identity.pattern.impl.PatternPackageImpl#getIdentityAttributePattern()
         * @generated
         */
        EClass IDENTITY_ATTRIBUTE_PATTERN = eINSTANCE.getIdentityAttributePattern();

        /**
         * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IDENTITY_ATTRIBUTE_PATTERN__VARIABLE = eINSTANCE.getIdentityAttributePattern_Variable();

    }

} //PatternPackage
