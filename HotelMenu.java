import java.util.Scanner;

public class HotelMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome");

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Veg Section");
            System.out.println("2. Non-Veg Section");
            System.out.println("3. Beverages");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayVegSection();
                    break;
                case 2:
                    displayNonVegSection();
                    break;
                case 3:
                    displayBeverages();
                    break;
                case 0:
                    System.out.println("Thank you for visiting! Have a great day!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void displayVegSection() {
        System.out.println("\nVEG SECTION:");
        System.out.println("1. Veggie Burger - 170Rs");
        System.out.println("2. Paneer Tikka - 200Rs");
        System.out.println("3. Vegetable Biryani - 150Rs");

        placeOrder("Veg");
    }

    private static void displayNonVegSection() {
        System.out.println("\nNON-VEG SECTION:");
        System.out.println("1. Chicken Burger - 349Rs");
        System.out.println("2. Chicken Wings - 300Rs");
        System.out.println("3. Mutton Biryani - 430Rs");

        placeOrder("Non-Veg");
    }

    private static void displayBeverages() {
        System.out.println("\nBEVERAGES:");
        System.out.println("1. Cola - 99Rs");
        System.out.println("2. Fresh Orange Juice - 130Rs");
        System.out.println("3. Masala Chai - 50Rs");

        placeOrder("Beverage");
    }

    private static void placeOrder(String section) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of the item you want to order (or 0 to skip): ");
        int item = scanner.nextInt();

        if (item != 0) {
            System.out.print("Enter the quantity: ");
            int quantity = scanner.nextInt();

            System.out.println("Order placed: " + section + " Item " + item + ", Quantity: " + quantity);
        } else {
            System.out.println("No order placed for " + section);
        }
    }
}
