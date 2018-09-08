import java.io.*;
public class ThrowsDemo 
{
	public static void display()
	{
	  try
	  {
		  FileInputStream fis = new FileInputStream("Shape.java");
	  }
	  catch(FileNotFoundException e)
	  {
		  System.out.println("Problem in finding file" +e.getMessage());
	  }
	  System.out.println("From display method file successfully opened");
	}
	public static void show() throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream("ExceptionHandled.java");
		System.out.println("From show method file successfully opened");
		
	}
	public static void main(String args[])throws FileNotFoundException
	{
		display();
		show();
	}
	
}
