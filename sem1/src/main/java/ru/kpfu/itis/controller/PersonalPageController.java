package ru.kpfu.itis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.entities.TicketsEntity;
import ru.kpfu.itis.service.*;
import java.util.List;

/**
 * Created by Damir on 03.05.2016.
 */
@Controller
@RequestMapping(value = "/personal")
public class PersonalPageController {
    @Autowired
    MoviesSessionService moviesSessionService;

    @Autowired
    HallsService hallsService;

    @Autowired
    TicketService ticketService;

    @Autowired
    PersonalService personalService;

    @RequestMapping(method = RequestMethod.GET)
    public String getPersonalPage(Model model){

        return "personal_page";
    }

    @RequestMapping(value = "/tickets",  method = RequestMethod.GET)
    public String getPaidTicketsPage(Model model){
        List tickets = ticketService.getTicketsPaid(false);
        model.addAttribute("tickets", tickets);
        return "paid_tickets";
    }

    @RequestMapping(value = "/tickets/all",  method = RequestMethod.GET)
    public String getTicketsPage(Model model){
        List tickets = ticketService.getAllTickets();
        model.addAttribute("tickets", tickets);
        return "all_tickets";
    }

    @RequestMapping(value = "/tickets/{d}",  method = RequestMethod.GET)
    public String getPaidTicketPage(Model model, @PathVariable("d") int d){
        TicketsEntity ticket = ticketService.getTicketEntityById(d);
        if (ticket.getPaid()){
            model.addAttribute("message", "This ticket is paid!");
            return "redirect:/personal/tickets";
        }
        model.addAttribute("ticket",ticket);
        return "ticket_page";
    }
    @RequestMapping(value = "/tickets/{d}",  method = RequestMethod.POST)
    public String getPaidTicketAddPage(Model model, @PathVariable("d") int d){
        ticketService.editTicket(d);
        return "redirect:/personal/tickets";
    }


}
