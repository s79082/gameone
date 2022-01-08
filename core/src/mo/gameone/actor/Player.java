package mo.gameone.actor;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

import java.awt.TextArea;

public class Player extends Image {
    public Player() {
        super(new Texture(Gdx.files.internal("enemie.png")));
        setScale(0.5f);
    }
}
