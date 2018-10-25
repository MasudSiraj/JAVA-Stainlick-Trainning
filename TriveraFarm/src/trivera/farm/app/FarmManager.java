package trivera.farm.app;


import trivera.farm.animal.*;
import trivera.farm.location.Property;
import trivera.farm.ui.FarmWindow;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FarmManager implements FarmClockListener{

	private Human		farmer;
	private Map<String,Animal> livestock = new HashMap<>();
	private Property farm;
	private static FarmClock clock;
	private FarmWindow farmWindow;
	
	// default constructor
	public FarmManager () {
		clock  = new FarmClock();
		this.createFarm();
		this.createFarmer();
		this.createLivestock();

		farmWindow = new FarmWindow(this,"Trivera Farm");
		clock.addFarmClockListener(this);
		clock.increment(15);
	}
	
	
	// create the farm
	private void createFarm() {
		farm = new Property ();
		farm.setName("Trivera Farm");
	}

	// create the farmer
	private void createFarmer() {
		farmer = new Human ();
		farmer.setName("Jeff");
		farmer.setOwner(this);
	}

	// create the livestock
	private void createLivestock() {
		Cat cat = new Cat();
		cat.setName("Yoda");
		livestock.put(cat.getName(), cat);
		
		Chicken chick = new Chicken();
		chick.setName("Scott");
		livestock.put(chick.getName(), chick);
		
		Cow cow = new Cow();
		cow.setName("Howdy");
		livestock.put(cow.getName(), cow);
		
		Crow crow = new Crow();
		crow.setName("Munin");
		livestock.put(crow.getName(), crow);
		
		Dog dog = new Dog();
		dog.setName("Torai");
		livestock.put(dog.getName(), dog);
		
		Horse horse = new Horse();
		horse.setName("Mr. Ed");
		livestock.put(horse.getName(), horse);
		
		Parakeet parakeet = new Parakeet();
		parakeet.setName("Gabby");
		livestock.put(parakeet.getName(), parakeet);
		
		Rat rat = new Rat();
		rat.setName("Remi");
		livestock.put(rat.getName(), rat);
		
		for(Animal a : livestock.values()) {
			a.setOwner(this);
		}
	}

	public Human getFarmer() {
		return farmer;
	}

	public void setFarmer(Human farmer) {
		this.farmer = farmer;
	}

	public Map<String, Animal> getLivestock() {
		return livestock;
	}
		
	public Property getFarm() {
		return farm;
	}

	public void setFarm(Property farm) {
		this.farm = farm;
	}

	public static FarmClock getClock() {
		return clock;
	}

	@Override
	public void clockUpdated(FarmClockEvent e) {
		farmWindow.getOverviewPanel().init(getClock().getState(), getFarmer().getStatus(), getFarm().getState());
		farmWindow.getAnimalsPanel().init(getLivestock().values());
	}




	public void refreshUI() {
		farmWindow.getOverviewPanel().init(getClock().getState(), getFarmer().getStatus(), getFarm().getState());
		farmWindow.getAnimalsPanel().init(getLivestock().values());
	}
}
