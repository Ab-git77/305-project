// Business Logic Layer
package airlineca;
public class AccountService {
    private AccountRepository accountRepository;

    public AccountService() {
        // Initialize the data layer
        this.accountRepository = new AccountRepository();
    }
        @param name     //The user's full name.
        @param email    //The user's email.
        @param password //The user's password.
        @return //true if the account is created successfully, false otherwise.
   
    public boolean createAccount(String name, String email, String password) {
        if (isValidEmail(email) && !password.isEmpty()) {
            Account newAccount = new Account(name, email, password);
            return accountRepository.saveAccount(newAccount);
        }
        return false;
    }
     * @param email //The user's email.
     * @return //true if the email is valid, false otherwise.
    private boolean isValidEmail(String email) {
        // Simple email validation
        return email.contains("@");
    }
}
