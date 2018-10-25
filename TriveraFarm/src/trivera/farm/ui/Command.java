package trivera.farm.ui;

import trivera.farm.animal.Animal;
import trivera.farm.app.FarmManagerContext;

/*
* Trivera Farm application - Command ancestor
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

public abstract class Command extends AbstractCommand {

	// the following is provided to the execute method
	protected FarmManagerContext ctx;

	// the command entered
	protected String command = null;
	
	// constructors
	public Command() {
		super();
	}
	
	public Command(String command) {
		this();
		this.command = command;
	}
	
	// execute method
	public abstract void execute(Object context);
	
	// common methods needed by all commands
	protected Animal getAnimal() {
		// prompt for name
		while (true) {
			ctx.getPrintStream().println("Enter name: ");
			String input = ctx.getScanner().nextLine();
			if (input.equals("")) { return null; }
			Animal livestock = ctx.getLivestock();
			if (input.equalsIgnoreCase(livestock.getName())) {
				return livestock;
			} else {
				ctx.getPrintStream().println("No animal named '"+input+"' found.");
			}
		}
	}
	
	// getters and setters
	public void setCommand(String command) {
		this.command = command;
	}
	
	public String getCommand() {
		return this.command;
	}
}
