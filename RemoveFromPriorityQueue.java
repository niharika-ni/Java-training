import java.util.PriorityQueue;
import java.util.Scanner;

public class RemoveFromPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        // Get user input for colors to add to the priority queue
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter colors to add to the PriorityQueue (type 'exit' to finish):");

        String color;
        while (true) {
            color = scanner.nextLine();

            if (color.equalsIgnoreCase("exit")) {
                break;
            }

            // Add the color to the PriorityQueue
            priorityQueue.add(color);
        }

        // Display the original PriorityQueue
        System.out.println("\nOriginal PriorityQueue elements:");
        displayPriorityQueue(priorityQueue);

        // Remove all elements from the PriorityQueue
        priorityQueue.clear();

        // Display the PriorityQueue after removal
        System.out.println("\nPriorityQueue elements after removal:");
        displayPriorityQueue(priorityQueue);

        scanner.close();
    }

    // Helper method to display the elements of a PriorityQueue
    private static void displayPriorityQueue(PriorityQueue<String> queue) {
        for (String element : queue) {
            System.out.println(element);
        }
    }
}
