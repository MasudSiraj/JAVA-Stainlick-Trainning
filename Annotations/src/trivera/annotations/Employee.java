package trivera.annotations;

import java.io.Serializable;

import trivera.annotations.writer.Identifier;
import trivera.annotations.writer.Persist;

/**
 * <p>
 * This component and its source code representation are copyright protected and
 * proprietary to Trivera Technologies, LLC, Worldwide D/B/A Trivera Technologies
 *
 * This component and source code may be used for instructional and evaluation
 * purposes only. No part of this component or its source code may be sold,
 * transferred, or publicly posted, nor may it be used in a commercial or
 * production environment, without the express written consent of the Trivera
 * Group, Inc.
 *
 * Copyright (c) 2018 Trivera Technologies, LLC http://www.triveratech.com
 * </p>
 * 
 * @author Trivera Technologies Tech Team.
 */
@Persist(filename = "employee")
public class Employee implements Serializable {
	private static final long serialVersionUID = 2619086449142429909L;
	private String employeeID;
	private String name;

	
	public Employee(){
		
	}
	
	
	public Employee(String employeeID, String name) {
		super();
		this.employeeID = employeeID;
		this.name = name;
	}


	@Identifier
	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
