package BooknAuthor;
import java.util.Scanner;

public class book {
    private String name;
    private double price;
    private author[] authors;
    private int qtyInStock = 0;

    public book(String name, author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public book(String name, author[] authors, double price, int qtyInStock) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public author[] getAuthors() {
        return authors;

    }

    public double gePrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    // in sachs
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return (name + price + qtyInStock);
    }

    void printAuthors() {

        for (int i = 0; i < authors.length; i++) {
            System.out.print(authors[i].getName() + " ");
        }

    }

}