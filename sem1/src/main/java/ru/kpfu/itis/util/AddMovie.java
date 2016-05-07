package ru.kpfu.itis.util;

import ru.kpfu.itis.entities.MoviesEntity;
import ru.kpfu.itis.form.MovieForm;

/**
 * Created by Damir on 03.05.2016.
 */
public class AddMovie {

    public static MoviesEntity transform(MovieForm movieForm) {
        if (movieForm == null ) {
            return null;
        }
        MoviesEntity movie = new MoviesEntity();
        movie.setName(movieForm.getName());
        movie.setCountry(movieForm.getCountry());
        movie.setYear(movieForm.getYear());
        return movie;
    }
}
