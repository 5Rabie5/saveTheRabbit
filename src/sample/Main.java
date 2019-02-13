package sample;

import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Move animation = new Move();


        Group root = new Group();
        Canvas canvas = new Canvas(1200, 800);
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();

        Scene scene = new Scene(root);
        Image background = new Image("sample/picture/background.jpg");
        canvas.getGraphicsContext2D().drawImage(background, 0, 0, 1200, 800);
        root.getChildren().add(canvas);

        Fox fox = new Fox();
        Rabbit rabbit = new Rabbit();

        ImageView foxView = fox.getImageView();
        ImageView rabbitView = rabbit.getImageView();
        root.getChildren().add(foxView);
        root.getChildren().add(rabbitView);
        Timeline timeline = new Timeline();
        primaryStage.setTitle("Save THe Rabbit");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
// scene.getStylesheets().add("style1.css");
// scene.getStylesheets().add(Main.class.getResource("style1.css").toExternalForm());
//        GraphicsContext gc = canvas.getGraphicsContext2D();
//        Image runingFox = new Image("sample/picture/runingFox.gif");
//        Image runingRabbit = new Image("sample/picture/runinRrabbit.gif");

//        canvas.getGraphicsContext2D().drawImage(runingFox, 0, 600, 150, 150);
//        canvas.getGraphicsContext2D().drawImage(runingRabbit, 400, 600, 150, 150);
//ImageView imageView = new ImageView(runingFox);
//       // ImageView imageView2 = new ImageView(runingRabbit);
//
//        root.getChildren().add(imageView);
//       // root.getChildren().add(imageView2);