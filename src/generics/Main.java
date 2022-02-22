package src.generics;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer tim = new SoccerPlayer("Tim");

        Team<FootballPlayer> naijaTeam = new Team<>("Naija");
        naijaTeam.addPlayer(joe);
//        naijaTeam.addPlayer(pat);
//        naijaTeam.addPlayer(tim);
        System.out.println(naijaTeam.numPlayers());

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Baseball Team");
        baseballPlayerTeam.addPlayer(pat);
    }
}
