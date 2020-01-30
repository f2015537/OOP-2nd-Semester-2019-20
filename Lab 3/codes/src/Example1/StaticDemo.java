package Example1;

 class MyStatic {
	int a;
	static int b;
	
	MyStatic() {
		super();
		b++;
	}
	
	public void showData() {
		System.out.println("Value of a = " + a);
		System.out.println("Value of b = " + b);
	}
	
	public static void increment() {
		//a++; Gives compilation error because non static variables cannot be accessed 
		// by static methods
	}
	
}

class StaticDemo {
	public static void main(String[] args) {
		MyStatic s1 = new MyStatic();
		s1.showData();
		MyStatic s2 = new MyStatic();
		s2.showData();
		MyStatic.b++;
		s1.showData();
	}
}

