package problems.flightbookingmanagement.Seat;

public class Seat {

    private final String seatNumber;
    private final SeatType seatType;
    private SeatStatus seatStatus;

    public Seat(SeatStatus seatStatus, SeatType seatType, String seatNumber) {
        this.seatStatus = seatStatus;
        this.seatType = seatType;
        this.seatNumber = seatNumber;
    }

    public void reserve()
    {
        seatStatus=seatStatus.RESERVED;
    }
    public void release()
    {
        seatStatus=seatStatus.AVAILABLE;
    }

}
