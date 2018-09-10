package com.abhishek.stir;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run2 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Module.xml");

		Person obj = (Person) context.getBean("Ability.xml");
		
	}
}