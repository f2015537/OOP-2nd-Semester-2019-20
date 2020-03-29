package exercise;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank();
		Random r = new Random();
		for(int i = 0; i < 29; i++) {
			b.addAccount(new Account(i*100000, r.nextInt(1000000)*r.nextDouble(),Integer.toString(i)));
		}
		System.out.println(b);
		System.out.println(b.addAccount(new Account(1500l, r.nextInt(1000000)*r.nextDouble(), "100")));
		System.out.println(b.removeAccount(1500l));
		System.out.println(b.deposit(1500l, 1000d));
		System.out.println(b.deposit(0l, 1000d));
		System.out.println(b.withdraw(0l, 1000000000000000000d));
	}

}
