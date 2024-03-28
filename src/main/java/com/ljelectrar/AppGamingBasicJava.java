package com.ljelectrar;

import com.ljelectrar.game.GameRunner;
import com.ljelectrar.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {

		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);

		gameRunner.run();

	}

}
