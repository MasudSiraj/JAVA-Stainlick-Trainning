package trivera.farm.animal;


import trivera.farm.app.FarmClock;
import trivera.farm.app.FarmClockEvent;
import trivera.farm.app.FarmClockListener;
import trivera.farm.app.FarmManager;

public class Animal implements FarmClockListener {
	
	private FarmManager owner;
	private AnimalState state = AnimalState.AWAKE;
	private String name,lastBehavior,lastReward;

	public Animal() {
		FarmClock clock = FarmManager.getClock();
		clock.addFarmClockListener(this);
	}
	
	public FarmManager getOwner() {
		return owner;
	}

	public void setOwner(FarmManager owner) {
		this.owner = owner;
	}
	
	public void eat() {
		this.state = AnimalState.EATING;
	}
	
	public void sleep() {
		this.state = AnimalState.SLEEPING;
	}
	
	public void wake() {
		this.state = AnimalState.AWAKE;
	}
	
	// optional challenge - perform and reward
	public void perform (String behavior) {
		// randomly determine if this animal performs the behavior
		if (Math.random() >= 0.5) {
			System.out.println(this.getName() + " performs " + behavior);
		} else {
			System.out.println(this.getName() + " does not perform " + behavior);
		}
	}
	
	public void reward (String reward, int amount) {
		String mood   = "";
		String degree = "";
		
		if (amount > 0) {
			mood = "pleased with";
		} else if (amount < 0){
			mood = "disappointed with";
		} else {
			mood = "uncertain about";
		}
		
		if (amount < 0) { amount = (0 - amount); }
			degree = "";
		if (amount == 1) {
			degree = "somewhat ";
		} else if (amount == 1) {
			degree = "fairly ";
		} else if (amount == 2) {
			degree = "very ";
		} else {
			degree = "extremely ";
		}
		System.out.println(this.getName() + " is " + degree + mood + " with receiving " + amount + " " + reward + "(s).");
	}
	
	public String getStatus() {
		return getName() + " is a "+ getClass().getSimpleName() + " and is currently " + state;
	}

	
	public String getName() {
		return this.name;
	}
	
	public AnimalState getState() {
		return state;
	}
	public void setState(AnimalState state) {
		this.state = state;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// override default toString()
	public String toString() {
		return getClass().getSimpleName() + "@" + Integer.toString(this.hashCode(),16);
	}

	@Override
	public void clockUpdated(FarmClockEvent e) {
		if(Math.random() <= .25) {
			if(state == AnimalState.SLEEPING	 ) {
				state = AnimalState.AWAKE;
			}
			else {
				state = AnimalState.SLEEPING;
			}
		}
		
	}

	public String getAnimalType() {
		return getClass().getSimpleName();
	}

	public String getLastBehavior() {
		return lastBehavior;
	}

	public void setLastBehavior(String lastBehavior) {
		this.lastBehavior = lastBehavior;
	}

	public String getLastReward() {
		return lastReward;
	}

	public void setLastReward(String lastReward) {
		this.lastReward = lastReward;
	}
}
