package com.ljelectrar;

import com.ljelectrar.game.GameRunner;
import com.ljelectrar.game.MarioGame;
import com.ljelectrar.game.PacmanGame;
import com.ljelectrar.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {

		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);

		gameRunner.run();

	}

}
