package com.ljelectrar.game;

public interface GameConsole {

	/*
	 * Logic of a videoGame Console
	 *  -------------       
	 * | _|_   O  H  |
	 * |  |     X  A |
	 *  -------------       
	 *         
	 * */
	void printConsole();
	void up();
	void down();
	void left();
	void right();
}
