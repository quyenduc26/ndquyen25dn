package UseLoan;
import java.util.Scanner;


public class Test{
  public static void main (String [] args){
    Scanner inp = new Scanner(System.in);
    System.out.print("1.Home Loan\n2.Car Loan\nChoose Loan: ");
    int l= inp.nextInt();
    switch(l){
      case 1:
        PersonalLoan psnl1= new HomeLoan();
        psnl1.setCost();
        psnl1.ToString();
        break;
 
      case 2:
        PersonalLoan psnl2= new CarLoan();
        psnl2.setCost();
        psnl2.ToString();
        break;
      default:
      System.out.println("----------------------\nPLease choose 1 or 2! ");
    }
  }
}