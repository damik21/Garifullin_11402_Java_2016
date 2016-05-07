package ru.kpfu.itis.service;

import ru.kpfu.itis.entities.MoviesEntity;
import ru.kpfu.itis.form.MovieForm;

import java.util.List;

/**
 * Created by Damir on 03.05.2016.
 */
public interface MoviesService {

    void addMovie(MovieForm movieForm);

    MoviesEntity getMovieEntityById(Integer id);

    List getAllMovies();
}
