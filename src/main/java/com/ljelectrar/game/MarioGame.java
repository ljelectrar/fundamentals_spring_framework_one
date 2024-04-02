package com.ljelectrar.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MarioGameQualifier")
public class MarioGame implements GameConsole {
	
	private String name;
	

	public void up() {
		System.out.println("Juuump");
	}

	public void down() {
		System.out.println("Goo into a hole");
	}

	public void left() {
		System.out.println("Go back...");
	}

	public void right() {
		System.out.println("Accelerate!");
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
