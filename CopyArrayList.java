import java.util.ArrayList;
import java.util.Scanner;

public class CopyArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create the source ArrayList to store elements
        ArrayList<String> sourceList = new ArrayList<>();

        // Get user input to add elements to the source ArrayList
        System.out.println("Enter elements for the source ArrayList (type 'exit' to finish):");

        String sourceElement;
        while (true) {
            sourceElement = scanner.nextLine();

            if (sourceElement.equalsIgnoreCase("exit")) {
                break;
            }

            // Add the element to the source ArrayList
            sourceList.add(sourceElement);
        }

        // Display the source ArrayList
        System.out.println("\nSource ArrayList:");
        for (String e : sourceList) {
            System.out.println(e);
        }

        // Create the destination ArrayList and copy the elements
        ArrayList<String> destinationList = new ArrayList<>(sourceList);

        // Display the destination ArrayList
        System.out.println("\nDestination ArrayList (copied from source):");
        for (String e : destinationList) {
            System.out.println(e);
        }

        scanner.close();
    }
}
