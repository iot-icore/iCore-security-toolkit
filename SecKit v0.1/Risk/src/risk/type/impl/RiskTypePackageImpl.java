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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import risk.RiskDesignModel;
import risk.RiskPackage;

import risk.type.Asset;
import risk.type.Countermeasure;
import risk.type.IncidentType;
import risk.type.RiskAssessment;
import risk.type.RiskTypePackage;
import risk.type.Stakeholder;
import risk.type.Threat;
import risk.type.ThreatScenario;
import risk.type.TypePackage;
import risk.type.Vulnerability;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk Type Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link risk.type.impl.RiskTypePackageImpl#getStakeholders <em>Stakeholders</em>}</li>
 *   <li>{@link risk.type.impl.RiskTypePackageImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link risk.type.impl.RiskTypePackageImpl#getThreats <em>Threats</em>}</li>
 *   <li>{@link risk.type.impl.RiskTypePackageImpl#getVulnerabilities <em>Vulnerabilities</em>}</li>
 *   <li>{@link risk.type.impl.RiskTypePackageImpl#getUnwantedIncidents <em>Unwanted Incidents</em>}</li>
 *   <li>{@link risk.type.impl.RiskTypePackageImpl#getScenarios <em>Scenarios</em>}</li>
 *   <li>{@link risk.type.impl.RiskTypePackageImpl#getRiskAssessments <em>Risk Assessments</em>}</li>
 *   <li>{@link risk.type.impl.RiskTypePackageImpl#getCountermeasures <em>Countermeasures</em>}</li>
 *   <li>{@link risk.type.impl.RiskTypePackageImpl#getSuperPackage <em>Super Package</em>}</li>
 *   <li>{@link risk.type.impl.RiskTypePackageImpl#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link risk.type.impl.RiskTypePackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link risk.type.impl.RiskTypePackageImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RiskTypePackageImpl extends ElementImpl implements RiskTypePackage {
    /**
     * The cached value of the '{@link #getStakeholders() <em>Stakeholders</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStakeholders()
     * @generated
     * @ordered
     */
    protected EList<Stakeholder> stakeholders;

    /**
     * The cached value of the '{@link #getAssets() <em>Assets</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssets()
     * @generated
     * @ordered
     */
    protected EList<Asset> assets;

    /**
     * The cached value of the '{@link #getThreats() <em>Threats</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThreats()
     * @generated
     * @ordered
     */
    protected EList<Threat> threats;

    /**
     * The cached value of the '{@link #getVulnerabilities() <em>Vulnerabilities</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVulnerabilities()
     * @generated
     * @ordered
     */
    protected EList<Vulnerability> vulnerabilities;

    /**
     * The cached value of the '{@link #getUnwantedIncidents() <em>Unwanted Incidents</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnwantedIncidents()
     * @generated
     * @ordered
     */
    protected EList<IncidentType> unwantedIncidents;

    /**
     * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScenarios()
     * @generated
     * @ordered
     */
    protected EList<ThreatScenario> scenarios;

    /**
     * The cached value of the '{@link #getRiskAssessments() <em>Risk Assessments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRiskAssessments()
     * @generated
     * @ordered
     */
    protected EList<RiskAssessment> riskAssessments;

    /**
     * The cached value of the '{@link #getCountermeasures() <em>Countermeasures</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCountermeasures()
     * @generated
     * @ordered
     */
    protected EList<Countermeasure> countermeasures;

    /**
     * The cached value of the '{@link #getSubPackages() <em>Sub Packages</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubPackages()
     * @generated
     * @ordered
     */
    protected EList<RiskTypePackage> subPackages;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RiskTypePackageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.RISK_TYPE_PACKAGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Stakeholder> getStakeholders() {
        if (stakeholders == null) {
            stakeholders = new EObjectContainmentEList<Stakeholder>(Stakeholder.class, this, TypePackage.RISK_TYPE_PACKAGE__STAKEHOLDERS);
        }
        return stakeholders;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Asset> getAssets() {
        if (assets == null) {
            assets = new EObjectContainmentEList<Asset>(Asset.class, this, TypePackage.RISK_TYPE_PACKAGE__ASSETS);
        }
        return assets;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Threat> getThreats() {
        if (threats == null) {
            threats = new EObjectContainmentEList<Threat>(Threat.class, this, TypePackage.RISK_TYPE_PACKAGE__THREATS);
        }
        return threats;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Vulnerability> getVulnerabilities() {
        if (vulnerabilities == null) {
            vulnerabilities = new EObjectContainmentEList<Vulnerability>(Vulnerability.class, this, TypePackage.RISK_TYPE_PACKAGE__VULNERABILITIES);
        }
        return vulnerabilities;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IncidentType> getUnwantedIncidents() {
        if (unwantedIncidents == null) {
            unwantedIncidents = new EObjectContainmentEList<IncidentType>(IncidentType.class, this, TypePackage.RISK_TYPE_PACKAGE__UNWANTED_INCIDENTS);
        }
        return unwantedIncidents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ThreatScenario> getScenarios() {
        if (scenarios == null) {
            scenarios = new EObjectContainmentEList<ThreatScenario>(ThreatScenario.class, this, TypePackage.RISK_TYPE_PACKAGE__SCENARIOS);
        }
        return scenarios;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RiskAssessment> getRiskAssessments() {
        if (riskAssessments == null) {
            riskAssessments = new EObjectContainmentEList<RiskAssessment>(RiskAssessment.class, this, TypePackage.RISK_TYPE_PACKAGE__RISK_ASSESSMENTS);
        }
        return riskAssessments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Countermeasure> getCountermeasures() {
        if (countermeasures == null) {
            countermeasures = new EObjectContainmentEList<Countermeasure>(Countermeasure.class, this, TypePackage.RISK_TYPE_PACKAGE__COUNTERMEASURES);
        }
        return countermeasures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RiskTypePackage getSuperPackage() {
        if (eContainerFeatureID() != TypePackage.RISK_TYPE_PACKAGE__SUPER_PACKAGE) return null;
        return (RiskTypePackage)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSuperPackage(RiskTypePackage newSuperPackage, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newSuperPackage, TypePackage.RISK_TYPE_PACKAGE__SUPER_PACKAGE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSuperPackage(RiskTypePackage newSuperPackage) {
        if (newSuperPackage != eInternalContainer() || (eContainerFeatureID() != TypePackage.RISK_TYPE_PACKAGE__SUPER_PACKAGE && newSuperPackage != null)) {
            if (EcoreUtil.isAncestor(this, newSuperPackage))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newSuperPackage != null)
                msgs = ((InternalEObject)newSuperPackage).eInverseAdd(this, TypePackage.RISK_TYPE_PACKAGE__SUB_PACKAGES, RiskTypePackage.class, msgs);
            msgs = basicSetSuperPackage(newSuperPackage, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.RISK_TYPE_PACKAGE__SUPER_PACKAGE, newSuperPackage, newSuperPackage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RiskTypePackage> getSubPackages() {
        if (subPackages == null) {
            subPackages = new EObjectContainmentWithInverseEList<RiskTypePackage>(RiskTypePackage.class, this, TypePackage.RISK_TYPE_PACKAGE__SUB_PACKAGES, TypePackage.RISK_TYPE_PACKAGE__SUPER_PACKAGE);
        }
        return subPackages;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.RISK_TYPE_PACKAGE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RiskDesignModel getModel() {
        if (eContainerFeatureID() != TypePackage.RISK_TYPE_PACKAGE__MODEL) return null;
        return (RiskDesignModel)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetModel(RiskDesignModel newModel, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newModel, TypePackage.RISK_TYPE_PACKAGE__MODEL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModel(RiskDesignModel newModel) {
        if (newModel != eInternalContainer() || (eContainerFeatureID() != TypePackage.RISK_TYPE_PACKAGE__MODEL && newModel != null)) {
            if (EcoreUtil.isAncestor(this, newModel))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newModel != null)
                msgs = ((InternalEObject)newModel).eInverseAdd(this, RiskPackage.RISK_DESIGN_MODEL__PACKAGES, RiskDesignModel.class, msgs);
            msgs = basicSetModel(newModel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.RISK_TYPE_PACKAGE__MODEL, newModel, newModel));
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
            case TypePackage.RISK_TYPE_PACKAGE__SUPER_PACKAGE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetSuperPackage((RiskTypePackage)otherEnd, msgs);
            case TypePackage.RISK_TYPE_PACKAGE__SUB_PACKAGES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubPackages()).basicAdd(otherEnd, msgs);
            case TypePackage.RISK_TYPE_PACKAGE__MODEL:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetModel((RiskDesignModel)otherEnd, msgs);
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
            case TypePackage.RISK_TYPE_PACKAGE__STAKEHOLDERS:
                return ((InternalEList<?>)getStakeholders()).basicRemove(otherEnd, msgs);
            case TypePackage.RISK_TYPE_PACKAGE__ASSETS:
                return ((InternalEList<?>)getAssets()).basicRemove(otherEnd, msgs);
            case TypePackage.RISK_TYPE_PACKAGE__THREATS:
                return ((InternalEList<?>)getThreats()).basicRemove(otherEnd, msgs);
            case TypePackage.RISK_TYPE_PACKAGE__VULNERABILITIES:
                return ((InternalEList<?>)getVulnerabilities()).basicRemove(otherEnd, msgs);
            case TypePackage.RISK_TYPE_PACKAGE__UNWANTED_INCIDENTS:
                return ((InternalEList<?>)getUnwantedIncidents()).basicRemove(otherEnd, msgs);
            case TypePackage.RISK_TYPE_PACKAGE__SCENARIOS:
                return ((InternalEList<?>)getScenarios()).basicRemove(otherEnd, msgs);
            case TypePackage.RISK_TYPE_PACKAGE__RISK_ASSESSMENTS:
                return ((InternalEList<?>)getRiskAssessments()).basicRemove(otherEnd, msgs);
            case TypePackage.RISK_TYPE_PACKAGE__COUNTERMEASURES:
                return ((InternalEList<?>)getCountermeasures()).basicRemove(otherEnd, msgs);
            case TypePackage.RISK_TYPE_PACKAGE__SUPER_PACKAGE:
                return basicSetSuperPackage(null, msgs);
            case TypePackage.RISK_TYPE_PACKAGE__SUB_PACKAGES:
                return ((InternalEList<?>)getSubPackages()).basicRemove(otherEnd, msgs);
            case TypePackage.RISK_TYPE_PACKAGE__MODEL:
                return basicSetModel(null, msgs);
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
            case TypePackage.RISK_TYPE_PACKAGE__SUPER_PACKAGE:
                return eInternalContainer().eInverseRemove(this, TypePackage.RISK_TYPE_PACKAGE__SUB_PACKAGES, RiskTypePackage.class, msgs);
            case TypePackage.RISK_TYPE_PACKAGE__MODEL:
                return eInternalContainer().eInverseRemove(this, RiskPackage.RISK_DESIGN_MODEL__PACKAGES, RiskDesignModel.class, msgs);
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
            case TypePackage.RISK_TYPE_PACKAGE__STAKEHOLDERS:
                return getStakeholders();
            case TypePackage.RISK_TYPE_PACKAGE__ASSETS:
                return getAssets();
            case TypePackage.RISK_TYPE_PACKAGE__THREATS:
                return getThreats();
            case TypePackage.RISK_TYPE_PACKAGE__VULNERABILITIES:
                return getVulnerabilities();
            case TypePackage.RISK_TYPE_PACKAGE__UNWANTED_INCIDENTS:
                return getUnwantedIncidents();
            case TypePackage.RISK_TYPE_PACKAGE__SCENARIOS:
                return getScenarios();
            case TypePackage.RISK_TYPE_PACKAGE__RISK_ASSESSMENTS:
                return getRiskAssessments();
            case TypePackage.RISK_TYPE_PACKAGE__COUNTERMEASURES:
                return getCountermeasures();
            case TypePackage.RISK_TYPE_PACKAGE__SUPER_PACKAGE:
                return getSuperPackage();
            case TypePackage.RISK_TYPE_PACKAGE__SUB_PACKAGES:
                return getSubPackages();
            case TypePackage.RISK_TYPE_PACKAGE__NAME:
                return getName();
            case TypePackage.RISK_TYPE_PACKAGE__MODEL:
                return getModel();
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
            case TypePackage.RISK_TYPE_PACKAGE__STAKEHOLDERS:
                getStakeholders().clear();
                getStakeholders().addAll((Collection<? extends Stakeholder>)newValue);
                return;
            case TypePackage.RISK_TYPE_PACKAGE__ASSETS:
                getAssets().clear();
                getAssets().addAll((Collection<? extends Asset>)newValue);
                return;
            case TypePackage.RISK_TYPE_PACKAGE__THREATS:
                getThreats().clear();
                getThreats().addAll((Collection<? extends Threat>)newValue);
                return;
            case TypePackage.RISK_TYPE_PACKAGE__VULNERABILITIES:
                getVulnerabilities().clear();
                getVulnerabilities().addAll((Collection<? extends Vulnerability>)newValue);
                return;
            case TypePackage.RISK_TYPE_PACKAGE__UNWANTED_INCIDENTS:
                getUnwantedIncidents().clear();
                getUnwantedIncidents().addAll((Collection<? extends IncidentType>)newValue);
                return;
            case TypePackage.RISK_TYPE_PACKAGE__SCENARIOS:
                getScenarios().clear();
                getScenarios().addAll((Collection<? extends ThreatScenario>)newValue);
                return;
            case TypePackage.RISK_TYPE_PACKAGE__RISK_ASSESSMENTS:
                getRiskAssessments().clear();
                getRiskAssessments().addAll((Collection<? extends RiskAssessment>)newValue);
                return;
            case TypePackage.RISK_TYPE_PACKAGE__COUNTERMEASURES:
                getCountermeasures().clear();
                getCountermeasures().addAll((Collection<? extends Countermeasure>)newValue);
                return;
            case TypePackage.RISK_TYPE_PACKAGE__SUPER_PACKAGE:
                setSuperPackage((RiskTypePackage)newValue);
                return;
            case TypePackage.RISK_TYPE_PACKAGE__SUB_PACKAGES:
                getSubPackages().clear();
                getSubPackages().addAll((Collection<? extends RiskTypePackage>)newValue);
                return;
            case TypePackage.RISK_TYPE_PACKAGE__NAME:
                setName((String)newValue);
                return;
            case TypePackage.RISK_TYPE_PACKAGE__MODEL:
                setModel((RiskDesignModel)newValue);
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
            case TypePackage.RISK_TYPE_PACKAGE__STAKEHOLDERS:
                getStakeholders().clear();
                return;
            case TypePackage.RISK_TYPE_PACKAGE__ASSETS:
                getAssets().clear();
                return;
            case TypePackage.RISK_TYPE_PACKAGE__THREATS:
                getThreats().clear();
                return;
            case TypePackage.RISK_TYPE_PACKAGE__VULNERABILITIES:
                getVulnerabilities().clear();
                return;
            case TypePackage.RISK_TYPE_PACKAGE__UNWANTED_INCIDENTS:
                getUnwantedIncidents().clear();
                return;
            case TypePackage.RISK_TYPE_PACKAGE__SCENARIOS:
                getScenarios().clear();
                return;
            case TypePackage.RISK_TYPE_PACKAGE__RISK_ASSESSMENTS:
                getRiskAssessments().clear();
                return;
            case TypePackage.RISK_TYPE_PACKAGE__COUNTERMEASURES:
                getCountermeasures().clear();
                return;
            case TypePackage.RISK_TYPE_PACKAGE__SUPER_PACKAGE:
                setSuperPackage((RiskTypePackage)null);
                return;
            case TypePackage.RISK_TYPE_PACKAGE__SUB_PACKAGES:
                getSubPackages().clear();
                return;
            case TypePackage.RISK_TYPE_PACKAGE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case TypePackage.RISK_TYPE_PACKAGE__MODEL:
                setModel((RiskDesignModel)null);
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
            case TypePackage.RISK_TYPE_PACKAGE__STAKEHOLDERS:
                return stakeholders != null && !stakeholders.isEmpty();
            case TypePackage.RISK_TYPE_PACKAGE__ASSETS:
                return assets != null && !assets.isEmpty();
            case TypePackage.RISK_TYPE_PACKAGE__THREATS:
                return threats != null && !threats.isEmpty();
            case TypePackage.RISK_TYPE_PACKAGE__VULNERABILITIES:
                return vulnerabilities != null && !vulnerabilities.isEmpty();
            case TypePackage.RISK_TYPE_PACKAGE__UNWANTED_INCIDENTS:
                return unwantedIncidents != null && !unwantedIncidents.isEmpty();
            case TypePackage.RISK_TYPE_PACKAGE__SCENARIOS:
                return scenarios != null && !scenarios.isEmpty();
            case TypePackage.RISK_TYPE_PACKAGE__RISK_ASSESSMENTS:
                return riskAssessments != null && !riskAssessments.isEmpty();
            case TypePackage.RISK_TYPE_PACKAGE__COUNTERMEASURES:
                return countermeasures != null && !countermeasures.isEmpty();
            case TypePackage.RISK_TYPE_PACKAGE__SUPER_PACKAGE:
                return getSuperPackage() != null;
            case TypePackage.RISK_TYPE_PACKAGE__SUB_PACKAGES:
                return subPackages != null && !subPackages.isEmpty();
            case TypePackage.RISK_TYPE_PACKAGE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case TypePackage.RISK_TYPE_PACKAGE__MODEL:
                return getModel() != null;
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
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //RiskTypePackageImpl
