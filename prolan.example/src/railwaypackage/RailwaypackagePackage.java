/**
 */
package railwaypackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see railwaypackage.RailwaypackageFactory
 * @model kind="package"
 * @generated
 */
public interface RailwaypackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "railwaypackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "prolan.example.railwaypackage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "railwaypackage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RailwaypackagePackage eINSTANCE = railwaypackage.impl.RailwaypackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link railwaypackage.impl.RailwayLayoutImpl <em>Railway Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see railwaypackage.impl.RailwayLayoutImpl
	 * @see railwaypackage.impl.RailwaypackagePackageImpl#getRailwayLayout()
	 * @generated
	 */
	int RAILWAY_LAYOUT = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_LAYOUT__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_LAYOUT__START = 1;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_LAYOUT__FINISH = 2;

	/**
	 * The number of structural features of the '<em>Railway Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_LAYOUT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Railway Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_LAYOUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link railwaypackage.impl.RailwayElementImpl <em>Railway Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see railwaypackage.impl.RailwayElementImpl
	 * @see railwaypackage.impl.RailwaypackagePackageImpl#getRailwayElement()
	 * @generated
	 */
	int RAILWAY_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_ELEMENT__LENGTH = 0;

	/**
	 * The number of structural features of the '<em>Railway Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Railway Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link railwaypackage.impl.SegmentImpl <em>Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see railwaypackage.impl.SegmentImpl
	 * @see railwaypackage.impl.RailwaypackagePackageImpl#getSegment()
	 * @generated
	 */
	int SEGMENT = 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__LENGTH = RAILWAY_ELEMENT__LENGTH;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__CONNECTED = RAILWAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_FEATURE_COUNT = RAILWAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_OPERATION_COUNT = RAILWAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link railwaypackage.impl.TurnoutImpl <em>Turnout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see railwaypackage.impl.TurnoutImpl
	 * @see railwaypackage.impl.RailwaypackagePackageImpl#getTurnout()
	 * @generated
	 */
	int TURNOUT = 2;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT__LENGTH = RAILWAY_ELEMENT__LENGTH;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT__FROM = RAILWAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Straight</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT__STRAIGHT = RAILWAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Divergent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT__DIVERGENT = RAILWAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Turnout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_FEATURE_COUNT = RAILWAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Turnout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNOUT_OPERATION_COUNT = RAILWAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link railwaypackage.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see railwaypackage.impl.SignalImpl
	 * @see railwaypackage.impl.RailwaypackagePackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 4;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__LENGTH = RAILWAY_ELEMENT__LENGTH;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__CONNECTED = RAILWAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = RAILWAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OPERATION_COUNT = RAILWAY_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link railwaypackage.RailwayLayout <em>Railway Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Railway Layout</em>'.
	 * @see railwaypackage.RailwayLayout
	 * @generated
	 */
	EClass getRailwayLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link railwaypackage.RailwayLayout#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see railwaypackage.RailwayLayout#getElements()
	 * @see #getRailwayLayout()
	 * @generated
	 */
	EReference getRailwayLayout_Elements();

	/**
	 * Returns the meta object for the containment reference '{@link railwaypackage.RailwayLayout#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see railwaypackage.RailwayLayout#getStart()
	 * @see #getRailwayLayout()
	 * @generated
	 */
	EReference getRailwayLayout_Start();

	/**
	 * Returns the meta object for the containment reference '{@link railwaypackage.RailwayLayout#getFinish <em>Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Finish</em>'.
	 * @see railwaypackage.RailwayLayout#getFinish()
	 * @see #getRailwayLayout()
	 * @generated
	 */
	EReference getRailwayLayout_Finish();

	/**
	 * Returns the meta object for class '{@link railwaypackage.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment</em>'.
	 * @see railwaypackage.Segment
	 * @generated
	 */
	EClass getSegment();

	/**
	 * Returns the meta object for the reference list '{@link railwaypackage.Segment#getConnected <em>Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected</em>'.
	 * @see railwaypackage.Segment#getConnected()
	 * @see #getSegment()
	 * @generated
	 */
	EReference getSegment_Connected();

	/**
	 * Returns the meta object for class '{@link railwaypackage.Turnout <em>Turnout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turnout</em>'.
	 * @see railwaypackage.Turnout
	 * @generated
	 */
	EClass getTurnout();

	/**
	 * Returns the meta object for the reference '{@link railwaypackage.Turnout#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see railwaypackage.Turnout#getFrom()
	 * @see #getTurnout()
	 * @generated
	 */
	EReference getTurnout_From();

	/**
	 * Returns the meta object for the reference '{@link railwaypackage.Turnout#getStraight <em>Straight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Straight</em>'.
	 * @see railwaypackage.Turnout#getStraight()
	 * @see #getTurnout()
	 * @generated
	 */
	EReference getTurnout_Straight();

	/**
	 * Returns the meta object for the reference '{@link railwaypackage.Turnout#getDivergent <em>Divergent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Divergent</em>'.
	 * @see railwaypackage.Turnout#getDivergent()
	 * @see #getTurnout()
	 * @generated
	 */
	EReference getTurnout_Divergent();

	/**
	 * Returns the meta object for class '{@link railwaypackage.RailwayElement <em>Railway Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Railway Element</em>'.
	 * @see railwaypackage.RailwayElement
	 * @generated
	 */
	EClass getRailwayElement();

	/**
	 * Returns the meta object for the attribute '{@link railwaypackage.RailwayElement#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see railwaypackage.RailwayElement#getLength()
	 * @see #getRailwayElement()
	 * @generated
	 */
	EAttribute getRailwayElement_Length();

	/**
	 * Returns the meta object for class '{@link railwaypackage.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see railwaypackage.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the meta object for the reference '{@link railwaypackage.Signal#getConnected <em>Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connected</em>'.
	 * @see railwaypackage.Signal#getConnected()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_Connected();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RailwaypackageFactory getRailwaypackageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link railwaypackage.impl.RailwayLayoutImpl <em>Railway Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see railwaypackage.impl.RailwayLayoutImpl
		 * @see railwaypackage.impl.RailwaypackagePackageImpl#getRailwayLayout()
		 * @generated
		 */
		EClass RAILWAY_LAYOUT = eINSTANCE.getRailwayLayout();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILWAY_LAYOUT__ELEMENTS = eINSTANCE.getRailwayLayout_Elements();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILWAY_LAYOUT__START = eINSTANCE.getRailwayLayout_Start();

		/**
		 * The meta object literal for the '<em><b>Finish</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILWAY_LAYOUT__FINISH = eINSTANCE.getRailwayLayout_Finish();

		/**
		 * The meta object literal for the '{@link railwaypackage.impl.SegmentImpl <em>Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see railwaypackage.impl.SegmentImpl
		 * @see railwaypackage.impl.RailwaypackagePackageImpl#getSegment()
		 * @generated
		 */
		EClass SEGMENT = eINSTANCE.getSegment();

		/**
		 * The meta object literal for the '<em><b>Connected</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT__CONNECTED = eINSTANCE.getSegment_Connected();

		/**
		 * The meta object literal for the '{@link railwaypackage.impl.TurnoutImpl <em>Turnout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see railwaypackage.impl.TurnoutImpl
		 * @see railwaypackage.impl.RailwaypackagePackageImpl#getTurnout()
		 * @generated
		 */
		EClass TURNOUT = eINSTANCE.getTurnout();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNOUT__FROM = eINSTANCE.getTurnout_From();

		/**
		 * The meta object literal for the '<em><b>Straight</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNOUT__STRAIGHT = eINSTANCE.getTurnout_Straight();

		/**
		 * The meta object literal for the '<em><b>Divergent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNOUT__DIVERGENT = eINSTANCE.getTurnout_Divergent();

		/**
		 * The meta object literal for the '{@link railwaypackage.impl.RailwayElementImpl <em>Railway Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see railwaypackage.impl.RailwayElementImpl
		 * @see railwaypackage.impl.RailwaypackagePackageImpl#getRailwayElement()
		 * @generated
		 */
		EClass RAILWAY_ELEMENT = eINSTANCE.getRailwayElement();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAILWAY_ELEMENT__LENGTH = eINSTANCE.getRailwayElement_Length();

		/**
		 * The meta object literal for the '{@link railwaypackage.impl.SignalImpl <em>Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see railwaypackage.impl.SignalImpl
		 * @see railwaypackage.impl.RailwaypackagePackageImpl#getSignal()
		 * @generated
		 */
		EClass SIGNAL = eINSTANCE.getSignal();

		/**
		 * The meta object literal for the '<em><b>Connected</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__CONNECTED = eINSTANCE.getSignal_Connected();

	}

} //RailwaypackagePackage
