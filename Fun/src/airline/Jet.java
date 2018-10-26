package airline;

public class Jet {

    Compass compass;

    Jet(){
        compass=Compass.North;
    }

    public Compass getHeading(){
        return compass;
    }

    private void adjustHeading(){
        this.compass = calculateHeading();
    }






    private Compass calculateHeading() {
        return Compass.East;
    }

    public void lowerLandingGear() throws Exception{

        if(Math.random() > .5){
            System.out.println("Landing gear is being deployed...");
        } else{
            throw new Exception("Right-rear wheel door is stuck.  Refer to page 14-2.3");
        }



    }

}
