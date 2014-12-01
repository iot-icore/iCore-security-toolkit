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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import risk.type.IncidentType;
import risk.type.NegativeConsequence;
import risk.type.TypePackage;

import trust.instance.LikelihoodLevel;
import trust.instance.LikelihoodMeasurement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Incident Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link risk.type.impl.IncidentTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link risk.type.impl.IncidentTypeImpl#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link risk.type.impl.IncidentTypeImpl#getEnables <em>Enables</em>}</li>
 *   <li>{@link risk.type.impl.IncidentTypeImpl#getNegativeConsequences <em>Negative Consequences</em>}</li>
 *   <li>{@link risk.type.impl.IncidentTypeImpl#getLikelihoodMeasurement <em>Likelihood Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncidentTypeImpl extends ElementImpl implements IncidentType {
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
     * The default value of the '{@link #getLikelihood() <em>Likelihood</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLikelihood()
     * @generated
     * @ordered
     */
    protected static final LikelihoodLevel LIKELIHOOD_EDEFAULT = LikelihoodLevel.RARE;

    /**
     * The cached value of the '{@link #getLikelihood() <em>Likelihood</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLikelihood()
     * @generated
     * @ordered
     */
    protected LikelihoodLevel likelihood = LIKELIHOOD_EDEFAULT;

    /**
     * The cached value of the '{@link #getEnables() <em>Enables</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnables()
     * @generated
     * @ordered
     */
    protected EList<IncidentType> enables;

    /**
     * The cached value of the '{@link #getNegativeConsequences() <em>Negative Consequences</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNegativeConsequences()
     * @generated
     * @ordered
     */
    protected EList<NegativeConsequence> negativeConsequences;

    /**
     * The cached value of the '{@link #getLikelihoodMeasurement() <em>Likelihood Measurement</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLikelihoodMeasurement()
     * @generated
     * @ordered
     */
    protected LikelihoodMeasurement likelihoodMeasurement;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IncidentTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.INCIDENT_TYPE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.INCIDENT_TYPE__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LikelihoodLevel getLikelihood() {
        return likelihood;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLikelihood(LikelihoodLevel newLikelihood) {
        LikelihoodLevel oldLikelihood = likelihood;
        likelihood = newLikelihood == null ? LIKELIHOOD_EDEFAULT : newLikelihood;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.INCIDENT_TYPE__LIKELIHOOD, oldLikelihood, likelihood));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IncidentType> getEnables() {
        if (enables == null) {
            enables = new EObjectResolvingEList<IncidentType>(IncidentType.class, this, TypePackage.INCIDENT_TYPE__ENABLES);
        }
        return enables;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<NegativeConsequence> getNegativeConsequences() {
        if (negativeConsequences == null) {
            negativeConsequences = new EObjectContainmentEList<NegativeConsequence>(NegativeConsequence.class, this, TypePackage.INCIDENT_TYPE__NEGATIVE_CONSEQUENCES);
        }
        return negativeConsequences;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LikelihoodMeasurement getLikelihoodMeasurement() {
        return likelihoodMeasurement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLikelihoodMeasurement(LikelihoodMeasurement newLikelihoodMeasurement, NotificationChain msgs) {
        LikelihoodMeasurement oldLikelihoodMeasurement = likelihoodMeasurement;
        likelihoodMeasurement = newLikelihoodMeasurement;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypePackage.INCIDENT_TYPE__LIKELIHOOD_MEASUREMENT, oldLikelihoodMeasurement, newLikelihoodMeasurement);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLikelihoodMeasurement(LikelihoodMeasurement newLikelihoodMeasurement) {
        if (newLikelihoodMeasurement != likelihoodMeasurement) {
            NotificationChain msgs = null;
            if (likelihoodMeasurement != null)
                msgs = ((InternalEObject)likelihoodMeasurement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypePackage.INCIDENT_TYPE__LIKELIHOOD_MEASUREMENT, null, msgs);
            if (newLikelihoodMeasurement != null)
                msgs = ((InternalEObject)newLikelihoodMeasurement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypePackage.INCIDENT_TYPE__LIKELIHOOD_MEASUREMENT, null, msgs);
            msgs = basicSetLikelihoodMeasurement(newLikelihoodMeasurement, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.INCIDENT_TYPE__LIKELIHOOD_MEASUREMENT, newLikelihoodMeasurement, newLikelihoodMeasurement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TypePackage.INCIDENT_TYPE__NEGATIVE_CONSEQUENCES:
                return ((InternalEList<?>)getNegativeConsequences()).basicRemove(otherEnd, msgs);
            case TypePackage.INCIDENT_TYPE__LIKELIHOOD_MEASUREMENT:
                return basicSetLikelihoodMeasurement(null, msgs);
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
            case TypePackage.INCIDENT_TYPE__DESCRIPTION:
                return getDescription();
            case TypePackage.INCIDENT_TYPE__LIKELIHOOD:
                return getLikelihood();
            case TypePackage.INCIDENT_TYPE__ENABLES:
                return getEnables();
            case TypePackage.INCIDENT_TYPE__NEGATIVE_CONSEQUENCES:
                return getNegativeConsequences();
            case TypePackage.INCIDENT_TYPE__LIKELIHOOD_MEASUREMENT:
                return getLikelihoodMeasurement();
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
            case TypePackage.INCIDENT_TYPE__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case TypePackage.INCIDENT_TYPE__LIKELIHOOD:
                setLikelihood((LikelihoodLevel)newValue);
                return;
            case TypePackage.INCIDENT_TYPE__ENABLES:
                getEnables().clear();
                getEnables().addAll((Collection<? extends IncidentType>)newValue);
                return;
            case TypePackage.INCIDENT_TYPE__NEGATIVE_CONSEQUENCES:
                getNegativeConsequences().clear();
                getNegativeConsequences().addAll((Collection<? extends NegativeConsequence>)newValue);
                return;
            case TypePackage.INCIDENT_TYPE__LIKELIHOOD_MEASUREMENT:
                setLikelihoodMeasurement((LikelihoodMeasurement)newValue);
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
            case TypePackage.INCIDENT_TYPE__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case TypePackage.INCIDENT_TYPE__LIKELIHOOD:
                setLikelihood(LIKELIHOOD_EDEFAULT);
                return;
            case TypePackage.INCIDENT_TYPE__ENABLES:
                getEnables().clear();
                return;
            case TypePackage.INCIDENT_TYPE__NEGATIVE_CONSEQUENCES:
                getNegativeConsequences().clear();
                return;
            case TypePackage.INCIDENT_TYPE__LIKELIHOOD_MEASUREMENT:
                setLikelihoodMeasurement((LikelihoodMeasurement)null);
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
            case TypePackage.INCIDENT_TYPE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case TypePackage.INCIDENT_TYPE__LIKELIHOOD:
                return likelihood != LIKELIHOOD_EDEFAULT;
            case TypePackage.INCIDENT_TYPE__ENABLES:
                return enables != null && !enables.isEmpty();
            case TypePackage.INCIDENT_TYPE__NEGATIVE_CONSEQUENCES:
                return negativeConsequences != null && !negativeConsequences.isEmpty();
            case TypePackage.INCIDENT_TYPE__LIKELIHOOD_MEASUREMENT:
                return likelihoodMeasurement != null;
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
        result.append(", likelihood: ");
        result.append(likelihood);
        result.append(')');
        return result.toString();
    }

} //IncidentTypeImpl
