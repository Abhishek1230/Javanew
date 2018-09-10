package com.abhishek;

public class StaticVariable 
{
	int a;
	static int b;
	public static void main(String ar1[])
	{
		StaticVariable s1 = new StaticVariable();
		StaticVariable s2 = new StaticVariable();
		System.out.println(++s1.a);
		System.out.println(++s1.b);
		System.out.println(++s2.a);
		System.out.println(++s2.b);
	
	}
	
}
