package ru.kpfu.itis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.entities.ClientEntity;
import ru.kpfu.itis.entities.GeneralUserEntity;
import ru.kpfu.itis.form.TicketForm;
import ru.kpfu.itis.service.*;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by Damir on 02.05.2016.
 */
@Controller
@RequestMapping("/client")
public class ClientGlobalController {

    @Autowired
    ClientService clientService;
    @Autowired
    MoviesSessionService moviesSessionService;

    @Autowired
    HallsService hallsService;

    @Autowired
    TicketService ticketService;

    @Autowired
    PersonalService personalService;

    @RequestMapping(method = RequestMethod.GET)
    public String getProfilePage(Model model){
        GeneralUserEntity person = (GeneralUserEntity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String role = String.valueOf(person.getPosition());

        if (role.equals("POSITION_ADMIN")){
            return "redirect:/admin";
        }

        if (role.equals("POSITION_PERSONAL")) {
            return "redirect:/personal";
        }

        ClientEntity client = clientService.getClientEntityById(person.getId());
        model.addAttribute("client", client);
        return "profile";
    }
    @RequestMapping(value = "/tickets/add", method = RequestMethod.POST)
    public String getTicketAdd(@ModelAttribute("ticketform") @Valid TicketForm ticketForm, BindingResult result){
        if (result.hasErrors()) {
            return "add_ticket";
        }
        GeneralUserEntity person = (GeneralUserEntity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        ticketService.addTicket(ticketForm, person);
        return "redirect:/profile";
    }
    @RequestMapping(value = "/tickets/add", method = RequestMethod.GET)
    public String getTicketAddPage(Model model){
        List halls = hallsService.getAllHalls();
        List movieSessions = moviesSessionService.getAllMovieSessions();
        model.addAttribute("halls",halls);
        model.addAttribute("moviesessions", movieSessions);
        model.addAttribute("ticketform", new TicketForm());
        return "add_ticket";
    }

}
