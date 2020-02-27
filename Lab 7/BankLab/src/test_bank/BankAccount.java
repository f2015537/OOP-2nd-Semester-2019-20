package test_bank;

/**
 * A class to represent a single bank account.
 * @author cs302
 */
public class BankAccount {

    private double balance;
    private int accountNumber;

    //************
    //*  TASK 2  *
    //************
    /**
     * Constructor
     * @param initialBalance the initial balance of the BankAccount
     * @param accountNumber The account number to associate with this 
     *                      BankAccount.  Must be a 5 digit integer.
     */
    public BankAccount(double initialBalance, int accountNumber) {

        if (initialBalance < 0) {
            throw new IllegalArgumentException(
                    "Accounts with a negative balance cannot be created!");
        } 
        //TODO TASK 2: add code here to throw an exception if the account
        // number isn't 5 digits.
        if (initialBalance < 10000d || initialBalance > 99999d) {
        	throw new IllegalArgumentException(
                    "Initial Balance must be a 5 digit number only!");
        }
        balance = initialBalance;
        this.accountNumber = accountNumber;
        
    }

    /**
     * Deposits money into the BankAccount
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException(
                    "Don't deposit negative amounts!");
        }
        balance = balance + amount;
    }

    //************
    //*  TASK 3  *
    //************
    /**
     * Withdraws money from the BankAccount
     *
     * @param amount the amount to withdraw
     * @throws InsufficientFundsException 
     */
    //TODO TASK 3: add code to throw our new exception if an overdraw is attempted
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount < 0) {
            throw new IllegalArgumentException(
                    "Don't withdraw a negative amount!");
        }
        if (amount > balance) {
        	throw new InsufficientFundsException("You can't withdraw more than you have!");
        }
        balance = balance - amount;
    }

    /**
     * Gets the current balance of the BankAccount
     *
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Gets the account number of the BankAccount
     * @return the account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Returns a string representation this BankAccount in
     * the following format, e.g. 12345 $100.52 where 12345
     * is the account number, and 100.52 is the balance.
     */
    public String toString () {
        return "" + accountNumber + " $" + balance;
    }
}
