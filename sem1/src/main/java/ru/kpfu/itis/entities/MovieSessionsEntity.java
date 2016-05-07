package ru.kpfu.itis.entities;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Damir on 29.04.2016.
 */
@Entity
@Table(name = "movie_sessions", uniqueConstraints = @UniqueConstraint(columnNames={"hall_id","time","date"}))
public class MovieSessionsEntity {
    private Integer id;
    private Integer movieId;
    private Integer hallId;

    private SessionTime time;
    private Integer price;
    private Date date;


    @Column(name = "date", nullable = false)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "movie_id", nullable = false)
    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    @Column(name = "hall_id", nullable = false)
    public Integer getHallId() {
        return hallId;
    }

    public void setHallId(Integer hallId) {
        this.hallId = hallId;
    }

    @Enumerated(EnumType.STRING)
    public SessionTime getTime() {
        return time;
    }

    public void setTime(SessionTime time) {
        this.time = time;
    }

    @Column(name = "price", nullable = false)
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MovieSessionsEntity that = (MovieSessionsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (movieId != null ? !movieId.equals(that.movieId) : that.movieId != null) return false;
        if (hallId != null ? !hallId.equals(that.hallId) : that.hallId != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (movieId != null ? movieId.hashCode() : 0);
        result = 31 * result + (hallId != null ? hallId.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}
