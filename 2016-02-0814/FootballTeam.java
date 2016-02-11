import java.util.ArrayList;

/**
 * Created by Damir on 11.02.2016.
 */
public class FootballTeam implements Team {

    String country = "unknown";
    String league = "unknown";
    String name = null;
    int foundationYear = -1;
    ArrayList<Player> players = null;
    Stadium homeStadium = null;
    Coach coach = null;
    ArrayList<Team> historyCoaches = null;

    public FootballTeam(String name,int foundationYear,Stadium stadium,Coach coach) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.homeStadium = stadium;
        this.coach = coach;
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public void removePlayer(Player player){
        if (this.players.contains(player)){
            this.players.remove(player);
        }
    }

    public void changeStadium(Stadium stadium){
        this.homeStadium = stadium;
    }

    public void newCoach(Coach coach){
        this.coach = coach;
    }

    @Override
    public String toString() {
        String a = "" + this.name + " (" + this.league + ", " + this.country + ")";
        return a;
    }

    @Override
    public int goalsFrom(Team team) {
        return 0;
    }

    @Override
    public int goalsAgainst(Team team) {
        return 0;
    }

    @Override
    public ArrayList matchList(Team team) {
        return null;
    }

    @Override
    public Match bestMatch(Team team) {
        return null;
    }
}
