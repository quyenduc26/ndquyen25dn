package ConstructionLoan;

import java.util.Scanner;

public abstract class Loan implements LoanConstant {
    protected int loanNb=0;
    protected String cusLastName;
    protected double aMountOfLoan;
    protected double interestRate;
    protected int term;
    public Scanner inp= new Scanner(System.in);
    
    public Loan(){
        System.out.print("Enter customer last name: ");
        cusLastName=inp.nextLine();
        do{
            System.out.print("--- Please enter the number is not over 100000$ ---\nEnter a mount of loan:");
            aMountOfLoan= inp.nextInt();
            }while(aMountOfLoan<0 || aMountOfLoan>maxLoanAmount);
        System.out.print("1.Short term: 1 year\n2.Meidum term: 3 years\n3.Long term: 5 years\n");
         System.out.print("Enter your term: ");
        int cterm = inp.nextInt();
        switch(cterm){
        case 1:
            term=shortTerm;
            break;
        case 2:
            term=mediumTerm;
            break;
        case 3:
            term=longTerm;
            break;
        default: term=shortTerm;
        System.out.println("Your selection is wrong! Set to Term 1");
        }    
    }
    public abstract double totalAmount();
    public abstract String ToString();
}
