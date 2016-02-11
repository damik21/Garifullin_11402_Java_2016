import java.util.ArrayList;

/**
 * Created by Damir on 11.02.2016.
 */
public interface Player {
    String name = null;
    String position = null; //defender,goalkeeper,forward,middle defender
    Team team = null;
    String country = null;
    ArrayList<Goal> goals = null;

    public String toString();
    public int countGoals(Player player); //кол-во голов забитых данным игроком
    public int countGoals(Player player,int season); //кол-во голов забитых в этом сезоне
    public ArrayList scoredTeams(Player player);//команды,которым забивал этот игрок
    public int countAssist(Player player); //кол-во отданных голевых передач данным игроком
    public int countAssist(Player player,int season); //кол-во отданных голевых передач в этом сезоне
    public ArrayList minutesScored(Player player);//минуты,на которых забивал голы
}
