package org.escoladeltreball.jackthegiant;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class mainClass extends Game {
	SpriteBatch batch;
	Texture img;
	Texture player1;

	/*
	Solo uno por juego(SpriteBatch)
	 */
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("Game BG.png");
		player1=new Texture("Player 1.png");

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.draw(player1,gameInfo.h_width-(player1.getWidth()/2),gameInfo.h_height-(player1.getHeight()/2));
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
