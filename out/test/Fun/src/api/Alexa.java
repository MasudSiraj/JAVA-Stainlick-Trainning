package api;

import java.time.LocalTime;

public class Alexa extends Device implements Calculator, Timepiece{

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


    @Override
    public void talkToTheCrazyThing() {

    }

    public void placeCall(){}
}
