import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Damir on 11.02.2016.
 */
public interface Coach {
    String name = null;
    String country = null;
    Team currentTeam = null;
    Date birthday = null;

    public String toString(Coach coach);
    public String coachesFromCountry(Coach coach);//искать тренеров с этой страны
    public ArrayList coachesFromTeam(Coach coach); //искать треноров за всю историю этого клуба
    public ArrayList coachesWithSimilarAge(Coach coach); //искать тренеров такого же возраста
}
