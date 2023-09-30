package BooknAuthor;

import java.util.Scanner;


public class testbookAuthor {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter the number of author: ");
        int n= inp.nextInt();
        author[] au = new  author[n];
        book b1 = new book("nhat ki trong tu ", au , 16666, 4);
        author.inpInfo(au);
       
        for (int i=0; i<3; i++){
            System.out.println(au[i].getName());
        }        
    }
}