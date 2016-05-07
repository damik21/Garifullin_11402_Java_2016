package ru.kpfu.itis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.entities.GeneralUserEntity;
import ru.kpfu.itis.entities.TicketsEntity;
import ru.kpfu.itis.form.TicketForm;
import ru.kpfu.itis.repository.TicketsRepository;
import ru.kpfu.itis.service.TicketService;
import ru.kpfu.itis.util.AddTicket;

import java.util.List;

/**
 * Created by Damir on 03.05.2016.
 */
@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketsRepository ticketsRepository;

    @Override
    public List getAllTickets() {
        return ticketsRepository.findAll();
    }

    @Override
    public List getTicketsPaid(boolean bool) {
        return ticketsRepository.findByPaid(bool);
    }

    @Override
    public TicketsEntity getTicketEntityById(Integer id) {
        return ticketsRepository.findById(id);
    }

    @Override
    public void addTicket(TicketForm ticketForm, GeneralUserEntity person) {
        TicketsEntity ticketsEntity = AddTicket.transform(ticketForm, person);
        ticketsRepository.save(ticketsEntity);
    }

    @Override
    public void editTicket(int id) {
        TicketsEntity ticketsEntity =  ticketsRepository.findById(id);
        ticketsEntity.setPaid(true);
        ticketsRepository.saveAndFlush(ticketsEntity);
    }
}
