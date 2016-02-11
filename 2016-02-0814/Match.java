import javax.swing.plaf.metal.MetalTabbedPaneUI;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Damir on 11.02.2016.
 */
public interface Match {
    Date matchDate = null;
    Team team1 = null;
    Team team2 = null;
    ArrayList<Goal> goals = null;

    public String toString(Match match);
    public ArrayList allGoals(Match match);
    public ArrayList historyOfOpposition(Match match); //история встреч
    public ArrayList lastFiveMatchesTeam1(Match match); //последние 5 матчей команды 2
    public ArrayList lastFiveMatchesTeam2(Match match); //последние 5 матчей команды 1
}
