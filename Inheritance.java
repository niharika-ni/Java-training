import java.util.Scanner;

// Define the superclass (Parent class)
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

// Define the subclass (Child class) inheriting from Animal
class Dog extends Animal {
    private String breed;

    // Constructor to initialize the Dog object
    public Dog(String name, int age, String breed) {
        super(name, age); // Call the constructor of the superclass
        this.breed = breed;
    }

    // Getter method for breed
    public String getBreed() {
        return breed;
    }

    // Setter method for breed
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Display information about the dog, including the breed
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo method of the superclass
        System.out.println("Breed: " + breed);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for creating a Dog object
        System.out.println("Enter the name of the dog:");
        String name = scanner.nextLine();

        System.out.println("Enter the age of the dog:");
        int age = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter the breed of the dog:");
        String breed = scanner.nextLine();

        // Create a Dog object using the constructor
        Dog myDog = new Dog(name, age, breed);

        // Display information using the overridden displayInfo method
        System.out.println("\nInformation about the dog:");
        myDog.displayInfo();

        scanner.close();
    }
}
