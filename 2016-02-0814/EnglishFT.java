/**
 * Created by Damir on 11.02.2016.
 */
public class EnglishFT extends FootballTeam {
    public EnglishFT(String name, int foundationYear, Stadium stadium, Coach coach) {
        super(name, foundationYear, stadium, coach);
        this.country = "England";
        this.league = "Premier League";
    }
}
