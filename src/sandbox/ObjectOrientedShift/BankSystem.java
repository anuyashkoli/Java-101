package sandbox.ObjectOrientedShift;

public class BankSystem {
    public static void main(String[] Args) {
        BankAccount arjunAccount = new BankAccount("Arjun", 2000);
        BankAccount duryodhanAccount = new BankAccount("Duryodhan", 20000);

        arjunAccount.deposit(1000);
        duryodhanAccount.deposit(0);

        arjunAccount.withdraw(1000);
        duryodhanAccount.withdraw(0);

        System.out.println(arjunAccount.getOwnerName());
        System.out.println(arjunAccount.getBalance());

        System.out.println(duryodhanAccount.getOwnerName());
        System.out.println(duryodhanAccount.getBalance());

        if (arjunAccount.getBalance() == duryodhanAccount.getBalance()) {
            System.out.println("Same Same but Different but Still Same");
        } else if (arjunAccount.getBalance() > duryodhanAccount.getBalance()) {
            System.out.println(arjunAccount.getOwnerName() + " is Richer");
        } else {
            System.out.println(duryodhanAccount.getOwnerName() + " is Richer");
        }
    }
}
