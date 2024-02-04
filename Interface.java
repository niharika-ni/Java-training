import java.util.Scanner;

// Define the Animal interface
interface Animal {
    void makeSound();
    void eat();
}

// Implement the Animal interface with a specific class (e.g., Dog)
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }
}

// Implement the Animal interface with another class (e.g., Cat)
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }
}

public class Interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input to choose an animal
        System.out.println("Choose an animal (1 for Dog, 2 for Cat):");
        int choice = scanner.nextInt();

        Animal animal;

        // Create an instance of the selected animal class
        if (choice == 1) {
            animal = new Dog();
        } else if (choice == 2) {
            animal = new Cat();
        } else {
            System.out.println("Invalid choice. Exiting program.");
            return;
        }

        // Call the methods of the selected animal class
        animal.makeSound();
        animal.eat();

        scanner.close();
    }
}
