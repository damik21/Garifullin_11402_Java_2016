package ru.kpfu.itis.service;

import org.springframework.data.domain.PageRequest;
import ru.kpfu.itis.entities.PersonalEntity;
import ru.kpfu.itis.form.PersonalForm;

import java.util.List;

/**
 * Created by Damir on 02.05.2016.
 */
public interface PersonalService {

    List getAllPersonal();

    PersonalEntity getPersonalEntityById(Integer id);

    void registerPersonal(PersonalForm personalForm);
}
