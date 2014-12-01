/**
 */
package identity.pattern.impl;

import data.pattern.DataPattern;

import identity.IdentityVariable;

import identity.instantiation.IdentityInstantiation;

import identity.pattern.IdentityAttributePattern;
import identity.pattern.IdentityPattern;
import identity.pattern.PatternPackage;

import identity.type.IdentityType;

import java.util.Collection;

import models.impl.PatternImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identity Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link identity.pattern.impl.IdentityPatternImpl#getAttributePatterns <em>Attribute Patterns</em>}</li>
 *   <li>{@link identity.pattern.impl.IdentityPatternImpl#getIssuerPattern <em>Issuer Pattern</em>}</li>
 *   <li>{@link identity.pattern.impl.IdentityPatternImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link identity.pattern.impl.IdentityPatternImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link identity.pattern.impl.IdentityPatternImpl#getInstantiation <em>Instantiation</em>}</li>
 *   <li>{@link identity.pattern.impl.IdentityPatternImpl#getType <em>Type</em>}</li>
 *   <li>{@link identity.pattern.impl.IdentityPatternImpl#getSubjectPattern <em>Subject Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdentityPatternImpl extends PatternImpl implements IdentityPattern {
    /**
     * The cached value of the '{@link #getAttributePatterns() <em>Attribute Patterns</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributePatterns()
     * @generated
     * @ordered
     */
    protected EList<IdentityAttributePattern> attributePatterns;

    /**
     * The cached value of the '{@link #getIssuerPattern() <em>Issuer Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIssuerPattern()
     * @generated
     * @ordered
     */
    protected IdentityPattern issuerPattern;

    /**
     * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubject()
     * @generated
     * @ordered
     */
    protected static final String SUBJECT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubject()
     * @generated
     * @ordered
     */
    protected String subject = SUBJECT_EDEFAULT;

    /**
     * The cached value of the '{@link #getVariables() <em>Variables</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariables()
     * @generated
     * @ordered
     */
    protected EList<IdentityVariable> variables;

    /**
     * The cached value of the '{@link #getInstantiation() <em>Instantiation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstantiation()
     * @generated
     * @ordered
     */
    protected IdentityInstantiation instantiation;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected IdentityType type;

    /**
     * The cached value of the '{@link #getSubjectPattern() <em>Subject Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubjectPattern()
     * @generated
     * @ordered
     */
    protected DataPattern subjectPattern;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IdentityPatternImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PatternPackage.Literals.IDENTITY_PATTERN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IdentityAttributePattern> getAttributePatterns() {
        if (attributePatterns == null) {
            attributePatterns = new EObjectContainmentEList<IdentityAttributePattern>(IdentityAttributePattern.class, this, PatternPackage.IDENTITY_PATTERN__ATTRIBUTE_PATTERNS);
        }
        return attributePatterns;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityPattern getIssuerPattern() {
        return issuerPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIssuerPattern(IdentityPattern newIssuerPattern, NotificationChain msgs) {
        IdentityPattern oldIssuerPattern = issuerPattern;
        issuerPattern = newIssuerPattern;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.IDENTITY_PATTERN__ISSUER_PATTERN, oldIssuerPattern, newIssuerPattern);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIssuerPattern(IdentityPattern newIssuerPattern) {
        if (newIssuerPattern != issuerPattern) {
            NotificationChain msgs = null;
            if (issuerPattern != null)
                msgs = ((InternalEObject)issuerPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternPackage.IDENTITY_PATTERN__ISSUER_PATTERN, null, msgs);
            if (newIssuerPattern != null)
                msgs = ((InternalEObject)newIssuerPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternPackage.IDENTITY_PATTERN__ISSUER_PATTERN, null, msgs);
            msgs = basicSetIssuerPattern(newIssuerPattern, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.IDENTITY_PATTERN__ISSUER_PATTERN, newIssuerPattern, newIssuerPattern));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSubject() {
        return subject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSubject(String newSubject) {
        String oldSubject = subject;
        subject = newSubject;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.IDENTITY_PATTERN__SUBJECT, oldSubject, subject));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IdentityVariable> getVariables() {
        if (variables == null) {
            variables = new EObjectResolvingEList<IdentityVariable>(IdentityVariable.class, this, PatternPackage.IDENTITY_PATTERN__VARIABLES);
        }
        return variables;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityInstantiation getInstantiation() {
        if (instantiation != null && instantiation.eIsProxy()) {
            InternalEObject oldInstantiation = (InternalEObject)instantiation;
            instantiation = (IdentityInstantiation)eResolveProxy(oldInstantiation);
            if (instantiation != oldInstantiation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.IDENTITY_PATTERN__INSTANTIATION, oldInstantiation, instantiation));
            }
        }
        return instantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityInstantiation basicGetInstantiation() {
        return instantiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstantiation(IdentityInstantiation newInstantiation) {
        IdentityInstantiation oldInstantiation = instantiation;
        instantiation = newInstantiation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.IDENTITY_PATTERN__INSTANTIATION, oldInstantiation, instantiation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityType getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (IdentityType)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.IDENTITY_PATTERN__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityType basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(IdentityType newType) {
        IdentityType oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.IDENTITY_PATTERN__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataPattern getSubjectPattern() {
        return subjectPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSubjectPattern(DataPattern newSubjectPattern, NotificationChain msgs) {
        DataPattern oldSubjectPattern = subjectPattern;
        subjectPattern = newSubjectPattern;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.IDENTITY_PATTERN__SUBJECT_PATTERN, oldSubjectPattern, newSubjectPattern);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSubjectPattern(DataPattern newSubjectPattern) {
        if (newSubjectPattern != subjectPattern) {
            NotificationChain msgs = null;
            if (subjectPattern != null)
                msgs = ((InternalEObject)subjectPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternPackage.IDENTITY_PATTERN__SUBJECT_PATTERN, null, msgs);
            if (newSubjectPattern != null)
                msgs = ((InternalEObject)newSubjectPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternPackage.IDENTITY_PATTERN__SUBJECT_PATTERN, null, msgs);
            msgs = basicSetSubjectPattern(newSubjectPattern, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.IDENTITY_PATTERN__SUBJECT_PATTERN, newSubjectPattern, newSubjectPattern));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PatternPackage.IDENTITY_PATTERN__ATTRIBUTE_PATTERNS:
                return ((InternalEList<?>)getAttributePatterns()).basicRemove(otherEnd, msgs);
            case PatternPackage.IDENTITY_PATTERN__ISSUER_PATTERN:
                return basicSetIssuerPattern(null, msgs);
            case PatternPackage.IDENTITY_PATTERN__SUBJECT_PATTERN:
                return basicSetSubjectPattern(null, msgs);
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
            case PatternPackage.IDENTITY_PATTERN__ATTRIBUTE_PATTERNS:
                return getAttributePatterns();
            case PatternPackage.IDENTITY_PATTERN__ISSUER_PATTERN:
                return getIssuerPattern();
            case PatternPackage.IDENTITY_PATTERN__SUBJECT:
                return getSubject();
            case PatternPackage.IDENTITY_PATTERN__VARIABLES:
                return getVariables();
            case PatternPackage.IDENTITY_PATTERN__INSTANTIATION:
                if (resolve) return getInstantiation();
                return basicGetInstantiation();
            case PatternPackage.IDENTITY_PATTERN__TYPE:
                if (resolve) return getType();
                return basicGetType();
            case PatternPackage.IDENTITY_PATTERN__SUBJECT_PATTERN:
                return getSubjectPattern();
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
            case PatternPackage.IDENTITY_PATTERN__ATTRIBUTE_PATTERNS:
                getAttributePatterns().clear();
                getAttributePatterns().addAll((Collection<? extends IdentityAttributePattern>)newValue);
                return;
            case PatternPackage.IDENTITY_PATTERN__ISSUER_PATTERN:
                setIssuerPattern((IdentityPattern)newValue);
                return;
            case PatternPackage.IDENTITY_PATTERN__SUBJECT:
                setSubject((String)newValue);
                return;
            case PatternPackage.IDENTITY_PATTERN__VARIABLES:
                getVariables().clear();
                getVariables().addAll((Collection<? extends IdentityVariable>)newValue);
                return;
            case PatternPackage.IDENTITY_PATTERN__INSTANTIATION:
                setInstantiation((IdentityInstantiation)newValue);
                return;
            case PatternPackage.IDENTITY_PATTERN__TYPE:
                setType((IdentityType)newValue);
                return;
            case PatternPackage.IDENTITY_PATTERN__SUBJECT_PATTERN:
                setSubjectPattern((DataPattern)newValue);
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
            case PatternPackage.IDENTITY_PATTERN__ATTRIBUTE_PATTERNS:
                getAttributePatterns().clear();
                return;
            case PatternPackage.IDENTITY_PATTERN__ISSUER_PATTERN:
                setIssuerPattern((IdentityPattern)null);
                return;
            case PatternPackage.IDENTITY_PATTERN__SUBJECT:
                setSubject(SUBJECT_EDEFAULT);
                return;
            case PatternPackage.IDENTITY_PATTERN__VARIABLES:
                getVariables().clear();
                return;
            case PatternPackage.IDENTITY_PATTERN__INSTANTIATION:
                setInstantiation((IdentityInstantiation)null);
                return;
            case PatternPackage.IDENTITY_PATTERN__TYPE:
                setType((IdentityType)null);
                return;
            case PatternPackage.IDENTITY_PATTERN__SUBJECT_PATTERN:
                setSubjectPattern((DataPattern)null);
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
            case PatternPackage.IDENTITY_PATTERN__ATTRIBUTE_PATTERNS:
                return attributePatterns != null && !attributePatterns.isEmpty();
            case PatternPackage.IDENTITY_PATTERN__ISSUER_PATTERN:
                return issuerPattern != null;
            case PatternPackage.IDENTITY_PATTERN__SUBJECT:
                return SUBJECT_EDEFAULT == null ? subject != null : !SUBJECT_EDEFAULT.equals(subject);
            case PatternPackage.IDENTITY_PATTERN__VARIABLES:
                return variables != null && !variables.isEmpty();
            case PatternPackage.IDENTITY_PATTERN__INSTANTIATION:
                return instantiation != null;
            case PatternPackage.IDENTITY_PATTERN__TYPE:
                return type != null;
            case PatternPackage.IDENTITY_PATTERN__SUBJECT_PATTERN:
                return subjectPattern != null;
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
        result.append(" (subject: ");
        result.append(subject);
        result.append(')');
        return result.toString();
    }

} //IdentityPatternImpl
