package ru.kpfu.itis.entities;

import javax.persistence.*;

/**
 * Created by Damir on 29.04.2016.
 */
@Entity
@Table(name = "tickets")
public class TicketsEntity {

    private Integer id;
    private Integer movieSessionsId;
    private Boolean paid;
    private Integer count;
    private Integer buyerId;

    @Column(name = "count", nullable = false)
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
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

    @Column(name = "movie_session_id", nullable = false)
    public Integer getMovieSessionsId() {
        return movieSessionsId;
    }

    public void setMovieSessionsId(Integer movieSessionsId) {
        this.movieSessionsId = movieSessionsId;
    }


    @Column(name = "paid", nullable = false)
    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    @Column(name = "buyer_id", nullable = false)
    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TicketsEntity that = (TicketsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (movieSessionsId != null ? !movieSessionsId.equals(that.movieSessionsId) : that.movieSessionsId != null)
            return false;
        if (paid != null ? !paid.equals(that.paid) : that.paid != null) return false;
        return buyerId != null ? buyerId.equals(that.buyerId) : that.buyerId == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (movieSessionsId != null ? movieSessionsId.hashCode() : 0);
        result = 31 * result + (paid != null ? paid.hashCode() : 0);
        result = 31 * result + (buyerId != null ? buyerId.hashCode() : 0);
        return result;
    }
}
