/**
 */
package rule.action.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import rule.action.ActionPackage;
import rule.action.Execute;

import rule.template.RuleTemplate;
import rule.template.TemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.action.impl.ExecuteImpl#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ExecuteImpl extends ActionBehaviorImpl implements Execute {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExecuteImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ActionPackage.Literals.EXECUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleTemplate getTemplate() {
        if (eContainerFeatureID() != ActionPackage.EXECUTE__TEMPLATE) return null;
        return (RuleTemplate)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTemplate(RuleTemplate newTemplate, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newTemplate, ActionPackage.EXECUTE__TEMPLATE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTemplate(RuleTemplate newTemplate) {
        if (newTemplate != eInternalContainer() || (eContainerFeatureID() != ActionPackage.EXECUTE__TEMPLATE && newTemplate != null)) {
            if (EcoreUtil.isAncestor(this, newTemplate))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newTemplate != null)
                msgs = ((InternalEObject)newTemplate).eInverseAdd(this, TemplatePackage.RULE_TEMPLATE__EXECUTE, RuleTemplate.class, msgs);
            msgs = basicSetTemplate(newTemplate, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.EXECUTE__TEMPLATE, newTemplate, newTemplate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ActionPackage.EXECUTE__TEMPLATE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetTemplate((RuleTemplate)otherEnd, msgs);
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
            case ActionPackage.EXECUTE__TEMPLATE:
                return basicSetTemplate(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case ActionPackage.EXECUTE__TEMPLATE:
                return eInternalContainer().eInverseRemove(this, TemplatePackage.RULE_TEMPLATE__EXECUTE, RuleTemplate.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ActionPackage.EXECUTE__TEMPLATE:
                return getTemplate();
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
            case ActionPackage.EXECUTE__TEMPLATE:
                setTemplate((RuleTemplate)newValue);
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
            case ActionPackage.EXECUTE__TEMPLATE:
                setTemplate((RuleTemplate)null);
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
            case ActionPackage.EXECUTE__TEMPLATE:
                return getTemplate() != null;
        }
        return super.eIsSet(featureID);
    }

} //ExecuteImpl
