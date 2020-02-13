package example_2_2_1;

public class Triangle extends Shape {
	private int base;
	private int height;
	
	public Triangle(String color, int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]" + " subclass of " + super.toString();
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0.5d*base*height;
	}
	
	
	
}
