/**
 */
package models.variable.impl;

import models.variable.RegExpVariableAssignment;
import models.variable.VariablePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reg Exp Variable Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link models.variable.impl.RegExpVariableAssignmentImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link models.variable.impl.RegExpVariableAssignmentImpl#getMatch <em>Match</em>}</li>
 *   <li>{@link models.variable.impl.RegExpVariableAssignmentImpl#getGroup <em>Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegExpVariableAssignmentImpl extends ReferenceVariableAssignmentImpl implements RegExpVariableAssignment {
    /**
     * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpression()
     * @generated
     * @ordered
     */
    protected static final String EXPRESSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpression()
     * @generated
     * @ordered
     */
    protected String expression = EXPRESSION_EDEFAULT;

    /**
     * The default value of the '{@link #getMatch() <em>Match</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMatch()
     * @generated
     * @ordered
     */
    protected static final int MATCH_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMatch() <em>Match</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMatch()
     * @generated
     * @ordered
     */
    protected int match = MATCH_EDEFAULT;

    /**
     * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroup()
     * @generated
     * @ordered
     */
    protected static final int GROUP_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroup()
     * @generated
     * @ordered
     */
    protected int group = GROUP_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RegExpVariableAssignmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return VariablePackage.Literals.REG_EXP_VARIABLE_ASSIGNMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getExpression() {
        return expression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExpression(String newExpression) {
        String oldExpression = expression;
        expression = newExpression;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VariablePackage.REG_EXP_VARIABLE_ASSIGNMENT__EXPRESSION, oldExpression, expression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMatch() {
        return match;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMatch(int newMatch) {
        int oldMatch = match;
        match = newMatch;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VariablePackage.REG_EXP_VARIABLE_ASSIGNMENT__MATCH, oldMatch, match));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getGroup() {
        return group;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGroup(int newGroup) {
        int oldGroup = group;
        group = newGroup;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, VariablePackage.REG_EXP_VARIABLE_ASSIGNMENT__GROUP, oldGroup, group));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case VariablePackage.REG_EXP_VARIABLE_ASSIGNMENT__EXPRESSION:
                return getExpression();
            case VariablePackage.REG_EXP_VARIABLE_ASSIGNMENT__MATCH:
                return getMatch();
            case VariablePackage.REG_EXP_VARIABLE_ASSIGNMENT__GROUP:
                return getGroup();
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
            case VariablePackage.REG_EXP_VARIABLE_ASSIGNMENT__EXPRESSION:
                setExpression((String)newValue);
                return;
            case VariablePackage.REG_EXP_VARIABLE_ASSIGNMENT__MATCH:
                setMatch((Integer)newValue);
                return;
            case VariablePackage.REG_EXP_VARIABLE_ASSIGNMENT__GROUP:
                setGroup((Integer)newValue);
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
            case VariablePackage.REG_EXP_VARIABLE_ASSIGNMENT__EXPRESSION:
                setExpression(EXPRESSION_EDEFAULT);
                return;
            case VariablePackage.REG_EXP_VARIABLE_ASSIGNMENT__MATCH:
                setMatch(MATCH_EDEFAULT);
                return;
            case VariablePackage.REG_EXP_VARIABLE_ASSIGNMENT__GROUP:
                setGroup(GROUP_EDEFAULT);
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
            case VariablePackage.REG_EXP_VARIABLE_ASSIGNMENT__EXPRESSION:
                return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
            case VariablePackage.REG_EXP_VARIABLE_ASSIGNMENT__MATCH:
                return match != MATCH_EDEFAULT;
            case VariablePackage.REG_EXP_VARIABLE_ASSIGNMENT__GROUP:
                return group != GROUP_EDEFAULT;
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
        result.append(" (expression: ");
        result.append(expression);
        result.append(", match: ");
        result.append(match);
        result.append(", group: ");
        result.append(group);
        result.append(')');
        return result.toString();
    }

} //RegExpVariableAssignmentImpl
