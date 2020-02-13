package exercise_1_2;

class A {
	public int a = 100;
	public int fun(int x) {
		return x*2;
	}
}
class B extends A {
//	public int a = 80;
	public int fun(int x) {
		return x*3;
	}
}
class C extends B {
	public int a = 60;
	public int fun(int x) {
		return x*4;
	}
}
class D extends C {
	public int a = 40;
	public int fun(int x) {
		return x*5;
	}
}
class E extends D {
	public int a = 10;
	
	public void show() {
		int a = 0;
		System.out.println(new A().a);
		System.out.println(new B().a);
		System.out.println(new C().a);
		System.out.println(new D().a);
		System.out.println(new E().a);
		System.out.println(a);
	}
}

class ExTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new E().show();
		A a1 = new E();
		D d1 = (D)a1; // d1 cannot directly refer to A type variable so we have to downcast explicitly
		System.out.println(a1.fun(34)); // Run time polymorphism
		B b1 = new E();
		System.out.println(b1.a); // Instance fields are binded at compile time
	}

}
