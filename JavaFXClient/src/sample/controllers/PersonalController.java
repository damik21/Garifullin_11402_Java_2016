package sample.controllers;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import sample.entities.PersonalEntity;

/**
 * Created by Damir on 24.05.2016.
 */
public class PersonalController extends AbstractController{
    public TableView<PersonalEntity> personalTable;
    public TableColumn<PersonalEntity,String> name;
    public TableColumn<PersonalEntity,String> surname;
    public TableColumn<PersonalEntity,String> profession;
    public TableColumn<PersonalEntity,String> phone;
    public TableColumn<PersonalEntity,String> salary;

    @FXML
    private void initialize() {
        name.setCellValueFactory(cellData ->
                new SimpleStringProperty(String.valueOf(cellData.getValue().getId())));

        surname.setCellValueFactory(cellData ->
                new SimpleStringProperty(String.valueOf(cellData.getValue().getSurname())));

        profession.setCellValueFactory(cellData ->
                new SimpleStringProperty(String.valueOf(cellData.getValue().getProfession())));

        phone.setCellValueFactory(cellData ->
                new SimpleStringProperty(String.valueOf(cellData.getValue().getPhone())));

        salary.setCellValueFactory(cellData ->
                new SimpleStringProperty(String.valueOf(cellData.getValue().getSalary())));



        ObservableList<PersonalEntity> list = FXCollections.observableArrayList();
        list.addAll(server.getPersonal());


        personalTable.setItems(list);

    }
}
