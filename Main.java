import java.util.*;

public class Main{
    public static void main(String[] args){
        
        System.out.println("=== BOOK MANAGEMENT SYSTEM ===\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book title: ");
        String title = sc.nextLine();
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        System.out.print("Enter stock: ");
        int stock = sc.nextInt();
        
        System.out.println("\n=== BOOK INFORMATION ===\n");
        Book b1 = new Book(title, author, price, stock);
        b1.displayInfo();
        
        
        //sellBook
        System.out.print("\nEnter quantity to purchase: ");
        int quantity = sc.nextInt();
        b1.sellBook(quantity);
        System.out.println("\n=== UPDATED BOOK INFORMATION ===\n");
        b1.displayInfo();
        
        
        
        //restock
        System.out.print("\nEnter quantity to restock: ");
        quantity = sc.nextInt();
        b1.restock(quantity);
        System.out.println("\n=== FINAL BOOK INFORMATION ===\n");
        b1.displayInfo();
        
        System.out.println("\n");
        //default
        System.out.println("=== DEFAULT BOOK ===");
        Book b2 = new Book();
        b2.displayInfo();
    }
}