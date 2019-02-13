package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Rabbit extends Movable {
    private Integer step = 10;
    public Integer postionX;

      @Override
    ImageView getImageView() {

          ImageView rabbitView = new ImageView(new Image("sample/picture/runinRrabbit.gif"));
          rabbitView.setFitWidth(150);
          rabbitView.setFitHeight(150);
          rabbitView.setX(300);
          rabbitView.setY(600);
          return rabbitView;


    }

    @Override
    void move() {
        postionX += step;
    }

}
