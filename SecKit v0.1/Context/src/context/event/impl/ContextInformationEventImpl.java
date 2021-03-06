/**
 */
package context.event.impl;

import context.event.ContextInformationEvent;
import context.event.EventPackage;

import data.event.impl.DataEventImpl;

import java.util.Collection;

import models.Element;
import models.ModelsPackage;
import models.VisualElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rule.action.Authorization;

import rule.condition.EventPattern;

import rule.event.Event;
import rule.event.EventModality;
import rule.event.TimeWindow;

import time.Timestamp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Information Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link context.event.impl.ContextInformationEventImpl#getVisualElements <em>Visual Elements</em>}</li>
 *   <li>{@link context.event.impl.ContextInformationEventImpl#getId <em>Id</em>}</li>
 *   <li>{@link context.event.impl.ContextInformationEventImpl#getSubscribedEventPatterns <em>Subscribed Event Patterns</em>}</li>
 *   <li>{@link context.event.impl.ContextInformationEventImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link context.event.impl.ContextInformationEventImpl#getWindows <em>Windows</em>}</li>
 *   <li>{@link context.event.impl.ContextInformationEventImpl#getAuthorization <em>Authorization</em>}</li>
 *   <li>{@link context.event.impl.ContextInformationEventImpl#getModality <em>Modality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextInformationEventImpl extends DataEventImpl implements ContextInformationEvent {
    /**
     * The cached value of the '{@link #getVisualElements() <em>Visual Elements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVisualElements()
     * @generated
     * @ordered
     */
    protected EList<VisualElement> visualElements;

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * The cached value of the '{@link #getSubscribedEventPatterns() <em>Subscribed Event Patterns</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubscribedEventPatterns()
     * @generated
     * @ordered
     */
    protected EList<EventPattern> subscribedEventPatterns;

    /**
     * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimestamp()
     * @generated
     * @ordered
     */
    protected Timestamp timestamp;

    /**
     * The cached value of the '{@link #getWindows() <em>Windows</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindows()
     * @generated
     * @ordered
     */
    protected EList<TimeWindow> windows;

    /**
     * The cached value of the '{@link #getAuthorization() <em>Authorization</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuthorization()
     * @generated
     * @ordered
     */
    protected Authorization authorization;

    /**
     * The default value of the '{@link #getModality() <em>Modality</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModality()
     * @generated
     * @ordered
     */
    protected static final EventModality MODALITY_EDEFAULT = EventModality.TENTATIVE;

    /**
     * The cached value of the '{@link #getModality() <em>Modality</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModality()
     * @generated
     * @ordered
     */
    protected EventModality modality = MODALITY_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContextInformationEventImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EventPackage.Literals.CONTEXT_INFORMATION_EVENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<VisualElement> getVisualElements() {
        if (visualElements == null) {
            visualElements = new EObjectWithInverseResolvingEList<VisualElement>(VisualElement.class, this, EventPackage.CONTEXT_INFORMATION_EVENT__VISUAL_ELEMENTS, ModelsPackage.VISUAL_ELEMENT__ELEMENT);
        }
        return visualElements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.CONTEXT_INFORMATION_EVENT__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EventPattern> getSubscribedEventPatterns() {
        if (subscribedEventPatterns == null) {
            subscribedEventPatterns = new EObjectResolvingEList<EventPattern>(EventPattern.class, this, EventPackage.CONTEXT_INFORMATION_EVENT__SUBSCRIBED_EVENT_PATTERNS);
        }
        return subscribedEventPatterns;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Timestamp getTimestamp() {
        return timestamp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTimestamp(Timestamp newTimestamp, NotificationChain msgs) {
        Timestamp oldTimestamp = timestamp;
        timestamp = newTimestamp;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventPackage.CONTEXT_INFORMATION_EVENT__TIMESTAMP, oldTimestamp, newTimestamp);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimestamp(Timestamp newTimestamp) {
        if (newTimestamp != timestamp) {
            NotificationChain msgs = null;
            if (timestamp != null)
                msgs = ((InternalEObject)timestamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventPackage.CONTEXT_INFORMATION_EVENT__TIMESTAMP, null, msgs);
            if (newTimestamp != null)
                msgs = ((InternalEObject)newTimestamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventPackage.CONTEXT_INFORMATION_EVENT__TIMESTAMP, null, msgs);
            msgs = basicSetTimestamp(newTimestamp, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.CONTEXT_INFORMATION_EVENT__TIMESTAMP, newTimestamp, newTimestamp));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TimeWindow> getWindows() {
        if (windows == null) {
            windows = new EObjectWithInverseResolvingEList.ManyInverse<TimeWindow>(TimeWindow.class, this, EventPackage.CONTEXT_INFORMATION_EVENT__WINDOWS, rule.event.EventPackage.TIME_WINDOW__EVENTS);
        }
        return windows;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Authorization getAuthorization() {
        if (authorization != null && authorization.eIsProxy()) {
            InternalEObject oldAuthorization = (InternalEObject)authorization;
            authorization = (Authorization)eResolveProxy(oldAuthorization);
            if (authorization != oldAuthorization) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventPackage.CONTEXT_INFORMATION_EVENT__AUTHORIZATION, oldAuthorization, authorization));
            }
        }
        return authorization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Authorization basicGetAuthorization() {
        return authorization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAuthorization(Authorization newAuthorization) {
        Authorization oldAuthorization = authorization;
        authorization = newAuthorization;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.CONTEXT_INFORMATION_EVENT__AUTHORIZATION, oldAuthorization, authorization));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventModality getModality() {
        return modality;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModality(EventModality newModality) {
        EventModality oldModality = modality;
        modality = newModality == null ? MODALITY_EDEFAULT : newModality;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EventPackage.CONTEXT_INFORMATION_EVENT__MODALITY, oldModality, modality));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EventPackage.CONTEXT_INFORMATION_EVENT__VISUAL_ELEMENTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getVisualElements()).basicAdd(otherEnd, msgs);
            case EventPackage.CONTEXT_INFORMATION_EVENT__WINDOWS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getWindows()).basicAdd(otherEnd, msgs);
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
            case EventPackage.CONTEXT_INFORMATION_EVENT__VISUAL_ELEMENTS:
                return ((InternalEList<?>)getVisualElements()).basicRemove(otherEnd, msgs);
            case EventPackage.CONTEXT_INFORMATION_EVENT__TIMESTAMP:
                return basicSetTimestamp(null, msgs);
            case EventPackage.CONTEXT_INFORMATION_EVENT__WINDOWS:
                return ((InternalEList<?>)getWindows()).basicRemove(otherEnd, msgs);
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
            case EventPackage.CONTEXT_INFORMATION_EVENT__VISUAL_ELEMENTS:
                return getVisualElements();
            case EventPackage.CONTEXT_INFORMATION_EVENT__ID:
                return getId();
            case EventPackage.CONTEXT_INFORMATION_EVENT__SUBSCRIBED_EVENT_PATTERNS:
                return getSubscribedEventPatterns();
            case EventPackage.CONTEXT_INFORMATION_EVENT__TIMESTAMP:
                return getTimestamp();
            case EventPackage.CONTEXT_INFORMATION_EVENT__WINDOWS:
                return getWindows();
            case EventPackage.CONTEXT_INFORMATION_EVENT__AUTHORIZATION:
                if (resolve) return getAuthorization();
                return basicGetAuthorization();
            case EventPackage.CONTEXT_INFORMATION_EVENT__MODALITY:
                return getModality();
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
            case EventPackage.CONTEXT_INFORMATION_EVENT__VISUAL_ELEMENTS:
                getVisualElements().clear();
                getVisualElements().addAll((Collection<? extends VisualElement>)newValue);
                return;
            case EventPackage.CONTEXT_INFORMATION_EVENT__ID:
                setId((String)newValue);
                return;
            case EventPackage.CONTEXT_INFORMATION_EVENT__SUBSCRIBED_EVENT_PATTERNS:
                getSubscribedEventPatterns().clear();
                getSubscribedEventPatterns().addAll((Collection<? extends EventPattern>)newValue);
                return;
            case EventPackage.CONTEXT_INFORMATION_EVENT__TIMESTAMP:
                setTimestamp((Timestamp)newValue);
                return;
            case EventPackage.CONTEXT_INFORMATION_EVENT__WINDOWS:
                getWindows().clear();
                getWindows().addAll((Collection<? extends TimeWindow>)newValue);
                return;
            case EventPackage.CONTEXT_INFORMATION_EVENT__AUTHORIZATION:
                setAuthorization((Authorization)newValue);
                return;
            case EventPackage.CONTEXT_INFORMATION_EVENT__MODALITY:
                setModality((EventModality)newValue);
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
            case EventPackage.CONTEXT_INFORMATION_EVENT__VISUAL_ELEMENTS:
                getVisualElements().clear();
                return;
            case EventPackage.CONTEXT_INFORMATION_EVENT__ID:
                setId(ID_EDEFAULT);
                return;
            case EventPackage.CONTEXT_INFORMATION_EVENT__SUBSCRIBED_EVENT_PATTERNS:
                getSubscribedEventPatterns().clear();
                return;
            case EventPackage.CONTEXT_INFORMATION_EVENT__TIMESTAMP:
                setTimestamp((Timestamp)null);
                return;
            case EventPackage.CONTEXT_INFORMATION_EVENT__WINDOWS:
                getWindows().clear();
                return;
            case EventPackage.CONTEXT_INFORMATION_EVENT__AUTHORIZATION:
                setAuthorization((Authorization)null);
                return;
            case EventPackage.CONTEXT_INFORMATION_EVENT__MODALITY:
                setModality(MODALITY_EDEFAULT);
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
            case EventPackage.CONTEXT_INFORMATION_EVENT__VISUAL_ELEMENTS:
                return visualElements != null && !visualElements.isEmpty();
            case EventPackage.CONTEXT_INFORMATION_EVENT__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case EventPackage.CONTEXT_INFORMATION_EVENT__SUBSCRIBED_EVENT_PATTERNS:
                return subscribedEventPatterns != null && !subscribedEventPatterns.isEmpty();
            case EventPackage.CONTEXT_INFORMATION_EVENT__TIMESTAMP:
                return timestamp != null;
            case EventPackage.CONTEXT_INFORMATION_EVENT__WINDOWS:
                return windows != null && !windows.isEmpty();
            case EventPackage.CONTEXT_INFORMATION_EVENT__AUTHORIZATION:
                return authorization != null;
            case EventPackage.CONTEXT_INFORMATION_EVENT__MODALITY:
                return modality != MODALITY_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == Element.class) {
            switch (derivedFeatureID) {
                case EventPackage.CONTEXT_INFORMATION_EVENT__VISUAL_ELEMENTS: return ModelsPackage.ELEMENT__VISUAL_ELEMENTS;
                case EventPackage.CONTEXT_INFORMATION_EVENT__ID: return ModelsPackage.ELEMENT__ID;
                default: return -1;
            }
        }
        if (baseClass == Event.class) {
            switch (derivedFeatureID) {
                case EventPackage.CONTEXT_INFORMATION_EVENT__SUBSCRIBED_EVENT_PATTERNS: return rule.event.EventPackage.EVENT__SUBSCRIBED_EVENT_PATTERNS;
                case EventPackage.CONTEXT_INFORMATION_EVENT__TIMESTAMP: return rule.event.EventPackage.EVENT__TIMESTAMP;
                case EventPackage.CONTEXT_INFORMATION_EVENT__WINDOWS: return rule.event.EventPackage.EVENT__WINDOWS;
                case EventPackage.CONTEXT_INFORMATION_EVENT__AUTHORIZATION: return rule.event.EventPackage.EVENT__AUTHORIZATION;
                case EventPackage.CONTEXT_INFORMATION_EVENT__MODALITY: return rule.event.EventPackage.EVENT__MODALITY;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == Element.class) {
            switch (baseFeatureID) {
                case ModelsPackage.ELEMENT__VISUAL_ELEMENTS: return EventPackage.CONTEXT_INFORMATION_EVENT__VISUAL_ELEMENTS;
                case ModelsPackage.ELEMENT__ID: return EventPackage.CONTEXT_INFORMATION_EVENT__ID;
                default: return -1;
            }
        }
        if (baseClass == Event.class) {
            switch (baseFeatureID) {
                case rule.event.EventPackage.EVENT__SUBSCRIBED_EVENT_PATTERNS: return EventPackage.CONTEXT_INFORMATION_EVENT__SUBSCRIBED_EVENT_PATTERNS;
                case rule.event.EventPackage.EVENT__TIMESTAMP: return EventPackage.CONTEXT_INFORMATION_EVENT__TIMESTAMP;
                case rule.event.EventPackage.EVENT__WINDOWS: return EventPackage.CONTEXT_INFORMATION_EVENT__WINDOWS;
                case rule.event.EventPackage.EVENT__AUTHORIZATION: return EventPackage.CONTEXT_INFORMATION_EVENT__AUTHORIZATION;
                case rule.event.EventPackage.EVENT__MODALITY: return EventPackage.CONTEXT_INFORMATION_EVENT__MODALITY;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
        result.append(" (id: ");
        result.append(id);
        result.append(", modality: ");
        result.append(modality);
        result.append(')');
        return result.toString();
    }

} //ContextInformationEventImpl
