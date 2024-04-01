package com.ljelectrar;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ljelectrar.game.GameConsole;
import com.ljelectrar.game.GameRunner;
import com.ljelectrar.game.MarioGame;
import com.ljelectrar.game.PacmanGame;
import com.ljelectrar.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(GameConfiguration.class)) {
			
			System.out.println(context.getBean(GameConsole.class).up());
			
		} catch (BeansException e) {
			e.printStackTrace();
		}

	}

}
