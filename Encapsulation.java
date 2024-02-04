import java.util.Scanner;

// Define a class demonstrating encapsulation
class Animal {
    private String name;
    private int age;

    // Constructor to initialize the object
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }

    // Display information about the animal
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for creating an Animal object
        System.out.println("Enter the name of the animal:");
        String name = scanner.nextLine();

        System.out.println("Enter the age of the animal:");
        int age = scanner.nextInt();

        // Create an Animal object using the constructor
        Animal myAnimal = new Animal(name, age);

        // Display information using encapsulated methods
        System.out.println("\nInformation about the animal:");
        myAnimal.displayInfo();

        // Update information using encapsulated setter methods
        System.out.println("\nEnter new name for the animal:");
        scanner.nextLine(); // Consume the newline character
        String newName = scanner.nextLine();
        myAnimal.setName(newName);

        System.out.println("Enter new age for the animal:");
        int newAge = scanner.nextInt();
        myAnimal.setAge(newAge);

        // Display updated information
        System.out.println("\nUpdated information about the animal:");
        myAnimal.displayInfo();

        scanner.close();
    }
}
