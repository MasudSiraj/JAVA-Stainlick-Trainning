package trivera.farm.ui;

/*
* Trivera Farm application - Command - sleep
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

import trivera.farm.animal.Animal;
import trivera.farm.app.FarmManagerContext;

public class CommandSleep extends Command {

	public CommandSleep() {
		super();
	}

	public CommandSleep(String command) {
		super(command);
	}

	@Override
	public void execute(Object context) {
		// get context
		ctx = (FarmManagerContext) context;
		
		// process the command
		Animal selectedAnimal = getAnimal();
		if (selectedAnimal != null) {
			selectedAnimal.sleep();
		}

	}

}
