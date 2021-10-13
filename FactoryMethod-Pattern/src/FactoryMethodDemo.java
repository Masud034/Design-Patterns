public class FactoryMethodDemo {
    public static void main(String[] args) {
        AccountFactory accountFactory = new AccountFactory();

        Account account = accountFactory.getAccount(1);
        System.out.println(String.format("%s -> Interest Rate: %.2f", account.getAccountType(), account.getInterestRate()));

        Account anotherAccount = accountFactory.getAccount(2);
        System.out.println(String.format("%s -> Interest Rate: %.2f", anotherAccount.getAccountType(), anotherAccount.getInterestRate()));
    }
}
