
public class TestStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer("Divyam", "123");
		Customer c2 = new Customer("Rohit", "456", 50000d);
		
		Item i1 = new Item("Biscuit", "Biscuit123");
		Item i2 = new Item("Cake", "Cake123", -2);
		Item i3 = new Item("Chips", "Chips123", 10, 10000);
		
		c1.buyItem(i1);
		c1.buyItem(i2);
		c1.buyItem(i3);
		
		c2.buyItem(i1);
		c2.buyItem(i2);
		c2.buyItem(i3);
	}

}
