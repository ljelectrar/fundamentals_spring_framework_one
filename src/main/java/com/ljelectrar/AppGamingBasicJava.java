package com.ljelectrar;

import com.ljelectrar.game.GameRunner;
import com.ljelectrar.game.MarioGame;
import com.ljelectrar.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {

		//var marioGame = new MarioGame();
		var superContra = new SuperContraGame();
		var gameRunner = new GameRunner(superContra);

		gameRunner.run();

	}

}
