import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveAllMappingsFromMap {
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

        // Remove all mappings from the map
        map.clear();

        // Display the map after removal
        System.out.println("\nMap after removing all mappings:");
        displayMap(map);

        scanner.close();
    }

    // Helper method to display the elements of a map
    private static void displayMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
