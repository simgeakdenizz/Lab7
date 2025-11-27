package lab.Lab7.Scenario2;
import java.util.Scanner;
public class Scenario2Main {
    public static void main(String[] args){
        long ID1 = 123456789;
        long ID2 = 987654321;
        BankAccount a1 = new BankAccount( ID1 , 45.5 );
        BankAccount a2 = new BankAccount(ID2 , 999.7 );
        AccountHelper h = new AccountHelper();
        Scanner sc = new Scanner(System.in);
        boolean always = true;
        while (always){
            System.out.print("Enter account ID: ");
            long inputID = sc.nextLong();
            if (a1.getAccountID() == inputID ){
                h.accountMenu(a1);
            }else if (a2.getAccountID() == inputID ){
                h.accountMenu(a2);
            }else{
                System.out.println("This accountID undefined");
            }
        }
    }
}


