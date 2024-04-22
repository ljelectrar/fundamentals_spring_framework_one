package com.ljelectrar.examples.d1;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {
	
}

@Lazy
@Component
class ClassB {
	
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		
		System.out.println("Initialization logic...");
		this.classA = classA;
	}
	
	public void methodToDoSomenthing() {
		System.out.println("Je suis enchanté avec toi...");
	}
}

@Configuration
@ComponentScan
public class LazyInitializationLaucherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(LazyInitializationLaucherApplication.class)) {
			
			System.out.println("Initialization of context is completed...");
			context.getBean(ClassB.class).methodToDoSomenthing();
			

		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
}
