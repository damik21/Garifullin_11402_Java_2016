package ru.kpfu.itis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.entities.MovieSessionsEntity;
import ru.kpfu.itis.form.MovieSessionForm;
import ru.kpfu.itis.repository.MoviesSessionsRepository;
import ru.kpfu.itis.service.MoviesSessionService;
import ru.kpfu.itis.util.AddMovieSession;

import java.util.List;

/**
 * Created by Damir on 03.05.2016.
 */
@Service
public class MoviesSessionServiceImpl implements MoviesSessionService {

    @Autowired
    MoviesSessionsRepository moviesSessionsRepository;

    @Override
    public void addMovie(MovieSessionForm movieSessionForm) {
        MovieSessionsEntity movieSessionsEntity = AddMovieSession.transform(movieSessionForm);
        moviesSessionsRepository.save(movieSessionsEntity);
    }

    @Override
    public MovieSessionsEntity getMovieSessionEntityById(Integer id) {
        return moviesSessionsRepository.findById(id);
    }

    @Override
    public List getAllMovieSessions() {
        return moviesSessionsRepository.findAll();
    }
}
