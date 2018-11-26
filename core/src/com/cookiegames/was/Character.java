package com.cookiegames.was;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Character extends Actor implements KeyboardController {

	
	KeyboardController keyboardController; 
	Sprite sprite;
	
	public Character(Texture image) {	
		sprite = new Sprite(image);
		this.setBounds(getX(), getY(), sprite.getWidth(), sprite.getHeight());
		
	}
	
	@Override
	public void act(float delta) {
		// TODO Auto-generated method stub
		super.act(delta);
		
	}

	@Override
	public void addAction(Action action) {
		// TODO Auto-generated method stub
		super.addAction(action);
	}

	@Override
	public void setBounds(float x, float y, float width, float height) {
		// TODO Auto-generated method stub
		super.setBounds(x, y, width, height);
	}

	@Override
	public void draw(Batch batch, float parentAlpha) {
		KeyboardAction();
		sprite.draw(batch);
		sprite.setCenter(getX(), getY());
		
	}

	@Override
	public void KeyboardAction() {
		
	}
	

}
