package trivera.core.employee;

public class AirMail implements Mailable {

    @Override
    public void mail() {
        System.out.println("Mailing myself through the air...");
    }
}
