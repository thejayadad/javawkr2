

record FootballPlayer(String name, String position){}

public class Ball {


    public static void main(String[] args) {
        BallTeam ravens = new BallTeam("Baltimore Raves");
        BallTeam bucs = new BallTeam("Tampa Bucs");
        scoreResult(ravens, 24, bucs, 17);

        var jackson = new FootballPlayer("L. Jackson", "Qb");
        var brady = new FootballPlayer("T. Brady", "Qb");
        ravens.addTeamMembers(jackson);
        ravens.listTeamMembers();
        bucs.addTeamMembers(brady);
        bucs.listTeamMembers();


    }

    public static void scoreResult(BallTeam team1, int t1_score,
                                    BallTeam team2, int t2_score){
            String message = team1.setScore(t1_score, t2_score);
            team2.setScore(t1_score, t2_score);
            System.out.printf("%s %s %n", team1, message, team2);
        }
}
