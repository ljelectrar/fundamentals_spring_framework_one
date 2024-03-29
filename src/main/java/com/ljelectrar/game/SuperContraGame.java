package com.ljelectrar.game;

public class SuperContraGame implements GameConsole {
	
	private String name;
	
	public void up() {
		System.out.println("up");
	}
	
	public void down() {
		System.out.println("Sit down");
	}
	
	public void left() {
		System.out.println("Go back...");
	}
	
	public void right() {
		System.out.println("Shoot a bullet");
	}
	
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
