package lab.Lab7.Scenario3;

public class BookDemo {
    public static void main(String[] args){
        Book b1 = new Book();
        b1.pages = 100;
        Book b2 = b1 ;
        Book b3 = new Book();

        System.out.println("BOOK 1 PAGES: " + b1.pages);
        System.out.println("BOOK 2 PAGES: " + b2.pages);
        System.out.println("\n");

        b2.addPages(20);
        System.out.println("İF B2 PAGES = 20 ");
        System.out.println("BOOK 1 PAGES: " + b1.pages);
        System.out.println("BOOK 2 PAGES: " + b2.pages);
        System.out.println("\n");

        //for b1 and b3

        b3.pages = b1.pages;
        System.out.println("COMPARİNG FİELD VALUES");
        System.out.println("BOOK 1 PAGES: " + b1.pages);
        System.out.println("BOOK 3 PAGES: " + b3.pages);
        System.out.println("SAME VALUES?: " + (b1.pages == b3.pages));
        System.out.println("\n");

        System.out.println("COMPARİNG REFERENCES");
        System.out.println("BOOK 1 REFERENCES: " + b1);
        System.out.println("BOOK 3 REFERENCES: " + b3);
        System.out.println("SAME REFERENCES?: " + (b1==b3));
    }
}

/*In comments, explain why both show the updated number of pages and how many objects are
actually created in memory?
There is only 1 object in memory.
new Book(); creates a book object in the memory. b1 points to this object.
Book b2 = b1; does not create a new book. It copies the address.
b1 and b2 look at the same place. So b1 and b2 influence same object.
 */

/*
We will create b3 using the new keyword.
This creates a separate object in memory. Then, we manually copy the values from b1 to b3.
b1 and b3 look the same. They have the same number of pages.
But they are not the same . They  in different  memory addresses.
 */

