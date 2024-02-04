import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store elements
        ArrayList<String> elementsList = new ArrayList<>();

        // Get user input to add elements to the ArrayList
        System.out.println("Enter elements (type 'exit' to finish):");

        String element;
        while (true) {
            element = scanner.nextLine();

            if (element.equalsIgnoreCase("exit")) {
                break;
            }

            // Add the element to the ArrayList
            elementsList.add(element);
        }

        // Iterate through all elements in the ArrayList
        System.out.println("\nIterating through all elements:");

        for (String e : elementsList) {
            System.out.println(e);
        }

        scanner.close();
    }
}
