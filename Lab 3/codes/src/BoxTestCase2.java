
public class BoxTestCase2 {

	public static void main(String[] args) {
		BOX b1 = new BOX(10,40,60);
		BOX b2 = new BOX(20,30,80);
		System.out.println(b1);
		System.out.println(b2);
		BOX temp = b1;
		b1 = b2;
		b2 = temp;
		System.out.println(b1);
		System.out.println(b2);
	}

}
