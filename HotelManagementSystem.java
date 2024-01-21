import java.util.ArrayList;
import java.util.Scanner;

// Base class representing a room
class Room {
    private int roomNumber;
    private boolean isOccupied;
    private double nightlyRate;

    public Room(int roomNumber, double nightlyRate) {
        this.roomNumber = roomNumber;
        this.nightlyRate = nightlyRate;
        this.isOccupied = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

    public void bookRoom() {
        isOccupied = true;
    }

    public void releaseRoom() {
        isOccupied = false;
    }
}

// Inherited class representing a deluxe room with additional amenities
class DeluxeRoom extends Room {
    private boolean hasMinibar;

    public DeluxeRoom(int roomNumber, double nightlyRate, boolean hasMinibar) {
        super(roomNumber, nightlyRate);
        this.hasMinibar = hasMinibar;
    }

    public boolean hasMinibar() {
        return hasMinibar;
    }
}

// Class representing a hotel guest
class Guest {
    private String name;
    private String email;
    private String phoneNumber;

    public Guest(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Email: " + email + ", Phone: " + phoneNumber;
    }
}

// Class representing a reservation
class Reservation {
    private Guest guest;
    private Room room;
    private int numberOfNights;

    public Reservation(Guest guest, Room room, int numberOfNights) {
        this.guest = guest;
        this.room = room;
        this.numberOfNights = numberOfNights;
    }

    public Guest getGuest() {
        return guest;
    }

    public Room getRoom() {
        return room;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public double calculateTotalCost() {
        return numberOfNights * room.getNightlyRate();
    }
}

public class HotelManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a list of rooms
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(new Room(101, 100.0));
        rooms.add(new DeluxeRoom(201, 150.0, true));
        rooms.add(new Room(301, 120.0));

        // Create a list of reservations
        ArrayList<Reservation> reservations = new ArrayList<>();

        // Main menu
        while (true) {
            System.out.println("\n1. Book a Room\n2. Check Room Availability\n3. View Reservations\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Book a Room
                    System.out.print("Enter your name: ");
                    scanner.nextLine(); // Consume the newline character
                    String guestName = scanner.nextLine();
                    System.out.print("Enter your email: ");
                    String guestEmail = scanner.nextLine();
                    System.out.print("Enter your phone number: ");
                    String guestPhoneNumber = scanner.nextLine();
                    Guest guest = new Guest(guestName, guestEmail, guestPhoneNumber);

                    System.out.println("Available Rooms:");
                    for (Room room : rooms) {
                        if (!room.isOccupied()) {
                            System.out.println("Room " + room.getRoomNumber() + " - $" + room.getNightlyRate());
                        }
                    }

                    System.out.print("Enter the room number to book: ");
                    int roomNumber = scanner.nextInt();
                    Room selectedRoom = null;

                    for (Room room : rooms) {
                        if (room.getRoomNumber() == roomNumber && !room.isOccupied()) {
                            selectedRoom = room;
                            break;
                        }
                    }

                    if (selectedRoom != null) {
                        System.out.print("Enter the number of nights to stay: ");
                        int numberOfNights = scanner.nextInt();
                        selectedRoom.bookRoom();

                        Reservation reservation = new Reservation(guest, selectedRoom, numberOfNights);
                        reservations.add(reservation);

                        System.out.println("Room booked successfully. Reservation details:");
                        System.out.println("Guest: " + guest.toString());
                        System.out.println("Room Number: " + selectedRoom.getRoomNumber());
                        System.out.println("Number of Nights: " + numberOfNights);
                        System.out.println("Total Cost: $" + reservation.calculateTotalCost());
                    } else {
                        System.out.println("Invalid room selection. Room may be occupied or does not exist.");
                    }
                    break;

                case 2:
                    // Check Room Availability
                    System.out.println("Available Rooms:");
                    for (Room room : rooms) {
                        if (!room.isOccupied()) {
                            System.out.println("Room " + room.getRoomNumber() + " - $" + room.getNightlyRate());
                        }
                    }
                    break;

                case 3:
                    // View Reservations
                    if (reservations.isEmpty()) {
                        System.out.println("No reservations yet.");
                    } else {
                        System.out.println("Current Reservations:");
                        for (Reservation res : reservations) {
                            System.out.println("Guest: " + res.getGuest().getName());
                            System.out.println("Room Number: " + res.getRoom().getRoomNumber());
                            System.out.println("Number of Nights: " + res.getNumberOfNights());
                            System.out.println("Total Cost: $" + res.calculateTotalCost());
                            System.out.println("-------------------------");
                        }
                    }
                    break;

                case 4:
                    // Exit
                    System.out.println("Exiting the Hotel Management System. Thank you!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

