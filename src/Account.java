import java.util.ArrayList;

public class Account {
    private double balance;
    private String pin;
    private ArrayList<String> history = new ArrayList<>();

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
            addLog("Deposited: $" + amount);
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

    public void addLog(String message){
        history.add(message);
    }

    public void printHistory(){
        System.out.println("Transaction History");
        if(history.isEmpty()){
            System.out.println("No transactions yet.");
        }else {
            for(String record: history){
                System.out.println(record);
            }
        }
    }




}