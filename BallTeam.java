import java.util.ArrayList;
import java.util.List;

public class BallTeam {

    private String teamName;

    private List<FootballPlayer> teamMembers = new ArrayList<>();

    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    BallTeam(String teamName){
        this.teamName = teamName;
    }

    //ADD TEAM MEMBERS

    public void addTeamMembers(FootballPlayer player){
        if(!teamMembers.contains(player)){
            teamMembers.add(player);
        }
    }

    //LIST TEAM MEMBERS
    public void listTeamMembers(){
        System.out.println(teamName + " Roster: " + teamMembers);
    }

    //TEAM RANKING
    public int ranking(){
        return (totalLosses * 2) + totalTies + 1;
    }

    //SETTING THE SCORE
    public String setScore(int ourScore, int theirScore){
        String message = "lost to";

        if(ourScore > theirScore){
            totalWins++;
            message = "WIN!!";

        } else if(ourScore == theirScore) {
            message = "TIE!";
        } else {
            totalLosses++;
        }

        return message;
    }

    @Override
    public String toString(){
        return teamName + " ( Ranked " + ranking() + ")";
    }
}
