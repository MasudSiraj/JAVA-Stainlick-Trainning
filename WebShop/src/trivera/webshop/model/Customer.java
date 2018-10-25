package trivera.webshop.model;

import java.util.Date;


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
 * Copyright (c) 2018 Trivera Technologies, LLC. http://www.triveratech.com
 * 
 * </p>
 * 
 * @author Trivera Technologies Tech Team.
 */
public class Customer {
	private String customerID;
	private String firstName;
	private String familyName;
	private String email;
	private Date dateOfBirth;

	
	public Customer(String id) {
		super();
		this.customerID = id;
	}
	
	public String getCustomerID() {
		return customerID;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFamilyName() {
		return familyName;
	}
	
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	
	public long getCustomerAge(){
		if(dateOfBirth == null){
			return -1;
		}
		return DateHelper.getAge(dateOfBirth);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID:    ").append(customerID).append("\n");
		sb.append("First Name:    ").append(firstName).append("\n");
		sb.append("Family Name:   ").append(familyName).append("\n");
		sb.append("Age: ").append(getCustomerAge()).append("\n");
		sb.append("Email:         ").append(email).append("\n");
		return sb.toString();
	}
	
	
}
