
public class PointTest {

	public static void main(String[] args) {
		
		Point p1 = new Point(10,20);
		System.out.println(p1);
		Point.changeState(p1);
		System.out.println(p1);
		
		Point p2 = new Point(100, 200);
		System.out.println(p2);
		Point.changeReference(p2);
		System.out.println(p2);
	}

}
