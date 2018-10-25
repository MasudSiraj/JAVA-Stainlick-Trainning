package misc;

public class BatteryTester {

    public static void main(String[] args) {
        Battery aBattery = new Battery();

        // create and test five batteries
        for (int i=0; i<5; i++){
            double theChargeLevel = aBattery.getBatteryCharge();
            System.out.println("The battery charge is "  + theChargeLevel);


        }


    }

}
