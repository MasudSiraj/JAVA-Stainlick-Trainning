package misc;

public class Flashlight {

    private Battery battery; //null
    private long idNumber;   //0
    private boolean poweredOn; //false
    private double id; // 0.0

    Flashlight(Battery battery){
        this.battery = battery;
    }

    public boolean on() {
        if (battery.getBatteryCharge() >= 10)
           return true;
        else
            return false;
    }
}
