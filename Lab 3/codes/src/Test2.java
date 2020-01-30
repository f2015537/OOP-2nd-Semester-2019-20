
public class Test2 {

	public static void main(String[] args) {
		Integer I = 10; 
		Integer J = 20; 
		System.out.println(I.intValue());
		System.out.println(I);
		System.out.println(J.intValue());
		System.out.println(J);
		Integer K1 = new Integer(I.intValue()+J.intValue());
		Integer K2 = I + J + K1;
		System.out.println(K2);
	}

}
