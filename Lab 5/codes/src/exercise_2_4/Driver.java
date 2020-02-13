package exercise_2_4;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Manager("A", 50000d, "IT");
		Employee e2 = new Manager("B", 70000d, "Operations");
		Employee e3 = new Employee("C", 90000d);
		Employee e4 = new Employee("D",110000d);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
	}

}
