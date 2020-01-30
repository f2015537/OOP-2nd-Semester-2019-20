
public class Circle {
	static double PI;
	private double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
		Circle.PI = 3.141d;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return PI * radius * radius;
	}
	
	public static void getCircumference(double radius) {
		System.out.println("Circumference " + 2 * PI * radius);
	}
}

