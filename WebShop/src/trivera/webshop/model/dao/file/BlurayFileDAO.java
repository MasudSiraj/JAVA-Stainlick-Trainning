package trivera.webshop.model.dao.file;

import java.util.ArrayList;
import java.util.List;

import trivera.webshop.model.Bluray;
import trivera.webshop.model.dao.BlurayDAO;

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
public class BlurayFileDAO implements BlurayDAO{
	private BlurayFileDataSource dataSource = BlurayFileDataSource.getInstance();
	
	/**
	 * Get All Available Bluray dics
	 * @return All Available Bluray dics
	 */
	public List<Bluray> getAllBlurays(){
		return dataSource.getAllBlurays();
	}
	
	/**
	 * Get All BluRay disc where the title contains value provided
	 * @param searchString The string to search for in the title
	 * @return All Available with search String in title
	 */
	public List<Bluray> searchByTitle(String searchString){
		List<Bluray> result = new ArrayList<Bluray>();
		for(Bluray bluRay: getAllBlurays()){
			String title = bluRay.getTitle();
			if(title!= null && title.toLowerCase().contains(searchString.toLowerCase())){
				result.add(bluRay);
			}
		}
		return result;
	}
	
	/**
	 * Ge a BluRay by the given ID
	 * @param id the BLuRay ID
	 * @return The BluRay for the given ID, or null when no BluRay is found for this ID
	 */
	public Bluray getBluRayByID(String id){
		for(Bluray bluRay: getAllBlurays()){
			String bluRayID = bluRay.getId();
			if(bluRayID!= null && bluRayID.equals(id)){
				return bluRay;
			}
		}
		return null;
	}
}
