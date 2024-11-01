// Business Logic Layer
package CreateAcc;
public class AccountService {
    private AccountRepository accountRepository;

    public AccountService() {
        // Initialize the data layer (Repository)
        this.accountRepository = new AccountRepository();
    }

    /**
     * Creates a new account.
     * 
     * @param name     The user's full name.
     * @param email    The user's email.
     * @param password The user's password.
     * @return true if the account is created successfully other wise false
     */
    public boolean createAccount(String name, String email, String password) {
        if (isValidEmail(email) && !password.isEmpty()) {
            Account newAccount = new Account(name, email, password);
            return accountRepository.saveAccount(newAccount);
        }
        return false;
    }

    /**
     * Validates the user's email.
     * 
     * @param email The user's email.
     * @return true if the email is valid, false otherwise.
     */
    private boolean isValidEmail(String email) {
        return email.contains("@");
    }
}
