package com.ljelectrar.test;

import java.io.Serializable;

/**
JAVA BEAN: 
Classes adhering to 3 three constraints:
Have public default (no argument) constructors
Allow access to their properties using getter and setter methods
Implement java.io.Serializable

POJO: 
Plain old Java Object
No constrains
Any Java Object is a POJO

SPRING BEAN: 
Any Java object that is managed by Spring
Spring uses IOC Container (Bean Factory or Application Context) to manage these objects
 * */


// POJO: Plain Old Java Object 
class Pojo {
	private String text;
	private int number;
	
	public String toString() {
		return text + ": " + number;
	}
}

class JavaBean implements Serializable {
	
	private String text;
	private int number;
	
	// A default constructor -> !noArguments
	public JavaBean() {
		
	}
	
	// Getters and Setters
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	};
}

public class SpringBeanVsJavaBeanAndPojo {
	
	public static void main(String[] args) {
		Pojo pojo = new Pojo();
		System.out.println(pojo);
	}
}
