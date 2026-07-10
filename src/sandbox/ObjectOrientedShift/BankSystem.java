package sandbox.ObjectOrientedShift;

public class BankSystem {
    public static void main(String[] Args) {
        BankAccount arjunAccount = new BankAccount("Arjun", 2000);
        BankAccount duryodhanAccount = new BankAccount("Duryodhan", 20000);

        arjunAccount.deposit(18000);
        duryodhanAccount.deposit(18000);

        // Print Final Balance of both of the account
    }
}
