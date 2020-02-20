

public class TestMovable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movable m1  = new MovablePoint(5,6,10,15);
		System.out.println(m1);
		m1.moveLeft();
		System.out.println(m1);
		
		Movable m2 = new MovableCircle(2,1,2,20,5);
		System.out.println(m2);
		m2.moveRight();
		System.out.println(m2);

	}

}
