package com.abhishek.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class HelloDemo 
{
	
	
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"bean.xml");
		
		Hello h1 = (Hello)context.getBean("Hello");
		h1.printhello();
	}
}
