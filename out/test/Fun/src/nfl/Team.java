package nfl;

public class Team {

    private static String teamName = "NOT_SET";
    private String mascot;

    public Team(String teamName) {
        Team.teamName=teamName;
    }

    public static String getTeamName(){
        return teamName;
    }

    public static void setTeamName(String newName){
        teamName=newName;
    }
}
