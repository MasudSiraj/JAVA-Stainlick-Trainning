package misc;

import java.util.ArrayList;
import java.util.Collection;

public class FlashlightTester {


    public static final int COUNT = 2;

    public static void main(String[] args) {

        int itWorkedCounter = 0;
        Battery aBattery = new Battery();
        Collection flashlightShelf = new ArrayList();


        for (int i = 0; i< COUNT; i++) {
            Flashlight flashlight = new Flashlight(new Battery());
            flashlightShelf.add(flashlight);
            boolean didItLight = flashlight.on();

            if (didItLight==true)
                itWorkedCounter++;
        }

        System.out.println("Worked " + itWorkedCounter + " times, but did not " + (COUNT -itWorkedCounter) + " times");
    }

}
