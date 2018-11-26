package com.cookiegames.was;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.cookiegames.scenes.GameScreen;
import com.cookiegames.scenes.SceneController;

public class RunClass extends ApplicationAdapter {
	SpriteBatch batch;
	
	SceneController sceneController ;
	@Override
	public void create () {
		batch = new SpriteBatch();
		
		sceneController = new SceneController();
		sceneController.CreateScreen("Game", new GameScreen("Level 1" ,batch));
		
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		sceneController.Render();
		batch.end();
	}
}
