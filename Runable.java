package polymorphism;

public class Runable {
	public static void main(String[] args) {
		Vechicle v1 = new Car();
		v1.Speed();
		
		System.out.println("---------------");
		
		Vechicle v2 = new Bike();
		v2.Speed();
		
		
	}
}
