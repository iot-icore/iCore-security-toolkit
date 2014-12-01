/**
 */
package structure.type.world.impl;

import org.eclipse.emf.ecore.EClass;

import structure.type.world.Person;
import structure.type.world.WorldPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class PersonImpl extends PointEntityImpl implements Person {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PersonImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return WorldPackage.Literals.PERSON;
    }

} //PersonImpl
