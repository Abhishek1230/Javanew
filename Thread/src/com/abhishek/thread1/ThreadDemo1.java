package com.abhishek.thread1;



public class ThreadDemo1 extends Thread
{
	 public void run()
	 {
		 try
		 {
			 for(int i = 0;i<11;i++)
			 {
				 System.out.println("Hello" +i);
				 Thread.sleep(1000);
			 }
			 
		 }
		 catch(InterruptedException e)
		 {
			 e.printStackTrace();
		 }
		 
	 }
	public static void main(String[] args) {
	    ThreadDemo1 t1 = new ThreadDemo1();
	    t1.run();
	}

}
