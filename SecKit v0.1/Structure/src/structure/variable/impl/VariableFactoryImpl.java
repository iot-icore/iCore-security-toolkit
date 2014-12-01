/**
 */
package structure.variable.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import structure.variable.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VariableFactoryImpl extends EFactoryImpl implements VariableFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static VariableFactory init() {
        try {
            VariableFactory theVariableFactory = (VariableFactory)EPackage.Registry.INSTANCE.getEFactory(VariablePackage.eNS_URI);
            if (theVariableFactory != null) {
                return theVariableFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new VariableFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VariableFactoryImpl() {
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
            case VariablePackage.ENTITY_TYPE_VARIABLE: return createEntityTypeVariable();
            case VariablePackage.ENTITY_INSTANCE_VARIABLE: return createEntityInstanceVariable();
            case VariablePackage.ENTITY_INSTANTIATION_HIERARCHY_VARIABLE: return createEntityInstantiationHierarchyVariable();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityTypeVariable createEntityTypeVariable() {
        EntityTypeVariableImpl entityTypeVariable = new EntityTypeVariableImpl();
        return entityTypeVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityInstanceVariable createEntityInstanceVariable() {
        EntityInstanceVariableImpl entityInstanceVariable = new EntityInstanceVariableImpl();
        return entityInstanceVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityInstantiationHierarchyVariable createEntityInstantiationHierarchyVariable() {
        EntityInstantiationHierarchyVariableImpl entityInstantiationHierarchyVariable = new EntityInstantiationHierarchyVariableImpl();
        return entityInstantiationHierarchyVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VariablePackage getVariablePackage() {
        return (VariablePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static VariablePackage getPackage() {
        return VariablePackage.eINSTANCE;
    }

} //VariableFactoryImpl
