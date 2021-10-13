public class SavingsAccount extends Account{
    private double interestRate = 5.5;

    public SavingsAccount(){
        setAccountType("Savings Account");
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
