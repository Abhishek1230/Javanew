package com.abhishek.test1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Run 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("File1.xml");

		Output output = (Output)context.getBean("OutputHelper");
    	        output.generateOutput();
	}
}
	

