
public class MovablePoint implements Movable {
	int x;
	int y;
	int xSpeed;
	int ySpeed;
	
	

	@Override
	public String toString() {
		return "MovablePoint [x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}

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

}
