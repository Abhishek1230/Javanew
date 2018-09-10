package com.abhishek.multiple;

public class TwoRuns 
{
	
		 public static void main(String args[])
		 {
			 FirstThread ft = new FirstThread();
			 SecondThread st = new SecondThread();
			 ft.start();
			 st.start();
			 try
			 {
				 ft.join();
				 st.join();
				
			 }
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}


}
