import java.util.Scanner;

public class Singleton {
    // Private static instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside the class
    private Singleton() {
        // Empty constructor
    }

    // Public method to get the instance of the class
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Method to take user input
    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();

        System.out.println("You entered: " + userInput);
    }

    public static void main(String[] args) {
        // Get the instance of the Singleton class
        Singleton singleton = Singleton.getInstance();

        // Use the instance to get user input
        singleton.getUserInput();
    }
}
