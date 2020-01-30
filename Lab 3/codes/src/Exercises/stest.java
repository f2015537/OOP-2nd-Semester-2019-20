package Exercises;

public class stest {
	private static String[] str;
	
	static {
		System.out.println("1.%");
	}
	
	public static void main(String args) {
		System.out.println("2.@");
	}
	
	static {
		System.out.println("3.&");
	}
	
	static {
		test.main(str);
//		stest.main(str); Compilation error
		System.out.println("4.~");
	}
	
	static {
		System.out.println("5.$");
	}

}
