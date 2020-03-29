
public class Anonymous {
	
	public Circle getCircle(int radius) {
		return new Circle(radius) {

			@Override
			public double area() {
				// TODO Auto-generated method stub
				return Math.PI * super.area();
			}
			
		};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous p = new Anonymous();
		Circle w = p.getCircle(10);
		System.out.println(w.area());
	}

}

class Circle {
	private int rad;

	public Circle(int rad) {
		super();
		this.rad = rad;
	}
	
	public double area() {
		return rad*rad;
	}
}