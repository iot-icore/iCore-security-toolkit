/**
 */
package data.pattern;

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
 * @see data.pattern.PatternFactory
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
    String eNS_URI = "http://data/pattern/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "data-pattern";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    PatternPackage eINSTANCE = data.pattern.impl.PatternPackageImpl.init();

    /**
     * The meta object id for the '{@link data.pattern.impl.DataPatternImpl <em>Data Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.pattern.impl.DataPatternImpl
     * @see data.pattern.impl.PatternPackageImpl#getDataPattern()
     * @generated
     */
    int DATA_PATTERN = 0;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PATTERN__VISUAL_ELEMENTS = ModelsPackage.PATTERN__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PATTERN__ID = ModelsPackage.PATTERN__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PATTERN__TYPE = ModelsPackage.PATTERN_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PATTERN__INSTANTIATION = ModelsPackage.PATTERN_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Variables</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PATTERN__VARIABLES = ModelsPackage.PATTERN_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PATTERN__VALUE = ModelsPackage.PATTERN_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Data Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PATTERN_FEATURE_COUNT = ModelsPackage.PATTERN_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Data Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_PATTERN_OPERATION_COUNT = ModelsPackage.PATTERN_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.pattern.impl.RegExpPatternImpl <em>Reg Exp Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.pattern.impl.RegExpPatternImpl
     * @see data.pattern.impl.PatternPackageImpl#getRegExpPattern()
     * @generated
     */
    int REG_EXP_PATTERN = 1;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REG_EXP_PATTERN__VISUAL_ELEMENTS = DATA_PATTERN__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REG_EXP_PATTERN__ID = DATA_PATTERN__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REG_EXP_PATTERN__TYPE = DATA_PATTERN__TYPE;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REG_EXP_PATTERN__INSTANTIATION = DATA_PATTERN__INSTANTIATION;

    /**
     * The feature id for the '<em><b>Variables</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REG_EXP_PATTERN__VARIABLES = DATA_PATTERN__VARIABLES;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REG_EXP_PATTERN__VALUE = DATA_PATTERN__VALUE;

    /**
     * The feature id for the '<em><b>Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REG_EXP_PATTERN__EXPRESSION = DATA_PATTERN_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Match</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REG_EXP_PATTERN__MATCH = DATA_PATTERN_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REG_EXP_PATTERN__GROUP = DATA_PATTERN_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Reg Exp Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REG_EXP_PATTERN_FEATURE_COUNT = DATA_PATTERN_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Reg Exp Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REG_EXP_PATTERN_OPERATION_COUNT = DATA_PATTERN_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.pattern.impl.XPathPatternImpl <em>XPath Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.pattern.impl.XPathPatternImpl
     * @see data.pattern.impl.PatternPackageImpl#getXPathPattern()
     * @generated
     */
    int XPATH_PATTERN = 2;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XPATH_PATTERN__VISUAL_ELEMENTS = DATA_PATTERN__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XPATH_PATTERN__ID = DATA_PATTERN__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XPATH_PATTERN__TYPE = DATA_PATTERN__TYPE;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XPATH_PATTERN__INSTANTIATION = DATA_PATTERN__INSTANTIATION;

    /**
     * The feature id for the '<em><b>Variables</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XPATH_PATTERN__VARIABLES = DATA_PATTERN__VARIABLES;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XPATH_PATTERN__VALUE = DATA_PATTERN__VALUE;

    /**
     * The feature id for the '<em><b>Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XPATH_PATTERN__EXPRESSION = DATA_PATTERN_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>XPath Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XPATH_PATTERN_FEATURE_COUNT = DATA_PATTERN_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>XPath Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XPATH_PATTERN_OPERATION_COUNT = DATA_PATTERN_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link data.pattern.impl.LiteralPatternImpl <em>Literal Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see data.pattern.impl.LiteralPatternImpl
     * @see data.pattern.impl.PatternPackageImpl#getLiteralPattern()
     * @generated
     */
    int LITERAL_PATTERN = 3;

    /**
     * The feature id for the '<em><b>Visual Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_PATTERN__VISUAL_ELEMENTS = DATA_PATTERN__VISUAL_ELEMENTS;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_PATTERN__ID = DATA_PATTERN__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_PATTERN__TYPE = DATA_PATTERN__TYPE;

    /**
     * The feature id for the '<em><b>Instantiation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_PATTERN__INSTANTIATION = DATA_PATTERN__INSTANTIATION;

    /**
     * The feature id for the '<em><b>Variables</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_PATTERN__VARIABLES = DATA_PATTERN__VARIABLES;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_PATTERN__VALUE = DATA_PATTERN__VALUE;

    /**
     * The number of structural features of the '<em>Literal Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_PATTERN_FEATURE_COUNT = DATA_PATTERN_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Literal Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_PATTERN_OPERATION_COUNT = DATA_PATTERN_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link data.pattern.DataPattern <em>Data Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Pattern</em>'.
     * @see data.pattern.DataPattern
     * @generated
     */
    EClass getDataPattern();

    /**
     * Returns the meta object for the reference '{@link data.pattern.DataPattern#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see data.pattern.DataPattern#getType()
     * @see #getDataPattern()
     * @generated
     */
    EReference getDataPattern_Type();

    /**
     * Returns the meta object for the reference '{@link data.pattern.DataPattern#getInstantiation <em>Instantiation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Instantiation</em>'.
     * @see data.pattern.DataPattern#getInstantiation()
     * @see #getDataPattern()
     * @generated
     */
    EReference getDataPattern_Instantiation();

    /**
     * Returns the meta object for the reference list '{@link data.pattern.DataPattern#getVariables <em>Variables</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Variables</em>'.
     * @see data.pattern.DataPattern#getVariables()
     * @see #getDataPattern()
     * @generated
     */
    EReference getDataPattern_Variables();

    /**
     * Returns the meta object for the attribute '{@link data.pattern.DataPattern#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see data.pattern.DataPattern#getValue()
     * @see #getDataPattern()
     * @generated
     */
    EAttribute getDataPattern_Value();

    /**
     * Returns the meta object for class '{@link data.pattern.RegExpPattern <em>Reg Exp Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Reg Exp Pattern</em>'.
     * @see data.pattern.RegExpPattern
     * @generated
     */
    EClass getRegExpPattern();

    /**
     * Returns the meta object for the attribute '{@link data.pattern.RegExpPattern#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Expression</em>'.
     * @see data.pattern.RegExpPattern#getExpression()
     * @see #getRegExpPattern()
     * @generated
     */
    EAttribute getRegExpPattern_Expression();

    /**
     * Returns the meta object for the attribute '{@link data.pattern.RegExpPattern#getMatch <em>Match</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Match</em>'.
     * @see data.pattern.RegExpPattern#getMatch()
     * @see #getRegExpPattern()
     * @generated
     */
    EAttribute getRegExpPattern_Match();

    /**
     * Returns the meta object for the attribute '{@link data.pattern.RegExpPattern#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Group</em>'.
     * @see data.pattern.RegExpPattern#getGroup()
     * @see #getRegExpPattern()
     * @generated
     */
    EAttribute getRegExpPattern_Group();

    /**
     * Returns the meta object for class '{@link data.pattern.XPathPattern <em>XPath Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>XPath Pattern</em>'.
     * @see data.pattern.XPathPattern
     * @generated
     */
    EClass getXPathPattern();

    /**
     * Returns the meta object for the attribute '{@link data.pattern.XPathPattern#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Expression</em>'.
     * @see data.pattern.XPathPattern#getExpression()
     * @see #getXPathPattern()
     * @generated
     */
    EAttribute getXPathPattern_Expression();

    /**
     * Returns the meta object for class '{@link data.pattern.LiteralPattern <em>Literal Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Literal Pattern</em>'.
     * @see data.pattern.LiteralPattern
     * @generated
     */
    EClass getLiteralPattern();

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
         * The meta object literal for the '{@link data.pattern.impl.DataPatternImpl <em>Data Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.pattern.impl.DataPatternImpl
         * @see data.pattern.impl.PatternPackageImpl#getDataPattern()
         * @generated
         */
        EClass DATA_PATTERN = eINSTANCE.getDataPattern();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_PATTERN__TYPE = eINSTANCE.getDataPattern_Type();

        /**
         * The meta object literal for the '<em><b>Instantiation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_PATTERN__INSTANTIATION = eINSTANCE.getDataPattern_Instantiation();

        /**
         * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_PATTERN__VARIABLES = eINSTANCE.getDataPattern_Variables();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_PATTERN__VALUE = eINSTANCE.getDataPattern_Value();

        /**
         * The meta object literal for the '{@link data.pattern.impl.RegExpPatternImpl <em>Reg Exp Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.pattern.impl.RegExpPatternImpl
         * @see data.pattern.impl.PatternPackageImpl#getRegExpPattern()
         * @generated
         */
        EClass REG_EXP_PATTERN = eINSTANCE.getRegExpPattern();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REG_EXP_PATTERN__EXPRESSION = eINSTANCE.getRegExpPattern_Expression();

        /**
         * The meta object literal for the '<em><b>Match</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REG_EXP_PATTERN__MATCH = eINSTANCE.getRegExpPattern_Match();

        /**
         * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REG_EXP_PATTERN__GROUP = eINSTANCE.getRegExpPattern_Group();

        /**
         * The meta object literal for the '{@link data.pattern.impl.XPathPatternImpl <em>XPath Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.pattern.impl.XPathPatternImpl
         * @see data.pattern.impl.PatternPackageImpl#getXPathPattern()
         * @generated
         */
        EClass XPATH_PATTERN = eINSTANCE.getXPathPattern();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute XPATH_PATTERN__EXPRESSION = eINSTANCE.getXPathPattern_Expression();

        /**
         * The meta object literal for the '{@link data.pattern.impl.LiteralPatternImpl <em>Literal Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see data.pattern.impl.LiteralPatternImpl
         * @see data.pattern.impl.PatternPackageImpl#getLiteralPattern()
         * @generated
         */
        EClass LITERAL_PATTERN = eINSTANCE.getLiteralPattern();

    }

} //PatternPackage
