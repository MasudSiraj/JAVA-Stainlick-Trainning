package trivera.webshop.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
public class ShoppingCart implements Serializable{
	private static final long serialVersionUID = -9191914962684495009L;
	private List<Bluray> content = new ArrayList<>();
	
	public void addBluray(Bluray bluray){
		content.add(bluray);
	}
	
	public int getNoOfItemsInCart(){
		return content.size();
	}
	
	public List<Bluray> getCartContent(){
		return Collections.unmodifiableList(content);
	}
	
	public double getTotalPrice(){
		
		double total = 0;
		for(Bluray bluray:content){
			total += bluray.getPrice();
		}
		return total;
		
	}
}
