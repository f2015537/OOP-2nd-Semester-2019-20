package example_2_2_1;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Rectangle("red", 4, 5);
		System.out.println(s1);
		System.out.println("Area is " + s1.getArea());
		Shape s2 = new Triangle("blue", 4, 5);
		System.out.println(s2);
		System.out.println("Area is " + s2.getArea());
		
		//Shape s3 = new Shape("green"); Cannot instantiate an interface or abstract class
	}

}
