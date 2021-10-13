public class CurrentAccount extends Account {
    private double interestRate = 0.0;

    public CurrentAccount(){
        setAccountType("Current Account");
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
