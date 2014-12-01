/**
 */
package rule.template.impl;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import rule.template.CombiningAlgorithm;
import rule.template.RuleTemplate;
import rule.template.TemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combining Algorithm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.template.impl.CombiningAlgorithmImpl#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CombiningAlgorithmImpl extends ElementImpl implements CombiningAlgorithm {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CombiningAlgorithmImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TemplatePackage.Literals.COMBINING_ALGORITHM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleTemplate getTemplate() {
        if (eContainerFeatureID() != TemplatePackage.COMBINING_ALGORITHM__TEMPLATE) return null;
        return (RuleTemplate)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTemplate(RuleTemplate newTemplate, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newTemplate, TemplatePackage.COMBINING_ALGORITHM__TEMPLATE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTemplate(RuleTemplate newTemplate) {
        if (newTemplate != eInternalContainer() || (eContainerFeatureID() != TemplatePackage.COMBINING_ALGORITHM__TEMPLATE && newTemplate != null)) {
            if (EcoreUtil.isAncestor(this, newTemplate))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newTemplate != null)
                msgs = ((InternalEObject)newTemplate).eInverseAdd(this, TemplatePackage.RULE_TEMPLATE__COMBINING_ALGORITHM, RuleTemplate.class, msgs);
            msgs = basicSetTemplate(newTemplate, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.COMBINING_ALGORITHM__TEMPLATE, newTemplate, newTemplate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TemplatePackage.COMBINING_ALGORITHM__TEMPLATE:
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
            case TemplatePackage.COMBINING_ALGORITHM__TEMPLATE:
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
            case TemplatePackage.COMBINING_ALGORITHM__TEMPLATE:
                return eInternalContainer().eInverseRemove(this, TemplatePackage.RULE_TEMPLATE__COMBINING_ALGORITHM, RuleTemplate.class, msgs);
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
            case TemplatePackage.COMBINING_ALGORITHM__TEMPLATE:
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
            case TemplatePackage.COMBINING_ALGORITHM__TEMPLATE:
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
            case TemplatePackage.COMBINING_ALGORITHM__TEMPLATE:
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
            case TemplatePackage.COMBINING_ALGORITHM__TEMPLATE:
                return getTemplate() != null;
        }
        return super.eIsSet(featureID);
    }

} //CombiningAlgorithmImpl
