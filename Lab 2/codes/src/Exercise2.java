import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char c = sc.next().charAt(0);
		System.out.println("AScii value: " + (int)c);
		sc.close();
	}

}
