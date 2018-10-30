package misc;

public class Battery {

    private float chargeLevel = (float) Math.random();

    public double getBatteryCharge() {
        return 100*chargeLevel;
    }
}
