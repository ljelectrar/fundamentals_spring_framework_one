package com.ljelectrar;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

record Person (String name, int age) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public Person person() {
		var person = new Person("Leandro", 28);
	}
	
	@Bean
	public String name() {
		return "Mr Bean";
	}
	
	@Bean
	public int age() {
		return 70;
	}
	
	@Bean
	public String email() {
		return "mrbean@email.com";
	}
	
	@Bean
	public String mrBean() {
		
		return "	                _______________\r\n"
				+ "			MR BEAN CONTEXT\r\n"
				+ "			---------------\r\n"
				+ "		  |*-			-*|\r\n"
				+ "		  	  ________\r\n"
				+ "		  	 /-_______\\\r\n"
				+ "		  	/-         \\\r\n"
				+ "		    |   ______   ______\r\n"
				+ "		  	|( ((.) ) ((.) )\r\n"
				+ "		    |           \\\r\n"
				+ "		                (\\>\r\n"
				+ "		           \\-____-/    \r\n"
				+ "		          \r\n"
				+ "		          let's play \r\n"
				+ "	                -------------       \r\n"
				+ "		       | _|_   O  H  |\r\n"
				+ "		       |  |     X  A |\r\n"
				+ "		        -------------\r\n"
				+ "			  \r\n"
				+ "		|*_			   _*|";
		
		
		  
	}
	

}
