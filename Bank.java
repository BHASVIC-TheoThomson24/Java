import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private ArrayList<Account> accounts;
    private static int latestAccount;

    Bank() { /*A new bank is defined with a list of bank accounts and a value that keeps track of the account number of the 
			 most recently added account*/
        this.accounts = new ArrayList<Account>();
        Bank.latestAccount = -1;
    }

    public int login() {
        System.out.println("Enter your account number: \n");
        String input=Console.readLine();
        Integer accountNumber=Integer.parseInt(input);
        if(accountNumber>latestAccount) {
            System.out.println("Your account number is greater than latest account number");
            return -1;
        }
        System.out.println("Enter your password: \n");
        String response2 = Console.readLine();

        Account account= accounts.get(accountNumber);
        if(account == null) {
            return -1;
        }
        else{
            return account.getNumber();
        }
    }

    public void deposit(int number) {
    /*This method should ask the user how much money they want to deposit into their account, and correctly update the 
	balance of their account*/
        String depositString=Console.readLine();
        Integer deposit=Integer.parseInt(depositString);
        Account account=accounts.get(number);
        account.setBalance(account.getBalance()+deposit);
    }

    public void withdraw(int number) {
    /*This method should ask the user how much money they want to withdraw from their account, and correctly update 
	the balance of their account*/
    }

    public void checkBalance(int number) {
        Account account=accounts.get(number);
        float balance=account.getBalance();
        System.out.println("Your account balance is: "+balance);
    }

    public void addAccount() {
    /*This method should create a new account with an account number 1 larger than the account number or the last account 
	created, a password given by the user, and a balance of 0. The account should be added to the bank's list of accounts*/
        latestAccount++;
        System.out.println("Enter your password: \n");
        String password=Console.readLine();
        float balance=0;
        Account account=new Account(latestAccount,password,balance);
        accounts.add(account);
    }
}