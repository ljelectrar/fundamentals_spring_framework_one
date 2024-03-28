package com.ljelectrar.game;

public class GameRunner {

	SuperContraGame superContraGame;

	public GameRunner(SuperContraGame superContraGame) {
		this.superContraGame = superContraGame;
	}
	
	public void run() {
		System.out.println("Super Contra is running...");
		superContraGame.up();
		superContraGame.down();
		superContraGame.left();
		superContraGame.right();
		superContraGame.printConsole();
	}

}
