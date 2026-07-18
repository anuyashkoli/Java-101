package sandbox.HashMaps;

import sandbox.ObjectOrientedShift.BankAccount;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class AadhaarDirectory {
    static boolean isRunning = true;
    static Scanner ask = new Scanner(System.in);
    static int userRequest;

    public static void main(String[] args) {
        Linker();
    }

    public static void Linker() {
        BankAccount Alice = new BankAccount("Alice", 1000);
        BankAccount Bob = new BankAccount("Bob", 1010);
        BankAccount Batman = new BankAccount("Bruce", 999999999);

        Map<Integer, BankAccount> linkedAccounts = new HashMap<>();

        linkedAccounts.put(1, Alice);
        linkedAccounts.put(2, Bob);
        linkedAccounts.put(3, Batman);

        while (isRunning) {
            try {
                System.out.println("Type an Account Number or q for Exit");
                userRequest = ask.nextInt();

                if (linkedAccounts.containsKey(userRequest)) {
                    System.out.println("Printing Account Details: ");
                    System.out.println("Account Holder: " + linkedAccounts.get(userRequest).getOwnerName());
                    System.out.println("Current Balance: " + linkedAccounts.get(userRequest).getBalance());
                    System.out.println("== == == == == == == == == ==");
                } else {
                    System.out.println("🚫 Account Not Found");
                    System.out.println("== == == == == == == == == ==");
                }
            } catch (InputMismatchException e) {
                String garbageCollector = ask.nextLine();
                if (garbageCollector.equalsIgnoreCase("q")) {
                    System.out.println("BYE.");
                    isRunning = false;
                } else {
                    System.out.println("Enter Numerical Values");
                }
            }
        }


    }
}

/*
The Brief: Build a high-speed lookup directory.

Acceptance Criteria: Create a HashMap where the Key is an Integer (Account Number) and the Value is a BankAccount object.
Add three accounts. Ask the user to type an Account Number, and instantly print the details of that specific account without writing a single for loop.
 */