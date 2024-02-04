import java.util.Scanner;

// Abstract class Animal
abstract class Animal {
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method to get sound
    public abstract String getSound();

    // Display information about the animal
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Sound: " + getSound());
    }
}

// Concrete class Dog extending Animal
class Dog extends Animal {
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Implementation of abstract method
    @Override
    public String getSound() {
        return "Woof! Woof!";
    }

    // Display information about the dog
    public void displayDogInfo() {
        displayInfo();
        System.out.println("Breed: " + breed);
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for creating a dog
        System.out.print("Enter the name of the dog: ");
        String name = scanner.nextLine();

        System.out.print("Enter the age of the dog: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the breed of the dog: ");
        String breed = scanner.nextLine();

        // Create a Dog object
        Dog myDog = new Dog(name, age, breed);

        // Display information about the dog
        System.out.println("\nInformation about the dog:");
        myDog.displayDogInfo();

        scanner.close();
    }
}
