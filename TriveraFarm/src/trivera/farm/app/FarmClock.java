package trivera.farm.app;

import java.util.List;
import java.util.ArrayList;

/*
* Trivera Farm application - clock simulator
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

public class FarmClock {

	// clock starts at day 1, 4:30am
	private int day		= 1;
	private int hour	= 4;
	private int minute	= 30;
	
	private FarmClock	oldClock;
	
	// registered listeners (for optional Observer)
	List <FarmClockListener> listeners = new ArrayList<FarmClockListener>();
	
	// default constructor
	public FarmClock () {
	}
	
	// constructor to copy an existing clock
	public FarmClock (FarmClock c) {
		this();
		this.day	= c.getDay();
		this.hour	= c.getHour();
		this.minute	= c.getMinute();
	}
	
	public void increment (int minutes) {
		this.increment(0, 0, minutes);
	}
	
	public void increment (int hours, int minutes) {
		this.increment(0, hours, minutes);
	}
	
	public void increment (int days, int hours, int minutes) {
		oldClock = new FarmClock(this);
		
		this.day	+= days;
		this.hour	+= hours;
		this.minute	+= minutes;
		
		// check for rollover
		if (this.minute >= 60) {
			this.minute -= 60;
			this.hour++;
		}
		if (this.hour >= 24) {
			this.hour -= 24;
			this.day++;
		}
		
		// notify listeners
		this.notifyListeners(oldClock);
		
		return;
	}

	// calculate difference in minutes
	public int clockDiff(FarmClock c) {
		int dayDiff  = this.day    - c.getDay(); 
		int hourDiff = this.hour   - c.getHour(); 
		int minDiff  = this.minute - c.getMinute(); 
		return (dayDiff * 24 * 60) + (hourDiff * 60) + minDiff;
	}
	
	// report state 
	public String getState() { return this.toString(); }
	
	public String toString() {
		return "Day: " + this.day + ", Time: " +
		((hour   < 10) ? "0" : "") + hour + ":" +
		((minute < 10) ? "0" : "") + minute;
	}

	public int getDay() {
		return day;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	// listener methods
	public void notifyListeners(FarmClock oldClock){
		FarmClockEvent fce = new FarmClockEvent(this, oldClock);
		for(FarmClockListener fcl : listeners) {
			if(fcl !=null) {
				fcl.clockUpdated(fce);
			}
		}
	}
	
	public void addFarmClockListener(FarmClockListener l) {
		if (!(listeners.contains(l))) {
			listeners.add(l);
		}
	}

	public void removeFarmClockListener(FarmClockListener l) {
		if ((listeners.contains(l))) {
			listeners.remove(l);
		}
	}
	
	public FarmClockListener[] getListeners() {
		return (FarmClockListener[]) listeners.toArray();
	}
}
