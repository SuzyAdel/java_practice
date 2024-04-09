/*
Write a Java program to create a class called "Bank" with a collection of
accounts and methods to add and remove accounts, 
and to deposit and withdraw money. 
Also define a class called "Account" to maintain account details of a particular customer.
 */

package bank;

/**
 *
 * @author Suzy
 */
public class Account {
    String accountnumber, name; 
    double balance;
    
//pramrtrised constructor 
    public Account(String accountnumber, double balance) {
        this.accountnumber = accountnumber;
        this.balance = balance;
    }
//fully pramtrised constructor 
    public Account(String accountnumber, String name, double balance) {
        this.accountnumber = accountnumber;
        this.name = name;
        this.balance = balance;
    }
// copy constructor , deep copy 
    public Account(Account acopy) {
       this.accountnumber = acopy.accountnumber;
       this.name = acopy.name;
       this.balance = acopy.balance;
    }
    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }
    // Withdraw method
    public void withdraw(double amount) {
        if (balance >= amount && amount > 0) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount for withdrawal.");
        }
    }
    // Display method
    public void display() {
        System.out.println("Account Number: " + accountnumber +  "\nBalance: " + balance);
    }

     
}
