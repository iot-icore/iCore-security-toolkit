/**
 */
package context.instance.tmp.impl;

import context.instance.tmp.*;

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
public class TmpFactoryImpl extends EFactoryImpl implements TmpFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TmpFactory init() {
        try {
            TmpFactory theTmpFactory = (TmpFactory)EPackage.Registry.INSTANCE.getEFactory(TmpPackage.eNS_URI);
            if (theTmpFactory != null) {
                return theTmpFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new TmpFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TmpFactoryImpl() {
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
            case TmpPackage.EVENT_PRECISION: return createEventPrecision();
            case TmpPackage.FEVER: return createFever();
            case TmpPackage.AVAILABLE_DEVICES: return createAvailableDevices();
            case TmpPackage.FORMAL_RELATION_CONTEXT: return createFormalRelationContext();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventPrecision createEventPrecision() {
        EventPrecisionImpl eventPrecision = new EventPrecisionImpl();
        return eventPrecision;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Fever createFever() {
        FeverImpl fever = new FeverImpl();
        return fever;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AvailableDevices createAvailableDevices() {
        AvailableDevicesImpl availableDevices = new AvailableDevicesImpl();
        return availableDevices;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FormalRelationContext createFormalRelationContext() {
        FormalRelationContextImpl formalRelationContext = new FormalRelationContextImpl();
        return formalRelationContext;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TmpPackage getTmpPackage() {
        return (TmpPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static TmpPackage getPackage() {
        return TmpPackage.eINSTANCE;
    }

} //TmpFactoryImpl
