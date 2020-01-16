import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		int arr[] = new int[n];
		arr[0] = 1;
		arr[1] = 1;
		int sum = 0;
		int avg = 1;
		for(int i = 2; i < n; i++) {
			arr[i] = arr[i-1] + arr[i-2];
			sum += arr[i];
		}
		if(n > 2) avg = sum/n;
		System.out.println(Arrays.toString(arr));
		System.out.println(avg);
			
	}

}
