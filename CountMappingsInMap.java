import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountMappingsInMap {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, String> map = new HashMap<>();

        // Get user input for key-value pairs
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter key-value pairs (type 'exit' to finish):");

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

        // Count the number of key-value mappings in the map
        int size = map.size();

        // Display the number of mappings
        System.out.println("\nNumber of key-value mappings in the map: " + size);

        scanner.close();
    }
}
