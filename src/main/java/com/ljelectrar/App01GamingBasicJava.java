package com.ljelectrar;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ljelectrar.game.GameConsole;
import com.ljelectrar.game.GameRunner;
import com.ljelectrar.game.MarioGame;
import com.ljelectrar.game.PacmanGame;
import com.ljelectrar.game.SuperContraGame;

@Configuration
@ComponentScan("com.ljelectrar.game")
public class App01GamingBasicJava {

	@Bean
	public GameRunner gameRunner(GameConsole game) {
		System.out.println("Parameter: " + game);
		return new GameRunner(game);
	}

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(App01GamingBasicJava.class)) {
			context.getBean(GameConsole.class).up();
			context.getBean(GameRunner.class).run();

		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
}
