package lab.Lab7.Scenario2;
import java.util.Scanner;
public class ChangeID {
    Scanner sc = new Scanner(System.in);
    long oldID;
    long newID;

    public void changingID(BankAccount account){
        oldID = account.getAccountID();
        System.out.println("Old ID: " + oldID);
        System.out.print("Enter new ID: ");
        newID = sc.nextLong();
        System.out.println("New account ID: " + newID);
        account.setAccountID(newID);

    }
}
