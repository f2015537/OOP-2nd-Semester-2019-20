
// Wrong solution, please make a PR if you can code the right solution

public class Unique3DigitNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "5714";
		String s2 = "7145";
		String s3 = "1457";
		String s4 = "4571";
		helper(s1);
		helper(s2);
		helper(s3);
		helper(s4);
	}
	
	private static void helper(String s) {
		for(int i = 0; i < s.length(); i++) {
			String output1 = Character.toString(s.charAt(i));
//			System.out.println(output1);
			for(int j = i+1; j < s.length(); j++) {
				String output2 = output1 + Character.toString(s.charAt(j));
//				System.out.println(output2);
				for(int k = j+1; k < s.length(); k++) {
					String output3 = output2 + Character.toString(s.charAt(k));
					System.out.println(output3);
				}
			}
		}
	}

}
