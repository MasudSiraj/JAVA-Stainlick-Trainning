package trivera.farm.location;

/*
* Trivera Farm application - Parcel
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

import trivera.farm.app.FarmClockEvent;
import trivera.farm.app.FarmClockListener;

public class Parcel extends Location implements FarmClockListener {

	// constructors
	public Parcel () {
		super();
	}
	
	public Parcel (String name) {
		super(name);
	}
	
	public Parcel (int coordX, int coordY) {
		super(coordX, coordY);
	}
	
	public Parcel (String name, int coordX, int coordY) {
		super(name, coordX, coordY);
	}
	
	public Parcel (Location[] loc) {
		super(loc);
	}

	public Parcel (String name, Location[] loc) {
		super(name, loc);
	}

	// implement FarmClockListener
	public void clockUpdated(FarmClockEvent fce) {
		// simulate real behavior use a 10% probability some event occurring
		if (Math.random() <= 0.10) {
			// pick and event based on the parcel
			if (this.getName().equalsIgnoreCase("Lake")) {
				System.out.println("\nA fish just jumped in the lake!\n");
			} else if (this.getName().equalsIgnoreCase("Corn Field")) {
				System.out.println("\nA flock of crows is in the Corn Field!\n");
			} else if (this.getName().equalsIgnoreCase("Yard")) {
				System.out.println("\nThere's a squirrel running across the Yard!\n");
			} else if (this.getName().equalsIgnoreCase("Chicken Yard")) {
				System.out.println("\nThe hens are cackling in the Chicken Yard!\n");
			}
		}
	}
	
	// getState - name plus count of plots and structures
	public String getState() {
		Structure[] struct = this.getStructures();
		int structCount = (struct == null) ? 0 : struct.length;
		int childCount  = (childLocations == null) ? 0 : childLocations.length;
		childCount = (childCount > structCount) ? childCount - structCount : 0;
		return getName() + " at (" + coordX + "," + coordY + "): contains " +
			((childCount  == 0) ? "NO" : childCount)  + " plots and " +
			((structCount == 0) ? "NO" : structCount) + " structures" ;
	}

	// getFullState - return getState() plus enumerated rooms, if any
	public String getFullState() {
		return getState() + ((this.childLocations.length == 0) ? "." : ":\n\t" + this.getChildState());
	}
	
	// full constructor
	public Parcel (String name, int coordX, int coordY, Location[] loc) {
		super(name, coordX, coordY, loc);
	}

	// determine if Location subtype is valid
	protected boolean isLocationValid (Location loc) {
		// a Parcel may contain Plots or Structures
		return (loc instanceof Plot || loc instanceof Structure);
	}

}
