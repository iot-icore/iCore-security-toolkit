/**
 */
package rule.propositional.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rule.propositional.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropositionalFactoryImpl extends EFactoryImpl implements PropositionalFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static PropositionalFactory init() {
        try {
            PropositionalFactory thePropositionalFactory = (PropositionalFactory)EPackage.Registry.INSTANCE.getEFactory(PropositionalPackage.eNS_URI);
            if (thePropositionalFactory != null) {
                return thePropositionalFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new PropositionalFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropositionalFactoryImpl() {
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
            case PropositionalPackage.AND: return createAnd();
            case PropositionalPackage.OR: return createOr();
            case PropositionalPackage.NOT: return createNot();
            case PropositionalPackage.IMPLIES: return createImplies();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public And createAnd() {
        AndImpl and = new AndImpl();
        return and;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Or createOr() {
        OrImpl or = new OrImpl();
        return or;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Not createNot() {
        NotImpl not = new NotImpl();
        return not;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Implies createImplies() {
        ImpliesImpl implies = new ImpliesImpl();
        return implies;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropositionalPackage getPropositionalPackage() {
        return (PropositionalPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static PropositionalPackage getPackage() {
        return PropositionalPackage.eINSTANCE;
    }

} //PropositionalFactoryImpl
