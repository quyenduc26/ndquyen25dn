package UseLoan;

public class CarLoan extends PersonalLoan{

    public CarLoan(){
        this.typeOfLoan="Car Loan";
    };

    public void setCost() {
        System.out.println("Enter your monthly fee: ");
        this.monthlyFee = inp.nextDouble();
    }

    public void ToString() {
        System.out.println("Type of loan: " + typeOfLoan + " | Monthly fee: " + monthlyFee);
    }
}
