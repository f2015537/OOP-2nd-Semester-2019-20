package example_2_2_1;

abstract public class Shape {
	private String color;

	public Shape(String color) {
		super();
		this.color = color;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
	
	abstract public double getArea();
}
