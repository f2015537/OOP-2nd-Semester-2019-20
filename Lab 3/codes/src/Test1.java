
public class Test1 {

	public static void main(String[] args) {
		Integer I = new Integer(10);
		Integer J = new Integer(20);
		System.out.println(I.intValue());
		System.out.println(I);
		System.out.println(J.intValue());
		System.out.println(J);
		Integer K1 = new Integer(I.intValue() + J.intValue());
		Integer K2 = I + J + K1;
		System.out.println(K2);
	}

}
