
public class Car {
	private int year;
	private String make;
	private double speed;
	
	Car(int year, String make, double speed) {
		super();
		this.year = year;
		this.make = make;
		this.speed = speed;
	}

	public int getYear() {
		return year;
	}

	public String getMake() {
		return make;
	}

	public double getSpeed() {
		return speed;
	}
	
	public void Accelerate() {
		speed++;
	}
	
	public void Accelerate(int increment) {
		speed += increment;
	}
	
	public void Break(int b) {
		speed -= Math.sqrt(b);
	}
}
