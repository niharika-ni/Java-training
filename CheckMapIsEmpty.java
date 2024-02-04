import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckMapIsEmpty {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, String> map = new HashMap<>();

        // Get user input for key-value pairs in the map
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter key-value pairs for the map (type 'exit' to finish):");

        while (true) {
            System.out.println("Enter the key:");
            String key = scanner.nextLine();

            if (key.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Enter the value:");
            String value = scanner.nextLine();

            // Associate the specified value with the specified key in the map
            map.put(key, value);
        }

        // Check whether the map contains key-value mappings or is empty
        boolean isEmpty = map.isEmpty();

        if (isEmpty) {
            System.out.println("\nThe map is empty.");
        } else {
            System.out.println("\nThe map contains key-value mappings.");
        }

        scanner.close();
    }
}
