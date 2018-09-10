package com.mkyong.common;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class ProductDemo 
{
	public void perform()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Spring0 p = (Spring0) ctx.getBean("prod");
	p.printName();
	}
	

public static void main(String[] args) {
	ProductDemo demo = new ProductDemo();
	demo.perform();
}
}
