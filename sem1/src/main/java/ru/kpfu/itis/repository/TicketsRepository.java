package ru.kpfu.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.entities.TicketsEntity;

import java.util.List;

/**
 * Created by Damir on 03.05.2016.
 */
@Repository
public interface TicketsRepository extends JpaRepository<TicketsEntity, Integer> {

    List findByBuyerId(Integer id);

    TicketsEntity findById(Integer id);

    List findByPaid(Boolean bool);

    List findByMovieSessionsId(Integer id);

}
