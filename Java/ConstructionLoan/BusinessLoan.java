package ConstructionLoan;

public class BusinessLoan extends Loan{

    public BusinessLoan(){
        interestRate=1;
    }

    public double totalAmount(){
        return interestRate*aMountOfLoan+aMountOfLoan;
    }

    public String ToString(){
        return "Type of Loan: Business Loan\nLoan Number: "+loanNb+"\nCustomer last name: "+cusLastName+
        "\nA mount of loan: "+aMountOfLoan+
        "\nInterest Rate: "+interestRate+"%\nTerm: "+term+" year\n----------------------------------";
    }
}
 