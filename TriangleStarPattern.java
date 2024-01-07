public class TriangleStarPattern {
    public static void main(String[] args) {
        int rows = 5;

        // Loop to iterate through each row
        for (int i = 1; i <= 5; i++) {
            // Loop to print stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
