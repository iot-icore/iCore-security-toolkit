/**
 */
package structure.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import structure.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureFactoryImpl extends EFactoryImpl implements StructureFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static StructureFactory init() {
        try {
            StructureFactory theStructureFactory = (StructureFactory)EPackage.Registry.INSTANCE.getEFactory(StructurePackage.eNS_URI);
            if (theStructureFactory != null) {
                return theStructureFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new StructureFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StructureFactoryImpl() {
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
            case StructurePackage.STRUCTURAL_DESIGN_MODEL: return createStructuralDesignModel();
            case StructurePackage.STRUCTURAL_RUNTIME_MODEL: return createStructuralRuntimeModel();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StructuralDesignModel createStructuralDesignModel() {
        StructuralDesignModelImpl structuralDesignModel = new StructuralDesignModelImpl();
        return structuralDesignModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StructuralRuntimeModel createStructuralRuntimeModel() {
        StructuralRuntimeModelImpl structuralRuntimeModel = new StructuralRuntimeModelImpl();
        return structuralRuntimeModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StructurePackage getStructurePackage() {
        return (StructurePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static StructurePackage getPackage() {
        return StructurePackage.eINSTANCE;
    }

} //StructureFactoryImpl
