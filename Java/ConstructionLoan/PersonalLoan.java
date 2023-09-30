package ConstructionLoan;

public class PersonalLoan extends Loan{

    public PersonalLoan(){
        interestRate=2;
    }

    public double totalAmount(){
        return interestRate*aMountOfLoan*term+aMountOfLoan;
    }

    public String ToString(){
        return "Type of Loan: Perosnal Loan\nLoan Number: "+loanNb+"\nCustomer last name: "+cusLastName+"\nA mount of loan: "+aMountOfLoan+"\nInterest Rate: "+interestRate+"%\nTerm: "+term+" year\n----------------------------------";
    }
}

