public class ProblemC {
    public static void main(String[] args) {
        try {
            int occupiedRooms = 0;
            int totalGuests = 25;

            double averageOccupancy =
                (double) totalGuests / occupiedRooms;

            System.out.println("Average Room Occupancy: "
                    + averageOccupancy);
        } catch (ArithmeticException e) {
            System.out.println(
                "Exception handled: Cannot divide by zero."
            );
        }
    }
}
