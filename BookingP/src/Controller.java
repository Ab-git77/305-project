// Controller.java
import java.time.LocalDate;
import java.time.LocalTime;
public class Controller {
    private Booking booking;
    private OperationalManagement operationalManagement;

    public Controller(Booking booking, OperationalManagement operationalManagement) {
        this.booking = booking;
        this.operationalManagement = operationalManagement;
    }

    public void getAirline(String airline) {
        booking.addAirline(airline);
    }

    public void getDate(LocalDate date) {
        booking.addDate(date);
    }

    public void getTime(LocalTime time) {
        booking.addTime(time);
    }

    public void getArrival(String arrival) {
        booking.addArrival(arrival);
    }

    public void getDeparture(String departure) {
        booking.addDeparture(departure);
    }

    public void requestFlightStatus(String flightNumber) {
        String status = operationalManagement.flightStatusRequest(flightNumber);
        System.out.println(status);
    }

    public void requestFlightCancellation(String flightNumber) {
        String cancellationInfo = operationalManagement.flightCancellation(flightNumber);
        System.out.println(cancellationInfo);
    }

    public void requestDelayedLuggageInfo(String flightNumber) {
        String luggageInfo = operationalManagement.delayedLuggage(flightNumber);
        System.out.println(luggageInfo);
    }
}