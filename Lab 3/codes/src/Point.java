
public class Point {
	private double x;
	private double y;
	
	Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public String toString() {
		return "X= " + x + " Y= "+ y;
	}
	
	public static void changeState(Point other) {
		other.setX(-20d);
		other.setY(-20d);
	}
	
	public static void changeReference(Point other) {
		other = new Point(-20, -20);
	}
	
}
