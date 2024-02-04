import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CopyToAnotherMap {
    public static void main(String[] args) {
        // Create two HashMaps
        Map<String, String> sourceMap = new HashMap<>();
        Map<String, String> destinationMap = new HashMap<>();

        // Get user input for key-value pairs in the source map
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter key-value pairs for the source map (type 'exit' to finish):");

        while (true) {
            System.out.println("Enter the key:");
            String key = scanner.nextLine();

            if (key.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Enter the value:");
            String value = scanner.nextLine();

            // Associate the specified value with the specified key in the source map
            sourceMap.put(key, value);
        }

        // Copy all mappings from the source map to the destination map
        destinationMap.putAll(sourceMap);

        // Display the destination map after copying
        System.out.println("\nDestination map after copying all mappings:");
        displayMap(destinationMap);

        scanner.close();
    }

    // Helper method to display the elements of a map
    private static void displayMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
