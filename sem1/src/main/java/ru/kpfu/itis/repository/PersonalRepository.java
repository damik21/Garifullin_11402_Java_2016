package ru.kpfu.itis.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.entities.PersonalEntity;

import java.util.List;

/**
 * Created by Damir on 03.05.2016.
 */
@Repository
public interface PersonalRepository extends JpaRepository<PersonalEntity,Long> {

    List<PersonalEntity> findAll();

    PersonalEntity findByLogin(String login);

    PersonalEntity findById(Integer id);

    void deleteById(Integer id);
}
