import java.util.Scanner;

public class FindElementIndex {
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

        // Get the element to find from the user
        System.out.print("Enter the element to find: ");
        int targetElement = scanner.nextInt();

        // Find the index of the specified element
        int index = findElementIndex(array, targetElement);

        // Display the result
        if (index != -1) {
            System.out.println("Element " + targetElement + " found at index " + index);
        } else {
            System.out.println("Element " + targetElement + " not found in the array");
        }

        scanner.close();
    }

    // Function to find the index of an element in an array
    private static int findElementIndex(int[] array, int targetElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == targetElement) {
                return i; // Return the index if the element is found
            }
        }
        return -1; // Return -1 if the element is not found in the array
    }
}
