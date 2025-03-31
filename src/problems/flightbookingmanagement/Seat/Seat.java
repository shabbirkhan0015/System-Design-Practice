package problems.flightbookingmanagement.Seat;

public class Seat {

    private final String seatNumber;
    private final SeatType seatType;
    private SeatStatus seatStatus;

    public Seat( String seatNumber,  SeatType seatType, SeatStatus seatStatus) {
        this.seatNumber = seatNumber;
        this.seatStatus = seatStatus;
        this.seatType = seatType;

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
