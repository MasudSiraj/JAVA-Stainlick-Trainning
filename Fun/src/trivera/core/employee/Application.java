package trivera.core.employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.LinkedList;

public class Application {

    Collection<Mailable> mailBag = null;

    int x = 8;


    Application(){

    if(mailBag!=null) {
        mailBag.add(new GroundMail());
        mailBag.add(new AirMail());
        mailBag.add(new GroundMail());
    } else {
        System.out.println("Try giving me an actual mailbag");
    }



    }


    public static void main(String[] args) {
        new Application();
    }


    public void sendMail(Mailable m){
        m.mail();
    }


    double commRate;

    @Override
    public String toString() {
        return Double.toString(commRate);
    }
}
