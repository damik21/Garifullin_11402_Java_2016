package ru.kpfu.itis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.entities.MoviesEntity;
import ru.kpfu.itis.form.MovieForm;
import ru.kpfu.itis.repository.MoviesRepository;
import ru.kpfu.itis.service.MoviesService;
import ru.kpfu.itis.util.AddMovie;

import java.util.List;

/**
 * Created by Damir on 03.05.2016.
 */
@Service
public class MoviesServiceImpl implements MoviesService {

    @Autowired
    MoviesRepository moviesRepository;

    @Override
    public void addMovie(MovieForm movieForm) {
        MoviesEntity moviesEntity = AddMovie.transform(movieForm);
        moviesRepository.save(moviesEntity);
    }

    @Override
    public MoviesEntity getMovieEntityById(Integer id) {
        return moviesRepository.findById(id);
    }

    @Override
    public List getAllMovies() {
        return moviesRepository.findAll();
    }
}
