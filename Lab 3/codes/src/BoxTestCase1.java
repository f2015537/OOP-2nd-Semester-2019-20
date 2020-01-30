
public class BoxTestCase1 {

	public static void main(String[] args) {
		BOX b1 = new BOX(10,40,60);
		BOX b2 = new BOX(20,30,80);
		System.out.println(b1);
		System.out.println(b2);
		BOX.swapBoxes(b1, b2);
		System.out.println(b1);
		System.out.println(b2);
	}

}
