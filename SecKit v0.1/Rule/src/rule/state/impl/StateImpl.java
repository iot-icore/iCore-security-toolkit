/**
 */
package rule.state.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import rule.condition.Atom;
import rule.condition.TruthValue;

import rule.state.State;
import rule.state.StatePackage;

import rule.template.RuleInstance;
import rule.template.TemplatePackage;

import utils.StateHandler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.state.impl.StateImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link rule.state.impl.StateImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link rule.state.impl.StateImpl#getAtom <em>Atom</em>}</li>
 *   <li>{@link rule.state.impl.StateImpl#getValue <em>Value</em>}</li>
 *   <li>{@link rule.state.impl.StateImpl#getPreviousValue <em>Previous Value</em>}</li>
 *   <li>{@link rule.state.impl.StateImpl#getRuleInstance <em>Rule Instance</em>}</li>
 *   <li>{@link rule.state.impl.StateImpl#getHandler <em>Handler</em>}</li>
 *   <li>{@link rule.state.impl.StateImpl#isImmutable <em>Immutable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends AbstractStateImpl implements State {
    /**
     * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParent()
     * @generated
     * @ordered
     */
    protected State parent;

    /**
     * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChildren()
     * @generated
     * @ordered
     */
    protected EList<State> children;

    /**
     * The cached value of the '{@link #getAtom() <em>Atom</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAtom()
     * @generated
     * @ordered
     */
    protected Atom atom;

    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final TruthValue VALUE_EDEFAULT = TruthValue.FALSE;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected TruthValue value = VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getPreviousValue() <em>Previous Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreviousValue()
     * @generated
     * @ordered
     */
    protected static final TruthValue PREVIOUS_VALUE_EDEFAULT = TruthValue.TRUE;

    /**
     * The cached value of the '{@link #getPreviousValue() <em>Previous Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreviousValue()
     * @generated
     * @ordered
     */
    protected TruthValue previousValue = PREVIOUS_VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getHandler() <em>Handler</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHandler()
     * @generated
     * @ordered
     */
    protected static final StateHandler HANDLER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHandler() <em>Handler</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHandler()
     * @generated
     * @ordered
     */
    protected StateHandler handler = HANDLER_EDEFAULT;

    /**
     * The default value of the '{@link #isImmutable() <em>Immutable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isImmutable()
     * @generated
     * @ordered
     */
    protected static final boolean IMMUTABLE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isImmutable() <em>Immutable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isImmutable()
     * @generated
     * @ordered
     */
    protected boolean immutable = IMMUTABLE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StatePackage.Literals.STATE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public State getParent() {
        if (parent != null && parent.eIsProxy()) {
            InternalEObject oldParent = (InternalEObject)parent;
            parent = (State)eResolveProxy(oldParent);
            if (parent != oldParent) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatePackage.STATE__PARENT, oldParent, parent));
            }
        }
        return parent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public State basicGetParent() {
        return parent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParent(State newParent, NotificationChain msgs) {
        State oldParent = parent;
        parent = newParent;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatePackage.STATE__PARENT, oldParent, newParent);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParent(State newParent) {
        if (newParent != parent) {
            NotificationChain msgs = null;
            if (parent != null)
                msgs = ((InternalEObject)parent).eInverseRemove(this, StatePackage.STATE__CHILDREN, State.class, msgs);
            if (newParent != null)
                msgs = ((InternalEObject)newParent).eInverseAdd(this, StatePackage.STATE__CHILDREN, State.class, msgs);
            msgs = basicSetParent(newParent, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatePackage.STATE__PARENT, newParent, newParent));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<State> getChildren() {
        if (children == null) {
            children = new EObjectWithInverseResolvingEList<State>(State.class, this, StatePackage.STATE__CHILDREN, StatePackage.STATE__PARENT);
        }
        return children;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Atom getAtom() {
        if (atom != null && atom.eIsProxy()) {
            InternalEObject oldAtom = (InternalEObject)atom;
            atom = (Atom)eResolveProxy(oldAtom);
            if (atom != oldAtom) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatePackage.STATE__ATOM, oldAtom, atom));
            }
        }
        return atom;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Atom basicGetAtom() {
        return atom;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAtom(Atom newAtom) {
        Atom oldAtom = atom;
        atom = newAtom;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatePackage.STATE__ATOM, oldAtom, atom));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TruthValue getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(TruthValue newValue) {
        TruthValue oldValue = value;
        value = newValue == null ? VALUE_EDEFAULT : newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatePackage.STATE__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TruthValue getPreviousValue() {
        return previousValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPreviousValue(TruthValue newPreviousValue) {
        TruthValue oldPreviousValue = previousValue;
        previousValue = newPreviousValue == null ? PREVIOUS_VALUE_EDEFAULT : newPreviousValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatePackage.STATE__PREVIOUS_VALUE, oldPreviousValue, previousValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleInstance getRuleInstance() {
        if (eContainerFeatureID() != StatePackage.STATE__RULE_INSTANCE) return null;
        return (RuleInstance)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRuleInstance(RuleInstance newRuleInstance, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newRuleInstance, StatePackage.STATE__RULE_INSTANCE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRuleInstance(RuleInstance newRuleInstance) {
        if (newRuleInstance != eInternalContainer() || (eContainerFeatureID() != StatePackage.STATE__RULE_INSTANCE && newRuleInstance != null)) {
            if (EcoreUtil.isAncestor(this, newRuleInstance))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newRuleInstance != null)
                msgs = ((InternalEObject)newRuleInstance).eInverseAdd(this, TemplatePackage.RULE_INSTANCE__STATES, RuleInstance.class, msgs);
            msgs = basicSetRuleInstance(newRuleInstance, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatePackage.STATE__RULE_INSTANCE, newRuleInstance, newRuleInstance));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StateHandler getHandler() {
        return handler;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHandler(StateHandler newHandler) {
        StateHandler oldHandler = handler;
        handler = newHandler;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatePackage.STATE__HANDLER, oldHandler, handler));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isImmutable() {
        return immutable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setImmutable(boolean newImmutable) {
        boolean oldImmutable = immutable;
        immutable = newImmutable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatePackage.STATE__IMMUTABLE, oldImmutable, immutable));
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
            case StatePackage.STATE__PARENT:
                if (parent != null)
                    msgs = ((InternalEObject)parent).eInverseRemove(this, StatePackage.STATE__CHILDREN, State.class, msgs);
                return basicSetParent((State)otherEnd, msgs);
            case StatePackage.STATE__CHILDREN:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
            case StatePackage.STATE__RULE_INSTANCE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetRuleInstance((RuleInstance)otherEnd, msgs);
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
            case StatePackage.STATE__PARENT:
                return basicSetParent(null, msgs);
            case StatePackage.STATE__CHILDREN:
                return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
            case StatePackage.STATE__RULE_INSTANCE:
                return basicSetRuleInstance(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case StatePackage.STATE__RULE_INSTANCE:
                return eInternalContainer().eInverseRemove(this, TemplatePackage.RULE_INSTANCE__STATES, RuleInstance.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case StatePackage.STATE__PARENT:
                if (resolve) return getParent();
                return basicGetParent();
            case StatePackage.STATE__CHILDREN:
                return getChildren();
            case StatePackage.STATE__ATOM:
                if (resolve) return getAtom();
                return basicGetAtom();
            case StatePackage.STATE__VALUE:
                return getValue();
            case StatePackage.STATE__PREVIOUS_VALUE:
                return getPreviousValue();
            case StatePackage.STATE__RULE_INSTANCE:
                return getRuleInstance();
            case StatePackage.STATE__HANDLER:
                return getHandler();
            case StatePackage.STATE__IMMUTABLE:
                return isImmutable();
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
            case StatePackage.STATE__PARENT:
                setParent((State)newValue);
                return;
            case StatePackage.STATE__CHILDREN:
                getChildren().clear();
                getChildren().addAll((Collection<? extends State>)newValue);
                return;
            case StatePackage.STATE__ATOM:
                setAtom((Atom)newValue);
                return;
            case StatePackage.STATE__VALUE:
                setValue((TruthValue)newValue);
                return;
            case StatePackage.STATE__PREVIOUS_VALUE:
                setPreviousValue((TruthValue)newValue);
                return;
            case StatePackage.STATE__RULE_INSTANCE:
                setRuleInstance((RuleInstance)newValue);
                return;
            case StatePackage.STATE__HANDLER:
                setHandler((StateHandler)newValue);
                return;
            case StatePackage.STATE__IMMUTABLE:
                setImmutable((Boolean)newValue);
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
            case StatePackage.STATE__PARENT:
                setParent((State)null);
                return;
            case StatePackage.STATE__CHILDREN:
                getChildren().clear();
                return;
            case StatePackage.STATE__ATOM:
                setAtom((Atom)null);
                return;
            case StatePackage.STATE__VALUE:
                setValue(VALUE_EDEFAULT);
                return;
            case StatePackage.STATE__PREVIOUS_VALUE:
                setPreviousValue(PREVIOUS_VALUE_EDEFAULT);
                return;
            case StatePackage.STATE__RULE_INSTANCE:
                setRuleInstance((RuleInstance)null);
                return;
            case StatePackage.STATE__HANDLER:
                setHandler(HANDLER_EDEFAULT);
                return;
            case StatePackage.STATE__IMMUTABLE:
                setImmutable(IMMUTABLE_EDEFAULT);
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
            case StatePackage.STATE__PARENT:
                return parent != null;
            case StatePackage.STATE__CHILDREN:
                return children != null && !children.isEmpty();
            case StatePackage.STATE__ATOM:
                return atom != null;
            case StatePackage.STATE__VALUE:
                return value != VALUE_EDEFAULT;
            case StatePackage.STATE__PREVIOUS_VALUE:
                return previousValue != PREVIOUS_VALUE_EDEFAULT;
            case StatePackage.STATE__RULE_INSTANCE:
                return getRuleInstance() != null;
            case StatePackage.STATE__HANDLER:
                return HANDLER_EDEFAULT == null ? handler != null : !HANDLER_EDEFAULT.equals(handler);
            case StatePackage.STATE__IMMUTABLE:
                return immutable != IMMUTABLE_EDEFAULT;
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
        result.append(" (value: ");
        result.append(value);
        result.append(", previousValue: ");
        result.append(previousValue);
        result.append(", handler: ");
        result.append(handler);
        result.append(", immutable: ");
        result.append(immutable);
        result.append(')');
        return result.toString();
    }

} //StateImpl
