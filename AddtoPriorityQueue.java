import java.util.PriorityQueue;
import java.util.Scanner;

public class AddtoPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> firstPriorityQueue = new PriorityQueue<>();
        PriorityQueue<String> secondPriorityQueue = new PriorityQueue<>();

        // Get user input for colors to add to the first priority queue
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter colors for the first PriorityQueue (type 'exit' to finish):");

        String color;
        while (true) {
            color = scanner.nextLine();

            if (color.equalsIgnoreCase("exit")) {
                break;
            }

            // Add the color to the first PriorityQueue
            firstPriorityQueue.add(color);
        }

        // Add all elements of the first PriorityQueue to the second PriorityQueue
        secondPriorityQueue.addAll(firstPriorityQueue);

        // Display the second PriorityQueue
        System.out.println("\nSecond PriorityQueue elements (after adding all elements from the first PriorityQueue):");
        displayPriorityQueue(secondPriorityQueue);

        scanner.close();
    }

    // Helper method to display the elements of a PriorityQueue
    private static void displayPriorityQueue(PriorityQueue<String> queue) {
        for (String element : queue) {
            System.out.println(element);
        }
    }
}
