/**
 */
package rule.condition.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rule.condition.ConditionPackage;
import rule.condition.FormulaInstantiation;
import rule.condition.FormulaTemplate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formula Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.condition.impl.FormulaInstantiationImpl#getFormulaTemplate <em>Formula Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormulaInstantiationImpl extends AtomImpl implements FormulaInstantiation {
    /**
     * The cached value of the '{@link #getFormulaTemplate() <em>Formula Template</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFormulaTemplate()
     * @generated
     * @ordered
     */
    protected FormulaTemplate formulaTemplate;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FormulaInstantiationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ConditionPackage.Literals.FORMULA_INSTANTIATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FormulaTemplate getFormulaTemplate() {
        if (formulaTemplate != null && formulaTemplate.eIsProxy()) {
            InternalEObject oldFormulaTemplate = (InternalEObject)formulaTemplate;
            formulaTemplate = (FormulaTemplate)eResolveProxy(oldFormulaTemplate);
            if (formulaTemplate != oldFormulaTemplate) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConditionPackage.FORMULA_INSTANTIATION__FORMULA_TEMPLATE, oldFormulaTemplate, formulaTemplate));
            }
        }
        return formulaTemplate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FormulaTemplate basicGetFormulaTemplate() {
        return formulaTemplate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFormulaTemplate(FormulaTemplate newFormulaTemplate) {
        FormulaTemplate oldFormulaTemplate = formulaTemplate;
        formulaTemplate = newFormulaTemplate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConditionPackage.FORMULA_INSTANTIATION__FORMULA_TEMPLATE, oldFormulaTemplate, formulaTemplate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ConditionPackage.FORMULA_INSTANTIATION__FORMULA_TEMPLATE:
                if (resolve) return getFormulaTemplate();
                return basicGetFormulaTemplate();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ConditionPackage.FORMULA_INSTANTIATION__FORMULA_TEMPLATE:
                setFormulaTemplate((FormulaTemplate)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case ConditionPackage.FORMULA_INSTANTIATION__FORMULA_TEMPLATE:
                setFormulaTemplate((FormulaTemplate)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ConditionPackage.FORMULA_INSTANTIATION__FORMULA_TEMPLATE:
                return formulaTemplate != null;
        }
        return super.eIsSet(featureID);
    }

} //FormulaInstantiationImpl
