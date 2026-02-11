public class Account {
    private double balance;
    private String pin;

    public Account(double initialBalance, String initialPin) {
        this.balance = initialBalance;
        this.pin = initialPin;
    }

    public boolean checkPin(String inputPin) {
        return this.pin.equals(inputPin);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: $" + amount);
        } else {
            System.out.println("Error: Insufficient funds or invalid amount.");
        }
    }

    public void changePin(String newPin){
        if(newPin.length() == 4){
            this.pin = newPin;
            System.out.println("PIN successfully changed!");
        }else{
            System.out.println("Error: PIN must be exactly 4 digits.");
        }
    }

    public double getBalance() {
        return balance;
    }
}