/**
 */
package models.impl;

import models.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ModelsFactoryImpl extends EFactoryImpl implements ModelsFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ModelsFactory init() {
        try {
            ModelsFactory theModelsFactory = (ModelsFactory)EPackage.Registry.INSTANCE.getEFactory(ModelsPackage.eNS_URI);
            if (theModelsFactory != null) {
                return theModelsFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ModelsFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelsFactoryImpl() {
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
            case ModelsPackage.MULTIPLICITY: return createMultiplicity();
            case ModelsPackage.MONETARY_AMOUNT: return createMonetaryAmount();
            case ModelsPackage.CURRENCY: return createCurrency();
            case ModelsPackage.SHAPE: return createShape();
            case ModelsPackage.DIAGRAM: return createDiagram();
            case ModelsPackage.TREE_NODE: return createTreeNode();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case ModelsPackage.OBJECT:
                return createObjectFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case ModelsPackage.OBJECT:
                return convertObjectToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Multiplicity createMultiplicity() {
        MultiplicityImpl multiplicity = new MultiplicityImpl();
        return multiplicity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MonetaryAmount createMonetaryAmount() {
        MonetaryAmountImpl monetaryAmount = new MonetaryAmountImpl();
        return monetaryAmount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Currency createCurrency() {
        CurrencyImpl currency = new CurrencyImpl();
        return currency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Shape createShape() {
        ShapeImpl shape = new ShapeImpl();
        return shape;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Diagram createDiagram() {
        DiagramImpl diagram = new DiagramImpl();
        return diagram;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TreeNode createTreeNode() {
        TreeNodeImpl treeNode = new TreeNodeImpl();
        return treeNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object createObjectFromString(EDataType eDataType, String initialValue) {
        return super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertObjectToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelsPackage getModelsPackage() {
        return (ModelsPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ModelsPackage getPackage() {
        return ModelsPackage.eINSTANCE;
    }

} //ModelsFactoryImpl
