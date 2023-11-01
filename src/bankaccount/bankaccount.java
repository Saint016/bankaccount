package bankaccount;

import bankaccount.BankAccount;
import bankaccount.CurrentAccount;
import bankaccount.SavingAccount;

class BankAccount {
    private String name;
    private String accountNumber;
    private String address;
    private String phone;
    private double balance;

    public BankAccount(String name, String accountNumber, String address) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.address = address;
        this.phone = phone;
        this.balance = 0;
    }

    public BankAccount(String name2, String accountNumber2, String phone2, Object address2) {
		
	}

	public void deposit(double amount) {
        balance += amount;
    }

    public void displayAccountInfo() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Address: " + address);
        System.out.println("phone: " + phone);
        System.out.println("Balance: $" + balance);
    }
}

class SavingAccount extends BankAccount {
    public SavingAccount(String name, String accountNumber,String phone, String string) {
        super(name, accountNumber, name);
        deposit(1000); 
    }
}

class CurrentAccount extends BankAccount {
    private static Object address;

	public CurrentAccount(String name, String accountNumber,String phone, String string) {
        super(name, accountNumber,phone, address);
    }
}

public class bankaccount{
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("Ann kamau", "1001","0720000",
        		  "test2gmail.com");
        CurrentAccount currentAccount = new CurrentAccount("Alice Smith", "CUR456","0810000", "admin@gmail.com");

        
        savingAccount.deposit(300);
        currentAccount.deposit(300);

       
        System.out.println("Saving Account Information:");
        savingAccount.displayAccountInfo();

        System.out.println("\nCurrent Account Information:");
        currentAccount.displayAccountInfo();
    }
}