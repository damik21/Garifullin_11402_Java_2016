package ru.kpfu.itis.form;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import ru.kpfu.itis.entities.Position;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.sql.Date;

/**
 * Created by Damir on 29.04.2016.
 */

public class RegisterForm {
    @NotEmpty(message = "Field can't be empty")
    @Size(min = 2)
    private String name;

    @NotEmpty(message = "Field can't be empty")
    @Size(min = 5)
    private String surname;

    @Pattern(message = "Invalid data", regexp = "^[a-zA-Z][a-zA-Z0-9-_\\.]{8,16}")
    private String login;

    @NotEmpty(message = "Field can't be empty")
    @Email(message = "It is not email")
    private String email;

    @Size(min = 3, message = "Password is incorrect")
    private String password;

    @Size(min = 3, message = "Password is incorrect")
    private String repassword;

    @Enumerated(EnumType.STRING)
    private Position position;

    @NotNull
    private Date birthDay;

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
