import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			System.out.println("Enter number " + (i+1) + ":");
			String num = br.readLine();
			sum += Integer.parseInt(num);
		}
		System.out.println("Sum = " + sum);
	}

}
