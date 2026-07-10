package sandbox.ObjectOrientedShift;

public class BankAccount {
    // Attributes
    String ownerName;
    int balance;

    // Constructor - Object Builder
    public BankAccount(String name, int startingBalance) {
        ownerName = name;
        balance = startingBalance;
    }

    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println(ownerName + " deposited " + amount + ". New Balance: " + balance);
    }
    // withdraw method
}
