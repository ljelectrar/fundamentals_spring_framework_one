package com.ljelectrar.examples.a1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/*
 * Dependencies
 * */
@Component
class MyBusinessDependencyClass {
	
	@Autowired
	DependencyOne dependencyOne;
	
	@Autowired
	DependencyTwo dependencyTwo;
	
	public String toString() {
		return "Using dependency " + dependencyOne + "\n and \n" + dependencyTwo;
	}
}

@Component
class DependencyOne {
	
}

@Component
class DependencyTwo {
	
}


@Configuration
@ComponentScan
public class DependencyInjectionLaucherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(DependencyInjectionLaucherApplication.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(MyBusinessDependencyClass.class));
			
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
}