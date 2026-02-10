import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Account myAccount = new Account(1000.0, "1234");
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Welcome to Java ATM ");
        System.out.print("Enter PIN: ");
        String enteredPin = scanner.nextLine();

        if (myAccount.checkPin(enteredPin)) {
            boolean running = true;

            while (running) {
                System.out.println("\nMAIN MENU: ");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw Cash");
                System.out.println("3. Deposit Funds");
                System.out.println("4. Exit");
                System.out.print("Select an option: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Current balance: $" + myAccount.getBalance());
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        myAccount.withdraw(withdrawAmount);
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        myAccount.deposit(depositAmount);
                        break;
                    case 4:
                        running = false;
                        System.out.println("Thank you for using our services. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } else {
            System.out.println("Access Denied: Wrong PIN!");
        }
        scanner.close();
    }
}