package sample;

import javafx.animation.KeyValue;
import javafx.beans.property.DoubleProperty;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Fox extends Movable {
   // private Integer step = 20;
    public DoubleProperty  postionX;
    public  Image fox;

    public Image getFox() {
        return new Image("sample/picture/runingFox.gif");
    }

    public Integer getStep() {
        return 20;
    }

    @Override
    ImageView getImageView() {

        ImageView foxView = new ImageView(new Image("sample/picture/runingFox.gif"));
        foxView.setFitWidth(150);
        foxView.setFitHeight(150);
        foxView.setX(0);
        foxView.setY(600);
        postionX=foxView.xProperty();
        return foxView;
    }


    public Double getPostionX() {
        return getImageView().getX();
    }





    @Override
    KeyValue getKeyValue() {
        return  new KeyValue(postionX, 1200);
    }

}
