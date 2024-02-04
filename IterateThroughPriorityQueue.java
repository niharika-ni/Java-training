import java.util.PriorityQueue;
import java.util.Scanner;

public class IterateThroughPriorityQueue {
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

        // Display the PriorityQueue
        System.out.println("\nPriorityQueue elements:");

        // Iterate through all elements in the PriorityQueue
        for (String element : priorityQueue) {
            System.out.println(element);
        }

        scanner.close();
    }
}
