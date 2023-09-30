package Book;
import java.util.Scanner;
import Book.Author;
public class Book {
    private String name;
    private static Author[] authors = new Author[5];
    private double price;
    private int qtyInstock = 0;
    int numOfAuthor=0;
    public static Scanner inp = new Scanner(System.in);

    public Book() {
    }
    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public Book(String name,double price, int qtyInstock) {
        this.name = name;
        this.price = price;
        this.qtyInstock = qtyInstock;
    }
    public String getName() {
        return name;
    }
    public Author[] getAuthors() {
        return authors;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        price = this.price;
    }
    public int getQtyInStock() {
        return qtyInstock;
    }
    public void setQtyInStock(int qtyInStock) {
        qtyInStock = this.qtyInstock;
    }
    public void printAuthors(Author [] authors){
        for (int i=0; i<authors.length;i++){
            System.out.println(authors[i].toString());
        }
     }
    public String toString() {
        return "The name of Book is: " + this.name + "\nThe price of book is: " + this.price
        + "\nThe qtyInStock is: " + this.qtyInstock;
    }
    public static void addAuthor(Author n){
            Author.inpInfo(Book.authors);
    } 

        
    }
