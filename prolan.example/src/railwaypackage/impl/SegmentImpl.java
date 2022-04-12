/**
 */
package railwaypackage.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import railwaypackage.RailwayElement;
import railwaypackage.RailwaypackagePackage;
import railwaypackage.Segment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link railwaypackage.impl.SegmentImpl#getConnected <em>Connected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SegmentImpl extends RailwayElementImpl implements Segment {
	/**
	 * The cached value of the '{@link #getConnected() <em>Connected</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnected()
	 * @generated
	 * @ordered
	 */
	protected EList<RailwayElement> connected;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RailwaypackagePackage.Literals.SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RailwayElement> getConnected() {
		if (connected == null) {
			connected = new EObjectResolvingEList<RailwayElement>(RailwayElement.class, this, RailwaypackagePackage.SEGMENT__CONNECTED);
		}
		return connected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RailwaypackagePackage.SEGMENT__CONNECTED:
				return getConnected();
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
			case RailwaypackagePackage.SEGMENT__CONNECTED:
				getConnected().clear();
				getConnected().addAll((Collection<? extends RailwayElement>)newValue);
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
			case RailwaypackagePackage.SEGMENT__CONNECTED:
				getConnected().clear();
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
			case RailwaypackagePackage.SEGMENT__CONNECTED:
				return connected != null && !connected.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SegmentImpl
