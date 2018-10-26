package trivera.core.employee;

public class GroundMail implements Mailable {

    @Override
    public void mail() {
        System.out.println("Mailing myself across the ground...");
    }
}
