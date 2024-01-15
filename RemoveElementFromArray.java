import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
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

        // Get the element to remove from the user
        System.out.print("Enter the element to remove: ");
        int elementToRemove = scanner.nextInt();

        // Remove the specified element from the array
        int[] newArray = removeElement(array, elementToRemove);

        // Display the original and modified arrays
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(newArray));

        scanner.close();
    }

    // Function to remove a specific element from an array
    private static int[] removeElement(int[] array, int elementToRemove) {
        int count = 0; // Count of elements that are not equal to the element to remove

        // Count the number of elements that are not equal to the element to remove
        for (int i = 0; i < array.length; i++) {
            if (array[i] != elementToRemove) {
                count++;
            }
        }

        // Create a new array with size equal to the count of elements to keep
        int[] newArray = new int[count];

        // Copy elements that are not equal to the element to remove to the new array
        int newIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != elementToRemove) {
                newArray[newIndex] = array[i];
                newIndex++;
            }
        }

        return newArray;
    }
}
