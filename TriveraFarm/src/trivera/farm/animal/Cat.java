package trivera.farm.animal;

/*
* Trivera Farm application - Cat
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

public class Cat extends Mammal {


	public void sleep() {
		// randomly determine if this animal performs the behavior
		if (Math.random() <= 0.85) {
			this.setState(AnimalState.SLEEPING);
		} else {
			//no operation 
		}
	}
	
	public void wake() {
		// randomly determine if this animal performs the behavior
		if (Math.random() <= 0.85) {
			this.setState(AnimalState.SLEEPING);
		} else {
			this.setState(AnimalState.AWAKE);
		}
	}
	
	public void eat() {
		this.setState(AnimalState.EATING);
	}
	
}
