/**
 */
package context.instance.impl;

import context.instance.*;

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
public class InstanceFactoryImpl extends EFactoryImpl implements InstanceFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static InstanceFactory init() {
        try {
            InstanceFactory theInstanceFactory = (InstanceFactory)EPackage.Registry.INSTANCE.getEFactory(InstancePackage.eNS_URI);
            if (theInstanceFactory != null) {
                return theInstanceFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new InstanceFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstanceFactoryImpl() {
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
            case InstancePackage.CONTEXT_SITUATION: return createContextSituation();
            case InstancePackage.ENTITY_ROLE: return createEntityRole();
            case InstancePackage.NUMERIC_PRECISION: return createNumericPrecision();
            case InstancePackage.QUALITY_OF_CONTEXT: return createQualityOfContext();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContextSituation createContextSituation() {
        ContextSituationImpl contextSituation = new ContextSituationImpl();
        return contextSituation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityRole createEntityRole() {
        EntityRoleImpl entityRole = new EntityRoleImpl();
        return entityRole;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NumericPrecision createNumericPrecision() {
        NumericPrecisionImpl numericPrecision = new NumericPrecisionImpl();
        return numericPrecision;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QualityOfContext createQualityOfContext() {
        QualityOfContextImpl qualityOfContext = new QualityOfContextImpl();
        return qualityOfContext;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstancePackage getInstancePackage() {
        return (InstancePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static InstancePackage getPackage() {
        return InstancePackage.eINSTANCE;
    }

} //InstanceFactoryImpl
