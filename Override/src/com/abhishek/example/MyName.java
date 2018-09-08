package com.abhishek.example;

class MyName
{
	
    public String meth(String s)
    {
        s = s + "  Hello";
         return s;
   }

	public static void main(String[] args)
	{
	MyName  a = new MyName();
	String xyz = a.meth("Abhishek");
	System.out.println(xyz);

              }

}
