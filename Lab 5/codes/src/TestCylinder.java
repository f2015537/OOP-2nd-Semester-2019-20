
public class TestCylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder cy1 = new Cylinder();
		System.out.println("Radius is " + cy1.getRadius() + " Height is " + cy1.getHeight() + " Color is " + cy1.getColor() + " Base area is " + cy1.getArea() + " Volume is " + cy1.getVolume());
		Cylinder cy2 = new Cylinder(5d,2d);
		System.out.println("Radius is " + cy2.getRadius() + " Height is " + cy2.getHeight() + " Color is " + cy2.getColor() + " Base area is " + cy2.getArea() + " Volume is " + cy2.getVolume());
	}

}
