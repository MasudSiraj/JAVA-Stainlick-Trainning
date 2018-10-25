package office.supply;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

public class Application {


    static Marker blackScentedEraseableMarker = null;

    public static void main(String[] args) {

        boolean ERASEABLE = true;
        boolean SCENTED = true;

        Collection<Marker> markers = new ArrayList<>();

        markers.add(new Marker(Color.BLACK, SCENTED, ERASEABLE ));
        markers.add(new Marker(Color.BLUE, !SCENTED, ERASEABLE ));
        markers.add(new Marker(Color.CYAN, !SCENTED, !ERASEABLE ));
        markers.add(new Marker(Color.DARK_GRAY, SCENTED, ERASEABLE ));
        markers.add(new Marker(Color.RED, !SCENTED, !ERASEABLE ));


        Marker blackScentedEraseableMarker = new Marker(Color.BLACK, SCENTED, ERASEABLE );


        for (Marker m: markers) {
            System.out.println(m.equals(blackScentedEraseableMarker)? m + " is equals " : "nope!");
        }



    }
}
