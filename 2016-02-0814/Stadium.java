import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Damir on 11.02.2016.
 */
public interface Stadium {
    String name = null;
    Date buildDate = null;
    String city = null;
    String country = null;
    Team team = null;

    public String toString(Stadium stadium);
    public ArrayList allMatches(Stadium stadium); //показать все матчи,сыгранные на даном стадионе
    public int age(Stadium stadium); //возраст стадиона
    public ArrayList allStadiumsInCountry(Stadium stadium);//все стадионы в стране
}
