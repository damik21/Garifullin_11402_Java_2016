package ru.kpfu.itis.form;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by Damir on 03.05.2016.
 */
public class TicketForm {

    private Integer movieSessionsId;

    private Boolean paid;

    private Integer buyerId;

    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getMovieSessionsId() {
        return movieSessionsId;
    }

    public void setMovieSessionsId(Integer movieSessionsId) {
        this.movieSessionsId = movieSessionsId;
    }


    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

}
