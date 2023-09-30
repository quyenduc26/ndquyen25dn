package UseLoan;
import java.util.Scanner;
public abstract class PersonalLoan {
      protected String typeOfLoan;
      protected double monthlyFee;
      Scanner inp = new Scanner(System.in);
      public PersonalLoan(){};
    
      public PersonalLoan(String typeOfLoan){
        this.typeOfLoan= typeOfLoan;
      }
    // get
      public double getMonthlyFee() {
        return monthlyFee;
      }
      public String getTypeOfLoan() {
        return typeOfLoan;
      }
    // abstract methods
      abstract public void ToString();
      abstract public void setCost();
    }

