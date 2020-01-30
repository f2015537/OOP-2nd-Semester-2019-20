package Exercises;

public class test2 {
	static int y;
	int z;
	public static void main(String[] args) {
		System.out.println(method1());
	}
	public static int method1() {
	    int x = 1; // static local variables are not allowed
		y++;
		//z++; Cannot access non static variables in static methods
		return x++;
	}
}
