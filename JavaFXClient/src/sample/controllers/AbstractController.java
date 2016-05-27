package sample.controllers;

import javafx.event.ActionEvent;
import sample.Main;
import sample.connection.ServerConnection;

/**
 * Created by Damir on 24.05.2016.
 */
public abstract class AbstractController {

    public void setApp(Main app) {
        this.app = app;
    }

    protected Main app;

    protected ServerConnection server = new ServerConnection();


    public void handleMoviesPage(ActionEvent actionEvent) {
        app.next("allMovies");
    }

    public void handleFeedbacksPage(ActionEvent actionEvent) {
        app.next("allFeedbacks");
    }

    public void handleAddMovie(ActionEvent actionEvent) {
        app.next("addMovie");

    }

    public void handleMovieSessionsPage(ActionEvent actionEvent) {
        app.next("allMovieSessions");

    }

    public void handleAddMovieSession(ActionEvent actionEvent) {
        app.next("addMovieSession");
    }


    public void handlePersonalPage(ActionEvent actionEvent) {
        app.next("allPersonal");
    }





}
