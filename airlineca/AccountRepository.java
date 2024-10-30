// Data Access Layer
package airlineca;
import java.util.ArrayList;
import java.util.List;

public class AccountRepository {
    private List<Account> accounts;

    public AccountRepository() {
        // In-memory data storage 
        this.accounts = new ArrayList<>();
    }
        @param account //The account to be saved.
        @return //true if the account is successfully saved.
     
    public boolean saveAccount(Account account) {
        return accounts.add(account);
    }
}
