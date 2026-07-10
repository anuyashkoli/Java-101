package sandbox.ObjectOrientedShift;

public class BankAccount {
    // Attributes
    private String ownerName;
    private int balance;

    // Constructor - Object Builder
    public BankAccount(String name, int startingBalance) {
        ownerName = name;
        balance = startingBalance;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Only Amount above ₹1 can be deposited, " + ownerName);
        } else {
            balance = balance + amount;
            System.out.println(ownerName + " deposited " + amount + ". New Balance: " + balance);
        }
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Itne paiso ka karoge kya ?, " + ownerName);
        } else if (balance >= amount) {
            balance = balance - amount;
            System.out.println(amount + " has been withdrawn from " + ownerName + "'s Account" + ". \nNew Balance is: " + balance);
        } else {
            System.out.println("Low Balance, Can't Withdraw");
        }
    }

    public void showBalance(){
        System.out.println("Account Balance: " + balance);
    }

    // Getters
    public String getOwnerName () {
        return ownerName;
    }

    public int getBalance() {
        return balance;
    }

}
