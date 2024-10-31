// Screen.java
import java.time.LocalDate;
import java.time.LocalTime;

public class Screen {
    private Controller controller;

    public Screen(Controller controller) {
        this.controller = controller;
    }

    public void selectAirline(String airline) {
        controller.getAirline(airline);
        System.out.println("Airline selected: " + airline);
    }

    public void setDate(LocalDate date) {
        controller.getDate(date);
        System.out.println("Date selected: " + date);
    }

    public void setTime(LocalTime time) {
        controller.getTime(time);
        System.out.println("Time selected: " + time);
    }

    public void selectArrival(String arrival) {
        controller.getArrival(arrival);
        System.out.println("Arrival selected: " + arrival);
    }

    public void selectDeparture(String departure) {
        controller.getDeparture(departure);
        System.out.println("Departure selected: " + departure);
    }
}