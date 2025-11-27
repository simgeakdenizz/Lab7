package lab.Lab7.Scenario3;

public class Book {
    String title = "Unknown";
    int pages = 0;
    public int addPages(int pages ){
       if (pages<=0){
           System.out.println("Invalid values");
       }else{
           this.pages += pages ;
       }return this.pages;
    }
    public void printBook(){
       System.out.println("Pages: " + pages);
       System.out.println("Title: " + title);
    }
}
