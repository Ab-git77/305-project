import java.util.Scanner;

public class PaymentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Collecting user payment information
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your credit card number: ");
        String cardNumber = scanner.nextLine();
        
        System.out.print("Enter expiration date (MM/YY): ");
        String expirationDate = scanner.nextLine();
        
        System.out.print("Enter CVV: ");
        String cvv = scanner.nextLine();
        
        System.out.print("Enter the amount to pay: ");
        double amount = scanner.nextDouble();
        
        // Processing payment
        System.out.println("\nProcessing payment...");
        boolean isPaymentSuccessful = processPayment(cardNumber, expirationDate, cvv, amount);
        
        // Display payment status
        if (isPaymentSuccessful) {
            System.out.println("Payment successful! Thank you, " + name + ".");
        } else {
            System.out.println("Payment failed. Please try again.");
        }
        
        scanner.close();
    }
    
    // Mock payment processing method
    public static boolean processPayment(String cardNumber, String expirationDate, String cvv, double amount) {
        // For this example, let's assume any payment below $500 is successful.
        if (amount <= 500) {
            return true;
        } else {
            return false;
        }
    }
}
