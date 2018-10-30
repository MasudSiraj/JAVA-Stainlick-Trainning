package airline;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        Jet a787 = new Jet();

        System.out.println( Arrays.toString(Compass.values()) );



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
