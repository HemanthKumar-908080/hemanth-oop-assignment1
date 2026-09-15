abstract class Booking {
    abstract void confirmBooking();
}

class HotelBooking extends Booking {
    @Override
    void confirmBooking() {
        System.out.println("Hotel booking confirmed successfully.");
    }
}

public class ProblemB {
    public static void main(String[] args) {
        HotelBooking booking = new HotelBooking();
        booking.confirmBooking();
    }
}
