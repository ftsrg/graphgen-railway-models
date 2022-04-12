/**
 */
package railwaypackage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import railwaypackage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RailwaypackageFactoryImpl extends EFactoryImpl implements RailwaypackageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RailwaypackageFactory init() {
		try {
			RailwaypackageFactory theRailwaypackageFactory = (RailwaypackageFactory)EPackage.Registry.INSTANCE.getEFactory(RailwaypackagePackage.eNS_URI);
			if (theRailwaypackageFactory != null) {
				return theRailwaypackageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RailwaypackageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailwaypackageFactoryImpl() {
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
			case RailwaypackagePackage.RAILWAY_LAYOUT: return createRailwayLayout();
			case RailwaypackagePackage.SEGMENT: return createSegment();
			case RailwaypackagePackage.TURNOUT: return createTurnout();
			case RailwaypackagePackage.SIGNAL: return createSignal();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RailwayLayout createRailwayLayout() {
		RailwayLayoutImpl railwayLayout = new RailwayLayoutImpl();
		return railwayLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Segment createSegment() {
		SegmentImpl segment = new SegmentImpl();
		return segment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Turnout createTurnout() {
		TurnoutImpl turnout = new TurnoutImpl();
		return turnout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal createSignal() {
		SignalImpl signal = new SignalImpl();
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RailwaypackagePackage getRailwaypackagePackage() {
		return (RailwaypackagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RailwaypackagePackage getPackage() {
		return RailwaypackagePackage.eINSTANCE;
	}

} //RailwaypackageFactoryImpl
