package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.controllers.AbstractController;

import java.io.IOException;

public class Main extends Application {

    private Stage someStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        someStage = primaryStage;
        someStage.setTitle("Cinema");
        next("login");
    }


    public static void main(String[] args) {
        launch(args);
    }

    public void next(String sceneName) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("scenes/" + sceneName + ".fxml"));
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        AbstractController controller = loader.getController();
        controller.setApp(this);

        someStage.setScene(new Scene(root));
        someStage.show();
    }
}
