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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import risk.type.Countermeasure;
import risk.type.IncidentType;
import risk.type.RefinementType;
import risk.type.Threat;
import risk.type.ThreatScenario;
import risk.type.ThreatScenarioAttribute;
import risk.type.TypePackage;
import risk.type.Vulnerability;

import trust.instance.LikelihoodLevel;
import trust.instance.LikelihoodMeasurement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Threat Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link risk.type.impl.ThreatScenarioImpl#getThreat <em>Threat</em>}</li>
 *   <li>{@link risk.type.impl.ThreatScenarioImpl#getVulnerability <em>Vulnerability</em>}</li>
 *   <li>{@link risk.type.impl.ThreatScenarioImpl#getUnwantedIncidents <em>Unwanted Incidents</em>}</li>
 *   <li>{@link risk.type.impl.ThreatScenarioImpl#getRequiresScenario <em>Requires Scenario</em>}</li>
 *   <li>{@link risk.type.impl.ThreatScenarioImpl#getEnablesScenario <em>Enables Scenario</em>}</li>
 *   <li>{@link risk.type.impl.ThreatScenarioImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link risk.type.impl.ThreatScenarioImpl#getCountermeasures <em>Countermeasures</em>}</li>
 *   <li>{@link risk.type.impl.ThreatScenarioImpl#getRefinementType <em>Refinement Type</em>}</li>
 *   <li>{@link risk.type.impl.ThreatScenarioImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link risk.type.impl.ThreatScenarioImpl#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link risk.type.impl.ThreatScenarioImpl#getLikelihoodMeasurement <em>Likelihood Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThreatScenarioImpl extends ElementImpl implements ThreatScenario {
    /**
     * The cached value of the '{@link #getThreat() <em>Threat</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThreat()
     * @generated
     * @ordered
     */
    protected Threat threat;

    /**
     * The cached value of the '{@link #getVulnerability() <em>Vulnerability</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVulnerability()
     * @generated
     * @ordered
     */
    protected EList<Vulnerability> vulnerability;

    /**
     * The cached value of the '{@link #getUnwantedIncidents() <em>Unwanted Incidents</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnwantedIncidents()
     * @generated
     * @ordered
     */
    protected EList<IncidentType> unwantedIncidents;

    /**
     * The cached value of the '{@link #getRequiresScenario() <em>Requires Scenario</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequiresScenario()
     * @generated
     * @ordered
     */
    protected EList<ThreatScenario> requiresScenario;

    /**
     * The cached value of the '{@link #getEnablesScenario() <em>Enables Scenario</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnablesScenario()
     * @generated
     * @ordered
     */
    protected EList<ThreatScenario> enablesScenario;

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
     * The cached value of the '{@link #getCountermeasures() <em>Countermeasures</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCountermeasures()
     * @generated
     * @ordered
     */
    protected EList<Countermeasure> countermeasures;

    /**
     * The default value of the '{@link #getRefinementType() <em>Refinement Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefinementType()
     * @generated
     * @ordered
     */
    protected static final RefinementType REFINEMENT_TYPE_EDEFAULT = RefinementType.AND;

    /**
     * The cached value of the '{@link #getRefinementType() <em>Refinement Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefinementType()
     * @generated
     * @ordered
     */
    protected RefinementType refinementType = REFINEMENT_TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributes()
     * @generated
     * @ordered
     */
    protected EList<ThreatScenarioAttribute> attributes;

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
    protected ThreatScenarioImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.THREAT_SCENARIO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Threat getThreat() {
        if (threat != null && threat.eIsProxy()) {
            InternalEObject oldThreat = (InternalEObject)threat;
            threat = (Threat)eResolveProxy(oldThreat);
            if (threat != oldThreat) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypePackage.THREAT_SCENARIO__THREAT, oldThreat, threat));
            }
        }
        return threat;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Threat basicGetThreat() {
        return threat;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setThreat(Threat newThreat) {
        Threat oldThreat = threat;
        threat = newThreat;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.THREAT_SCENARIO__THREAT, oldThreat, threat));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Vulnerability> getVulnerability() {
        if (vulnerability == null) {
            vulnerability = new EObjectResolvingEList<Vulnerability>(Vulnerability.class, this, TypePackage.THREAT_SCENARIO__VULNERABILITY);
        }
        return vulnerability;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IncidentType> getUnwantedIncidents() {
        if (unwantedIncidents == null) {
            unwantedIncidents = new EObjectResolvingEList<IncidentType>(IncidentType.class, this, TypePackage.THREAT_SCENARIO__UNWANTED_INCIDENTS);
        }
        return unwantedIncidents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ThreatScenario> getRequiresScenario() {
        if (requiresScenario == null) {
            requiresScenario = new EObjectWithInverseResolvingEList.ManyInverse<ThreatScenario>(ThreatScenario.class, this, TypePackage.THREAT_SCENARIO__REQUIRES_SCENARIO, TypePackage.THREAT_SCENARIO__ENABLES_SCENARIO);
        }
        return requiresScenario;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ThreatScenario> getEnablesScenario() {
        if (enablesScenario == null) {
            enablesScenario = new EObjectWithInverseResolvingEList.ManyInverse<ThreatScenario>(ThreatScenario.class, this, TypePackage.THREAT_SCENARIO__ENABLES_SCENARIO, TypePackage.THREAT_SCENARIO__REQUIRES_SCENARIO);
        }
        return enablesScenario;
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
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.THREAT_SCENARIO__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Countermeasure> getCountermeasures() {
        if (countermeasures == null) {
            countermeasures = new EObjectResolvingEList<Countermeasure>(Countermeasure.class, this, TypePackage.THREAT_SCENARIO__COUNTERMEASURES);
        }
        return countermeasures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RefinementType getRefinementType() {
        return refinementType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRefinementType(RefinementType newRefinementType) {
        RefinementType oldRefinementType = refinementType;
        refinementType = newRefinementType == null ? REFINEMENT_TYPE_EDEFAULT : newRefinementType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.THREAT_SCENARIO__REFINEMENT_TYPE, oldRefinementType, refinementType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ThreatScenarioAttribute> getAttributes() {
        if (attributes == null) {
            attributes = new EObjectContainmentEList<ThreatScenarioAttribute>(ThreatScenarioAttribute.class, this, TypePackage.THREAT_SCENARIO__ATTRIBUTES);
        }
        return attributes;
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
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.THREAT_SCENARIO__LIKELIHOOD, oldLikelihood, likelihood));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypePackage.THREAT_SCENARIO__LIKELIHOOD_MEASUREMENT, oldLikelihoodMeasurement, newLikelihoodMeasurement);
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
                msgs = ((InternalEObject)likelihoodMeasurement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypePackage.THREAT_SCENARIO__LIKELIHOOD_MEASUREMENT, null, msgs);
            if (newLikelihoodMeasurement != null)
                msgs = ((InternalEObject)newLikelihoodMeasurement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypePackage.THREAT_SCENARIO__LIKELIHOOD_MEASUREMENT, null, msgs);
            msgs = basicSetLikelihoodMeasurement(newLikelihoodMeasurement, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.THREAT_SCENARIO__LIKELIHOOD_MEASUREMENT, newLikelihoodMeasurement, newLikelihoodMeasurement));
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
            case TypePackage.THREAT_SCENARIO__REQUIRES_SCENARIO:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiresScenario()).basicAdd(otherEnd, msgs);
            case TypePackage.THREAT_SCENARIO__ENABLES_SCENARIO:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnablesScenario()).basicAdd(otherEnd, msgs);
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
            case TypePackage.THREAT_SCENARIO__REQUIRES_SCENARIO:
                return ((InternalEList<?>)getRequiresScenario()).basicRemove(otherEnd, msgs);
            case TypePackage.THREAT_SCENARIO__ENABLES_SCENARIO:
                return ((InternalEList<?>)getEnablesScenario()).basicRemove(otherEnd, msgs);
            case TypePackage.THREAT_SCENARIO__ATTRIBUTES:
                return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
            case TypePackage.THREAT_SCENARIO__LIKELIHOOD_MEASUREMENT:
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
            case TypePackage.THREAT_SCENARIO__THREAT:
                if (resolve) return getThreat();
                return basicGetThreat();
            case TypePackage.THREAT_SCENARIO__VULNERABILITY:
                return getVulnerability();
            case TypePackage.THREAT_SCENARIO__UNWANTED_INCIDENTS:
                return getUnwantedIncidents();
            case TypePackage.THREAT_SCENARIO__REQUIRES_SCENARIO:
                return getRequiresScenario();
            case TypePackage.THREAT_SCENARIO__ENABLES_SCENARIO:
                return getEnablesScenario();
            case TypePackage.THREAT_SCENARIO__DESCRIPTION:
                return getDescription();
            case TypePackage.THREAT_SCENARIO__COUNTERMEASURES:
                return getCountermeasures();
            case TypePackage.THREAT_SCENARIO__REFINEMENT_TYPE:
                return getRefinementType();
            case TypePackage.THREAT_SCENARIO__ATTRIBUTES:
                return getAttributes();
            case TypePackage.THREAT_SCENARIO__LIKELIHOOD:
                return getLikelihood();
            case TypePackage.THREAT_SCENARIO__LIKELIHOOD_MEASUREMENT:
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
            case TypePackage.THREAT_SCENARIO__THREAT:
                setThreat((Threat)newValue);
                return;
            case TypePackage.THREAT_SCENARIO__VULNERABILITY:
                getVulnerability().clear();
                getVulnerability().addAll((Collection<? extends Vulnerability>)newValue);
                return;
            case TypePackage.THREAT_SCENARIO__UNWANTED_INCIDENTS:
                getUnwantedIncidents().clear();
                getUnwantedIncidents().addAll((Collection<? extends IncidentType>)newValue);
                return;
            case TypePackage.THREAT_SCENARIO__REQUIRES_SCENARIO:
                getRequiresScenario().clear();
                getRequiresScenario().addAll((Collection<? extends ThreatScenario>)newValue);
                return;
            case TypePackage.THREAT_SCENARIO__ENABLES_SCENARIO:
                getEnablesScenario().clear();
                getEnablesScenario().addAll((Collection<? extends ThreatScenario>)newValue);
                return;
            case TypePackage.THREAT_SCENARIO__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case TypePackage.THREAT_SCENARIO__COUNTERMEASURES:
                getCountermeasures().clear();
                getCountermeasures().addAll((Collection<? extends Countermeasure>)newValue);
                return;
            case TypePackage.THREAT_SCENARIO__REFINEMENT_TYPE:
                setRefinementType((RefinementType)newValue);
                return;
            case TypePackage.THREAT_SCENARIO__ATTRIBUTES:
                getAttributes().clear();
                getAttributes().addAll((Collection<? extends ThreatScenarioAttribute>)newValue);
                return;
            case TypePackage.THREAT_SCENARIO__LIKELIHOOD:
                setLikelihood((LikelihoodLevel)newValue);
                return;
            case TypePackage.THREAT_SCENARIO__LIKELIHOOD_MEASUREMENT:
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
            case TypePackage.THREAT_SCENARIO__THREAT:
                setThreat((Threat)null);
                return;
            case TypePackage.THREAT_SCENARIO__VULNERABILITY:
                getVulnerability().clear();
                return;
            case TypePackage.THREAT_SCENARIO__UNWANTED_INCIDENTS:
                getUnwantedIncidents().clear();
                return;
            case TypePackage.THREAT_SCENARIO__REQUIRES_SCENARIO:
                getRequiresScenario().clear();
                return;
            case TypePackage.THREAT_SCENARIO__ENABLES_SCENARIO:
                getEnablesScenario().clear();
                return;
            case TypePackage.THREAT_SCENARIO__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case TypePackage.THREAT_SCENARIO__COUNTERMEASURES:
                getCountermeasures().clear();
                return;
            case TypePackage.THREAT_SCENARIO__REFINEMENT_TYPE:
                setRefinementType(REFINEMENT_TYPE_EDEFAULT);
                return;
            case TypePackage.THREAT_SCENARIO__ATTRIBUTES:
                getAttributes().clear();
                return;
            case TypePackage.THREAT_SCENARIO__LIKELIHOOD:
                setLikelihood(LIKELIHOOD_EDEFAULT);
                return;
            case TypePackage.THREAT_SCENARIO__LIKELIHOOD_MEASUREMENT:
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
            case TypePackage.THREAT_SCENARIO__THREAT:
                return threat != null;
            case TypePackage.THREAT_SCENARIO__VULNERABILITY:
                return vulnerability != null && !vulnerability.isEmpty();
            case TypePackage.THREAT_SCENARIO__UNWANTED_INCIDENTS:
                return unwantedIncidents != null && !unwantedIncidents.isEmpty();
            case TypePackage.THREAT_SCENARIO__REQUIRES_SCENARIO:
                return requiresScenario != null && !requiresScenario.isEmpty();
            case TypePackage.THREAT_SCENARIO__ENABLES_SCENARIO:
                return enablesScenario != null && !enablesScenario.isEmpty();
            case TypePackage.THREAT_SCENARIO__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case TypePackage.THREAT_SCENARIO__COUNTERMEASURES:
                return countermeasures != null && !countermeasures.isEmpty();
            case TypePackage.THREAT_SCENARIO__REFINEMENT_TYPE:
                return refinementType != REFINEMENT_TYPE_EDEFAULT;
            case TypePackage.THREAT_SCENARIO__ATTRIBUTES:
                return attributes != null && !attributes.isEmpty();
            case TypePackage.THREAT_SCENARIO__LIKELIHOOD:
                return likelihood != LIKELIHOOD_EDEFAULT;
            case TypePackage.THREAT_SCENARIO__LIKELIHOOD_MEASUREMENT:
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
        result.append(", refinementType: ");
        result.append(refinementType);
        result.append(", likelihood: ");
        result.append(likelihood);
        result.append(')');
        return result.toString();
    }

} //ThreatScenarioImpl
