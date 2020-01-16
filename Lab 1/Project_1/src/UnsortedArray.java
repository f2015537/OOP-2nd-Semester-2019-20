
public class UnsortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = Integer.parseInt(args[0]);
		int arr[] = new int[args.length-1];
		for(int i = 1; i < args.length; i++)
			arr[i-1] = Integer.parseInt(args[i]);
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] + arr[j] == x)
					System.out.println(arr[i] + " " + arr[j]);
			}
		}
	}

}
