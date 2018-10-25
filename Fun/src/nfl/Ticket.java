package nfl;

public class Ticket {

    private static Team homeTeam;
    private static Team visitingTeam = null;

    Ticket(Team homeTeam,Team visitingTeam){
       Ticket.homeTeam=homeTeam;
       Ticket.visitingTeam=visitingTeam;
    }

    void showYourTeamFingerprints(){
        System.out.println("ticket has hashCode=" + hashCode() + " homeTeam=" + homeTeam.getTeamName() + " has hashCode=" + homeTeam.hashCode());
    }
}
