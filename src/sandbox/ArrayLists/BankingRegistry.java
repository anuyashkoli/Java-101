package sandbox.ArrayLists;

import sandbox.ObjectOrientedShift.BankAccount;

import java.util.ArrayList;

public class BankingRegistry {
    public static void main(String[] Args){
        ArrayList<BankAccount> registry = new ArrayList<BankAccount>();
        int totalVaultCash = 0;

        // List of few accounts
        BankAccount Yudhishthir = new BankAccount("Yudhishthir", 1);
        BankAccount Bheem = new BankAccount("Bheem", 2);
        BankAccount Arjun = new BankAccount("Arjun", 3);
        BankAccount Nakul = new BankAccount("Nakul", 4);
        BankAccount Sahadev = new BankAccount("Sahadev", 5);
        registry.add(Yudhishthir);
        registry.add(Bheem);
        registry.add(Arjun);
        registry.add(Nakul);
        registry.add(Sahadev);


        for (int pandav = 0; pandav < registry.size(); pandav++ ) {
            BankAccount currentAccount = registry.get(pandav);
            totalVaultCash = totalVaultCash + currentAccount.getBalance();
            System.out.println("Account Holder: " +currentAccount.getOwnerName() + ", Available Balance: " + currentAccount.getBalance());
        }
        System.out.println("Total Vault Cash: " + totalVaultCash);
    }
}
/*
In Phase 8, you are combining your OOP knowledge and your ArrayList knowledge.
You will create an ArrayList<BankAccount>, add three distinct bank accounts to it, and use a for loop to audit them and calculate the total vault cash*/