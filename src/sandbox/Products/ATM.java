package sandbox.Products;

import java.util.Scanner;

public class ATM {

    static int accountBalance = 5000; // Default Balance ₹5000
    static String accountPin = "1010"; // I think String would be better
    static Scanner ask = new Scanner(System.in);
    static boolean isExited = true;

    public static void main(String[] Args) {
        theMenu();
    }

    public static void theMenu() {

        while (isExited) {
            System.out.println("\nSelect any of the following option");
            System.out.println("1) Check Balance");
            System.out.println("2) Deposit");
            System.out.println("3) Withdraw");
            System.out.println("4) Exit");

            int userOption = ask.nextInt(); // For Menu

            switch (userOption) {

                case 1:  // Account Balance
                    System.out.println("Account Balance: ₹" + accountBalance);
                    break;

                case 2:  // Deposit
                    System.out.println("Enter amount to be deposited: ₹");
                    int depositAmount = ask.nextInt();
                    if (depositAmount <= 0) {
                        System.out.println("Minimum ₹1 Deposit required");
                    } else {
                        accountBalance = accountBalance + depositAmount;
                        System.out.println("Amount Deposited: " + depositAmount); // To take Deposit Amount
                    }
                    break;

                case 3:  // Withdraw
                    int withdrawalAmount = ask.nextInt();
                    if (withdrawalAmount <= 0) {
                        System.out.println("Kya karoge itne dhanraashi ka ?");
                    } else {
                        if (accountBalance >= withdrawalAmount) {
                            accountBalance = accountBalance - withdrawalAmount;
                            System.out.println("Amount Withdraw: " + withdrawalAmount);
                        } else {
                            System.out.println("Low Balance of ₹: " + (accountBalance - withdrawalAmount));
                        }
                    }
                    break;

                case 4:  // Exit
                    System.out.println("Have A Nice Day");
                    isExited = false;
                    break;

                default:
                    System.out.println("System.out");

            }
        }

    }

}

// The Brief: Build a command-line bank.
/*Criteria:
The user starts with a ₹5,000 balance and a hardcoded PIN.
They are trapped in a menu loop (1. Check Balance, 2. Deposit, 3. Withdraw, 4. Exit).
They cannot withdraw more than they have. They must enter the correct PIN before the menu even opens. */