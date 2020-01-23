import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Your First Name: ");
		String name = br.readLine();
		System.out.println("Your name is: " + name);
	}

}
