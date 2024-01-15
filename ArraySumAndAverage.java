import java.util.Scanner;

public class ArraySumAndAverage {
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

        // Calculate the sum of the array elements
        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        // Calculate the average of the array elements
        double average = (double) sum / size;

        // Display the sum and average
        System.out.println("Sum of the array elements: " + sum);
        System.out.println("Average of the array elements: " + average);

        scanner.close();
    }
}
