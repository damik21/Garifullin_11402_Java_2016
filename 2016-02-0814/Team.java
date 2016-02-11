import java.util.ArrayList;

/**
 * Created by Damir on 11.02.2016.
 */
public interface Team {
    String name = null;
    String league = null;
    int foundationYear = -1;
    ArrayList<Player> players = null;
    Stadium homeStadium = null;
    Coach coach = null;
    ArrayList<Team> historyCoaches = null;
    String country = null;

    public String toString();
    public int goalsFrom(Team team); //забитых голов
    public int goalsAgainst(Team team);//пропущено
    public ArrayList matchList(Team team);//список всех матчей
    public Match bestMatch(Team team);//самый результативный матч

}
