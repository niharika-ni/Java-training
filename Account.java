import java.util.Scanner;

// Enum to represent different account types
enum AccountType {
    SAVING, CURRENT, DEMAT
}

// Class to represent the Bank Account
class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        displayBalance();
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            displayBalance();
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

// Class to represent Fixed Deposit
class FixedDeposit {
    // Method to deposit money for fixed time period
    public static void depositFixedAmount(BankAccount account, double amount, int months) {
        double interestRate = 0.05; // 5% interest rate for example
        double interest = amount * interestRate * months / 12;
        account.deposit(amount + interest);
        System.out.println("Fixed Deposit interest earned: $" + interest);
    }
}

// Main class to run the bank application
public class Account {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account holder's name: ");
        String accountHolder = scanner.nextLine();

        BankAccount bankAccount = new BankAccount(accountHolder);

        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Display Balance\n4. Fixed Deposit\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    bankAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    bankAccount.withdraw(withdrawAmount);
                    break;
                case 3:
                    bankAccount.displayBalance();
                    break;
                case 4:
                    System.out.print("Enter fixed deposit amount: $");
                    double fixedDepositAmount = scanner.nextDouble();
                    System.out.print("Enter fixed deposit duration in months: ");
                    int fixedDepositMonths = scanner.nextInt();
                    FixedDeposit.depositFixedAmount(bankAccount, fixedDepositAmount, fixedDepositMonths);
                    break;
                case 5:
                    System.out.println("Exiting the bank application. Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
