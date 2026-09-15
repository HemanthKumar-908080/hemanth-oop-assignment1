abstract class Booking {
    abstract void confirmBooking();
}

class HotelBooking extends Booking {
    private String guestName;
    private String hotelName;
    private int roomNumber;

    HotelBooking(String guestName, String hotelName, int roomNumber) {
        this.guestName = guestName;
        this.hotelName = hotelName;
        this.roomNumber = roomNumber;
    }

    @Override
    void confirmBooking() {
        System.out.println("Hotel Booking Confirmed");
        System.out.println("Guest Name: " + guestName);
        System.out.println("Hotel Name: " + hotelName);
        System.out.println("Room Number: " + roomNumber);
    }
}

public class ProblemB {
    public static void main(String[] args) {
        HotelBooking booking = new HotelBooking("Hemanth", "Grand Palace Hotel", 205);
        booking.confirmBooking();
    }
}
