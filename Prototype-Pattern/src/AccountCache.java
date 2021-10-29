import java.util.Hashtable;

public class AccountCache {
    private static Hashtable<String, Account> accountMap = new Hashtable<>();

    public static Account getAccount(String accountId){
        Account cachedAccount = accountMap.get(accountId);
        return cachedAccount.clone();
    }

    public static void loadCache(){
        Account currentAccount = new CurrentAccount().clone();
        currentAccount.setId("1");
        accountMap.put(currentAccount.getId(), currentAccount);

        Account savingsAccount = new SavingsAccount().clone();
        savingsAccount.setId("2");
        accountMap.put(savingsAccount.getId(), savingsAccount);
    }
}