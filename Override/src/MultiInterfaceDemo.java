
public class MultiInterfaceDemo implements interface3
{
	public void display()
	{
		System.out.println("From Display");
	}
	public void show()
	{
		System.out.println("From show");
	}
	public void illustrate()
	{
		System.out.println("Form illustrate");
	
	}
	public static void main(String[] args)
	{
	MultiInterfaceDemo mid = new MultiInterfaceDemo();
	mid.display();
	mid.show();
	mid.illustrate();
	}

}
