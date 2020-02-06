import java.util.Arrays;

public class RetailStoreExample extends RetailStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index;
		RetailStore retailOne = new RetailStore();
		
		String description = retailOne.fetchDescription(1004);
		String[] StringArray;
		StringArray = description.split("\\s");
		String type = StringArray[2];
		System.out.println("The type of the item is " + type);
		System.out.println("the charactor at starting position is " + type.charAt(0));
		index = type.indexOf('-');
		String stringFromSubstring = type.substring(index + 1);
		
		System.out.println("the price computed using the substring method is " + stringFromSubstring);
		
		String stringFromDouble = Double.toString(new RetailStore().computePrice(1004)); System.out.println("the price of the item computed using double.toString method is "+ stringFromDouble);
		
		System.out.println(stringFromSubstring.equals(stringFromDouble.substring(0, stringFromDouble.indexOf("."))));
		
	}

}
