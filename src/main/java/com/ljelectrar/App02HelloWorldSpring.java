package com.ljelectrar;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// Create a Spring Context
		var context = 
			new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("mrBean"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean(Address.class)); // Just another way to get a bean?
		System.out.println(context.getBean("address"));
		System.out.println(context.getBean("Leandro"));
	}

}
