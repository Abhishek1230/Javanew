package com.abhishek.thread1;

public class UsingRunnable implements Runnable
{
	 public void run()
	 {
		 try
		 {
			 for(int i=1;i<11;i++)
			 System.out.println("Hello" +i);
			 Thread.sleep(5000);
		 }
		 catch(InterruptedException e)
		 {
			 e.printStackTrace();
		 }
	 }
	public static void main(String args[])
	{
		UsingRunnable ur = new UsingRunnable();
		Thread t1 = new Thread(ur);
		t1.start();
		
	}
	 
}
	
