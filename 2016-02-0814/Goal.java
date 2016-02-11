import java.util.ArrayList;

/**
 * Created by Damir on 11.02.2016.
 */
public interface Goal {
    Player scored = null;
    Player assist = null;
    Team from = null;
    Team against = null;
    Match match = null;
    int minute = -1;


    public String toString();
    public String currentScore(Goal goal); //счет матча на момент забития данного гола
    public String totalScore(Goal goal); //итоговый сет данного матча
    public ArrayList playerGoals(Goal goal); // все голы игрока,забившего данный гол

}
