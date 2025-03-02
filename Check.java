package polymorphism;

public class Check {
	public static void main(String[] args) {
		Check c = new Check();
		Employee e = new Employee();
		System.out.println("Employee");

		Employee e1 = new Developer();
		e1.work();

		Employee e2 = new Tester();
		e2.work();

	}
}
