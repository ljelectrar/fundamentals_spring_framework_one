package com.ljelectrar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ljelectrar.game.GameConsole;
import com.ljelectrar.game.GameRunner;
import com.ljelectrar.game.MarioGame;
import com.ljelectrar.game.PacmanGame;
import com.ljelectrar.game.SuperContraGame;

@Configuration
public class GameConfiguration {
	
	@Bean(name="Pacman")
	public GameConsole gamePacman() {
		return new PacmanGame();
	}
	
	@Bean(name="Super Contra")
	public GameConsole gameSuperContra() {
		return new SuperContraGame();
	}
	
	@Bean(name="Mario")
	public GameConsole gameMario() {
		return new MarioGame();
	}
}
