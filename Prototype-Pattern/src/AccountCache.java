import java.util.Hashtable;

public class AccountCache {
    private static Hashtable<String, Account> accountMap = new Hashtable<>();

    public static Account getAccount(String accountId){
        Account cachedAccount = accountMap.get(accountId);
        return (Account) cachedAccount.clone();
    }

    public static void loadCache(){
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.setId("1");
        accountMap.put(currentAccount.getId(), currentAccount);

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setId("2");
        accountMap.put(savingsAccount.getId(), savingsAccount);
    }
}