package ru.kpfu.itis.service;

import ru.kpfu.itis.entities.HallsEntity;

import java.util.List;

/**
 * Created by Damir on 02.05.2016.
 */
public interface HallsService {

    HallsEntity getHallEntityById(Integer id);

    List getAllHalls();
}
