package com.abhishek.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Modify 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"cust.xml"});
		Service custA= (Service)context.getBean("service");
		custA.setMessage("message by custA");
		System.out.println("Message :" + custA.getMessage());
		Service custB = (Service)context.getBean("service");
		System.out.println("Message :" +custB.getMessage());
	}
}