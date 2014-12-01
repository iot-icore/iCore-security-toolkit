/**
 */
package context.instance.tmp.impl;

import context.instance.impl.ContextSituationImpl;

import context.instance.tmp.NearbyMeasurement;
import context.instance.tmp.TmpPackage;

import identity.instance.AbstractIdentity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nearby Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link context.instance.tmp.impl.NearbyMeasurementImpl#getEntityA <em>Entity A</em>}</li>
 *   <li>{@link context.instance.tmp.impl.NearbyMeasurementImpl#getEntityB <em>Entity B</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NearbyMeasurementImpl extends ContextSituationImpl implements NearbyMeasurement {
    /**
     * The cached value of the '{@link #getEntityA() <em>Entity A</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntityA()
     * @generated
     * @ordered
     */
    protected AbstractIdentity entityA;

    /**
     * The cached value of the '{@link #getEntityB() <em>Entity B</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntityB()
     * @generated
     * @ordered
     */
    protected AbstractIdentity entityB;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NearbyMeasurementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TmpPackage.Literals.NEARBY_MEASUREMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractIdentity getEntityA() {
        if (entityA != null && entityA.eIsProxy()) {
            InternalEObject oldEntityA = (InternalEObject)entityA;
            entityA = (AbstractIdentity)eResolveProxy(oldEntityA);
            if (entityA != oldEntityA) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TmpPackage.NEARBY_MEASUREMENT__ENTITY_A, oldEntityA, entityA));
            }
        }
        return entityA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractIdentity basicGetEntityA() {
        return entityA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEntityA(AbstractIdentity newEntityA) {
        AbstractIdentity oldEntityA = entityA;
        entityA = newEntityA;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TmpPackage.NEARBY_MEASUREMENT__ENTITY_A, oldEntityA, entityA));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractIdentity getEntityB() {
        if (entityB != null && entityB.eIsProxy()) {
            InternalEObject oldEntityB = (InternalEObject)entityB;
            entityB = (AbstractIdentity)eResolveProxy(oldEntityB);
            if (entityB != oldEntityB) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TmpPackage.NEARBY_MEASUREMENT__ENTITY_B, oldEntityB, entityB));
            }
        }
        return entityB;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractIdentity basicGetEntityB() {
        return entityB;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEntityB(AbstractIdentity newEntityB) {
        AbstractIdentity oldEntityB = entityB;
        entityB = newEntityB;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TmpPackage.NEARBY_MEASUREMENT__ENTITY_B, oldEntityB, entityB));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TmpPackage.NEARBY_MEASUREMENT__ENTITY_A:
                if (resolve) return getEntityA();
                return basicGetEntityA();
            case TmpPackage.NEARBY_MEASUREMENT__ENTITY_B:
                if (resolve) return getEntityB();
                return basicGetEntityB();
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
            case TmpPackage.NEARBY_MEASUREMENT__ENTITY_A:
                setEntityA((AbstractIdentity)newValue);
                return;
            case TmpPackage.NEARBY_MEASUREMENT__ENTITY_B:
                setEntityB((AbstractIdentity)newValue);
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
            case TmpPackage.NEARBY_MEASUREMENT__ENTITY_A:
                setEntityA((AbstractIdentity)null);
                return;
            case TmpPackage.NEARBY_MEASUREMENT__ENTITY_B:
                setEntityB((AbstractIdentity)null);
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
            case TmpPackage.NEARBY_MEASUREMENT__ENTITY_A:
                return entityA != null;
            case TmpPackage.NEARBY_MEASUREMENT__ENTITY_B:
                return entityB != null;
        }
        return super.eIsSet(featureID);
    }

} //NearbyMeasurementImpl
