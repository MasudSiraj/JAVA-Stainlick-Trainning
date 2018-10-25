package trivera.farm.app;

import trivera.farm.animal.Animal;
import trivera.farm.ui.FarmWindow;

import java.io.PrintStream;
import java.util.Scanner;



public class App {

	private FarmManager farmManager;
	private PrintStream 	SysOut;
	private Scanner			SysIn;

	public static void main(String[] args) {
		new App().runFarm();
	}
	
	private void runFarm() {
		farmManager = new FarmManager();
	}

	
	private boolean displayMenu() {

		boolean	actionComplete = false;

		do {
			SysOut.println("Actions:");
			SysOut.println("\tS\tMake animal sleep");
			SysOut.println("\tW\tWake animal up");
			SysOut.println("\tE\tMake animal eat");
			SysOut.println("\tP\tAsk animal to perform behavior");
			SysOut.println("\tR\tReward or punish animal");
			SysOut.println("\t0\tNothing, and Return");
			SysOut.println("\t15\tNothing (extra 15 minutes)");
			SysOut.println("\t60\tNothing (extra 1 hour)");
			SysOut.println("\tX\tExit");

			SysOut.println("Enter selection:");
			String input = null;
			input = SysIn.nextLine();

			switch (input.toUpperCase()){
				case "P" :
					handlePerformAction();
					actionComplete= true;
					break;
				case "R" :
					handleRewardAction();
					actionComplete= true;
					break;
			}

		} while (!actionComplete);
		
		return actionComplete;
	}
	

	
	// challenge - handle perform method
	private void handlePerformAction() {
//		Animal selectedAnimal = whichAnimal();
//		if (selectedAnimal == null) { return; }
//		// prompt for behavior
//		SysOut.println("Enter behavior: ");
//		String behavior = SysIn.nextLine();
//		if (behavior == null || behavior.equals("")) { return; }
//		selectedAnimal.perform(behavior);
	}
	
	// challenge - handle reward method
	private void handleRewardAction() {
		Animal selectedAnimal = null;// = whichAnimal();
		if (selectedAnimal == null) { return; }
		// prompt for behavior
		SysOut.println("Enter reward: ");
		String reward = SysIn.nextLine();
		if (reward == null || reward.equals("")) { return; }
		SysOut.println("Enter count: ");
		String count = SysIn.nextLine();
		int number = Integer.parseInt(count);
		selectedAnimal.reward(reward, number);
	}
	

	
}
