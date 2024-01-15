import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class FindDuplicatesInArray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of strings of the specified size
        String[] array = new String[size];

        // Get the array elements (strings) from the user
        System.out.println("Enter the string elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.next();
        }

        // Find duplicate values in the array
        List<String> duplicates = findDuplicates(array);

        // Display the results
        if (duplicates.isEmpty()) {
            System.out.println("No duplicate values found in the array.");
        } else {
            System.out.println("Duplicate values in the array: " + duplicates);
        }

        scanner.close();
    }

    // Function to find duplicate values in an array of strings
    private static List<String> findDuplicates(String[] array) {
        List<String> result = new ArrayList<>();

        // Compare each element with every other element in the array
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j]) && !result.contains(array[i])) {
                    // If elements are equal and not already in the result list, add to result
                    result.add(array[i]);
                }
            }
        }

        return result;
    }
}
