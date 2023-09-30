package UseLoan;

public class HomeLoan extends PersonalLoan {

    public HomeLoan(){
        this.typeOfLoan="Home Loan";
    }

    public void setCost() {
        System.out.println("Enter your monthly fee: ");
        this.monthlyFee = inp.nextDouble();
    }

    public void ToString() {
        System.out.println("Type of loan: " + typeOfLoan + " | Monthly fee: " + monthlyFee);
    }
}
