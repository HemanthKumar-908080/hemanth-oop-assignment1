class Room {
    int roomNumber;
    String type;

    Room(int roomNumber, String type) {
        this.roomNumber = roomNumber;
        this.type = type;
    }

    void display() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + type);
    }
}

class DeluxeRoom extends Room {
    String amenities;

    DeluxeRoom(int roomNumber, String type, String amenities) {
        super(roomNumber, type);
        this.amenities = amenities;
    }

    @Override
    void display() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + type);
        System.out.println("Amenities: " + amenities);
    }
}

public class ProblemA {
    public static void main(String[] args) {
        DeluxeRoom room = new DeluxeRoom(
            205,
            "Deluxe",
            "Wi-Fi, AC, TV, Mini Bar"
        );

        room.display();
    }
}
