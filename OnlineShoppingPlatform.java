import java.util.ArrayList;
import java.util.Scanner;

// Base class representing a product
class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Inherited class representing a specific category of product (e.g., Electronics)
class Electronics extends Product {
    private String brand;

    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

// Inherited class representing a specific category of product (e.g., Clothing)
class Clothing extends Product {
    private String size;

    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}

// Class representing a customer
class Customer {
    private String name;
    private String email;
    private String address;
    private ArrayList<Product> shoppingCart;

    public Customer(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.shoppingCart = new ArrayList<>();
    }

    public void addToCart(Product product) {
        shoppingCart.add(product);
        System.out.println(product.getName() + " added to your shopping cart.");
    }

    public void removeFromCart(Product product) {
        shoppingCart.remove(product);
        System.out.println(product.getName() + " removed from your shopping cart.");
    }

    public void viewShoppingCart() {
        System.out.println("\nShopping Cart:");
        for (Product product : shoppingCart) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
        System.out.println("Total: $" + calculateTotal());
    }

    private double calculateTotal() {
        double total = 0;
        for (Product product : shoppingCart) {
            total += product.getPrice();
        }
        return total;
    }

    public void processOrder() {
        System.out.println("Order processed for " + name + ". Total amount: $" + calculateTotal());
        shoppingCart.clear();
    }

    public ArrayList<Product> getShoppingCart() {
        return shoppingCart;
    }
}

public class OnlineShoppingPlatform {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter your email: ");
        String customerEmail = scanner.nextLine();

        System.out.print("Enter your address: ");
        String customerAddress = scanner.nextLine();

        Customer customer = new Customer(customerName, customerEmail, customerAddress);

        // Sample products
        Electronics laptop = new Electronics("Laptop", 899.99, "Dell");
        Clothing shirt = new Clothing("Casual Shirt", 29.99, "M");

        customer.addToCart(laptop);
        customer.addToCart(shirt);

        customer.viewShoppingCart();

        System.out.print("\nDo you want to remove an item from your cart? (yes/no): ");
        String removeChoice = scanner.nextLine().toLowerCase();
        if (removeChoice.equals("yes")) {
            System.out.print("Enter the name of the product to remove: ");
            String productNameToRemove = scanner.nextLine();
            for (Product product : customer.getShoppingCart()) {
                if (product.getName().equalsIgnoreCase(productNameToRemove)) {
                    customer.removeFromCart(product);
                    break;
                }
            }
            customer.viewShoppingCart();
        }

        System.out.print("\nDo you want to process your order? (yes/no): ");
        String processOrderChoice = scanner.nextLine().toLowerCase();
        if (processOrderChoice.equals("yes")) {
            customer.processOrder();
            System.out.println("Thank you for shopping with us!");
        } else {
            System.out.println("Your order has not been processed. Thank you for visiting!");
        }
    }
}
