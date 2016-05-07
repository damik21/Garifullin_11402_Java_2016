package ru.kpfu.itis.service;

import ru.kpfu.itis.entities.ClientEntity;
import ru.kpfu.itis.form.RegisterForm;

import java.util.List;

/**
 * Created by Damir on 02.05.2016.
 */
public interface ClientService {


    void registerClient(RegisterForm registerForm);

    ClientEntity getClientEntityById(Integer id);

    List getAllClients();

}
