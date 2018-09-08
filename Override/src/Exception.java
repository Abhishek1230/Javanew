
public class Exception {
	public static void main(String[] args)
	{
		int a = 10,b = 0; 
		try {
		int c=a/b;
		}
		catch(ArithmeticException g)
		{
			System.out.println("There is exception  "+g);
		}
		finally
		{
		System.out.println("Okay");
	}
	}

}
