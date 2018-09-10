
public class MotorCar implements Suzuki, Ford

{
	public void body()
	{
		System.out.println("Fits Suzuki body");
		
	}
	public void engine()
	{
		System.out.println("Fits fors engione");
		
	}
	
	public static void main(String args[])
	{

		MotorCar mc1 = new MotorCar();
		mc1.body();
		mc1.engine();
	}
}

