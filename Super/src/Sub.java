
public class Sub extends Super {

	void Sample()
	{
		System.out.println("method sub class");
	}

public static void main(String args[])
{
	//Upcasting(Converting subclass type to a superclass type
   //Super obj = (Super) new Sub();
   //obj.Sample();
   //Downcasting(Converting superclass type to a sub class type
   Super obj = new Sub();
   Sub s = (Sub)obj;
   s.Sample();  
   
}
}