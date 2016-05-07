package ru.kpfu.itis.form;

import ru.kpfu.itis.entities.SessionTime;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import java.sql.Date;

/**
 * Created by Damir on 03.05.2016.
 */
public class MovieSessionForm {

    private Integer movieId;

    private Integer hallId;

    private Date date;

    @Enumerated(EnumType.STRING)
    private SessionTime time;

    private Integer price;

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Integer getHallId() {
        return hallId;
    }

    public void setHallId(Integer hallId) {
        this.hallId = hallId;
    }

    public SessionTime getTime() {
        return time;
    }

    public void setTime(SessionTime time) {
        this.time = time;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
