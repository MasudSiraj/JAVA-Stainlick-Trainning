package trivera.farm.location;

import java.util.Arrays;

/*
* Trivera Farm application - Structure
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

public class Structure extends Location {

	// constructors
	public Structure () {
		super();
	}
	
	public Structure (String name) {
		super(name);
	}
	
	public Structure (Location[] loc) {
		super(loc);
	}

	public Structure (String name, Location[] loc) {
		super(name, loc);
	}

	// getState - name plus count of rooms
	public String getState() {
		Room[] rooms = this.getRooms();
		return getName() + ": contains " +
		((rooms == null || rooms.length == 0) ? "NO" : childLocations.length) + " rooms";
	}

	// getFullState - return getState() plus enumerated rooms, if any
	public String getFullState() {
		Room[] rooms = this.getRooms();
		return getState() + ((rooms == null || rooms.length == 0) ? "." : ":\n\t" + this.getChildState());
	}
	
	// get rooms
	public Room[] getRooms() {
		Room[] rooms = null;
		for (int i=0, j=childLocations.length; i<j; i++) {
			if (childLocations[i] == null) { continue; }
			// see if first
			if (rooms == null) {
				rooms = new Room[1];
				rooms[0] = (Room) childLocations[i];
			} else {
				rooms = Arrays.copyOf(rooms, (rooms.length + 1));
				rooms[rooms.length-1] = (Room) childLocations[i];
			}
		}
		return rooms;
	}
	
	// determine if Location subtype is valid
	protected boolean isLocationValid (Location loc) {
		// a Structure may only contain Rooms
		return (loc instanceof Room);
	}

}
