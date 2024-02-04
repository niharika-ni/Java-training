import java.util.Scanner;
import java.util.TreeSet;

public class IterateThroughTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        // Get user input for colors to add to the tree set
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter colors to add to the TreeSet (type 'exit' to finish):");

        String color;
        while (true) {
            color = scanner.nextLine();

            if (color.equalsIgnoreCase("exit")) {
                break;
            }

            // Add the color to the TreeSet
            treeSet.add(color);
        }

        // Display the TreeSet
        System.out.println("\nTreeSet elements:");

        // Iterate through all elements in the TreeSet
        for (String element : treeSet) {
            System.out.println(element);
        }

        scanner.close();
    }
}
