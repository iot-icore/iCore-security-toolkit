/**
 */
package context.pattern.impl;

import context.pattern.*;

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
            case PatternPackage.CONTEXT_SITUATION_PATTERN: return createContextSituationPattern();
            case PatternPackage.CONTEXT_INFORMATION_PATTERN: return createContextInformationPattern();
            case PatternPackage.ENTITY_ROLE_PATTERN: return createEntityRolePattern();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextSituationPattern createContextSituationPattern() {
        ContextSituationPatternImpl contextSituationPattern = new ContextSituationPatternImpl();
        return contextSituationPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextInformationPattern createContextInformationPattern() {
        ContextInformationPatternImpl contextInformationPattern = new ContextInformationPatternImpl();
        return contextInformationPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityRolePattern createEntityRolePattern() {
        EntityRolePatternImpl entityRolePattern = new EntityRolePatternImpl();
        return entityRolePattern;
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
