import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class MovableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		MovablePoint[] mpoints = new MovablePoint[10];
		for(int i = 0; i < 10; i++)
			mpoints[i] = new MovablePoint(r.nextInt(100),r.nextInt(100),r.nextInt(100),r.nextInt(100));
		System.out.println("Unsorted Points:");
		System.out.println(Arrays.toString(mpoints));
		System.out.println("Points sorted by xSpeed");
		Arrays.sort(mpoints, new sortByxSpeed());
		System.out.println(Arrays.toString(mpoints));
		System.out.println("Points sorted by ySpeed");
		Arrays.sort(mpoints, new sortByySpeed());
		System.out.println(Arrays.toString(mpoints));

	}
}

interface Movable {
	void moveUp();
	void moveDown();
	void moveLeft();
	void moveRight();
}

class MovablePoint implements Movable {

	int x,y,xSpeed,ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super();
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		y -= ySpeed;
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		y += ySpeed;
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		x -= xSpeed;
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		x += xSpeed;
	}

	@Override
	public String toString() {
		return "MovablePoint [x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}
	
}

class sortByxSpeed implements Comparator<MovablePoint>{

	@Override
	public int compare(MovablePoint o1, MovablePoint o2) {
		// TODO Auto-generated method stub
		return o1.xSpeed - o2.xSpeed;
	}
	
}

class sortByySpeed implements Comparator<MovablePoint>{

	@Override
	public int compare(MovablePoint o1, MovablePoint o2) {
		// TODO Auto-generated method stub
		return o1.ySpeed - o2.ySpeed;
	}
	
}

class MovableCircle implements Movable,Comparable<MovableCircle> {

	private int radius;
	private MovablePoint center;
	
	
	public MovableCircle(int radius,int x, int y, int xSpeed, int ySpeed) {
		super();
		this.radius = radius;
		this.center = new MovablePoint(x,y,xSpeed,ySpeed);
	}

	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		center.moveUp();
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		center.moveDown();
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		center.moveLeft();
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		center.moveRight();
	}

	@Override
	public int compareTo(MovableCircle o) {
		// TODO Auto-generated method stub
		return this.radius - o.radius;
	}

	@Override
	public String toString() {
		return "MovableCircle [radius=" + radius + ", center=" + center + "]";
	}
	
}

