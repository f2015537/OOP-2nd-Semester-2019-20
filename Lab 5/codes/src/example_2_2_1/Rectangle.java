package example_2_2_1;

public class Rectangle extends Shape {
	private int length;
	private int width;
	
	public Rectangle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]" + " subclass of " + super.toString();
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length*width;
	}
	
	
}
