package ru.kpfu.itis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.form.MovieForm;
import ru.kpfu.itis.form.MovieSessionForm;
import ru.kpfu.itis.form.PersonalForm;
import ru.kpfu.itis.service.*;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Damir on 02.05.2016.
 */
@Controller
@RequestMapping("/admin")
public class AdminPageController {

    @Autowired
    ClientService clientService;

    @Autowired
    PersonalService personalService;

    @Autowired
    HallsService hallsService;


    @Autowired
    MoviesService moviesService;


    @Autowired
    MoviesSessionService moviesSessionService;

    @RequestMapping(value = "/movies")
    public String getMoviesPage(Model model){
        List movies = moviesService.getAllMovies();
        model.addAttribute("movies", movies);
        return "all_movies";
    }

    @RequestMapping(value = "/movies/add", method = RequestMethod.GET)
    public String getMovieAddPage(Model model){
        model.addAttribute("movieform", new MovieForm());
        return "add_movie";
    }

    @RequestMapping(value = "/movies/add", method = RequestMethod.POST)
    public String getMovieAdd(@ModelAttribute("movieform") @Valid MovieForm movieForm, BindingResult result){

        if (result.hasErrors()) {
            return "add_movie";
        }

        moviesService.addMovie(movieForm);
        return "redirect:/admin/movies";
    }

    @RequestMapping(value = "/movie_sessions")
    public String getMovieSessionsPage(Model model){
        List moveiSessions = moviesSessionService.getAllMovieSessions();
        model.addAttribute("moviesessions", moveiSessions);
        return "all_movie_sessions";
    }

    @RequestMapping(value = "/movie_sessions/add", method = RequestMethod.GET)
    public String addMovieSessionsPage(Model model){
        List halls = hallsService.getAllHalls();
        List movies = moviesService.getAllMovies();
        ArrayList<String> time = new ArrayList<String>();
        time.add("SESSION_TIME_10");
        time.add("SESSION_TIME_12");
        time.add("SESSION_TIME_15");
        time.add("SESSION_TIME_18");
        time.add("SESSION_TIME_21");
        model.addAttribute("halls",halls);
        model.addAttribute("movies", movies);
        model.addAttribute("times",time);
        model.addAttribute("moviesessionform", new MovieSessionForm());
        return "add_movie_session";
    }

    @RequestMapping(value = "/movie_sessions/add", method = RequestMethod.POST)
    public String addMovieSessions(@ModelAttribute("movieform") @Valid MovieSessionForm movieSessionForm, BindingResult result){

        if (result.hasErrors()) {
            return "add_movie_session";
        }

        moviesSessionService.addMovie(movieSessionForm);
        return "redirect:/admin/movie_sessions";
    }

    @RequestMapping(value = "/halls")
    public String getProfilePage(Model model){
        List halls = hallsService.getAllHalls();
        model.addAttribute("all_halls", halls);
        return "all_halls";
    }
    @RequestMapping(method = RequestMethod.GET)
    public String getAdminPage() {

        return "admin_page";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String getPersonalRegisterPage(Model model) {
        model.addAttribute("personalform", new PersonalForm());
        return "new_personal";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String getClientRegistration(@ModelAttribute("personalform") @Valid PersonalForm registerForm, BindingResult result){

        if (result.hasErrors()) {
            return "new_personal";
        }

        personalService.registerPersonal(registerForm);
        return "redirect:/profile";
    }

    @RequestMapping(value = "/personal", method = RequestMethod.GET)
    public String getPersonalPage(Model model) {
        List personalEntity = personalService.getAllPersonal();
        model.addAttribute("personal", personalEntity);
        return "all_personal";
    }

    @RequestMapping(value = "/clients")
    public String getClientsPage(Model model) {
        List clientEntity = clientService.getAllClients();
        model.addAttribute("clients", clientEntity);
        return "all_clients";
    }



}
