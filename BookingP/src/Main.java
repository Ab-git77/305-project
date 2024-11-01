
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Booking booking = new Booking();
        OperationalManagement operationalManagement = new OperationalManagement();
        Controller controller = new Controller(booking, operationalManagement);
        Screen screen = new Screen(controller);

        // Simulate user input
        screen.selectAirline("Emirates");
        screen.setDate(LocalDate.of(2023, 12, 25));
        screen.setTime(LocalTime.of(10, 30));
        screen.selectArrival("Dubai");
        screen.selectDeparture("New York");

        // Display booking information
        booking.returnBookingInfo();

        // Simulate operational management requests
        String flightNumber = "EK500";
        controller.requestFlightStatus(flightNumber);
        controller.requestFlightCancellation(flightNumber);
        controller.requestDelayedLuggageInfo(flightNumber);
    }
}