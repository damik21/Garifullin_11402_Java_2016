package ru.kpfu.itis.form;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


/**
 * Created by Damir on 29.04.2016.
 */

public class PersonalForm extends RegisterForm{

    @NotBlank(message = "Поле обязательно для заполнения")
    private String profession;

    private Integer salary;

    @Pattern(message = "Please, enter phone in +12345678900 or 12345678900 format.", regexp = "^[+\\d][\\d]{10,13}")
    private String phone;

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
