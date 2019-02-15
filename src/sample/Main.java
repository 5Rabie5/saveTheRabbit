package sample;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.stream.Stream;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Group root = new Group();

        Canvas canvas = new Canvas(1200, 800);
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();

        Scene scene = new Scene(root);
        Image background = new Image("sample/picture/background.jpg");
        graphicsContext.drawImage(background, 0, 0, 1200, 800);
        root.getChildren().add(canvas);

        Fox fox = new Fox();
        Rabbit rabbit = new Rabbit();

        ImageView foxView = fox.getImageView();
        ImageView rabbitView = rabbit.getImageView();

        root.getChildren().add(foxView);
        root.getChildren().add(rabbitView);

        Group qustionGroup = new Group();
        root.getChildren().add(qustionGroup);
        Button button = new Button("move rabbit one step");


        final KeyFrame keyFrameF = new KeyFrame(Duration.millis(9000), fox.getKeyValue());
        final KeyFrame keyFrameR = new KeyFrame(Duration.millis(9000), rabbit.getKeyValue());
        Timeline timelineFox = new Timeline(keyFrameF);
        Timeline timelineRabbit = new Timeline(keyFrameR);



        timelineFox.setCycleCount(Timeline.INDEFINITE);
        timelineFox.play();

        timelineRabbit.setCycleCount(Timeline.INDEFINITE);
        timelineRabbit.play();

        button.setOnAction(e-> {
            System.out.println(timelineRabbit.getCurrentTime());

            timelineRabbit.jumpTo(timelineRabbit.getCurrentTime().add(Duration.millis(1000)) );

//            long count = Stream.of(timeline)
//
//                    .count();

            //System.out.println(count);

        });




        qustionGroup.getChildren().add(button);
        qustionGroup.setLayoutX(canvas.getWidth()/2);

        qustionGroup.setLayoutY(canvas.getHeight()*0.50);



        primaryStage.setTitle("Save THe Rabbit");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
