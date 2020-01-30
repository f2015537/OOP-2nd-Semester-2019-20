public class TestCircle{
	public static void main(String[] args) {
		Circle c1 = new Circle(2.3d);
		System.out.println(c1.area());
		
		Circle.getCircumference(2.3d);
		
		Circle c2 = new Circle(3.45d);
		System.out.println(c2.area());
		
		c2.getCircumference(3.45d);
	}
}