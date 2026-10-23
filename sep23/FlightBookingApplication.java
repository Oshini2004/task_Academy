package sep23;


import java.util.ArrayList;
import java.util.Scanner;

// Abstract base class
abstract class Passenger {
    private String name;
    private int age;

    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Common discount contract
    public abstract double getDiscountPercentage();
}

// Regular passenger
class RegularPassenger extends Passenger {

    public RegularPassenger(String name, int age) {
        super(name, age);
    }

    @Override
    public double getDiscountPercentage() {
        return 0;
    }
}

// Student passenger
class StudentPassenger extends Passenger {

    public StudentPassenger(String name, int age) {
        super(name, age);
    }

    @Override
    public double getDiscountPercentage() {
        return 10;
    }
}

// Flight class
class Flight {
    private String flightCode;
    private String airline;
    private String source;
    private String destination;
    private int availableSeats;
    private double baseFare;

    public Flight(String flightCode, String airline,
                  String source, String destination,
                  int availableSeats, double baseFare) {
        this.flightCode = flightCode;
        this.airline = airline;
        this.source = source;
        this.destination = destination;
        this.availableSeats = availableSeats;
        this.baseFare = baseFare;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public String getAirline() {
        return airline;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public double getBaseFare() {
        return baseFare;
    }

    // Update seats only through this method
    public void reserveSeats(int tickets) {
        if (tickets > 0 && tickets <= availableSeats) {
            availableSeats = availableSeats - tickets;
        }
    }

    public void displayFlight() {
        System.out.println(
            flightCode + " | " + airline
            + " | " + source + " -> " + destination
            + " | Seats: " + availableSeats
            + " | Base Fare: Rs." + baseFare
        );
    }
}

// Booking class
class Booking {
    private String bookingId;
    private Passenger passenger;
    private Flight flight;
    private int tickets;
    private double baseFareTotal;
    private double discountAmount;
    private double totalFare;

    public Booking(String bookingId, Passenger passenger,
                   Flight flight, int tickets,
                   double baseFareTotal,
                   double discountAmount, double totalFare) {
        this.bookingId = bookingId;
        this.passenger = passenger;
        this.flight = flight;
        this.tickets = tickets;
        this.baseFareTotal = baseFareTotal;
        this.discountAmount = discountAmount;
        this.totalFare = totalFare;
    }

    public void displaySummary() {
        System.out.println("\n===== BOOKING SUMMARY =====");
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Passenger Name: " + passenger.getName());
        System.out.println("Passenger Age: " + passenger.getAge());
        System.out.println("Passenger Type: "
                + passenger.getClass().getSimpleName());
        System.out.println("Flight Code: " + flight.getFlightCode());
        System.out.println("Airline: " + flight.getAirline());
        System.out.println("Source: " + flight.getSource());
        System.out.println("Destination: " + flight.getDestination());
        System.out.println("Number of Tickets: " + tickets);
        System.out.printf("Base Fare: Rs.%.2f%n", baseFareTotal);
        System.out.printf("Discount: Rs.%.2f%n", discountAmount);
        System.out.printf("Final Amount: Rs.%.2f%n", totalFare);
        System.out.println("===========================");
    }
}

// Main booking system
class FlightBookingSystem {
    private ArrayList<Flight> flights;
    private Booking latestBooking;
    private int bookingCounter;
    private Scanner sc;

    public FlightBookingSystem() {
        flights = new ArrayList<>();
        sc = new Scanner(System.in);
        bookingCounter = 1001;

        // Predefined flights
        flights.add(new Flight("F101", "Air India",
                "Nagpur", "Mumbai", 50, 3500));
        flights.add(new Flight("F102", "IndiGo",
                "Nagpur", "Delhi", 40, 5000));
        flights.add(new Flight("F103", "Air India",
                "Mumbai", "Bengaluru", 30, 4500));
    }

    // Display all flights
    public void displayFlights() {
        System.out.println("\n===== AVAILABLE FLIGHTS =====");

        for (Flight flight : flights) {
            flight.displayFlight();
        }
    }

    // Find flight using its code
    public Flight findFlightByCode(String code) {
        for (Flight flight : flights) {
            if (flight.getFlightCode().equalsIgnoreCase(code)) {
                return flight;
            }
        }

        return null;
    }

    // Validate all booking details
    public boolean validateBookingDetails(
            Flight flight, String name, int age, int tickets) {

        if (flight == null) {
            System.out.println("Error: Invalid flight code.");
            return false;
        }

        if (name == null || name.trim().isEmpty()) {
            System.out.println("Error: Passenger name cannot be empty.");
            return false;
        }

        if (age <= 0) {
            System.out.println("Error: Age must be greater than 0.");
            return false;
        }

        if (tickets <= 0) {
            System.out.println("Error: Tickets must be greater than 0.");
            return false;
        }

        if (tickets > flight.getAvailableSeats()) {
            System.out.println("Error: Not enough available seats.");
            return false;
        }

        return true;
    }

    // Calculate fare using polymorphism
    public double calculateFare(
            Flight flight, Passenger passenger, int tickets) {

        double baseFareTotal = flight.getBaseFare() * tickets;

        // Calls the overridden method of the actual passenger type
        double discountPercentage = passenger.getDiscountPercentage();

        double discountAmount =
                baseFareTotal * discountPercentage / 100;

        return baseFareTotal - discountAmount;
    }

    // Book a flight
    public void bookFlight() {
        displayFlights();

        System.out.print("\nEnter flight code: ");
        String code = sc.nextLine().trim();

        Flight flight = findFlightByCode(code);

        System.out.print("Enter passenger name: ");
        String name = sc.nextLine().trim();

        int age = readInt("Enter passenger age: ");
        int tickets = readInt("Enter number of tickets: ");

        System.out.println("\nPassenger Category:");
        System.out.println("1. Regular Passenger (0% discount)");
        System.out.println("2. Student Passenger (10% discount)");

        int category = readInt("Select category: ");

        // Validate details before creating a booking
        if (!validateBookingDetails(flight, name, age, tickets)) {
            return;
        }

        if (category != 1 && category != 2) {
            System.out.println("Error: Invalid passenger category.");
            return;
        }

        // Create the appropriate passenger object
        Passenger passenger;

        if (category == 1) {
            passenger = new RegularPassenger(name, age);
        } else {
            passenger = new StudentPassenger(name, age);
        }

        // Calculate fare
        double baseFareTotal = flight.getBaseFare() * tickets;

        double discountAmount =
                baseFareTotal * passenger.getDiscountPercentage() / 100;

        double totalFare =
                calculateFare(flight, passenger, tickets);

        // Confirm booking only after all validation succeeds
        System.out.print("Confirm booking? (yes/no): ");
        String confirmation = sc.nextLine().trim();

        if (!confirmation.equalsIgnoreCase("yes")) {
            System.out.println("Booking cancelled.");
            return;
        }

        // Update seats and save the confirmed booking
        flight.reserveSeats(tickets);

        String bookingId = "BK" + bookingCounter++;

        latestBooking = new Booking(
                bookingId, passenger, flight, tickets,
                baseFareTotal, discountAmount, totalFare
        );

        System.out.println("\nBooking confirmed successfully!");
        latestBooking.displaySummary();
    }

    // View most recent booking
    public void viewBooking() {
        if (latestBooking == null) {
            System.out.println("No confirmed booking found.");
        } else {
            latestBooking.displaySummary();
        }
    }

    // Read integer input safely
    private int readInt(String message) {
        System.out.print(message);
        String input = sc.nextLine().trim();

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    // Main menu loop
    public void start() {
        System.out.println("Welcome to Flight Booking System!");

        while (true) {
            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. View Flights");
            System.out.println("2. Book Flight");
            System.out.println("3. View Booking");
            System.out.println("4. Exit");

            int choice = readInt("Enter your choice: ");

            if (choice == 1) {
                displayFlights();
            } else if (choice == 2) {
                bookFlight();
            } else if (choice == 3) {
                viewBooking();
            } else if (choice == 4) {
                System.out.println(
                    "Thank you for using Flight Booking System. Goodbye!"
                );
                break;
            } else {
                System.out.println(
                    "Invalid choice. Please select between 1 and 4."
                );
            }
        }

        sc.close();
    }
}

// Public class: save the file as FlightBookingApplication.java
public class FlightBookingApplication {
    public static void main(String[] args) {
        FlightBookingSystem system = new FlightBookingSystem();
        system.start();
    }
}
```