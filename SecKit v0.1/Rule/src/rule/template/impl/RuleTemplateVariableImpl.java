/**
 */
package rule.template.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rule.template.RuleTemplate;
import rule.template.RuleTemplateVariable;
import rule.template.TemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Template Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.template.impl.RuleTemplateVariableImpl#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RuleTemplateVariableImpl extends RuleVariableImpl implements RuleTemplateVariable {
    /**
     * The cached value of the '{@link #getTemplate() <em>Template</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTemplate()
     * @generated
     * @ordered
     */
    protected RuleTemplate template;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RuleTemplateVariableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TemplatePackage.Literals.RULE_TEMPLATE_VARIABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleTemplate getTemplate() {
        if (template != null && template.eIsProxy()) {
            InternalEObject oldTemplate = (InternalEObject)template;
            template = (RuleTemplate)eResolveProxy(oldTemplate);
            if (template != oldTemplate) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatePackage.RULE_TEMPLATE_VARIABLE__TEMPLATE, oldTemplate, template));
            }
        }
        return template;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleTemplate basicGetTemplate() {
        return template;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTemplate(RuleTemplate newTemplate) {
        RuleTemplate oldTemplate = template;
        template = newTemplate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_TEMPLATE_VARIABLE__TEMPLATE, oldTemplate, template));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TemplatePackage.RULE_TEMPLATE_VARIABLE__TEMPLATE:
                if (resolve) return getTemplate();
                return basicGetTemplate();
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
            case TemplatePackage.RULE_TEMPLATE_VARIABLE__TEMPLATE:
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
            case TemplatePackage.RULE_TEMPLATE_VARIABLE__TEMPLATE:
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
            case TemplatePackage.RULE_TEMPLATE_VARIABLE__TEMPLATE:
                return template != null;
        }
        return super.eIsSet(featureID);
    }

} //RuleTemplateVariableImpl
