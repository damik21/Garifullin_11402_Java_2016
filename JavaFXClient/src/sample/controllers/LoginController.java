package sample.controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import sample.connection.ServerAuthentication;

/**
 * Created by Damir on 24.05.2016.
 */
public class LoginController extends AbstractController {


    public Pane pane;
    public TextField login;
    public PasswordField password;
    public Label error;
    public Button buttonLog;

    public void handleSubmitAction(ActionEvent actionEvent) {
        ServerAuthentication authentication = new ServerAuthentication();
        if (authentication.tryAuth(login.getText(), password.getText())) {
            switch (ServerAuthentication.position) {
                case POSITION_ADMIN:
                    app.next("main");
                    break;
                case POSITION_PERSONAL:
                    error.setText("You are not admin!");
                    break;

                case POSITION_CLIENT:
                    error.setText("You are not admin!");
                    break;

                default:
                    app.next("login");
            }

        } else {
            error.setText(" Invalid login or password");
        }
    }
}
