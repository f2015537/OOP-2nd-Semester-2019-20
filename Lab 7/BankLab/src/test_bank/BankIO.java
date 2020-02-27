package test_bank;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public abstract class BankIO {
	
	public static void readFile(String filename, Bank bank) throws IOException {
		Scanner in = null;
		try {
			in = new Scanner(new File(filename));
			while(in.hasNextLine()) {
				bank.add(readAccount(in));
			}
				
		} catch(FileNotFoundException e) {
			System.err.println("Could not find the file you mentioned!");
			return;
		} finally {
			in.close();
		}
	}
	
	public static BankAccount readAccount(Scanner in) throws IOException {
		String[] tokens = in.nextLine().split(" ");
		if(tokens.length != 2 || tokens[0].equals("") || tokens[1].equals("")) throw new IOException("Bad input file!");
//		if (!in.hasNextInt()) throw new IOException("Bad input file!");
		int accountNumber = Integer.parseInt(tokens[0]);
//		if (!in.hasNextDouble()) throw new IOException("Bad input file!");
		double balance = Double.parseDouble(tokens[1]);
//		in.nextLine();
//		System.out.println(accountNumber + " " +balance);
		return new BankAccount(balance, accountNumber);
	}
	
	public static void write(String filename, Bank bank) {
		PrintWriter out = null;
		try {
			out = new PrintWriter(filename);
			out.print(bank.toString());
		} catch(FileNotFoundException e) {
			System.err.println("Could not find the file you mentioned!");
			return;
		} finally {
			out.close();
		}
	}

}
