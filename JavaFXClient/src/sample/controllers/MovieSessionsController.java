package sample.controllers;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import sample.entities.MovieSessionsEntity;
import sample.entities.MoviesEntity;

import java.awt.*;

/**
 * Created by Damir on 24.05.2016.
 */
public class MovieSessionsController extends AbstractController {
    public TableView<MovieSessionsEntity> msTable;
    public TableColumn<MovieSessionsEntity, String> id;
    public TableColumn<MovieSessionsEntity, String> movie;
    public TableColumn<MovieSessionsEntity, String> hall;
    public TableColumn<MovieSessionsEntity, String> date;
    public TableColumn<MovieSessionsEntity, String> time;
    public TableColumn<MovieSessionsEntity, String> price;

    @FXML
    private void initialize() {
        id.setCellValueFactory(cellData ->
                new SimpleStringProperty(String.valueOf(cellData.getValue().getId())));

        movie.setCellValueFactory(cellData ->
                new SimpleStringProperty(String.valueOf(cellData.getValue().getMovieName())));

        date.setCellValueFactory(cellData ->
                new SimpleStringProperty(String.valueOf(cellData.getValue().getDate())));

        hall.setCellValueFactory(cellData ->
                new SimpleStringProperty(String.valueOf(cellData.getValue().getHallId())));

        time.setCellValueFactory(cellData ->
                new SimpleStringProperty(String.valueOf(cellData.getValue().getTime())));

        price.setCellValueFactory(cellData ->
                new SimpleStringProperty(String.valueOf(cellData.getValue().getPrice())));


        ObservableList<MovieSessionsEntity> list = FXCollections.observableArrayList();
        list.addAll(server.getMovieSessions());
        ObservableList<MoviesEntity> movies = FXCollections.observableArrayList();
        movies.addAll(server.getMovies());
        for (MovieSessionsEntity c : list) {
            for (MoviesEntity a: movies) {
                if (c.getMovieId().equals(a.getId())){
                    c.setMovieName(a.getName());
                }
            }
        }


        msTable.setItems(list);

    }
}
