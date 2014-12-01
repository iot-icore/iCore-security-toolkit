/**
 */
package rule.impl;

import java.util.Collection;

import models.impl.ModelImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rule.RuleDesignModel;
import rule.RulePackage;

import rule.template.RuleTemplatePackage;
import rule.template.TemplatePackage;
import rule.template.TimeStepSize;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.impl.RuleDesignModelImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link rule.impl.RuleDesignModelImpl#getTimeStepSizes <em>Time Step Sizes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleDesignModelImpl extends ModelImpl implements RuleDesignModel {
    /**
     * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPackages()
     * @generated
     * @ordered
     */
    protected EList<RuleTemplatePackage> packages;

    /**
     * The cached value of the '{@link #getTimeStepSizes() <em>Time Step Sizes</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeStepSizes()
     * @generated
     * @ordered
     */
    protected EList<TimeStepSize> timeStepSizes;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RuleDesignModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RulePackage.Literals.RULE_DESIGN_MODEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RuleTemplatePackage> getPackages() {
        if (packages == null) {
            packages = new EObjectContainmentWithInverseEList<RuleTemplatePackage>(RuleTemplatePackage.class, this, RulePackage.RULE_DESIGN_MODEL__PACKAGES, TemplatePackage.RULE_TEMPLATE_PACKAGE__MODEL);
        }
        return packages;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TimeStepSize> getTimeStepSizes() {
        if (timeStepSizes == null) {
            timeStepSizes = new EObjectContainmentEList<TimeStepSize>(TimeStepSize.class, this, RulePackage.RULE_DESIGN_MODEL__TIME_STEP_SIZES);
        }
        return timeStepSizes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RulePackage.RULE_DESIGN_MODEL__PACKAGES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackages()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case RulePackage.RULE_DESIGN_MODEL__PACKAGES:
                return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
            case RulePackage.RULE_DESIGN_MODEL__TIME_STEP_SIZES:
                return ((InternalEList<?>)getTimeStepSizes()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RulePackage.RULE_DESIGN_MODEL__PACKAGES:
                return getPackages();
            case RulePackage.RULE_DESIGN_MODEL__TIME_STEP_SIZES:
                return getTimeStepSizes();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case RulePackage.RULE_DESIGN_MODEL__PACKAGES:
                getPackages().clear();
                getPackages().addAll((Collection<? extends RuleTemplatePackage>)newValue);
                return;
            case RulePackage.RULE_DESIGN_MODEL__TIME_STEP_SIZES:
                getTimeStepSizes().clear();
                getTimeStepSizes().addAll((Collection<? extends TimeStepSize>)newValue);
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
            case RulePackage.RULE_DESIGN_MODEL__PACKAGES:
                getPackages().clear();
                return;
            case RulePackage.RULE_DESIGN_MODEL__TIME_STEP_SIZES:
                getTimeStepSizes().clear();
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
            case RulePackage.RULE_DESIGN_MODEL__PACKAGES:
                return packages != null && !packages.isEmpty();
            case RulePackage.RULE_DESIGN_MODEL__TIME_STEP_SIZES:
                return timeStepSizes != null && !timeStepSizes.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //RuleDesignModelImpl
