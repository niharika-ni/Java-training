import java.util.Scanner;

public class CheckArrayContents {
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

            // Check if the entered element is 0 or -1
            if (array[i] == 0 || array[i] == -1) {
                System.out.println("The array contains 0 or -1.");
                return;
            }
        }

        // If we reach here, the array does not contain 0 or -1
        System.out.println("The array does not contain 0 or -1.");

        scanner.close();
    }
}
