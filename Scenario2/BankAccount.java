package lab.Lab7.Scenario2;
import java.util.Scanner;
public class BankAccount {
    Scanner sc = new Scanner(System.in);
    private long accountID;
    private double balance;
    public BankAccount(long a , double b){
        accountID = a ;
        balance = b;
    }
    public void setAccountID(long a ){accountID = a ; }
    public void setBalance(double b ){balance = b ; }
    public long getAccountID(){return accountID ; }
    public double getBalance(){return balance ; }

    public void deposit (double amount){
        if (amount>0){
            balance += amount;
            System.out.println("Amount : " + amount);
            System.out.println("New balance : " + balance );
        }else{
            System.out.println("Invalid value");
        }
    }

    public void withdraw(double amount){
        if (amount<= balance){
            balance -= amount;
            System.out.println("Amount : " + amount);
            System.out.println("New balance : " + balance);
        }else {
            System.out.println("Your balance is not enough. Do you want to go into borrowing ? 1) YES / 2) NO ");
            int choice = sc.nextInt();
            if (choice == 1 ){
                balance -= amount;
                System.out.println("Amount : " + amount);
                System.out.println("New balance : " + balance);
            }else if (choice == 2 ){
                System.out.println("Insufficient balance!");
                System.out.println("Balance : " + balance);
            }else {
                System.out.println("Invalid values");
            }
        }
    }

    public void accountDetails (){
        System.out.println("Balance : " + balance);
        System.out.println("accountID : " + accountID);
    }
}
