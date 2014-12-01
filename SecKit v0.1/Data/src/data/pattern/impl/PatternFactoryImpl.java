/**
 */
package data.pattern.impl;

import data.pattern.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternFactoryImpl extends EFactoryImpl implements PatternFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static PatternFactory init() {
        try {
            PatternFactory thePatternFactory = (PatternFactory)EPackage.Registry.INSTANCE.getEFactory(PatternPackage.eNS_URI);
            if (thePatternFactory != null) {
                return thePatternFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new PatternFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatternFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case PatternPackage.DATA_PATTERN: return createDataPattern();
            case PatternPackage.REG_EXP_PATTERN: return createRegExpPattern();
            case PatternPackage.XPATH_PATTERN: return createXPathPattern();
            case PatternPackage.LITERAL_PATTERN: return createLiteralPattern();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataPattern createDataPattern() {
        DataPatternImpl dataPattern = new DataPatternImpl();
        return dataPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RegExpPattern createRegExpPattern() {
        RegExpPatternImpl regExpPattern = new RegExpPatternImpl();
        return regExpPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XPathPattern createXPathPattern() {
        XPathPatternImpl xPathPattern = new XPathPatternImpl();
        return xPathPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LiteralPattern createLiteralPattern() {
        LiteralPatternImpl literalPattern = new LiteralPatternImpl();
        return literalPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatternPackage getPatternPackage() {
        return (PatternPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static PatternPackage getPackage() {
        return PatternPackage.eINSTANCE;
    }

} //PatternFactoryImpl
