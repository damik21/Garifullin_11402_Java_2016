package ru.kpfu.itis.util;

import ru.kpfu.itis.entities.MovieSessionsEntity;
import ru.kpfu.itis.form.MovieSessionForm;

/**
 * Created by Damir on 03.05.2016.
 */
public class AddMovieSession {


    public static MovieSessionsEntity transform(MovieSessionForm movieSessionForm) {
        if (movieSessionForm == null) {
            return null;
        }
        MovieSessionsEntity movieSession = new MovieSessionsEntity();
        movieSession.setHallId(movieSessionForm.getHallId());
        movieSession.setMovieId(movieSessionForm.getMovieId());
        movieSession.setPrice(movieSessionForm.getPrice());
        movieSession.setTime(movieSessionForm.getTime());
        movieSession.setDate(movieSessionForm.getDate());
        return movieSession;
    }

}
