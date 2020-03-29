package exercise;

public class Account {
	private long acctNumber;
	private double balance;
	private String name;
	
	public Account(long acctNumber, double balance, String name) {
		super();
		this.acctNumber = acctNumber;
		this.balance = balance;
		this.name = name;
	}

	public long getAcctNumber() {
		return acctNumber;
	}

	public double getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [acctNumber=" + acctNumber + ", balance=" + balance + ", name=" + name + "]";
	}
	
	
	
}
