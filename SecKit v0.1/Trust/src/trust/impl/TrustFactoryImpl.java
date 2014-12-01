/**
 */
package trust.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import trust.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrustFactoryImpl extends EFactoryImpl implements TrustFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TrustFactory init() {
    try {
      TrustFactory theTrustFactory = (TrustFactory)EPackage.Registry.INSTANCE.getEFactory(TrustPackage.eNS_URI);
      if (theTrustFactory != null) {
        return theTrustFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TrustFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrustFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case TrustPackage.TRUST_RUNTIME_MODEL: return createTrustRuntimeModel();
      case TrustPackage.TRUST_DESIGN_MODEL: return createTrustDesignModel();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrustRuntimeModel createTrustRuntimeModel() {
    TrustRuntimeModelImpl trustRuntimeModel = new TrustRuntimeModelImpl();
    return trustRuntimeModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrustDesignModel createTrustDesignModel() {
    TrustDesignModelImpl trustDesignModel = new TrustDesignModelImpl();
    return trustDesignModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrustPackage getTrustPackage() {
    return (TrustPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TrustPackage getPackage() {
    return TrustPackage.eINSTANCE;
  }

} //TrustFactoryImpl
