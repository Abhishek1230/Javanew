
public class UseAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Dog d = new Dog();
  Animal a = (Animal)d;
  d.callme();
  d.callme();
  ((Dog) a).callme2();
		  
	}

}
