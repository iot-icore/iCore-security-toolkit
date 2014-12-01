/**
 */
package risk.type.impl;

import java.util.Collection;

import models.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import risk.type.Countermeasure;
import risk.type.MonetaryAmount;
import risk.type.TypePackage;

import rule.template.RuleTemplate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Countermeasure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link risk.type.impl.CountermeasureImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link risk.type.impl.CountermeasureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link risk.type.impl.CountermeasureImpl#getRuleTemplates <em>Rule Templates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CountermeasureImpl extends ElementImpl implements Countermeasure {
    /**
     * The cached value of the '{@link #getCost() <em>Cost</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCost()
     * @generated
     * @ordered
     */
    protected MonetaryAmount cost;

    /**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
     * The cached value of the '{@link #getRuleTemplates() <em>Rule Templates</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRuleTemplates()
     * @generated
     * @ordered
     */
    protected EList<RuleTemplate> ruleTemplates;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CountermeasureImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.COUNTERMEASURE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MonetaryAmount getCost() {
        return cost;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCost(MonetaryAmount newCost, NotificationChain msgs) {
        MonetaryAmount oldCost = cost;
        cost = newCost;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypePackage.COUNTERMEASURE__COST, oldCost, newCost);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCost(MonetaryAmount newCost) {
        if (newCost != cost) {
            NotificationChain msgs = null;
            if (cost != null)
                msgs = ((InternalEObject)cost).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypePackage.COUNTERMEASURE__COST, null, msgs);
            if (newCost != null)
                msgs = ((InternalEObject)newCost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypePackage.COUNTERMEASURE__COST, null, msgs);
            msgs = basicSetCost(newCost, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.COUNTERMEASURE__COST, newCost, newCost));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDescription(String newDescription) {
        String oldDescription = description;
        description = newDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.COUNTERMEASURE__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RuleTemplate> getRuleTemplates() {
        if (ruleTemplates == null) {
            ruleTemplates = new EObjectResolvingEList<RuleTemplate>(RuleTemplate.class, this, TypePackage.COUNTERMEASURE__RULE_TEMPLATES);
        }
        return ruleTemplates;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TypePackage.COUNTERMEASURE__COST:
                return basicSetCost(null, msgs);
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
            case TypePackage.COUNTERMEASURE__COST:
                return getCost();
            case TypePackage.COUNTERMEASURE__DESCRIPTION:
                return getDescription();
            case TypePackage.COUNTERMEASURE__RULE_TEMPLATES:
                return getRuleTemplates();
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
            case TypePackage.COUNTERMEASURE__COST:
                setCost((MonetaryAmount)newValue);
                return;
            case TypePackage.COUNTERMEASURE__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case TypePackage.COUNTERMEASURE__RULE_TEMPLATES:
                getRuleTemplates().clear();
                getRuleTemplates().addAll((Collection<? extends RuleTemplate>)newValue);
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
            case TypePackage.COUNTERMEASURE__COST:
                setCost((MonetaryAmount)null);
                return;
            case TypePackage.COUNTERMEASURE__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case TypePackage.COUNTERMEASURE__RULE_TEMPLATES:
                getRuleTemplates().clear();
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
            case TypePackage.COUNTERMEASURE__COST:
                return cost != null;
            case TypePackage.COUNTERMEASURE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case TypePackage.COUNTERMEASURE__RULE_TEMPLATES:
                return ruleTemplates != null && !ruleTemplates.isEmpty();
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
        result.append(" (description: ");
        result.append(description);
        result.append(')');
        return result.toString();
    }

} //CountermeasureImpl
