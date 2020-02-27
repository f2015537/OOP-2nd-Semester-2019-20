package test_bank;

import java.io.IOException;
import java.util.Scanner;

public class BankFileTester  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Use the below commented code to test BankIO.readFile(String filename, Bank bank);
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the input filename");
		String filename = in.nextLine();
		Bank b = new Bank(10);
		try {
			BankIO.readFile(filename, b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		in.close();
		
		/*
		 * Use the below code to test BankIO.write(String filename, Bank b)
		 */
		
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter the filename you want to write to");
//		String filename = in.nextLine();
//		Bank b = new Bank(10);
//		try {
//			BankIO.readFile("C:\\Users\\DELL\\Desktop\\5-2\\oop\\lab sheets\\Lab 7\\BankLab\\src\\test_bank\\badinput.txt", b);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} //You'll have to adjust this filename when you run it on your system
//		BankIO.write(filename, b);
//		in.close();
	}

}

//"C:\\Users\\DELL\\Desktop\\5-2\\oop\\lab sheets\\Lab 7\\BankLab\\src\\test_bank\\output.txt"