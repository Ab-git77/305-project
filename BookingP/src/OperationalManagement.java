
public class OperationalManagement {
    public String flightStatusRequest(String flightNumber) {
        // Implement logic to fetch flight status from an external source or database
        return "Flight " + flightNumber + " is on time.";
    }

    public String flightCancellation(String flightNumber) {
        // Implement logic to check flight cancellation status
        return "Flight " + flightNumber + " is not cancelled.";
    }

    public String delayedLuggage(String flightNumber) {
        // Implement logic to check luggage delay status
        return "No delay expected for luggage on flight " + flightNumber;
    }
}