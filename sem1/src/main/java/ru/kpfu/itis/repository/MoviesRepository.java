package ru.kpfu.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.entities.MoviesEntity;

/**
 * Created by Damir on 02.05.2016.
 */
@Repository
public interface MoviesRepository extends JpaRepository<MoviesEntity, Integer> {

    MoviesEntity findByName(String name);

    MoviesEntity findById(Integer id);

}
