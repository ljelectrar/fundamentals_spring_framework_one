package com.ljelectrar.examples.e1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Normal bean or Normal Class
@Component
class NormalClass {

}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {
	
}

@Configuration
@ComponentScan
public class BeanScopeLaucherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(BeanScopeLaucherApplication.class)) {

			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));

		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
}
