/**
 */
package rule.template.impl;

import models.variable.impl.XPathVariableAssignmentImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rule.template.RuleXPathVariableAssignment;
import rule.template.TemplatePackage;
import rule.template.XPathContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule XPath Variable Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.template.impl.RuleXPathVariableAssignmentImpl#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleXPathVariableAssignmentImpl extends XPathVariableAssignmentImpl implements RuleXPathVariableAssignment {
    /**
     * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContext()
     * @generated
     * @ordered
     */
    protected static final XPathContext CONTEXT_EDEFAULT = XPathContext.TRIGGER_EVENT;

    /**
     * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContext()
     * @generated
     * @ordered
     */
    protected XPathContext context = CONTEXT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RuleXPathVariableAssignmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TemplatePackage.Literals.RULE_XPATH_VARIABLE_ASSIGNMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XPathContext getContext() {
        return context;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContext(XPathContext newContext) {
        XPathContext oldContext = context;
        context = newContext == null ? CONTEXT_EDEFAULT : newContext;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_XPATH_VARIABLE_ASSIGNMENT__CONTEXT, oldContext, context));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TemplatePackage.RULE_XPATH_VARIABLE_ASSIGNMENT__CONTEXT:
                return getContext();
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
            case TemplatePackage.RULE_XPATH_VARIABLE_ASSIGNMENT__CONTEXT:
                setContext((XPathContext)newValue);
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
            case TemplatePackage.RULE_XPATH_VARIABLE_ASSIGNMENT__CONTEXT:
                setContext(CONTEXT_EDEFAULT);
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
            case TemplatePackage.RULE_XPATH_VARIABLE_ASSIGNMENT__CONTEXT:
                return context != CONTEXT_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (context: ");
        result.append(context);
        result.append(')');
        return result.toString();
    }

} //RuleXPathVariableAssignmentImpl
