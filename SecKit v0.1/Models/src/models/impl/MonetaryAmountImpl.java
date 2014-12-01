/**
 */
package models.impl;

import models.Currency;
import models.ModelsPackage;
import models.MonetaryAmount;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monetary Amount</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link models.impl.MonetaryAmountImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link models.impl.MonetaryAmountImpl#getCurrency <em>Currency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MonetaryAmountImpl extends MinimalEObjectImpl.Container implements MonetaryAmount {
    /**
     * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAmount()
     * @generated
     * @ordered
     */
    protected static final double AMOUNT_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAmount()
     * @generated
     * @ordered
     */
    protected double amount = AMOUNT_EDEFAULT;

    /**
     * The cached value of the '{@link #getCurrency() <em>Currency</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrency()
     * @generated
     * @ordered
     */
    protected Currency currency;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MonetaryAmountImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelsPackage.Literals.MONETARY_AMOUNT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public double getAmount() {
        return amount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAmount(double newAmount) {
        double oldAmount = amount;
        amount = newAmount;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelsPackage.MONETARY_AMOUNT__AMOUNT, oldAmount, amount));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCurrency(Currency newCurrency, NotificationChain msgs) {
        Currency oldCurrency = currency;
        currency = newCurrency;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelsPackage.MONETARY_AMOUNT__CURRENCY, oldCurrency, newCurrency);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCurrency(Currency newCurrency) {
        if (newCurrency != currency) {
            NotificationChain msgs = null;
            if (currency != null)
                msgs = ((InternalEObject)currency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelsPackage.MONETARY_AMOUNT__CURRENCY, null, msgs);
            if (newCurrency != null)
                msgs = ((InternalEObject)newCurrency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelsPackage.MONETARY_AMOUNT__CURRENCY, null, msgs);
            msgs = basicSetCurrency(newCurrency, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelsPackage.MONETARY_AMOUNT__CURRENCY, newCurrency, newCurrency));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ModelsPackage.MONETARY_AMOUNT__CURRENCY:
                return basicSetCurrency(null, msgs);
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
            case ModelsPackage.MONETARY_AMOUNT__AMOUNT:
                return getAmount();
            case ModelsPackage.MONETARY_AMOUNT__CURRENCY:
                return getCurrency();
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
            case ModelsPackage.MONETARY_AMOUNT__AMOUNT:
                setAmount((Double)newValue);
                return;
            case ModelsPackage.MONETARY_AMOUNT__CURRENCY:
                setCurrency((Currency)newValue);
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
            case ModelsPackage.MONETARY_AMOUNT__AMOUNT:
                setAmount(AMOUNT_EDEFAULT);
                return;
            case ModelsPackage.MONETARY_AMOUNT__CURRENCY:
                setCurrency((Currency)null);
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
            case ModelsPackage.MONETARY_AMOUNT__AMOUNT:
                return amount != AMOUNT_EDEFAULT;
            case ModelsPackage.MONETARY_AMOUNT__CURRENCY:
                return currency != null;
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
        result.append(" (amount: ");
        result.append(amount);
        result.append(')');
        return result.toString();
    }

} //MonetaryAmountImpl
