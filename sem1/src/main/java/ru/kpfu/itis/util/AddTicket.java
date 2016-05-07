package ru.kpfu.itis.util;

import ru.kpfu.itis.entities.GeneralUserEntity;
import ru.kpfu.itis.entities.TicketsEntity;
import ru.kpfu.itis.form.TicketForm;

/**
 * Created by Damir on 03.05.2016.
 */
public class AddTicket {


    public static TicketsEntity transform(TicketForm ticketForm, GeneralUserEntity person) {
        if (ticketForm == null ) {
            return null;
        }
        TicketsEntity ticket = new TicketsEntity();
        ticket.setBuyerId(person.getId());
        ticket.setMovieSessionsId(ticketForm.getMovieSessionsId());
        ticket.setCount(ticketForm.getCount());
        ticket.setPaid(false);
        return ticket;
    }
}
