package ru.kpfu.itis.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ru.kpfu.itis.entities.PersonalEntity;
import ru.kpfu.itis.entities.Position;
import ru.kpfu.itis.form.PersonalForm;

import java.util.Objects;

/**
 * Created by Damir on 02.05.2016.
 */
public class RegPersToUser {

    static BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public static PersonalEntity transform(PersonalForm personalForm) {
        if (personalForm == null || (!Objects.equals(personalForm.getPassword(), personalForm.getRepassword()))) {
            return null;
        }

        PersonalEntity personal = new PersonalEntity();
        personal.setName(personalForm.getName());
        personal.setSurname(personalForm.getSurname());
        personal.setEmail(personalForm.getEmail());
        personal.setLogin(personalForm.getLogin());
        personal.setBirthDay(personalForm.getBirthDay());
        personal.setPassword(encoder.encode(personalForm.getPassword()));
        personal.setPosition(Position.POSITION_PERSONAL);
        personal.setProfession(personalForm.getProfession());
        personal.setSalary(personalForm.getSalary());
        personal.setPhone(personalForm.getPhone());
        return  personal;
    }
}
