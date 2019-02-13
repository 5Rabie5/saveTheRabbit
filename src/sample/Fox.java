package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Fox extends Movable {
    private Integer step = 20;
    public Integer postionX;

    @Override
    ImageView getImageView() {

        ImageView foxView = new ImageView(new Image("sample/picture/runingFox.gif"));
        foxView.setFitWidth(150);
        foxView.setFitHeight(150);
        foxView.setX(0);
        foxView.setY(600);
        return foxView;
    }

    @Override
    void move() {
        postionX += step;
    }

}
