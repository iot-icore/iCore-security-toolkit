/**
 */
package behavior.quality.impl;

import behavior.quality.Price;
import behavior.quality.QualityPackage;

import models.MonetaryAmount;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Price</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.quality.impl.PriceImpl#getAmount <em>Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PriceImpl extends QuantitativeImpl implements Price {
    /**
     * The cached value of the '{@link #getAmount() <em>Amount</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAmount()
     * @generated
     * @ordered
     */
    protected MonetaryAmount amount;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PriceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return QualityPackage.Literals.PRICE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MonetaryAmount getAmount() {
        return amount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAmount(MonetaryAmount newAmount, NotificationChain msgs) {
        MonetaryAmount oldAmount = amount;
        amount = newAmount;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QualityPackage.PRICE__AMOUNT, oldAmount, newAmount);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAmount(MonetaryAmount newAmount) {
        if (newAmount != amount) {
            NotificationChain msgs = null;
            if (amount != null)
                msgs = ((InternalEObject)amount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QualityPackage.PRICE__AMOUNT, null, msgs);
            if (newAmount != null)
                msgs = ((InternalEObject)newAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QualityPackage.PRICE__AMOUNT, null, msgs);
            msgs = basicSetAmount(newAmount, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, QualityPackage.PRICE__AMOUNT, newAmount, newAmount));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case QualityPackage.PRICE__AMOUNT:
                return basicSetAmount(null, msgs);
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
            case QualityPackage.PRICE__AMOUNT:
                return getAmount();
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
            case QualityPackage.PRICE__AMOUNT:
                setAmount((MonetaryAmount)newValue);
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
            case QualityPackage.PRICE__AMOUNT:
                setAmount((MonetaryAmount)null);
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
            case QualityPackage.PRICE__AMOUNT:
                return amount != null;
        }
        return super.eIsSet(featureID);
    }

} //PriceImpl
