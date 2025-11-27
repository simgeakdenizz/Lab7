package lab.Lab7.Scenario2;
import java.util.Scanner;
public class AccountHelper {
    public void accountMenu (BankAccount acc){
        Scanner sc = new Scanner(System.in);
        ChangeID ch = new ChangeID();
        System.out.println("Enter account ID : ");
        boolean cont = true;
        while(cont){
            System.out.println("menu for banking operations: ");
            System.out.println("1 - Deposit\n" + "2 - Withdraw\n" + "3 - Account Details\n" + "4 - Exit\n" + "5 - Change ID" );
            int choice = sc.nextInt();
            if (choice == 1){
                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();
                acc.deposit(amount);
            }else if(choice == 2){
                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();
                acc.withdraw(amount);
            }else if (choice == 3) {
                acc.accountDetails();
            }else if (choice == 4) {
                System.out.println("Exit");
                System.out.println("---------------------------------------------");
                System.out.println(" ");
                cont = false ;
                break;
            }else if (choice == 5 ){
                ch.changingID(acc);
            } else{
                System.out.println("Invalid values");
            }
        }
    }
}
