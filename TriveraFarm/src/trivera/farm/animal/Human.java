package trivera.farm.animal;

/*
* Trivera Farm application - Human
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

import trivera.farm.app.FarmClock;

public class Human extends Mammal {

	public void sleep() {
		FarmClock clock = getOwner().getClock();
		int time = clock.getHour();
		if (time > 22 || time < 7) {
			this.setState(AnimalState.SLEEPING);
		} else {
			//no operation
		}
	}
	
	public void wake() {
		FarmClock clock = getOwner().getClock();
		int time = clock.getHour();
		if (time > 22 || time < 7) {
			this.setState(AnimalState.SLEEPING);
		} else {
			this.setState(AnimalState.AWAKE);
		}	
	}

}
