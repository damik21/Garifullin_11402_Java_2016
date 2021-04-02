package sample.controllers;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import sample.entities.FeedbackEntity;
/**
 * Created by Damir on 24.05.2016.
 */
public class FeedbacksController extends AbstractController {
    public TableView<FeedbackEntity> feedbacksTable;
    public TableColumn<FeedbackEntity,String>  login;
    public TableColumn<FeedbackEntity,String> message;

    @FXML
    private void initialize(){
        login.setCellValueFactory(cellData ->
                new SimpleStringProperty(String.valueOf(cellData.getValue().getClient().getLogin())));

        message.setCellValueFactory(cellData ->
                new SimpleStringProperty( cellData.getValue().getMessage()));



        ObservableList<FeedbackEntity> list = FXCollections.observableArrayList();
        list.addAll(server.getFeedbacks());

        feedbacksTable.setItems(list);

    }
}
