/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sebastien Minguet (Mia-Software) - initial API and implementation
 *     Frederic Madiot (Mia-Software) - initial API and implementation
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - initial API and implementation
 *     Erwan Breton (Sodifrance) - initial API and implementation
 *     Romain Dervaux (Mia-Software) - initial API and implementation
 */
package org.eclipse.gmt.modisco.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PackageAccess#getPackage <em>Package</em>}</li>
 *   <li>{@link PackageAccess#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gmt.modisco.java.meta.JavaPackage#getPackageAccess()
 * @model
 * @generated
 */
public interface PackageAccess extends NamespaceAccess {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Package#getUsagesInPackageAccess <em>Usages In Package Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(Package)
	 * @see org.eclipse.gmt.modisco.java.meta.JavaPackage#getPackageAccess_Package()
	 * @see Package#getUsagesInPackageAccess
	 * @model opposite="usagesInPackageAccess" required="true" ordered="false"
	 * @generated
	 */
	Package getPackage();

	/**
	 * Sets the value of the '{@link PackageAccess#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(Package value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference.
	 * @see #setQualifier(PackageAccess)
	 * @see org.eclipse.gmt.modisco.java.meta.JavaPackage#getPackageAccess_Qualifier()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	PackageAccess getQualifier();

	/**
	 * Sets the value of the '{@link PackageAccess#getQualifier <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' containment reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(PackageAccess value);

} // PackageAccess
