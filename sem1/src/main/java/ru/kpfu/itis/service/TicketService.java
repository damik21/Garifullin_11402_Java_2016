package ru.kpfu.itis.service;

import ru.kpfu.itis.entities.GeneralUserEntity;
import ru.kpfu.itis.entities.TicketsEntity;
import ru.kpfu.itis.form.TicketForm;

import java.util.List;

/**
 * Created by Damir on 03.05.2016.
 */
public interface TicketService {

    List getAllTickets();

    List getTicketsPaid(boolean bool);

    TicketsEntity getTicketEntityById(Integer id);

    void addTicket(TicketForm ticketForm, GeneralUserEntity person);

    void editTicket(int id);

}
