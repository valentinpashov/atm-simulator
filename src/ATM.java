import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        // Bill 1000 лв. amd PIN "1234"
        Account myAccount = new Account(1000.0, "1234");
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Welcome to Java ATM ");
        System.out.print("PIN: ");
        String enteredPin = scanner.nextLine();

        if (myAccount.checkPin(enteredPin)) {
            System.out.println("\nSuccessful Login!");
            System.out.println("1. Balance | 2. Withdrawal | 3. Deposit");
            System.out.print("Chose option: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Current balance: " + myAccount.getBalance() + " лв.");
            } else if (choice == 2) {
                System.out.print("Withdrawal amount: ");
                double amount = scanner.nextDouble();
                myAccount.withdraw(amount);
            } else if (choice == 3) {
                System.out.print("Deposit amount: ");
                double amount = scanner.nextDouble();
                myAccount.deposit(amount);
            }
        } else {
            System.out.println("Wrong PIN! Access denied.");
        }

        scanner.close();
    }
}