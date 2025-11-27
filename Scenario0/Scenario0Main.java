package lab.Lab7.Scenario0;
import java.util.Scanner;
public class Scenario0Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Point p = new Point();
        Circle c = new Circle();
        c.center = p ;
        System.out.print("Enter x : ");
        c.center.x = sc.nextInt();
        System.out.print("Enter y : ");
        c.center.y =sc.nextInt();
        System.out.print("Enter r (float) : ");
        c.r = sc.nextFloat();
        System.out.println("Radius : " + c.r + "\n"+ "Center : (" + c.center.x + "," + c.center.y + ")");
    }
}
