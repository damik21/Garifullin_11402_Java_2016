package sample.controllers;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import sample.entities.MoviesEntity;

/**
 * Created by Damir on 24.05.2016.
 */
public class MoviesController extends AbstractController {

    public TableView<MoviesEntity> movieTable;
    public TableColumn<MoviesEntity,String> id;
    public TableColumn<MoviesEntity,String> name;
    public TableColumn<MoviesEntity,String> year;
    public TableColumn<MoviesEntity,String> country;

    @FXML
    private void initialize(){
        id.setCellValueFactory(cellData ->
                new SimpleStringProperty(String.valueOf(cellData.getValue().getId())));

        name.setCellValueFactory(cellData ->
                new SimpleStringProperty( cellData.getValue().getName()));

        year.setCellValueFactory(cellData ->
                new SimpleStringProperty(String.valueOf(cellData.getValue().getYear())));

        country.setCellValueFactory(cellData ->
                new SimpleStringProperty(cellData.getValue().getCountry()));



        ObservableList<MoviesEntity> list = FXCollections.observableArrayList();
        list.addAll(server.getMovies());

        movieTable.setItems(list);

    }
}
