package polymorphism;

public class Myntra {
	void shopping(int cost) {
		System.out.println(cost);
	}

	void shopping(String name) {
		System.out.println(name);
	}

	void shopping(int cost, String name) {
		System.out.println(cost + name);
	}

	void shopping(double salary) {
		System.out.println(salary);
	}
}
