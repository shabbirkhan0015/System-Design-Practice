package problems.flightbookingmanagement.Booking;

import problems.flightbookingmanagement.Flight.Flight;
import problems.flightbookingmanagement.Passenger;
import problems.flightbookingmanagement.Seat.Seat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class BookingManager {

    public static BookingManager instance;
    private final Map<String, Booking> bookings;
    private final Object lock = new Object();
    private final AtomicInteger bookingCounter = new AtomicInteger(0);

    private BookingManager() {
        bookings = new HashMap<>();
    }
    public static synchronized BookingManager getInstance()
    {
        if(instance ==null)
        {
            return new BookingManager();
        }
        return instance;
    }

    public Booking createBooking(Flight flight, Passenger passenger, Seat seat, double price)
    {
        String bookingNumber = generateBookingNumber();
        Booking booking=new Booking(bookingNumber,flight,passenger,seat,price);
        synchronized (lock) {
            bookings.put(bookingNumber, booking);
        }
        return booking;
    }
    public void cancelBooking(String bookingNumber) {
        synchronized (lock) {
            Booking booking = bookings.get(bookingNumber);
            if (booking != null) {
                booking.cancel();
            }
        }
    }

    private String generateBookingNumber() {
        int bookingId = bookingCounter.incrementAndGet();
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        return "BKG" + timestamp + String.format("%06d", bookingId);
    }
}
