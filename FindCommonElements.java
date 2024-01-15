import java.util.*;

public class FindCommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the first array from the user
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();

        // Create the first array of integers
        int[] array1 = new int[size1];

        // Get the elements of the first array from the user
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        // Get the size of the second array from the user
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();

        // Create the second array of integers
        int[] array2 = new int[size2];

        // Get the elements of the second array from the user
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        // Find common elements between the two arrays
        List<Integer> commonElements = findCommonElements(array1, array2);

        // Display the results
        if (commonElements.isEmpty()) {
            System.out.println("No common elements found.");
        } else {
            System.out.println("Common elements between the two arrays: " + commonElements);
        }

        scanner.close();
    }

    // Function to find common elements between two integer arrays
    private static List<Integer> findCommonElements(int[] array1, int[] array2) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();

        // Add elements of the first array to a set for quick lookup
        for (int num : array1) {
            set1.add(num);
        }

        // Check elements of the second array against the set
        for (int num : array2) {
            if (set1.contains(num) && !result.contains(num)) {
                result.add(num);
            }
        }

        return result;
    }
}
