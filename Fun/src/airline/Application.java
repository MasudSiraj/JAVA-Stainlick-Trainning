package airline;

import java.io.FileInputStream;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {

        Jet a787 = new Jet();

        Compass compass = a787.getHeading();

        System.out.println(compass);

        try {
            a787.lowerLandingGear();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // execute manual procedure
        } finally{
            System.out.println("Thanks for flying budget airlines");
        }




    }

}
