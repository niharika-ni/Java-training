import java.util.Scanner;
import java.util.TreeSet;

public class AddAllElementsToAnotherTreeSet {
    public static void main(String[] args) {
        TreeSet<String> firstTreeSet = new TreeSet<>();
        TreeSet<String> secondTreeSet = new TreeSet<>();

        // Get user input for colors to add to the first tree set
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter colors for the first TreeSet (type 'exit' to finish):");

        String color;
        while (true) {
            color = scanner.nextLine();

            if (color.equalsIgnoreCase("exit")) {
                break;
            }

            // Add the color to the first TreeSet
            firstTreeSet.add(color);
        }

        // Add all elements of the first TreeSet to the second TreeSet
        secondTreeSet.addAll(firstTreeSet);

        // Display the second TreeSet
        System.out.println("\nSecond TreeSet elements (after adding all elements from the first TreeSet):");
        displayTreeSet(secondTreeSet);

        scanner.close();
    }

    // Helper method to display the elements of a TreeSet
    private static void displayTreeSet(TreeSet<String> set) {
        for (String element : set) {
            System.out.println(element);
        }
    }
}
