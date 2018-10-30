package nfl;

public class Application {


    public static void main(String[] args) {
         Team home = new Team("Cowboys");
         Team visitor = new Team("Chiefs");

        Ticket t1 = new Ticket(home, visitor);
        Ticket t2 = new Ticket(home, visitor);
        Ticket t3 = new Ticket(home, visitor);
        Ticket t4 = new Ticket(home, visitor);

        t1.showYourTeamFingerprints();
        t2.showYourTeamFingerprints();
        t3.showYourTeamFingerprints();
        t4.showYourTeamFingerprints();










        home.setTeamName(home.getTeamName().toUpperCase());

        t1.showYourTeamFingerprints();
        t2.showYourTeamFingerprints();
        t3.showYourTeamFingerprints();
        t4.showYourTeamFingerprints();

    }
}
