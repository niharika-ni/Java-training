import java.util.Scanner;

public class SecondSmallestElement {
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

        // Find the second smallest element in the array
        int secondSmallest = findSecondSmallest(array);

        // Display the result
        if (secondSmallest != Integer.MAX_VALUE) {
            System.out.println("Second Smallest Element in the Array: " + secondSmallest);
        } else {
            System.out.println("Array does not have a second smallest element.");
        }

        scanner.close();
    }

    // Function to find the second smallest element in an array
    private static int findSecondSmallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        return secondSmallest;
    }
}
