package problems.flightbookingmanagement.Booking;

import problems.flightbookingmanagement.Flight.Flight;
import problems.flightbookingmanagement.Passenger;
import problems.flightbookingmanagement.Seat.Seat;

public class Booking {
    private final String bookingNumber;
    private final Flight flight;
    private final Passenger passenger;
    private final Seat seat;
    private final double price;
    private BookingStatus status;

    public Booking(String bookingNumber, Flight flight, Passenger passenger, Seat seat, double price) {
        this.bookingNumber = bookingNumber;
        this.flight = flight;
        this.passenger = passenger;
        this.seat = seat;
        this.price = price;
        this.status = BookingStatus.CONFIRMED;
    }

    public void cancel() {
        status = BookingStatus.CANCELLED;
    }

    public String getBookingNumber() {
        return bookingNumber;
    }
}