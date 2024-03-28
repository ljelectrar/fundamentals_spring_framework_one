package com.ljelectrar.game;

public class GameRunner {

	MarioGame game;

	public GameRunner(MarioGame game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Gaming is runnig " + game);
		game.up();
		game.down();
		game.lef();
		game.right();
	}	

}
