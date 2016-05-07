package ru.kpfu.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.entities.MovieSessionsEntity;
import ru.kpfu.itis.entities.SessionTime;

import java.util.List;

/**
 * Created by Damir on 03.05.2016.
 */
@Repository
public interface MoviesSessionsRepository extends JpaRepository<MovieSessionsEntity,Integer> {

    List findByHallId(Integer id);

    List findByMovieId(String name);

    List findByPrice(String name);

    List findByTime(SessionTime time);

    MovieSessionsEntity findById(Integer id);
}
