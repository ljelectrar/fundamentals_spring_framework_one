package com.ljelectrar.game;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ljelectrar.game")
public class GamingAppLaucherApplication {

	@Bean
	public GameRunner gameRunner(GameConsole game) {
		System.out.println("Parameter: " + game);
		return new GameRunner(game);
	}

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GamingAppLaucherApplication.class)) {
			context.getBean(GameConsole.class).up();
			context.getBean(GameRunner.class).run();

		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
}
