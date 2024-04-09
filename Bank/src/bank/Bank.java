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
//import java.util.Scanner;

public class Bank {
    Account[] accounts;
    int numAccounts;
//default constructor
//     public Bank(int capacity) {
//        accounts = new Account[capacity];
//        // Prompt the user to enter details for each account
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < capacity ; i++) {
//            //take from user if default 
//            System.out.println("Enter details for account " + (i + 1) + ":");
//            System.out.print("Enter your Accout Number: ");
//            String numb = scanner.next();
//            System.out.print("Account balance: ");
//            double balance = scanner.nextDouble();
//            // Create a new Account object with user input and assign it to the array
//            accounts[i] = new Account(numb, balance);
//        }
//    }
    
  public Bank(int capacity) {
        accounts = new Account[capacity];
        numAccounts = 0;
    }
/*copy constructor ,
    deep as if you wan to create a new bank it should copy it
    not point at the same refreance */
    public Bank(Account[] A) {
        this.accounts=new Account[A.length]; 
    }
 // Add account method
    public void addAccount(Account account) {
        if (numAccounts < accounts.length) {
            accounts[numAccounts++] = new Account(account);
            System.out.println("Account added successfully.");
        } else {
            System.out.println("Bank capacity reached. Cannot add more accounts.");
        }
    }

    // Remove account method
    public void removeAccount(String accountNumber) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].accountnumber.equals(accountNumber)) {
                accounts[i] = null;
                // Shift accounts to fill the gap
                for (int j = i; j < numAccounts - 1; j++) {
                    accounts[j] = accounts[j + 1];
                }
                accounts[numAccounts - 1] = null;
                numAccounts--;
                System.out.println("Account removed successfully.");
                return;
            }
        }
        System.out.println("Account not found.");
    }

    // Deposit method
    public void deposit(String accountNumber, double amount) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].accountnumber.equals(accountNumber)) {
                accounts[i].deposit(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    // Withdraw method
    public void withdraw(String accountNumber, double amount) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].accountnumber.equals(accountNumber)) {
                accounts[i].withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    // Display all accounts method
    public void displayAllAccounts() {
        System.out.println("Bank Accounts:");
        for (int i = 0; i < numAccounts; i++) {
            accounts[i].display();
        }
    }


    public static void main(String[] args) {
        // TODO code application logic here
        Bank bank = new Bank(10);

        // Adding accounts
        Account johnAccount = new Account("1001", "John", 5000);
        Account janaAccount = new Account("1002", "Jana", 10000);
        Account aliAccount = new Account("1003", "Ali", 15000);
        
        bank.addAccount(johnAccount);
        bank.addAccount(janaAccount);
        bank.addAccount(aliAccount);

        // Depositing and withdrawing from accounts
        bank.deposit("1001", 2000);
        bank.withdraw("1002", 500);
        bank.withdraw("1003", 20000); // Should fail due to insufficient balance

        // Displaying all accounts
        bank.displayAllAccounts();

        // Removing an account
        bank.removeAccount("1002");

        // Displaying all accounts after removal
        bank.displayAllAccounts();
    }
   
    
}
