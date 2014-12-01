/**
 */
package trust.instance.impl;

import java.util.Collection;
import models.variable.VariableAssignment;
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
import rule.condition.Atom;
import rule.condition.ConditionPackage;
import rule.condition.Operator;
import rule.template.Template;
import trust.instance.InstancePackage;
import trust.instance.TrustAssessmentOperator;
import trust.instance.TrustFusionOperator;
import trust.pattern.TrustDegreePattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trust Assessment Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trust.instance.impl.TrustAssessmentOperatorImpl#getVariableAssignments <em>Variable Assignments</em>}</li>
 *   <li>{@link trust.instance.impl.TrustAssessmentOperatorImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link trust.instance.impl.TrustAssessmentOperatorImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link trust.instance.impl.TrustAssessmentOperatorImpl#getOperands <em>Operands</em>}</li>
 *   <li>{@link trust.instance.impl.TrustAssessmentOperatorImpl#getTrustFusionOperator <em>Trust Fusion Operator</em>}</li>
 *   <li>{@link trust.instance.impl.TrustAssessmentOperatorImpl#getDegree <em>Degree</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrustAssessmentOperatorImpl extends TrustOperatorImpl implements TrustAssessmentOperator {
  /**
   * The cached value of the '{@link #getVariableAssignments() <em>Variable Assignments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableAssignments()
   * @generated
   * @ordered
   */
  protected EList<VariableAssignment> variableAssignments;

  /**
   * The cached value of the '{@link #getTemplate() <em>Template</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplate()
   * @generated
   * @ordered
   */
  protected Template template;

  /**
   * The cached value of the '{@link #getOperands() <em>Operands</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperands()
   * @generated
   * @ordered
   */
  protected EList<Atom> operands;

  /**
   * The cached value of the '{@link #getTrustFusionOperator() <em>Trust Fusion Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrustFusionOperator()
   * @generated
   * @ordered
   */
  protected TrustFusionOperator trustFusionOperator;

  /**
   * The cached value of the '{@link #getDegree() <em>Degree</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDegree()
   * @generated
   * @ordered
   */
  protected TrustDegreePattern degree;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrustAssessmentOperatorImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return InstancePackage.Literals.TRUST_ASSESSMENT_OPERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VariableAssignment> getVariableAssignments() {
    if (variableAssignments == null) {
      variableAssignments = new EObjectContainmentEList<VariableAssignment>(VariableAssignment.class, this, InstancePackage.TRUST_ASSESSMENT_OPERATOR__VARIABLE_ASSIGNMENTS);
    }
    return variableAssignments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operator getOperator() {
    if (eContainerFeatureID() != InstancePackage.TRUST_ASSESSMENT_OPERATOR__OPERATOR) return null;
    return (Operator)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperator(Operator newOperator, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newOperator, InstancePackage.TRUST_ASSESSMENT_OPERATOR__OPERATOR, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(Operator newOperator) {
    if (newOperator != eInternalContainer() || (eContainerFeatureID() != InstancePackage.TRUST_ASSESSMENT_OPERATOR__OPERATOR && newOperator != null)) {
      if (EcoreUtil.isAncestor(this, newOperator))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newOperator != null)
        msgs = ((InternalEObject)newOperator).eInverseAdd(this, ConditionPackage.OPERATOR__OPERANDS, Operator.class, msgs);
      msgs = basicSetOperator(newOperator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.TRUST_ASSESSMENT_OPERATOR__OPERATOR, newOperator, newOperator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Template getTemplate() {
    if (template != null && template.eIsProxy()) {
      InternalEObject oldTemplate = (InternalEObject)template;
      template = (Template)eResolveProxy(oldTemplate);
      if (template != oldTemplate) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.TRUST_ASSESSMENT_OPERATOR__TEMPLATE, oldTemplate, template));
      }
    }
    return template;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Template basicGetTemplate() {
    return template;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTemplate(Template newTemplate) {
    Template oldTemplate = template;
    template = newTemplate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.TRUST_ASSESSMENT_OPERATOR__TEMPLATE, oldTemplate, template));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Atom> getOperands() {
    if (operands == null) {
      operands = new EObjectContainmentWithInverseEList<Atom>(Atom.class, this, InstancePackage.TRUST_ASSESSMENT_OPERATOR__OPERANDS, ConditionPackage.ATOM__OPERATOR);
    }
    return operands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrustFusionOperator getTrustFusionOperator() {
    return trustFusionOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrustFusionOperator(TrustFusionOperator newTrustFusionOperator, NotificationChain msgs) {
    TrustFusionOperator oldTrustFusionOperator = trustFusionOperator;
    trustFusionOperator = newTrustFusionOperator;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.TRUST_ASSESSMENT_OPERATOR__TRUST_FUSION_OPERATOR, oldTrustFusionOperator, newTrustFusionOperator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrustFusionOperator(TrustFusionOperator newTrustFusionOperator) {
    if (newTrustFusionOperator != trustFusionOperator) {
      NotificationChain msgs = null;
      if (trustFusionOperator != null)
        msgs = ((InternalEObject)trustFusionOperator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.TRUST_ASSESSMENT_OPERATOR__TRUST_FUSION_OPERATOR, null, msgs);
      if (newTrustFusionOperator != null)
        msgs = ((InternalEObject)newTrustFusionOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.TRUST_ASSESSMENT_OPERATOR__TRUST_FUSION_OPERATOR, null, msgs);
      msgs = basicSetTrustFusionOperator(newTrustFusionOperator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.TRUST_ASSESSMENT_OPERATOR__TRUST_FUSION_OPERATOR, newTrustFusionOperator, newTrustFusionOperator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrustDegreePattern getDegree() {
    return degree;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDegree(TrustDegreePattern newDegree, NotificationChain msgs) {
    TrustDegreePattern oldDegree = degree;
    degree = newDegree;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.TRUST_ASSESSMENT_OPERATOR__DEGREE, oldDegree, newDegree);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDegree(TrustDegreePattern newDegree) {
    if (newDegree != degree) {
      NotificationChain msgs = null;
      if (degree != null)
        msgs = ((InternalEObject)degree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.TRUST_ASSESSMENT_OPERATOR__DEGREE, null, msgs);
      if (newDegree != null)
        msgs = ((InternalEObject)newDegree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstancePackage.TRUST_ASSESSMENT_OPERATOR__DEGREE, null, msgs);
      msgs = basicSetDegree(newDegree, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.TRUST_ASSESSMENT_OPERATOR__DEGREE, newDegree, newDegree));
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
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__OPERATOR:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetOperator((Operator)otherEnd, msgs);
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__OPERANDS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperands()).basicAdd(otherEnd, msgs);
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
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__VARIABLE_ASSIGNMENTS:
        return ((InternalEList<?>)getVariableAssignments()).basicRemove(otherEnd, msgs);
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__OPERATOR:
        return basicSetOperator(null, msgs);
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__OPERANDS:
        return ((InternalEList<?>)getOperands()).basicRemove(otherEnd, msgs);
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__TRUST_FUSION_OPERATOR:
        return basicSetTrustFusionOperator(null, msgs);
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__DEGREE:
        return basicSetDegree(null, msgs);
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
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__OPERATOR:
        return eInternalContainer().eInverseRemove(this, ConditionPackage.OPERATOR__OPERANDS, Operator.class, msgs);
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
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__VARIABLE_ASSIGNMENTS:
        return getVariableAssignments();
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__OPERATOR:
        return getOperator();
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__TEMPLATE:
        if (resolve) return getTemplate();
        return basicGetTemplate();
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__OPERANDS:
        return getOperands();
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__TRUST_FUSION_OPERATOR:
        return getTrustFusionOperator();
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__DEGREE:
        return getDegree();
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
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__VARIABLE_ASSIGNMENTS:
        getVariableAssignments().clear();
        getVariableAssignments().addAll((Collection<? extends VariableAssignment>)newValue);
        return;
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__OPERATOR:
        setOperator((Operator)newValue);
        return;
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__TEMPLATE:
        setTemplate((Template)newValue);
        return;
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__OPERANDS:
        getOperands().clear();
        getOperands().addAll((Collection<? extends Atom>)newValue);
        return;
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__TRUST_FUSION_OPERATOR:
        setTrustFusionOperator((TrustFusionOperator)newValue);
        return;
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__DEGREE:
        setDegree((TrustDegreePattern)newValue);
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
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__VARIABLE_ASSIGNMENTS:
        getVariableAssignments().clear();
        return;
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__OPERATOR:
        setOperator((Operator)null);
        return;
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__TEMPLATE:
        setTemplate((Template)null);
        return;
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__OPERANDS:
        getOperands().clear();
        return;
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__TRUST_FUSION_OPERATOR:
        setTrustFusionOperator((TrustFusionOperator)null);
        return;
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__DEGREE:
        setDegree((TrustDegreePattern)null);
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
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__VARIABLE_ASSIGNMENTS:
        return variableAssignments != null && !variableAssignments.isEmpty();
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__OPERATOR:
        return getOperator() != null;
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__TEMPLATE:
        return template != null;
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__OPERANDS:
        return operands != null && !operands.isEmpty();
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__TRUST_FUSION_OPERATOR:
        return trustFusionOperator != null;
      case InstancePackage.TRUST_ASSESSMENT_OPERATOR__DEGREE:
        return degree != null;
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
    if (baseClass == Atom.class) {
      switch (derivedFeatureID) {
        case InstancePackage.TRUST_ASSESSMENT_OPERATOR__VARIABLE_ASSIGNMENTS: return ConditionPackage.ATOM__VARIABLE_ASSIGNMENTS;
        case InstancePackage.TRUST_ASSESSMENT_OPERATOR__OPERATOR: return ConditionPackage.ATOM__OPERATOR;
        case InstancePackage.TRUST_ASSESSMENT_OPERATOR__TEMPLATE: return ConditionPackage.ATOM__TEMPLATE;
        default: return -1;
      }
    }
    if (baseClass == Operator.class) {
      switch (derivedFeatureID) {
        case InstancePackage.TRUST_ASSESSMENT_OPERATOR__OPERANDS: return ConditionPackage.OPERATOR__OPERANDS;
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
    if (baseClass == Atom.class) {
      switch (baseFeatureID) {
        case ConditionPackage.ATOM__VARIABLE_ASSIGNMENTS: return InstancePackage.TRUST_ASSESSMENT_OPERATOR__VARIABLE_ASSIGNMENTS;
        case ConditionPackage.ATOM__OPERATOR: return InstancePackage.TRUST_ASSESSMENT_OPERATOR__OPERATOR;
        case ConditionPackage.ATOM__TEMPLATE: return InstancePackage.TRUST_ASSESSMENT_OPERATOR__TEMPLATE;
        default: return -1;
      }
    }
    if (baseClass == Operator.class) {
      switch (baseFeatureID) {
        case ConditionPackage.OPERATOR__OPERANDS: return InstancePackage.TRUST_ASSESSMENT_OPERATOR__OPERANDS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //TrustAssessmentOperatorImpl
