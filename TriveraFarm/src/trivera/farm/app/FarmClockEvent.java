package trivera.farm.app;

import java.util.EventObject;


public class FarmClockEvent extends EventObject {

	private FarmClock 	oldClock;
	private int			clockDiff;
	
	public FarmClockEvent (FarmClock clock, FarmClock oldClock) {
		super(clock);
		this.oldClock = oldClock;
		this.clockDiff = clock.clockDiff(oldClock);
	}

	public FarmClock getOldClock() {
		return oldClock;
	}

	public int getClockDiff() {
		return clockDiff;
	}

}
