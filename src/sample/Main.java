package sample;

import javafx.animation.Animation;
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


        // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Group root = new Group();
        Canvas canvas = new Canvas(1200, 800);
        Scene scene = new Scene(root);
       // scene.getStylesheets().add("style1.css");
       // scene.getStylesheets().add(Main.class.getResource("style1.css").toExternalForm());
        Image background = new Image("sample/picture/background.jpg");
        Image runingFox = new Image("sample/picture/runingFox.gif");
        Image runingRabbit = new Image("sample/picture/runinRrabbit.gif");
       // canvas.getGraphicsContext2D().drawImage(background,0,0);
        canvas.getGraphicsContext2D().drawImage(background,0,0,1200,800);
        canvas.getGraphicsContext2D().drawImage(runingFox,0,600,150,150);
        canvas.getGraphicsContext2D().drawImage(runingRabbit,400,600,150,150);
        root.getChildren().add(canvas);

        GraphicsContext gc = canvas.getGraphicsContext2D();






        primaryStage.setTitle("Save THe Rabbit");
        primaryStage.setScene(scene);


        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
