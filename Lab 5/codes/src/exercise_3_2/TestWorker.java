package exercise_3_2;

public class TestWorker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker w1 = new FullTimeWorker("A", 100d, 210);
		Worker w2 = new HourlyWorker("B", 50d, 50);
		System.out.println(w1.computePay());
		System.out.println(w2.computePay());
	}

}

abstract class Worker {
	private String name;
	private double salary_rate;
	
	public Worker(String name, double salary_rate) {
		super();
		this.name = name;
		this.salary_rate = salary_rate;
	}

	public String getName() {
		return name;
	}

	public double getSalary_rate() {
		return salary_rate;
	}
	
	abstract public double computePay();
}

class FullTimeWorker extends Worker {
	private int hours_Worked;
	
	public FullTimeWorker(String name, double salary_rate, int hourse_Worked) {
		super(name, salary_rate);
		this.hours_Worked = hourse_Worked;
	}

	@Override
	public double computePay() {
		// TODO Auto-generated method stub
		double pay = (hours_Worked <= 240) ? hours_Worked*getSalary_rate(): 240*getSalary_rate();
		return pay;
	}
	
}

class HourlyWorker extends Worker {
	private int hours_Worked;

	public HourlyWorker(String name, double salary_rate, int hours_Worked) {
		super(name, salary_rate);
		this.hours_Worked = hours_Worked;
	}
	
	@Override
	public double computePay() {
		// TODO Auto-generated method stub
		double pay = (hours_Worked <= 60) ? hours_Worked*getSalary_rate(): 60*getSalary_rate();
		return pay;
	}
}