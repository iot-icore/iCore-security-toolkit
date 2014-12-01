/**
 */
package data.type.impl;

import data.instance.impl.AddressImpl;

import data.type.MemoryAddress;
import data.type.TypePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MemoryAddressImpl extends AddressImpl implements MemoryAddress {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MemoryAddressImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.MEMORY_ADDRESS;
    }

} //MemoryAddressImpl
