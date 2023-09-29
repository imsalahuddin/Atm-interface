import java.util.Scanner;

public class ATM_Interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 5000;

        System.out.println("Welcome to the ATM!");

        while (true) {
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: $" + balance);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: $");
                    int withdrawAmount = scanner.nextInt();
                    if (withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful. Remaining balance: $" + balance);
                    } else {
                        System.out.println("Insufficient funds!");
                    }
                    break;
                case 3:
                    System.out.print("Enter the amount to deposit: $");
                    int depositAmount = scanner.nextInt();
                    balance += depositAmount;
                    System.out.println("Deposit successful. New balance: $" + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}