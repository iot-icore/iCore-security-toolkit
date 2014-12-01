/**
 */
package rule.template.impl;

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

import rule.RuleDesignModel;
import rule.RulePackage;

import rule.condition.FormulaTemplate;

import rule.template.RuleTemplate;
import rule.template.RuleTemplateConfiguration;
import rule.template.RuleTemplatePackage;
import rule.template.TemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Template Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.template.impl.RuleTemplatePackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link rule.template.impl.RuleTemplatePackageImpl#getTemplates <em>Templates</em>}</li>
 *   <li>{@link rule.template.impl.RuleTemplatePackageImpl#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link rule.template.impl.RuleTemplatePackageImpl#getFormulaTemplates <em>Formula Templates</em>}</li>
 *   <li>{@link rule.template.impl.RuleTemplatePackageImpl#getModel <em>Model</em>}</li>
 *   <li>{@link rule.template.impl.RuleTemplatePackageImpl#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleTemplatePackageImpl extends ElementImpl implements RuleTemplatePackage {
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
     * The cached value of the '{@link #getTemplates() <em>Templates</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTemplates()
     * @generated
     * @ordered
     */
    protected EList<RuleTemplate> templates;

    /**
     * The cached value of the '{@link #getSubPackages() <em>Sub Packages</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubPackages()
     * @generated
     * @ordered
     */
    protected EList<RuleTemplatePackage> subPackages;

    /**
     * The cached value of the '{@link #getFormulaTemplates() <em>Formula Templates</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFormulaTemplates()
     * @generated
     * @ordered
     */
    protected EList<FormulaTemplate> formulaTemplates;

    /**
     * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigurations()
     * @generated
     * @ordered
     */
    protected EList<RuleTemplateConfiguration> configurations;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RuleTemplatePackageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TemplatePackage.Literals.RULE_TEMPLATE_PACKAGE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_TEMPLATE_PACKAGE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RuleTemplate> getTemplates() {
        if (templates == null) {
            templates = new EObjectContainmentWithInverseEList<RuleTemplate>(RuleTemplate.class, this, TemplatePackage.RULE_TEMPLATE_PACKAGE__TEMPLATES, TemplatePackage.RULE_TEMPLATE__PACKAGE);
        }
        return templates;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RuleTemplatePackage> getSubPackages() {
        if (subPackages == null) {
            subPackages = new EObjectContainmentEList<RuleTemplatePackage>(RuleTemplatePackage.class, this, TemplatePackage.RULE_TEMPLATE_PACKAGE__SUB_PACKAGES);
        }
        return subPackages;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FormulaTemplate> getFormulaTemplates() {
        if (formulaTemplates == null) {
            formulaTemplates = new EObjectContainmentEList<FormulaTemplate>(FormulaTemplate.class, this, TemplatePackage.RULE_TEMPLATE_PACKAGE__FORMULA_TEMPLATES);
        }
        return formulaTemplates;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuleDesignModel getModel() {
        if (eContainerFeatureID() != TemplatePackage.RULE_TEMPLATE_PACKAGE__MODEL) return null;
        return (RuleDesignModel)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetModel(RuleDesignModel newModel, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newModel, TemplatePackage.RULE_TEMPLATE_PACKAGE__MODEL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModel(RuleDesignModel newModel) {
        if (newModel != eInternalContainer() || (eContainerFeatureID() != TemplatePackage.RULE_TEMPLATE_PACKAGE__MODEL && newModel != null)) {
            if (EcoreUtil.isAncestor(this, newModel))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newModel != null)
                msgs = ((InternalEObject)newModel).eInverseAdd(this, RulePackage.RULE_DESIGN_MODEL__PACKAGES, RuleDesignModel.class, msgs);
            msgs = basicSetModel(newModel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TemplatePackage.RULE_TEMPLATE_PACKAGE__MODEL, newModel, newModel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RuleTemplateConfiguration> getConfigurations() {
        if (configurations == null) {
            configurations = new EObjectContainmentWithInverseEList<RuleTemplateConfiguration>(RuleTemplateConfiguration.class, this, TemplatePackage.RULE_TEMPLATE_PACKAGE__CONFIGURATIONS, TemplatePackage.RULE_TEMPLATE_CONFIGURATION__PACKAGE);
        }
        return configurations;
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
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__TEMPLATES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getTemplates()).basicAdd(otherEnd, msgs);
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__MODEL:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetModel((RuleDesignModel)otherEnd, msgs);
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__CONFIGURATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getConfigurations()).basicAdd(otherEnd, msgs);
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
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__TEMPLATES:
                return ((InternalEList<?>)getTemplates()).basicRemove(otherEnd, msgs);
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__SUB_PACKAGES:
                return ((InternalEList<?>)getSubPackages()).basicRemove(otherEnd, msgs);
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__FORMULA_TEMPLATES:
                return ((InternalEList<?>)getFormulaTemplates()).basicRemove(otherEnd, msgs);
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__MODEL:
                return basicSetModel(null, msgs);
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__CONFIGURATIONS:
                return ((InternalEList<?>)getConfigurations()).basicRemove(otherEnd, msgs);
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
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__MODEL:
                return eInternalContainer().eInverseRemove(this, RulePackage.RULE_DESIGN_MODEL__PACKAGES, RuleDesignModel.class, msgs);
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
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__NAME:
                return getName();
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__TEMPLATES:
                return getTemplates();
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__SUB_PACKAGES:
                return getSubPackages();
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__FORMULA_TEMPLATES:
                return getFormulaTemplates();
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__MODEL:
                return getModel();
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__CONFIGURATIONS:
                return getConfigurations();
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
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__NAME:
                setName((String)newValue);
                return;
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__TEMPLATES:
                getTemplates().clear();
                getTemplates().addAll((Collection<? extends RuleTemplate>)newValue);
                return;
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__SUB_PACKAGES:
                getSubPackages().clear();
                getSubPackages().addAll((Collection<? extends RuleTemplatePackage>)newValue);
                return;
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__FORMULA_TEMPLATES:
                getFormulaTemplates().clear();
                getFormulaTemplates().addAll((Collection<? extends FormulaTemplate>)newValue);
                return;
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__MODEL:
                setModel((RuleDesignModel)newValue);
                return;
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__CONFIGURATIONS:
                getConfigurations().clear();
                getConfigurations().addAll((Collection<? extends RuleTemplateConfiguration>)newValue);
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
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__TEMPLATES:
                getTemplates().clear();
                return;
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__SUB_PACKAGES:
                getSubPackages().clear();
                return;
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__FORMULA_TEMPLATES:
                getFormulaTemplates().clear();
                return;
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__MODEL:
                setModel((RuleDesignModel)null);
                return;
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__CONFIGURATIONS:
                getConfigurations().clear();
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
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__TEMPLATES:
                return templates != null && !templates.isEmpty();
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__SUB_PACKAGES:
                return subPackages != null && !subPackages.isEmpty();
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__FORMULA_TEMPLATES:
                return formulaTemplates != null && !formulaTemplates.isEmpty();
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__MODEL:
                return getModel() != null;
            case TemplatePackage.RULE_TEMPLATE_PACKAGE__CONFIGURATIONS:
                return configurations != null && !configurations.isEmpty();
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

} //RuleTemplatePackageImpl
