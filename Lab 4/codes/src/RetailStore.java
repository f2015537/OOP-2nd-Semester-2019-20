
public class RetailStore {
	
	private int[] itemId;
	private double[] price;
	private String[] itemName;
	
	
	
	public RetailStore() {
		itemId = new int[] {1001,1002,1003,1004,1005};
		price = new double[] {950d,750d,450d,350d,250d};
		itemName = new String[] {"Yonex Tennis Racket-950",
				"Yonex Badminton Racket-750", 
				"Silvers Badminton Racket-450",
				"Cosco Badminton shuttle-350", 
				"Cosco Tennis Racket-250"};
	}

	protected double computePrice(int value) {
		for(int i = 0; i < price.length; i++) {
			if(itemId[i] == value) {
				return price[i];
			}
		}
		return price[value];
	}
	
	protected String fetchDescription(int value) {
		for(int i = 0; i < price.length; i++) {
			if(itemId[i] == value) {
				return itemName[i];
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RetailStore retailOne = new RetailStore();
		System.out.println("Price of item id 1002 is " +retailOne.computePrice(1002));
		System.out.println("Price of item id 1004 is " +retailOne.computePrice(1004));
		System.out.println("Price of item id 1009 is " +retailOne.computePrice(1009)); // Run time error
	}

}
