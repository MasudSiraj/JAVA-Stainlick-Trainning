package trivera.farm.location;

import trivera.farm.app.FarmClock;
import trivera.farm.app.FarmClockListener;
import trivera.farm.app.FarmManager;

import java.util.Arrays;


public abstract class Location extends AbstractLocation{
	
	// add name property
	protected String name = null;
	
	// add coordinate properties
	protected int coordX = 0;
	protected int coordY = 0;
	
	// add child location property. default to 10  entries
	protected Location[] childLocations = new Location[10];
	
	// constructors
	public Location () {
		super();
		// handle registration for appropriate subtypes 
		if (this instanceof FarmClockListener) {
			FarmClock clock = FarmManager.getClock();
			clock.addFarmClockListener((FarmClockListener)this);
		}
	}
	
	public Location (String name) {
		this();
		this.name = name;
	}
	
	public Location (int coordX, int coordY) {
		this();
		this.coordX = coordX;
		this.coordY = coordY;
	}
	
	public Location (String name, int coordX, int coordY) {
		this();
		this.name = name;
		this.coordX = coordX;
		this.coordY = coordY;
	}
	
	public Location (Location[] loc) {
		this();
		this.childLocations = loc;
	}

	public Location (String name, Location[] loc) {
		this();
		this.name = name;
		this.childLocations = loc;
	}
	
	// full constructor
	public Location (String name, int coordX, int coordY, Location[] loc) {
		this();
		this.name = name;
		this.coordX = coordX;
		this.coordY = coordY;
		this.childLocations = loc;
	}
	
	// get coordinates
	public int[] getCoordinates() {
		return new int[] { coordX, coordY };
	}
	
	public int getCoordinateX() {
		return coordX;
	}
	
	public int getCoordinateY() {
		return coordY;
	}
	
	// set coordinates
	public void setCoordinates(int[] coord) {
		if (coord.length == 2) {
			coordX = coord[0];
			coordY = coord[1];
		}
	}
	
	public void setCoordinates(int coordX, int coordY ) {
		this.coordX = coordX;
		this.coordY = coordY;
	}
	
	// determine if Location subtype is valid (override in descendants)
	protected boolean isLocationValid (Location loc) {
		return true;
	}
	
	// add one location
	public void addLocation(Location loc) {
		if (isLocationValid(loc)) {
			int index = this.getAvailableIndex();
			childLocations[index] = loc;
		}
	}
	
	// add multiple locations
	public void addLocations(Location[] loc) {
		for (int i=0, j=loc.length; i<j; i++) {
			this.addLocation(loc[i]);
		}
	}
	
	// get one location by index
	public Location getLocation(int index) {
		Location loc = null;
		if (index < childLocations.length) {
			loc = childLocations[index];
		}
		return loc;
	}
	
	// get one location by name
	public Location getLocation(String name) {
		Location loc = null;
		int index = getLocationIndex(name);
		if (index >= 0) 
		{ 
			loc = childLocations[index]; 
		}
		return loc;
	}
	
	//get index of named location
	public int getLocationIndex(String name) {
		int index = -1;
		for (int i=0; i<childLocations.length; i++) {
			if (childLocations[i] == null) { 
				continue; 
			}
			if (childLocations[i].getName().equals(name)) { 
				index = i;
				break;
			}
		}
		return index;
	}
	
	// get all locations
	public Location[] getLocations() {
		return this.childLocations;
	}
	
	// get next available index
	protected int getAvailableIndex () {
		int index = -1;
		int initialLength = childLocations.length;
		for (int i=0; i<initialLength; i++) {
			if (childLocations[i] == null) {
				index = i;
				break;
			}
		}
		
		// see if we found a slot - extend array if not
		if (index == -1) {
			childLocations = (Location[]) Arrays.copyOf(childLocations, (childLocations.length + 10));
			index = initialLength + 1;
		}
		
		// return the index
		return index;
	}
	
	// get structures
	public Structure[] getStructures() {
		Structure[] struct = null;
		// locate any structures. Call recursively to get structures from children
		for (int i=0, j= childLocations.length; i<j; i++) {
			Location loc = childLocations[i];
			if (loc == null) { 
				continue; 
			}
			// see if a structure
			if (loc instanceof Structure) {
				// see if first
				if (struct == null) {
					struct = new Structure[1];
					struct[0] = (Structure) loc;
				} else {
					struct = Arrays.copyOf(struct, (struct.length+1));
					struct[struct.length-1] = (Structure) loc;
				}
				
			} else {
				Structure[] childStruct = loc.getStructures();
				// append child's structures
				if (childStruct != null && childStruct.length > 0) {
					int childLength   = childStruct.length;
					if (struct == null) {
						// if we have no structures yet, just copy child's
						struct = childStruct;
					} else {
						// extend array and copy child's structures
						int initialLength = struct.length;
						struct = Arrays.copyOf(struct, (initialLength + childLength));
						for (int k=0, l=childLength; k<l; k++) {
							struct[initialLength + k] = childStruct[k];
						}
					}
				}
			}
		}
		
		// return the structures
		return struct;
	}
	
	// getState - for Location (or descendants not overriding) returns name only
	public String getState() {
		String name = this.getName();
		if (name == null || name.equals("")) {
			name = this.toString();
		}
		return name;
	}

	// getFullState - for Location  (or descendants not overriding) returns getState()
	public String getFullState() {
		return getState();
	}

	// get child state
	public String getChildState() {
		StringBuffer childState = new StringBuffer();
		for (int i=0, j=childLocations.length; i<j; i++) {
			if (childLocations[i] == null) { 
				continue; 
			}
			childState.append("\n\t" + childLocations[i].getState());
		}
		return childState.toString();
	}

	// get child full state
	public String getChildFullState() {
		StringBuffer childState = new StringBuffer();
		for (int i=0, j=childLocations.length; i<j; i++) {
			if (childLocations[i] == null) { 
				continue; 
			}
			childState.append("\n\t" + childLocations[i].getFullState());
		}
		return childState.toString();
	}

	// getters and setters
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// override default toString()
	public String toString() {
		return this.getClass().getSimpleName() + "@" + Integer.toString(this.hashCode(),16);
	}

}
