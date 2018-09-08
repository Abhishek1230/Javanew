package com.abhishek.example;


public class method1            
 {                                      
	public String meth1(String str1)
	{
	 Method2 m2 = new Method2();
	  str1 = m2.meth2(str1) + " Tekgroup";
	 return str1;
	}
 

public static void main(String[] args)
	    {
	        method1 m1 = new method1();
	       
	       String mystr = m1.meth1("Hi");
	     
	        System.out.println(mystr);
	 }
 }


