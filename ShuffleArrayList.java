import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShuffleArrayList {
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

        // Display the original ArrayList
        System.out.println("\nOriginal ArrayList:");
        for (String e : elementsList) {
            System.out.println(e);
        }

        // Shuffle the elements in the ArrayList
        Collections.shuffle(elementsList);

        // Display the shuffled ArrayList
        System.out.println("\nShuffled ArrayList:");
        for (String e : elementsList) {
            System.out.println(e);
        }

        scanner.close();
    }
}
