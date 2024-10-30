// Presentation Layer - Simulating a user interface
package airlineca;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AccountService accountService = new AccountService();

        // Simulate account creation
        System.out.println("Welcome to Airline Reservation System - Create a New Account");
        System.out.print("Enter your full name: ");
        String name = scan.nextLine();

        System.out.print("Enter your email: ");
        String email = scan.nextLine();

        System.out.print("Enter your password: ");
        String password = scan.nextLine();

        // Create the account using business logic
        boolean isCreated = accountService.createAccount(name, email, password);

        if (isCreated) {
            System.out.println("Account successfully created!");
        } else {
            System.out.println("Account creation failed. Please try again.");
        }

        scan.close();
    }
}
