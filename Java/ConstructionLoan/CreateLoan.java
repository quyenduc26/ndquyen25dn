package ConstructionLoan;

import java.util.Scanner;

public class CreateLoan {
  public static void main(String [] args){
    Scanner inp= new Scanner(System.in);
    // Loan b1= new BusinessLoan();
    // Loan b2= new PersonalLoan();
    // System.out.println(b1.ToString());
    // System.out.println("Total amount: "+b1.totalAmount());
    // System.out.println(b2.ToString());
    // System.out.println("Total amount: "+b2  .totalAmount());
    System.out.println("");
    Loan [] Loans= new Loan[1];
    for (int i=0;i<Loans.length;i++){
      System.out.println("Customer "+(i+1));
      int n;
      do{
        System.out.println("Please choose 1 or 2!");
        System.out.print("1.Business Loan\n2.Personal Loan\nChoose the type of loan: ");
        n= inp.nextInt();
        }while(n!=1 && n!=2);
      System.out.print("Enter the prime interest rate: ");
      double pri= inp.nextDouble();
      if(n==1){
        Loans[i]= new BusinessLoan();
      }
      else{
        Loans[i]= new PersonalLoan();
      }
      Loans[i].interestRate+=pri;
      if(i==Loans.length-1){
        System.out.println("-------------COMPLETED-------------");
      }else{System.out.println("..............................");}
    }
    for(int i=0;i<Loans.length;i++){
      Loans[i].loanNb=i+1;
      System.out.println(Loans[i].ToString());
    }
  }
}
