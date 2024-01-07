public class DiviByThreeAndFive {
    public static void main(String[] args) {
        System.out.println("Numbers between 1 and 100 divisible by 3, 5, or both:");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " (divisible by 3 and 5)");
            }
        }
    }
}
