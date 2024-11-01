// Data Access Layer
package CreateAcc;

import java.util.ArrayList;
import java.util.List;

public class AccountRepository {
    private List<Account> accounts;

    public AccountRepository() {
        this.accounts = new ArrayList<>();
    }

    public boolean saveAccount(Account account) {
        return accounts.add(account);
    }
}

