package api;

import java.time.LocalTime;

public class SmartPhone extends Device implements Calculator, Timepiece{

    // Calculator aspect
    @Override
    public double add(double x, double y) {
        return x+y;
    }

    // Timepiece aspect
    @Override
    public LocalTime whatTimeIsIt() {
        return LocalTime.now();
    }

    // SmartPhone aspect
    public void placeCall(){}
}
