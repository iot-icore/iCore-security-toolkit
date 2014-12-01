/**
 */
package data.pattern.impl;

import data.pattern.PatternPackage;
import data.pattern.RegExpPattern;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reg Exp Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link data.pattern.impl.RegExpPatternImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link data.pattern.impl.RegExpPatternImpl#getMatch <em>Match</em>}</li>
 *   <li>{@link data.pattern.impl.RegExpPatternImpl#getGroup <em>Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegExpPatternImpl extends DataPatternImpl implements RegExpPattern {
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
    protected RegExpPatternImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PatternPackage.Literals.REG_EXP_PATTERN;
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
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.REG_EXP_PATTERN__EXPRESSION, oldExpression, expression));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.REG_EXP_PATTERN__MATCH, oldMatch, match));
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
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.REG_EXP_PATTERN__GROUP, oldGroup, group));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PatternPackage.REG_EXP_PATTERN__EXPRESSION:
                return getExpression();
            case PatternPackage.REG_EXP_PATTERN__MATCH:
                return getMatch();
            case PatternPackage.REG_EXP_PATTERN__GROUP:
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
            case PatternPackage.REG_EXP_PATTERN__EXPRESSION:
                setExpression((String)newValue);
                return;
            case PatternPackage.REG_EXP_PATTERN__MATCH:
                setMatch((Integer)newValue);
                return;
            case PatternPackage.REG_EXP_PATTERN__GROUP:
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
            case PatternPackage.REG_EXP_PATTERN__EXPRESSION:
                setExpression(EXPRESSION_EDEFAULT);
                return;
            case PatternPackage.REG_EXP_PATTERN__MATCH:
                setMatch(MATCH_EDEFAULT);
                return;
            case PatternPackage.REG_EXP_PATTERN__GROUP:
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
            case PatternPackage.REG_EXP_PATTERN__EXPRESSION:
                return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
            case PatternPackage.REG_EXP_PATTERN__MATCH:
                return match != MATCH_EDEFAULT;
            case PatternPackage.REG_EXP_PATTERN__GROUP:
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

} //RegExpPatternImpl
