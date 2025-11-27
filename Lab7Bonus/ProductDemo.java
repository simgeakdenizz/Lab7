package lab.Lab7.Lab7Bonus;
import java.util.Scanner;
public class ProductDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("How many product do you have?: ");
        size = sc.nextInt();
        sc.nextLine();
        if (size <= 0){
            System.out.println("INVALID VALUES");
        }else{
            Product[] productList = new Product[size];
            for (int i = 0 ; i < size ; i++){
                System.out.print("Enter product's name: ");
                String name = sc.nextLine();
                System.out.print("Enter " + name + "'s stock: ");
                int stock = sc.nextInt();
                sc.nextLine();
                if (stock < 0 ){
                    System.out.println("INVALID VALUES");
                    i--;
                }else{
                    Product product = new Product(name , stock);
                    productList[i]=product;
                }
            }boolean cont = true ;
            while (cont){
                System.out.println("----------MENU----------");
                for (int i = 0 ; i<size ; i++){
                    System.out.println(productList[i].getName() + " ==> " + productList[i].getStock() + "\n");
                }
                System.out.print("Enter product name which you want to buy or enter Q for quit: ");
                String enter = sc.nextLine();
                if ((enter.equals("q")) || (enter.equals("Q"))){
                    System.out.println("Quit");
                    for (int i = 0 ; i<size ; i++){
                        productList[i].printInfo();
                    }
                    cont = false ;
                }else{
                    boolean found = false;
                    for(int i = 0 ; i < size ; i++){
                        if(enter.equals(productList[i].getName())){
                            boolean success = productList[i].buyOne();
                            if (success){
                                System.out.println("Success! You bought one " + productList[i].getName());
                                System.out.println("Remaining Stock: " + productList[i].getStock());
                            }
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("No such product!");
                    }
                }
            }
        }
    }
}
