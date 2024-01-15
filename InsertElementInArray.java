import java.util.Arrays;
import java.util.Scanner;

public class InsertElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];

        // Get the array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Get the element to insert from the user
        System.out.print("Enter the element to insert: ");
        int elementToInsert = scanner.nextInt();

        // Get the position to insert the element at from the user
        System.out.print("Enter the position to insert the element (1 to " + (size + 1) + "): ");
        int position = scanner.nextInt();

        // Insert the specified element at the specified position in the array
        int[] newArray = insertElement(array, elementToInsert, position);

        // Display the original and modified arrays
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Array after inserting " + elementToInsert + " at position " + position + ": " + Arrays.toString(newArray));

        scanner.close();
    }

    // Function to insert an element at a specific position in an array
    private static int[] insertElement(int[] array, int elementToInsert, int position) {
        int newSize = array.length + 1;

        // Create a new array with size increased by 1
        int[] newArray = new int[newSize];

        // Copy elements up to the specified position from the original array
        for (int i = 0; i < position - 1; i++) {
            newArray[i] = array[i];
        }

        // Insert the new element at the specified position
        newArray[position - 1] = elementToInsert;

        // Copy the remaining elements from the original array
        for (int i = position; i < newSize; i++) {
            newArray[i] = array[i - 1];
        }

        return newArray;
    }
}
