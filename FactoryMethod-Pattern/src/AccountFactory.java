public class AccountFactory {
    public Account getAccount (int accountType){
        Account account = null;

        if (accountType == 1)
            account = new CurrentAccount();
        else if (accountType == 2)
            account = new SavingsAccount();

        return account;
    }
}
