
public class Thread1
{
  public static void main(String[] args)
  {
	  Thread t1 = Thread.currentThread();
	  System.out.println("CurrentThread:" +t1);
	  
	  t1.setName("My current threaD");
	  System.out.println("After the name change:" +t1);
	  try
	  {
		  for(int i = 5;i>0;i--)
			  System.out.println(i);
		  Thread.sleep(1000);	  
	}
	  catch(InterruptedException e)
	  {
		  System.out.println("Main thread interru[ted:");
	  }
	  
  }
}
