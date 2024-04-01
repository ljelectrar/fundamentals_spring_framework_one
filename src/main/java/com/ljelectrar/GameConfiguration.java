package com.ljelectrar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ljelectrar.game.GameConsole;
import com.ljelectrar.game.GameRunner;
import com.ljelectrar.game.PacmanGame;

@Configuration
public class GameConfiguration {
	
	@Bean(name="Pacman")
	public GameConsole game() {
		return new PacmanGame();
	}
	
	@Bean
	public GameRunner gameRunner() {
		return new GameRunner(game()); 
	}
	
	/*
	@Bean(name="Super Contra")
	public GameConsole gameSuperContra() {
		return new SuperContraGame();
	}
	
	@Bean(name="Mario")
	public GameConsole gameMario() {
		return new MarioGame();
	}
	*/
}
