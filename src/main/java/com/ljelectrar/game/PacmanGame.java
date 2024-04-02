package com.ljelectrar.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GameConsole {

	@Override
	public void up() {
		System.out.println("Up");
	}

	@Override
	public void down() {
		System.out.println("down");
	}

	@Override
	public void left() {
		System.out.println("left");
	}

	@Override
	public void right() {
		System.out.println("right");
	}

	@Override
	public void printConsole() {
		System.out.println(""
				+ "\r\n"
				+ "	 Logic of a videoGame Console\r\n"
				+ "	  -------------       \r\n"
				+ "	 | _|_   O  H  |\r\n"
				+ "	 |  |     X  A |\r\n"
				+ "	  -------------       \r\n"
				+ "	         \r\n");
	}
}
