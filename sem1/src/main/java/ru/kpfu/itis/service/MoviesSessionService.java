package ru.kpfu.itis.service;

import ru.kpfu.itis.entities.MovieSessionsEntity;
import ru.kpfu.itis.form.MovieSessionForm;

import java.util.List;

/**
 * Created by Damir on 03.05.2016.
 */
public interface MoviesSessionService {

    void addMovie(MovieSessionForm movieSessionForm);

    MovieSessionsEntity getMovieSessionEntityById(Integer id);

    List getAllMovieSessions();

}
