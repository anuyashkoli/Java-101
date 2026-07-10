package sandbox.ObjectOrientedShift;

public class BankSystem {
    public static void main(String[] Args) {
        BankAccount arjunAccount = new BankAccount("Arjun", 2000);
        BankAccount duryodhanAccount = new BankAccount("Duryodhan", 20000);

        arjunAccount.deposit(1000);
        duryodhanAccount.deposit(0);

        arjunAccount.withdraw(1000);
        duryodhanAccount.withdraw(0);

        arjunAccount.showBalance();
        duryodhanAccount.showBalance();
    }
}
