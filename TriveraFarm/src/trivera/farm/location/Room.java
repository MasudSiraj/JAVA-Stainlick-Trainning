package trivera.farm.location;

/*
* Trivera Farm application - Room
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

public class Room extends Location implements FarmClockListener {

	// constructors
	public Room () {
		super();
	}
	
	public Room (String name) {
		super(name);
	}

	// implement FarmClockListener
	public void clockUpdated(FarmClockEvent fce) {
		// simulate real behavior use a 10% probability some event occurring
		if (Math.random() <= 0.10) {
			// pick and event based on the parcel
			if (this.getName().equalsIgnoreCase("Kitchen")) {
				System.out.println("\nThe refrigerator just made a funny noise!\n");
			} else if (this.getName().equalsIgnoreCase("Master bathroom")) {
				System.out.println("\nThe toilet seems to be running in the Master Bathroom!\n");
			} else if (this.getName().equalsIgnoreCase("Kid's Bathroom")) {
				System.out.println("\nSomebody left the water runnng in the Kid's Bathroom!\n");
			} else if (this.getName().equalsIgnoreCase("Family Room")) {
				System.out.println("\nThe phone is ringing in the Family Room!\n");
			}
		}
	}
	
	
	// Note: getState and GetFullState() - default to ancestor (Location)

	// determine if Location subtype is valid
	protected boolean isLocationValid (Location loc) {
		// a Room may not contain anything
		return false;
	}

}
