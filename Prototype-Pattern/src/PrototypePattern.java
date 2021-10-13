public class PrototypePattern {
    public static void main(String[] args) {

        AccountCache.loadCache();

        Account clonedCurrentAccount = AccountCache.getAccount("1");
        System.out.println(String.format("Account type: %s", clonedCurrentAccount.getType()));
        System.out.println(String.format("Interest rate: %.1f%%", clonedCurrentAccount.getInterestRate()));

        Account clonedSavingsAccount = AccountCache.getAccount("2");
        System.out.println(String.format("Account type: %s", clonedSavingsAccount.getType()));
        System.out.println(String.format("Interest rate: %.1f%%", clonedSavingsAccount.getInterestRate()));
    }
}
