package mo.gameone;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;

import java.awt.Image;
import java.awt.RenderingHints;

import mo.gameone.actor.Enemy;
import mo.gameone.actor.Player;

public class GameOneApplicationAdapter extends ApplicationAdapter implements InputProcessor {
	Stage stage;
	Group enemies;
	Player player;
	
	@Override
	public void create () {
		Gdx.input.setInputProcessor(this);

		player = new Player();
		enemies = new Group();
		enemies.addActor(new Enemy());
		stage = new Stage();
		stage.addActor(enemies);
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		stage.act();
		stage.draw();
	}
	
	@Override
	public void dispose () {
	}

	@Override
	public boolean keyDown(int character) {
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		float dispX = 0;
		if (character == 'd')
			dispX = 1;
		if (character == 'a')
			dispX = -1;

		dispX *= 5;
		enemies.moveBy(dispX, 0);
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		return false;
	}

	@Override
	public boolean scrolled(float amountX, float amountY) {
		return false;
	}
}
