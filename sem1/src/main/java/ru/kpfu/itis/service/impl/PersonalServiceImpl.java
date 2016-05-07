package ru.kpfu.itis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.itis.entities.PersonalEntity;
import ru.kpfu.itis.form.PersonalForm;
import ru.kpfu.itis.repository.PersonalRepository;
import ru.kpfu.itis.service.PersonalService;
import ru.kpfu.itis.util.RegPersToUser;

import java.util.List;

/**
 * Created by Damir on 02.05.2016.
 */
@Service
public class PersonalServiceImpl implements PersonalService {

    @Autowired
    PersonalRepository personalRepository;

    @Override
    public List<PersonalEntity> getAllPersonal() {
        return personalRepository.findAll();
    }

    @Override
    public PersonalEntity getPersonalEntityById(Integer id) {
        return personalRepository.findById(id);
    }


    public void registerPersonal(PersonalForm personalForm) {
        PersonalEntity personalEntity = RegPersToUser.transform(personalForm);
        personalRepository.save(personalEntity);
    }

}
