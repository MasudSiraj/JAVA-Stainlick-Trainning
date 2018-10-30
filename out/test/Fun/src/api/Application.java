package api;

public class Application {

    public static void main(String[] args) {

        SmartPhone smarty = new SmartPhone();

        Device      device =        smarty;
        Calculator  calculator =    smarty;
        Timepiece   timepiece =     smarty;
        Object      object =        smarty;

        System.out.println("Time is : " + timepiece.whatTimeIsIt());
        System.out.println("12 + 12 is : " + calculator.add(12,12));
    }

}
