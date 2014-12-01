/**
 */
package rule.test.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rule.event.impl.TimeWindowImpl;

import rule.template.RuleTemplateConfiguration;

import rule.test.SimulatedTimeStepWindow;
import rule.test.TestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulated Time Step Window</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.test.impl.SimulatedTimeStepWindowImpl#getExpectedToBeTriggeredRules <em>Expected To Be Triggered Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimulatedTimeStepWindowImpl extends TimeWindowImpl implements SimulatedTimeStepWindow {
    /**
     * The cached value of the '{@link #getExpectedToBeTriggeredRules() <em>Expected To Be Triggered Rules</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpectedToBeTriggeredRules()
     * @generated
     * @ordered
     */
    protected EList<RuleTemplateConfiguration> expectedToBeTriggeredRules;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SimulatedTimeStepWindowImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TestPackage.Literals.SIMULATED_TIME_STEP_WINDOW;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RuleTemplateConfiguration> getExpectedToBeTriggeredRules() {
        if (expectedToBeTriggeredRules == null) {
            expectedToBeTriggeredRules = new EObjectContainmentEList<RuleTemplateConfiguration>(RuleTemplateConfiguration.class, this, TestPackage.SIMULATED_TIME_STEP_WINDOW__EXPECTED_TO_BE_TRIGGERED_RULES);
        }
        return expectedToBeTriggeredRules;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TestPackage.SIMULATED_TIME_STEP_WINDOW__EXPECTED_TO_BE_TRIGGERED_RULES:
                return ((InternalEList<?>)getExpectedToBeTriggeredRules()).basicRemove(otherEnd, msgs);
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
            case TestPackage.SIMULATED_TIME_STEP_WINDOW__EXPECTED_TO_BE_TRIGGERED_RULES:
                return getExpectedToBeTriggeredRules();
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
            case TestPackage.SIMULATED_TIME_STEP_WINDOW__EXPECTED_TO_BE_TRIGGERED_RULES:
                getExpectedToBeTriggeredRules().clear();
                getExpectedToBeTriggeredRules().addAll((Collection<? extends RuleTemplateConfiguration>)newValue);
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
            case TestPackage.SIMULATED_TIME_STEP_WINDOW__EXPECTED_TO_BE_TRIGGERED_RULES:
                getExpectedToBeTriggeredRules().clear();
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
            case TestPackage.SIMULATED_TIME_STEP_WINDOW__EXPECTED_TO_BE_TRIGGERED_RULES:
                return expectedToBeTriggeredRules != null && !expectedToBeTriggeredRules.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //SimulatedTimeStepWindowImpl
