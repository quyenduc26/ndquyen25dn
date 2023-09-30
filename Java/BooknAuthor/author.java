package BooknAuthor;

import java.util.Scanner;

public class author {
    private String name;
    private String email;
    private char gender;
    public static Scanner inp= new Scanner(System.in);

    public author(){}

    public author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }    

    public String getEmail(){
        return email;
    }

    public char getGender(){
        return gender;
    }

    public void setName(String name){// dat lai gia tri
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setGender(char gender){
        this.gender = gender;
    }  
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return (name + email + gender);
    }
    public static void inpInfo(author[] authors){
        for (int i=0;i<authors.length;i++){
        authors[i] = new author();
        System.out.print("Enter name author: ");
        authors[i].name=inp.nextLine();
        System.out.print("Enter email author: ");
        authors[i].email=inp.nextLine();
        System.out.print("Enter gender author: ");
        authors[i].gender=inp.nextLine().charAt(0);
    }
}

}

