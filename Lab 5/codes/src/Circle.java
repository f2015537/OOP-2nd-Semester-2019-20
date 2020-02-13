
public class Circle {
	private double radius;
	private String color;
	
	public Circle() {
		super();
		radius = 1d;
		color = "red";
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
		color = "red";
	}

	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	
}
