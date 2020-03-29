import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arlTest = new ArrayList();
		System.out.println("Size of ArrayList at creation: " + arlTest.size());
		arlTest.add("B");
		arlTest.add("I");
		arlTest.add("T");
		arlTest.add("S");
		
		System.out.println("Size of the ArrayList after adding elements: " + arlTest.size());
		System.out.println("List of all elements: " + arlTest);
		arlTest.remove("B");
		System.out.println("See contents after removing one element: " + arlTest);
		arlTest.remove(2);
		System.out.println("See contents after romoving element by index: " + arlTest);
		System.out.println("Size of arrayList after removing elements: " + arlTest.size());
		System.out.println(arlTest.contains("T"));
	}

}
