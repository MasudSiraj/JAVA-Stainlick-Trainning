package trivera.farm.app;

import trivera.farm.animal.Animal;
import trivera.farm.animal.Human;
import trivera.farm.location.Property;

import java.io.PrintStream;
import java.util.Scanner;

/*
* Trivera Farm application - FarmManager Context Object (Command Pattern)
* * <p>
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

public class FarmManagerContext {

	private Property farm;
	private Human farmer;
	private Animal livestock;
	private Scanner		sysIn;
	private PrintStream sysOut;
	private FarmClock	clock ;
	
	// constructor
	public FarmManagerContext(Property farm, Human farmer, Animal livestock, Scanner sysIn, PrintStream sysOut, FarmClock clock) {
		// init farm, farmer and livestock
		this.farm		= farm;
		this.farmer		= farmer;
		this.livestock	= livestock;
		
		// init input and output streams and clock
		this.sysIn	= sysIn;
		this.sysOut	= sysOut;
		this.clock	= clock;
	}
	
	// methods to provide access to services provided by application
	public Property getFarm() {
		return this.farm;
	}
	
	public Human getFarmer() {
		return this.farmer;
	}
	
	public Animal getLivestock() {
		return this.livestock;
	}
	
	public Scanner getScanner() {
		return this.sysIn;
	}
	
	public PrintStream getPrintStream() {
		return this.sysOut;
	}
	
	public FarmClock getFarmClock () {
		return this.clock;
	}
}
