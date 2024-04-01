package com.ljelectrar;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

record Person (String name, int age) {};
record Address (String city, String state) {};
record PersonWithAddress(String name, int age, Address adress) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public Person person() {
		return new Person("Leandro", 28);
	}
	
	@Bean(name="Popaye")
	public Person person2() {
		return new Person("Popaye", 28);
	}
	
	@Bean(name="Person3")
	public Person person3MethodCall() {
		// return from HelloWorldConfiguration.cass, methods: name() and age(), that are @Beans ;)
		return new Person(name(), age()); 
	}
	
	@Bean(name = "Person4")
	public Person person4ParametersCall(String name, int age) {
		return new Person(name, age);
	}
	
	@Bean(name="person_with_address")
	public PersonWithAddress personWithAddress(String name, int age, Address address) {
		return new PersonWithAddress(name, age, address);
	}
	
	@Bean(name="Volta Redonda")
	public Address address() {
		return new Address("Volta Redonda", "Rio de Janeiro");
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
