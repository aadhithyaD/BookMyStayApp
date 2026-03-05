abstract class Room {

    protected String roomType;
    protected int beds;
    protected int size;
    protected double price;

    public Room(String roomType, int beds, int size, double price) {
        this.roomType = roomType;
        this.beds = beds;
        this.size = size;
        this.price = price;
    }

    public void displayRoomDetails() {
        System.out.println("Room Type : " + roomType);
        System.out.println("Beds      : " + beds);
        System.out.println("Size      : " + size + " sq.ft");
        System.out.println("Price     : ₹" + price);
    }
}

// Single Room class
class SingleRoom extends Room {

    public SingleRoom() {
        super("Single Room", 1, 200, 1500);
    }
}

// Double Room class
class DoubleRoom extends Room {

    public DoubleRoom() {
        super("Double Room", 2, 350, 2500);
    }
}

// Suite Room class
class SuiteRoom extends Room {

    public SuiteRoom() {
        super("Suite Room", 3, 500, 5000);
    }
}

// Main class
public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("        Book My Stay – Version 2.1       ");
        System.out.println("      Hotel Booking Management System    ");
        System.out.println("=========================================");

        // Creating room objects (Polymorphism)
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Static availability variables
        int singleAvailability = 5;
        int doubleAvailability = 3;
        int suiteAvailability = 2;

        System.out.println("\n--- Available Room Types ---\n");

        single.displayRoomDetails();
        System.out.println("Available Rooms : " + singleAvailability);
        System.out.println("----------------------------------");

        doubleRoom.displayRoomDetails();
        System.out.println("Available Rooms : " + doubleAvailability);
        System.out.println("----------------------------------");

        suite.displayRoomDetails();
        System.out.println("Available Rooms : " + suiteAvailability);
        System.out.println("----------------------------------");

        System.out.println("\nApplication executed successfully.");
    }
}