package staticnestedclasses;

class StaticOuter {
	String a = "StaticOuter string";
	static String b = "StaticOuter static string";
	
	void seeStaticInner() {
		//System.out.println(nonstatic); nonstatic is not visible in this scope
		//System.out.println(StaticInner.nonstatic); cannot make a static reference to a non static field
		System.out.println(new StaticInner().nonstatic); //Legal
		System.out.println(StaticInner.s); //Legal
	}
	
	public static void main(String[] args) {
		//System.out.println(s); s is not visible in this scope
		System.out.println(StaticInner.s);
		StaticOuter so = new StaticOuter();
		so.seeStaticInner();
		System.out.println(new StaticInner().s2);
	}
	
	static class StaticInner {
		String nonstatic = "StaticInner nonstatic string";
		static String s = "StaticInner static string";
		private String s2 = "Hello";
		
		public static void main(String[] args) {
			// System.out.println(nonstatic); Cannot access non static variables from static methods
			System.out.println(s);
			System.out.println(b);
		}
	}
}

class SomeOther {
	public static void main(String[] args) {
		System.out.println(StaticOuter.StaticInner.s);
		StaticOuter.StaticInner si = new StaticOuter.StaticInner();
		System.out.println(si.nonstatic);
		System.out.println(si.s); // Not a good practice to call statc fields with object references
	}
}