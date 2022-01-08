package mo.gameone.actor;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Enemy extends Image {
    public Enemy() {
        super(new Texture(Gdx.files.internal("enemie.png")));
        scaleBy(-0.5f);
    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }


}
