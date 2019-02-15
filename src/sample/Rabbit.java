package sample;

import javafx.animation.KeyValue;
import javafx.beans.property.DoubleProperty;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Rabbit extends Movable {
    private Integer step = 10;
     public DoubleProperty  postionX;

      @Override
    ImageView getImageView() {

          ImageView rabbitView = new ImageView(new Image("sample/picture/runinRrabbit.gif"));
          rabbitView.setFitWidth(150);
          rabbitView.setFitHeight(150);
          rabbitView.setX(300);
          rabbitView.setY(600);
          postionX=rabbitView.xProperty();
          return rabbitView;


    }
        @Override
    KeyValue getKeyValue() {
        return  new KeyValue(postionX, 1200);
    }





 }
