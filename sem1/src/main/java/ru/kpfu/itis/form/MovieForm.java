package ru.kpfu.itis.form;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * Created by Damir on 03.05.2016.
 */
public class MovieForm {

    @NotEmpty(message = "Field can't be empty")
    @Size(min = 1, max = 50, message = "Max 50 symbols")
    private String name;

    @NotEmpty(message = "Field can't be empty")
    @Size(min = 2, max = 20, message = "Max 20 symbols")
    private String country;


    private int year ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
