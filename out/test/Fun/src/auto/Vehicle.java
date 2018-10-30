package auto;

public abstract class Vehicle extends Object{

    private Meter meter = new Meter();
    private boolean running;

    public void startStop(){
        if (running){
            running = false;
            meter.stopMetering();
        } else{
            // how has the earthling been treating me?
            if(meter.allowed()){
                running = true;
                meter.startMetering();
            }
        }

    }

    public void honk(){
        System.out.println("Honking the vehicle horn");
    }

}
