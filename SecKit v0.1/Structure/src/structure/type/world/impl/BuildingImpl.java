/**
 */
package structure.type.world.impl;

import org.eclipse.emf.ecore.EClass;

import structure.type.world.Building;
import structure.type.world.WorldPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Building</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class BuildingImpl extends PhysicalContainerEntityImpl implements Building {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BuildingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return WorldPackage.Literals.BUILDING;
    }

} //BuildingImpl
