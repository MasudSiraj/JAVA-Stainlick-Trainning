package trivera.farm.location;

/*
* Trivera Farm application - Plot
* <p>
* This component and its source code representation are copyright protected
* and proprietary to The Trivera Group, Inc., Worldwide D/B/A Trivera Technologies
*
* This component and source code may be used for instructional and
* evaluation purposes only. No part of this component or its source code
* may be sold, transferred, or publicly posted, nor may it be used in a
* commercial or production environment, without the express written consent
* of the Trivera Group, Inc.
*
* Copyright (c) 2018 The Trivera Group, Inc.
* http://www.triveratech.com   http://www.triveragroup.com
* </p>
* @author The Trivera Group Tech Team.
*/

public class Plot extends Location {

	// constructors
	public Plot () {
		super();
	}
	
	public Plot (String name) {
		super(name);
	}
	
	public Plot (int coordX, int coordY) {
		super(coordX, coordY);
	}
	
	public Plot (String name, int coordX, int coordY) {
		super(name, coordX, coordY);
	}
	
	public Plot (Location[] loc) {
		super(loc);
	}

	public Plot (String name, Location[] loc) {
		super(name, loc);
	}

	// full constructor
	public Plot (String name, int coordX, int coordY, Location[] loc) {
		super(name, coordX, coordY, loc);
	}

	// getState - name plus count of structures
	public String getState() {
		return getName() + " at (" + coordX + "," + coordY + "): contains " +
		((this.childLocations.length == 0) ? "NO" : childLocations.length) + " structures";
	}

	// getFullState - return getState() plus enumerated rooms, if any
	public String getFullState() {
		return getState() + ((this.childLocations.length == 0) ? "." : ":\n\t" + this.getChildState());
	}
	
	// determine if Location subtype is valid
	protected boolean isLocationValid (Location loc) {
		// a Plot may only contain Structures
		return (loc instanceof Structure);
	}

	
}
