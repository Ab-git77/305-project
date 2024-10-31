// Booking.java
import java.time.LocalDate;
import java.time.LocalTime;
public class Booking {
    private String airline;
    private LocalDate date;
    private LocalTime time;
    private String arrival;
    private String departure;

    public void addAirline(String airline) {
        this.airline = airline;
    }

    public void addDate(LocalDate date) {
        this.date = date;
    }

    public void addTime(LocalTime time) {
        this.time = time;
    }

    public void addArrival(String arrival) {
        this.arrival = arrival;
    }

    public void addDeparture(String departure) {
        this.departure = departure;
    }

    public void returnBookingInfo() {
        System.out.println("Booking Details:");
        System.out.println("Airline: " + airline);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Arrival: " + arrival);
        System.out.println("Departure: " + departure);
    }
}