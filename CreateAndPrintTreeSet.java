import java.util.Scanner;
import java.util.TreeSet;

public class CreateAndPrintTreeSet {
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
        displayTreeSet(treeSet);

        scanner.close();
    }

    // Helper method to display the elements of a TreeSet
    private static void displayTreeSet(TreeSet<String> set) {
        for (String element : set) {
            System.out.println(element);
        }
    }
}
