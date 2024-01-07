import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        //enter a string
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        
        scanner.close();

        // Initialize counters
        int letterCount = 0;
        int spaceCount = 0;
        int numberCount = 0;
        int otherCount = 0;

        // Loop through each character in the input string
        for (char ch : str.toCharArray()) {
            
            if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            } else if (Character.isWhitespace(ch)) {
                spaceCount++;
            } else {
                otherCount++;
            }
        }
        /* toCharArray() method converts the given string into a sequence of characters.
        it checks whether it is a letter, digit, whitespace, or another character using
        Character class methods (isLetter(), isDigit(), isWhitespace()).
        Based on the classification, the corresponding counter is incremented.
        */

        // Print the results
        System.out.println("Letter count: " + letterCount);
        System.out.println("Number count: " + numberCount);
        System.out.println("Space count: " + spaceCount);
        System.out.println("Other character count: " + otherCount);
    }
}
