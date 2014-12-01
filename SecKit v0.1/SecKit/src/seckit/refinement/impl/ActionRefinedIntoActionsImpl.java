/**
 */
package seckit.refinement.impl;

import behavior.causality.CausalityRelation;

import behavior.instantiation.ActionInstantiation;
import behavior.instantiation.InteractionContributionInstantiation;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import seckit.refinement.ActionRefinedIntoActions;
import seckit.refinement.RefinementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Refined Into Actions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link seckit.refinement.impl.ActionRefinedIntoActionsImpl#getConcreteInteractions <em>Concrete Interactions</em>}</li>
 *   <li>{@link seckit.refinement.impl.ActionRefinedIntoActionsImpl#getConcreteActions <em>Concrete Actions</em>}</li>
 *   <li>{@link seckit.refinement.impl.ActionRefinedIntoActionsImpl#getConcreteRelations <em>Concrete Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionRefinedIntoActionsImpl extends ActionRefinementImpl implements ActionRefinedIntoActions {
    /**
     * The cached value of the '{@link #getConcreteInteractions() <em>Concrete Interactions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConcreteInteractions()
     * @generated
     * @ordered
     */
    protected EList<InteractionContributionInstantiation> concreteInteractions;

    /**
     * The cached value of the '{@link #getConcreteActions() <em>Concrete Actions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConcreteActions()
     * @generated
     * @ordered
     */
    protected EList<ActionInstantiation> concreteActions;

    /**
     * The cached value of the '{@link #getConcreteRelations() <em>Concrete Relations</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConcreteRelations()
     * @generated
     * @ordered
     */
    protected EList<CausalityRelation> concreteRelations;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActionRefinedIntoActionsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RefinementPackage.Literals.ACTION_REFINED_INTO_ACTIONS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InteractionContributionInstantiation> getConcreteInteractions() {
        if (concreteInteractions == null) {
            concreteInteractions = new EObjectResolvingEList<InteractionContributionInstantiation>(InteractionContributionInstantiation.class, this, RefinementPackage.ACTION_REFINED_INTO_ACTIONS__CONCRETE_INTERACTIONS);
        }
        return concreteInteractions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ActionInstantiation> getConcreteActions() {
        if (concreteActions == null) {
            concreteActions = new EObjectResolvingEList<ActionInstantiation>(ActionInstantiation.class, this, RefinementPackage.ACTION_REFINED_INTO_ACTIONS__CONCRETE_ACTIONS);
        }
        return concreteActions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CausalityRelation> getConcreteRelations() {
        if (concreteRelations == null) {
            concreteRelations = new EObjectResolvingEList<CausalityRelation>(CausalityRelation.class, this, RefinementPackage.ACTION_REFINED_INTO_ACTIONS__CONCRETE_RELATIONS);
        }
        return concreteRelations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RefinementPackage.ACTION_REFINED_INTO_ACTIONS__CONCRETE_INTERACTIONS:
                return getConcreteInteractions();
            case RefinementPackage.ACTION_REFINED_INTO_ACTIONS__CONCRETE_ACTIONS:
                return getConcreteActions();
            case RefinementPackage.ACTION_REFINED_INTO_ACTIONS__CONCRETE_RELATIONS:
                return getConcreteRelations();
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
            case RefinementPackage.ACTION_REFINED_INTO_ACTIONS__CONCRETE_INTERACTIONS:
                getConcreteInteractions().clear();
                getConcreteInteractions().addAll((Collection<? extends InteractionContributionInstantiation>)newValue);
                return;
            case RefinementPackage.ACTION_REFINED_INTO_ACTIONS__CONCRETE_ACTIONS:
                getConcreteActions().clear();
                getConcreteActions().addAll((Collection<? extends ActionInstantiation>)newValue);
                return;
            case RefinementPackage.ACTION_REFINED_INTO_ACTIONS__CONCRETE_RELATIONS:
                getConcreteRelations().clear();
                getConcreteRelations().addAll((Collection<? extends CausalityRelation>)newValue);
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
            case RefinementPackage.ACTION_REFINED_INTO_ACTIONS__CONCRETE_INTERACTIONS:
                getConcreteInteractions().clear();
                return;
            case RefinementPackage.ACTION_REFINED_INTO_ACTIONS__CONCRETE_ACTIONS:
                getConcreteActions().clear();
                return;
            case RefinementPackage.ACTION_REFINED_INTO_ACTIONS__CONCRETE_RELATIONS:
                getConcreteRelations().clear();
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
            case RefinementPackage.ACTION_REFINED_INTO_ACTIONS__CONCRETE_INTERACTIONS:
                return concreteInteractions != null && !concreteInteractions.isEmpty();
            case RefinementPackage.ACTION_REFINED_INTO_ACTIONS__CONCRETE_ACTIONS:
                return concreteActions != null && !concreteActions.isEmpty();
            case RefinementPackage.ACTION_REFINED_INTO_ACTIONS__CONCRETE_RELATIONS:
                return concreteRelations != null && !concreteRelations.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ActionRefinedIntoActionsImpl
