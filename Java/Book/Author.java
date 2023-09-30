package Book;
import java.util.Scanner;
public class Author {
    private String name;
    private String email;
    private char gender;
    public static Scanner inp = new Scanner(System.in);
    public Author() {
    }
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    public void setName(String name) {
        name = this.name;
    }
    public void setEmail(String email) {
        email = this.email;
    }
    public void setGender(char gender) {
        gender = this.gender;
    }

    public void inpInfo(){}
    public static void inpInfo(Author[] authors){
        System.out.println("Enter number of authors: ");
        int x= inp.nextInt();
        for (int i=0;i<x;i++){
        authors[i] = new Author();
        System.out.print("Enter name author: ");
        authors[i].name=inp.nextLine();
        System.out.print("Enter email author: ");
        authors[i].email=(inp.nextLine());
        System.out.print("Enter gender author: ");
        authors[i].gender=inp.nextLine().charAt(0);
    }
}

    public String toString() {
        return "Name of author is " + this.name + "\nEmail of author is " + this.email + "\nGender of author is "
                + this.gender;
    }
}