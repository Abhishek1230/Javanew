
public class Bank implements Runnable
{
	int balance = 100;
	@Override
	public synchronized void  run()
	{
		System.out.println(Thread.currentThread().getName() + "came here!!!");
		 for(int i = 0;i<10;i++)
		 {
			 System.out.println(Thread.currentThread().getName()+"  doing the transaction");
		  if(balance>0)
		  {
			  balance = balance - 10;
		  }
		  else
		  {
			  System.out.println("No balance");
		  }
		  try
		  { 
			  Thread.sleep(1000);
		  
		  }catch(InterruptedException e)
		  {
			e.printStackTrace();
		  }
		 }
		 
	}
}
