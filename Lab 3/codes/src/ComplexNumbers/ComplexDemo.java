package ComplexNumbers;

public class ComplexDemo {

	public static void main(String[] args) {
		Complex c1 = new Complex(3d,4d);
		Double[] d = {7d,8d};
		Complex c2 = new Complex(d);
		System.out.println(c1.add(c2));
		System.out.println(c1.subtract(c2));
		System.out.println(c1.multiply(c2));
		System.out.println(c1.divide(c2));
	}

}
