
public class AssistantSurgeon 
{
	public void controlBleeding()
	{
		System.out.println("Do not apply pressure");
	}
	public void closeWound()
	{
		System.out.println("Do not close the wound");
	}
	public static void main(String args[])
	{
		AssistantSurgeon as = new AssistantSurgeon();
		as.controlBleeding();
		as.closeWound();
	}

}
