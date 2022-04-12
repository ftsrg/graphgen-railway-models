/**
 */
package railwaypackage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import railwaypackage.RailwayElement;
import railwaypackage.RailwaypackagePackage;
import railwaypackage.Turnout;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turnout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link railwaypackage.impl.TurnoutImpl#getFrom <em>From</em>}</li>
 *   <li>{@link railwaypackage.impl.TurnoutImpl#getStraight <em>Straight</em>}</li>
 *   <li>{@link railwaypackage.impl.TurnoutImpl#getDivergent <em>Divergent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TurnoutImpl extends RailwayElementImpl implements Turnout {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected RailwayElement from;

	/**
	 * The cached value of the '{@link #getStraight() <em>Straight</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStraight()
	 * @generated
	 * @ordered
	 */
	protected RailwayElement straight;

	/**
	 * The cached value of the '{@link #getDivergent() <em>Divergent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDivergent()
	 * @generated
	 * @ordered
	 */
	protected RailwayElement divergent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurnoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RailwaypackagePackage.Literals.TURNOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RailwayElement getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (RailwayElement)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RailwaypackagePackage.TURNOUT__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailwayElement basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrom(RailwayElement newFrom) {
		RailwayElement oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailwaypackagePackage.TURNOUT__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RailwayElement getStraight() {
		if (straight != null && straight.eIsProxy()) {
			InternalEObject oldStraight = (InternalEObject)straight;
			straight = (RailwayElement)eResolveProxy(oldStraight);
			if (straight != oldStraight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RailwaypackagePackage.TURNOUT__STRAIGHT, oldStraight, straight));
			}
		}
		return straight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailwayElement basicGetStraight() {
		return straight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStraight(RailwayElement newStraight) {
		RailwayElement oldStraight = straight;
		straight = newStraight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailwaypackagePackage.TURNOUT__STRAIGHT, oldStraight, straight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RailwayElement getDivergent() {
		if (divergent != null && divergent.eIsProxy()) {
			InternalEObject oldDivergent = (InternalEObject)divergent;
			divergent = (RailwayElement)eResolveProxy(oldDivergent);
			if (divergent != oldDivergent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RailwaypackagePackage.TURNOUT__DIVERGENT, oldDivergent, divergent));
			}
		}
		return divergent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailwayElement basicGetDivergent() {
		return divergent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDivergent(RailwayElement newDivergent) {
		RailwayElement oldDivergent = divergent;
		divergent = newDivergent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RailwaypackagePackage.TURNOUT__DIVERGENT, oldDivergent, divergent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RailwaypackagePackage.TURNOUT__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case RailwaypackagePackage.TURNOUT__STRAIGHT:
				if (resolve) return getStraight();
				return basicGetStraight();
			case RailwaypackagePackage.TURNOUT__DIVERGENT:
				if (resolve) return getDivergent();
				return basicGetDivergent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RailwaypackagePackage.TURNOUT__FROM:
				setFrom((RailwayElement)newValue);
				return;
			case RailwaypackagePackage.TURNOUT__STRAIGHT:
				setStraight((RailwayElement)newValue);
				return;
			case RailwaypackagePackage.TURNOUT__DIVERGENT:
				setDivergent((RailwayElement)newValue);
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
			case RailwaypackagePackage.TURNOUT__FROM:
				setFrom((RailwayElement)null);
				return;
			case RailwaypackagePackage.TURNOUT__STRAIGHT:
				setStraight((RailwayElement)null);
				return;
			case RailwaypackagePackage.TURNOUT__DIVERGENT:
				setDivergent((RailwayElement)null);
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
			case RailwaypackagePackage.TURNOUT__FROM:
				return from != null;
			case RailwaypackagePackage.TURNOUT__STRAIGHT:
				return straight != null;
			case RailwaypackagePackage.TURNOUT__DIVERGENT:
				return divergent != null;
		}
		return super.eIsSet(featureID);
	}

} //TurnoutImpl
