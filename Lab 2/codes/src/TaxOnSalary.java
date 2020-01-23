import java.util.Scanner;

public class TaxOnSalary {
	private double salary;
	private boolean isPANsubmitted;
	static Scanner sc = new Scanner(System.in);
	
	public TaxOnSalary(boolean isPANsubmitted) {
		super();
		this.isPANsubmitted = isPANsubmitted;
		salary = 1000d;
	}

	public TaxOnSalary() {
		super();
		salary = 0d;
		isPANsubmitted = false;
	}

	public double getSalary() {
		return salary;
	}

	public boolean isPANsubmitted() {
		return isPANsubmitted;
	}
	
	public double calculateTax() {
		if(salary < 180000 && isPANsubmitted) {
			return 0d;
		}
		else if (salary < 180000 && !isPANsubmitted) {
			return 0.05 * salary;
		}
		else if (salary > 180000 && salary < 500000) {
			return 0.10 * salary;
		}
		else if(salary > 500000 && salary < 1000000) {
			return 0.20 * salary;
		}
		else if (salary > 1000000) {
			return 0.30 * salary;
		}
		return -1d; // Sentinel Value
	}
	
	public void inputSalary() {
		System.out.println("Please enter salary");
		this.salary = sc.nextDouble();
	}
}
