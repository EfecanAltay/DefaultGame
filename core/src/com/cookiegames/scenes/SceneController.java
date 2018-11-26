package com.cookiegames.scenes;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;

public class SceneController {
	Screen current_screen ;
	ArrayList<Scene> screenList;
	
	public SceneController() {
		screenList = new ArrayList<Scene>();
		current_screen = null ;
	}
	
	public void CreateScreen(String name ,Scene s) {
		screenList.add(s);
		current_screen = s;
	}
	public boolean ChangeScreen(String sceneName ) {
		for(Scene ss : screenList ) {
			if(ss.sceneName.equals(sceneName)) {
				current_screen = ss;
				return true ;
			}
		}
		return false ;
	}
	void SetScreen(Screen screen) {
		this.current_screen = screen; 
		current_screen.show();
	}
	public void Render() {
		if(current_screen != null)
			current_screen.render(Gdx.app.getGraphics().getDeltaTime());
	}
}
