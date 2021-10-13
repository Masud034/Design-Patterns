public abstract class Account {
    private String accountType;
    public abstract double getInterestRate();

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
