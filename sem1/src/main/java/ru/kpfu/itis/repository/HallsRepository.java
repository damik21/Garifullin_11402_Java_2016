package ru.kpfu.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.entities.HallsEntity;

/**
 * Created by Damir on 02.05.2016.
 */
@Repository
public interface HallsRepository extends JpaRepository<HallsEntity,Integer> {

    HallsEntity findById(Integer id);

    HallsEntity findByName(String login);
}
