public class Book{
    private String title;
    private String author;
    private double price;
    private int stock;
    
    public Book(){
        this("Untitled","Unknown",0.0,0);
    }
    public Book(String title, String author, double price, int stock){
        this.title = "Untitled";
        this.author = "Unknown";
        setTitle(title);
        setAuthor(author);
        setPrice(price);
        setStock(stock);
    }
    
    //setters
    public void setTitle(String title){
        if(title != null && !title.isBlank()){
            this.title = title;
        }
    }
    
    public void setAuthor(String author){
        if(author != null && !author.isBlank()){
            this.author = author;
        }
    }
    
    public void setPrice(double price){
        if(price >= 0){
            this.price = price;
        }
    }
    
    public void setStock(int stock){
        if(stock >= 0){
            this.stock = stock;
        }
    }
    
    //getters
    public String getTitle(){ return title;}
    public String getAuthor(){ return author;}
    public double getPrice(){ return price;}
    public int getStock(){ return stock;}
    
    public void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.printf("Price: %.2f\n", price);
        System.out.printf("Stock: %d\n", stock);
    }
    
    public void sellBook(int quantity){
        if(quantity > 0 && quantity <= Integer.MAX_VALUE - stock){
            stock -= quantity;
            System.out.println("SUCCESS SOLD " + quantity + " BOOKS!");
        }else{ System.out.println("ERROR"); }
    }
    
    public void restock(int quantity){
        if(quantity > 0 && quantity <= Integer.MAX_VALUE - stock){
            stock += quantity;
            System.out.println("SUCCESSFULLY ADDED " + quantity + " BOOKS!");
        }else{
            System.out.println("ERROR: Invalid restock quantity!");
        }
    }
    
}