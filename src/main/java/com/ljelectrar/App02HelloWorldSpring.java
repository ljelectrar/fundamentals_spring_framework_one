package com.ljelectrar;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// Create a Spring Context
		var context = 
			new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//System.out.println(context.getBean("person_with_address"));
		
		//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		System.out.println(context.getBean(Person.class));
		System.out.println(context.getBean(Address.class));
		
		
		
		
		/*
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("mrBean"));
		System.out.println(context.getBean("person"));
		*/
		
		// Just another way to get a bean? 
		//System.out.println(context.getBean(Address.class));
		// If we add another Address type here, we will get an error using this type of calling
		/*
		System.out.println(context.getBean("Popaye"));
		
		System.out.println(context.getBean("Person3"));
		System.out.println(context.getBean("Person4"));
		
		System.out.println(context.getBean("Volta Redonda"));
		System.out.println(context.getBean("Barra Mansa"));
		*/
	}

}
