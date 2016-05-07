package ru.kpfu.itis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.entities.HallsEntity;
import ru.kpfu.itis.repository.HallsRepository;
import ru.kpfu.itis.service.HallsService;

import java.util.List;

/**
 * Created by Damir on 02.05.2016.
 */
@Service
public class HallsServiceImpl implements HallsService {

    @Autowired
    HallsRepository hallsRepository;

    @Override
    public HallsEntity getHallEntityById(Integer id) {
        return hallsRepository.findById(id);
    }

    @Override
    public List getAllHalls() {
        return hallsRepository.findAll();
    }
}
