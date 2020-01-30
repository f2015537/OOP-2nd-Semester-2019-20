
public class BOX {
	private double length, width, height;

	BOX(double length, double width, double height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return "BOX [length=" + length + ", width=" + width + ", height=" + height + "]";
	}
	
	public double area() {
		return 2 * (length * width + width * height + height * length);
	}
	
	public double volume() {
		return length*width*height;
	}
	
	public static void swapBoxes(BOX b1, BOX b2) {
		BOX temp = b1;
		b1 = b2;
		b2 = temp;
	}
}
