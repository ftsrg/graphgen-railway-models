/**
 */
package railwaypackage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link railwaypackage.Segment#getConnected <em>Connected</em>}</li>
 * </ul>
 *
 * @see railwaypackage.RailwaypackagePackage#getSegment()
 * @model
 * @generated
 */
public interface Segment extends RailwayElement {
	/**
	 * Returns the value of the '<em><b>Connected</b></em>' reference list.
	 * The list contents are of type {@link railwaypackage.RailwayElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected</em>' reference list.
	 * @see railwaypackage.RailwaypackagePackage#getSegment_Connected()
	 * @model upper="2"
	 * @generated
	 */
	EList<RailwayElement> getConnected();

} // Segment
