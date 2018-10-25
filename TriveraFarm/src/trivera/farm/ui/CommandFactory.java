package trivera.farm.ui;

/*
* Trivera Farm application - Command factory
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

public class CommandFactory extends AbstractCommandFactory {
	
	// create specified command
	public static Command createCommand(String commandString) {
		Command commandObject 	= null;
		String classname 		= null;
		
		// determine which class to create. Try sommandString as-is first
		classname = "trivera.farm.ui.Command" + commandString;
		
		try {
			Class clazz 	= Class.forName(classname);
			commandObject 	= (Command) clazz.newInstance();
		} catch (Exception e) {
			// ignore here - try initial caps first.
		}

		// If not created, try forcing initial caps
		if (commandObject == null) {
			// try using initial caps
			classname = "trivera.farm.ui.Command" +
				commandString.substring(0, 1).toUpperCase() +
				commandString.substring(1).toLowerCase();
		
			// instantiate the class
			try {
				Class clazz 	= Class.forName(classname);
				commandObject 	= (Command) clazz.newInstance();
			} catch (Exception e) {
				System.out.println("Unrecognized command '"+commandString+"'.");
			}
		}

		// set the command string
		if (commandObject != null) {
			commandObject.setCommand(commandString);
		}
		
		// return the command
		return commandObject;
	}

}
