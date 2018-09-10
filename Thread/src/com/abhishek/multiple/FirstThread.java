package com.abhishek.multiple;

public class FirstThread extends Thread
{
	public void run()
	{
		for(int i=1; i<5; i++)
		{
			System.out.println("FirstThread:" + i);
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

