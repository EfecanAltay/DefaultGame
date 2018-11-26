package com.cookiegames.scenes;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.cookiegames.was.Player;

public class GameScreen extends Scene {

	int x,y ;
	Player player ;
	
	SpriteBatch batch;
	
	public GameScreen(String SceneName,SpriteBatch sp) {
		super(SceneName);
		this.batch = sp ;
		player = new Player(new Texture("badlogic.jpg"));
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		player.draw(batch, 0f);
		
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
