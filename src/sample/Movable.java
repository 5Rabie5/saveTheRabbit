package sample;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.beans.property.DoubleProperty;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public abstract class Movable {



    abstract ImageView getImageView();



     abstract KeyValue getKeyValue();

}
