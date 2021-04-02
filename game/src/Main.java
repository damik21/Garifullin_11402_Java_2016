import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene; 
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;


/**
 * Created by Damir on 26.05.2016.
 */
public class Main extends Application {

    private enum UserAction {NONE, LEFT, RIGHT}

    private static final int appWidht = 800;
    private static final int appHeight = 600;
    private static final int ballRadius = 10;
    private static final int platformWidht = 100;
    private static final int platformHeight = 20;
    private Circle ball = new Circle(ballRadius);
    private Rectangle platform = new Rectangle(platformWidht, platformHeight);
    private boolean ballUp = true;
    private boolean ballLeft = false;
    private UserAction userAction = UserAction.NONE;
    private Timeline timeline = new Timeline();
    private boolean running = true;
    private Label score = new Label();
    private FillTransition fade = new FillTransition(Duration.millis(1000),platform, Color.BLUE,Color.BLACK);

    private Parent createContent() {
        Pane root = new Pane();
        root.setPrefSize(appWidht, appHeight);
        platform.setTranslateX(appWidht / 2);
        platform.setTranslateY(appHeight - platformHeight);
        platform.setFill(Color.GREEN);
        KeyFrame frame = new KeyFrame(Duration.seconds(0.02), event -> {
            if (!running) {
                return;
            }
            switch (userAction) {
                case LEFT:
                    if (platform.getTranslateX() - 5 >= 0) {
                        platform.setTranslateX(platform.getTranslateX() - 5);
                    }
                    break;
                case RIGHT:
                    if (platform.getTranslateX() + platformWidht + 5 <= appWidht) {
                        platform.setTranslateX(platform.getTranslateX() + 5);
                    }
                    break;
                case NONE:
                    break;
            }

            ball.setTranslateX(ball.getTranslateX() + (ballLeft ? -5 : 5));
            ball.setTranslateY(ball.getTranslateY() + (ballUp ? -5 : 5));

            if (ball.getTranslateX() - ballRadius == 0) {
                ballLeft = false;
            } else if (ball.getTranslateX() + ballRadius == appWidht) {
                ballLeft = true;
            }

            if (ball.getTranslateY() - ballRadius == 0) {
                ballUp = false;
            } else if (ball.getTranslateY() + ballRadius == appHeight - platformHeight
                    && ball.getTranslateX() + ballRadius >= (platform.getTranslateX() - 5)
                    && ball.getTranslateX() + ballRadius <= (platform.getTranslateX() + 5 + platformWidht)) {
                int a = Integer.parseInt(score.getText().substring(8)) + 1;
                score.setText("Score : " + a );
                ballUp = true;
            }
            if (ball.getTranslateY() + ballRadius == appHeight) {
                restartGame();
            }

        });

        fade.setAutoReverse(true);
        fade.setCycleCount(Timeline.INDEFINITE);
        timeline.getKeyFrames().add(frame);
        timeline.setCycleCount(Timeline.INDEFINITE);
        score.setTranslateX(0);
        score.setTranslateY(0);
        root.getChildren().addAll(ball, platform,score);
        return root;
    }

    private void restartGame() {
        stopGame();
        startGame();
    }

    private void startGame() {
        ballUp = true;
        ball.setTranslateX(appWidht / 2);
        ball.setTranslateY(appHeight / 2);
        score.setText("Score : 0");
        timeline.play();
        running = true;
        fade.play();
    }

    private void stopGame() {
        running = false;
        timeline.stop();
        fade.pause();
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(createContent());
        scene.setOnKeyPressed( event -> {
            switch (event.getCode()){
                case LEFT:
                    userAction = UserAction.LEFT;
                    break;
                case RIGHT:
                    userAction = UserAction.RIGHT;
                    break;
            }
        });

        scene.setOnKeyReleased( event -> {
            switch (event.getCode()){
                case LEFT:
                    userAction = UserAction.NONE;
                    break;
                case RIGHT:
                    userAction = UserAction.NONE;
                    break;
            }
        });

        primaryStage.setTitle("TennisTetris");
        primaryStage.setScene(scene);
        primaryStage.show();

        startGame();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
