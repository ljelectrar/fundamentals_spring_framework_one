package com.ljelectrar.examples.f1;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class PrePostAnnotationContextLaucherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationContextLaucherApplication.class)) {

			

		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
}
