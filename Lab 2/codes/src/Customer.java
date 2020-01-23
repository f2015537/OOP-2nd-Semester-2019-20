
public class Customer {
	private String name;
	private String idNo;
	private double balance = 5000d;
	private Item item;
	
	public Customer(String name, String idNo, double balance) {
		super();
		this.name = name;
		this.idNo = idNo;
		this.balance = balance;
	}

	public Customer(String name, String idNo) {
		super();
		this.name = name;
		this.idNo = idNo;
	}

	public String getName() {
		return name;
	}

	public String getIdNo() {
		return idNo;
	}

	public double getBalance() {
		return balance;
	}

	public Item getItem() {
		return item;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	
	public void print() {
		System.out.println(item);
		System.out.println(balance);
	}
	
	public void buyItem(Item item) {
		if(item.getItemQuantity() < 1) {
			System.out.println("Order is not valid");
		}
		else if(item.getItemQuantity() * item.getItemPrice() > balance) {
			System.out.println("Insufficient balance");
		}
		else {
			this.item = item;
			balance -= item.getItemPrice() * item.getItemQuantity();
			print();
		}
	}
	
	
	
}
