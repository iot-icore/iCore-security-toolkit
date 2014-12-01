/**
 */
package structure.address.impl;

import org.eclipse.emf.ecore.EClass;

import structure.address.AddressPackage;
import structure.address.IpAddress;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ip Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IpAddressImpl extends AddressTypeImpl implements IpAddress {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IpAddressImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AddressPackage.Literals.IP_ADDRESS;
    }

} //IpAddressImpl
