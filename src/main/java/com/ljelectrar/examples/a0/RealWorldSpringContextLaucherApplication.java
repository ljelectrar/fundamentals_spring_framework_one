package com.ljelectrar.examples.a0;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ljelectrar.examples.c1.BusinessCalculationService;
import com.ljelectrar.examples.c1.MySqlDataService;

@Configuration
@ComponentScan
public class RealWorldSpringContextLaucherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(RealWorldSpringContextLaucherApplication.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			

		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
}
