
public class Atm {

	public static void main(String[] args) {
	Bank b1 = new Bank();
		
		Thread t1 = new Thread(b1);
				t1.setName("Tom");
		Thread t2 = new Thread(b1);
		
		t2.setName("Jerry");
		t1.start();
		t2.start();
	}

}
