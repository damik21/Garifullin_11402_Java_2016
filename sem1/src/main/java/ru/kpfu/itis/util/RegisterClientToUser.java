package ru.kpfu.itis.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ru.kpfu.itis.entities.ClientEntity;
import ru.kpfu.itis.entities.Position;
import ru.kpfu.itis.form.RegisterForm;

import java.util.Objects;

/**
 * Created by Damir on 02.05.2016.
 */
public class RegisterClientToUser {
    static BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public static ClientEntity transform(RegisterForm registerForm) {
        if (registerForm == null || (!Objects.equals(registerForm.getPassword(), registerForm.getRepassword()))) {
            return null;
        }
        ClientEntity client = new ClientEntity();
        client.setName(registerForm.getName());
        client.setSurname(registerForm.getSurname());
        client.setLogin(registerForm.getLogin());
        client.setEmail(registerForm.getEmail());
        client.setBirthDay(registerForm.getBirthDay());
        client.setPassword(encoder.encode(registerForm.getPassword()));
        client.setPosition(Position.POSITION_CLIENT);
        return client;
    }

}
