package airline;

import api.SKU;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        Jet a787 = new Jet();

        Map<String, Collection<Jet>> fleet = new Hashtable<>();


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
