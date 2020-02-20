package innerclasses;

public class Outer {
	Inner i1 = new Inner();
	private String s = "Outer String";
	void getS() {
		System.out.println(s);
	}
	void getInnerS() {
		System.out.println(i1.s);
	}
	class Inner {
		private String s = "Inner String";
		void getS() {
			System.out.println(s);
		}
		void getOuterS() {
			System.out.println(Outer.this.s);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		Outer.Inner oi = o.new Inner();
		o.getS();
		o.getInnerS();
		oi.getS();
		oi.getOuterS();
	}

}
