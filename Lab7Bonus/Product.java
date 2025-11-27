package lab.Lab7.Lab7Bonus;

public class Product {
    private String name;
    private int stock;

    public Product(String name , int stock){
        this.name = name;
        this.stock = stock;
    }

    public void setName(String name){this.name = name; }
    public void setStock(int stock){this.stock = stock;}
    public String getName(){return this.name;}
    public int getStock(){return this.stock;}

    public boolean buyOne(){

        if (this.stock == 0){
            System.out.println("Out of stock!");
            return false;
        }else if (this.stock>0){
            this.stock-- ;
        }
        return true;

    }

    public void printInfo(){
        System.out.println("----------PRODUCT INFORMATIONS----------");
        System.out.println("Product name: " + this.name);
        System.out.println("Stock: " + this.stock);
    }

}
