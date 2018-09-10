package com.abhishek.multiple;

public class SecondThread extends Thread {
 public void run()
 {
	 for(int i=1;i<5;i++)
	 {
	  System.out.println("Second Thread "+i);
	  try
	  {
		  Thread.sleep(1000);
		  
	  }
	  catch(InterruptedException e)
	  {
		  e.printStackTrace();
	  }
	}
 }
}
 
 