import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size - 1];

        // Get the array elements from the user
        System.out.println("Enter " + (size - 1) + " elements of the array (consecutive integers from 1 to " + size + " with one missing):");
        for (int i = 0; i < size - 1; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Find the missing number in the array
        int missingNumber = findMissingNumber(array, size);

        // Display the result
        System.out.println("Missing Number in the Array: " + missingNumber);

        scanner.close();
    }

    // Function to find the missing number in an array
    private static int findMissingNumber(int[] array, int size) {
        // Calculate the sum of the first n natural numbers using the formula n*(n+1)/2
        int expectedSum = size * (size + 1) / 2;

        // Calculate the actual sum of the array elements
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }

        // The missing number is the difference between the expected and actual sums
        return expectedSum - actualSum;
    }
}
