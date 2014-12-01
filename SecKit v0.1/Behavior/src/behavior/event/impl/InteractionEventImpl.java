/**
 */
package behavior.event.impl;

import behavior.event.EventPackage;
import behavior.event.InteractionEvent;

import behavior.instance.Interaction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link behavior.event.impl.InteractionEventImpl#getInteraction <em>Interaction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionEventImpl extends ActivityEventImpl implements InteractionEvent {
    /**
     * The cached value of the '{@link #getInteraction() <em>Interaction</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInteraction()
     * @generated
     * @ordered
     */
    protected Interaction interaction;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InteractionEventImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EventPackage.Literals.INTERACTION_EVENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Interaction getInteraction() {
        if (interaction != null && interaction.eIsProxy()) {
            InternalEObject oldInteraction = (InternalEObject)interaction;
            interaction = (Interaction)eResolveProxy(oldInteraction);
            if (interaction != oldInteraction) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventPackage.INTERACTION_EVENT__INTERACTION, oldInteraction, interaction));
            }
        }
        return interaction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Interaction basicGetInteraction() {
        return interaction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInteraction(Interaction newInteraction) {
        Interaction oldInteraction = interaction;
        interaction = newInteraction;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.INTERACTION_EVENT__INTERACTION, oldInteraction, interaction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EventPackage.INTERACTION_EVENT__INTERACTION:
                if (resolve) return getInteraction();
                return basicGetInteraction();
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
            case EventPackage.INTERACTION_EVENT__INTERACTION:
                setInteraction((Interaction)newValue);
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
            case EventPackage.INTERACTION_EVENT__INTERACTION:
                setInteraction((Interaction)null);
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
            case EventPackage.INTERACTION_EVENT__INTERACTION:
                return interaction != null;
        }
        return super.eIsSet(featureID);
    }

} //InteractionEventImpl
