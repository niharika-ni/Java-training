import java.util.Scanner;

public class agecomparison {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Initialize variables for ages
        int age1, age2, age3;

     
        System.out.print("Enter age of person 1: ");
        age1 = scanner.nextInt();

        System.out.print("Enter age of person 2: ");
        age2 = scanner.nextInt();

        System.out.print("Enter age of person 3: ");
        age3 = scanner.nextInt();

        
        scanner.close();

       
        int oldest, youngest;

        if (age1 > age2 && age1 > age3) 
        {
            oldest = age1;
        } 
        else if (age2 > age3 && age2 > age1) 
        {
            oldest = age2;
        } 
        else 
        {
            oldest = age3;
        }

        if (age1 < age2 && age1 < age3) 
        {
            youngest = age1;
        } 
        else if (age2 < age3 && age2 < age1) 
        {
            youngest = age2;
        } 
        else 
        {
            youngest = age3;
        }

        // Display the results
        System.out.println("Oldest person's age: " + oldest);
        System.out.println("Youngest person's age: " + youngest);
    }
}
