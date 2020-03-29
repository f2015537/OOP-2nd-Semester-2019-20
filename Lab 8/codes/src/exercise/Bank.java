package exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Bank {
	private ArrayList<Account> accts = new ArrayList<Account>();
	final int maxActive = 30;
	
	public boolean addAccount (Account newone) {
		if(accts.size() == maxActive)
			return false;
		return accts.add(newone);
	}
	
	public boolean removeAccount(long acctnum) {
		Iterator<Account> itr = accts.iterator();
		while(itr.hasNext()) {
			Account acc = itr.next();
			if(acc.getAcctNumber() == acctnum) {
				itr.remove();
				return true;
			}
				
		}
		return false;
	}
	
	public double deposit(long acctnum, double amount) {
		ListIterator<Account> litr = accts.listIterator();
		while(litr.hasNext()) {
			Account acc = litr.next();
			if(acc.getAcctNumber() == acctnum) {
				acc.setBalance(acc.getBalance() + amount);
				litr.set(acc);
				return 1d;
			}
		}
		return -1d;
	}
	
	public double withdraw(long acctnum, double amount) {
		ListIterator<Account> litr = accts.listIterator();
		while(litr.hasNext()) {
			Account acc = litr.next();
			if(acc.getAcctNumber() == acctnum) {
				if(acc.getBalance() < amount)
					return -1d;
				acc.setBalance(acc.getBalance()-amount);
				litr.set(acc);
				return 1d;
			}
		}
		return -1d;
	}

	@Override
	public String toString() {
		return "Bank [accts=" + accts + ", maxActive=" + maxActive + "]";
	}
	
	
}
