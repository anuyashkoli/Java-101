package sandbox.ArrayLists;

import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
import java.util.Scanner;

public class TheRoaster {
    public static void main(String[] Args) {
        boolean isRunning = true;
        Scanner ask = new Scanner(System.in);
        ArrayList<String> customerNames = new ArrayList<String>(); // Empty ArrayList

        while (isRunning) {
            System.out.print("\nEnter a new customer name: ");
            String customerName = ask.nextLine();
            if (customerName.equalsIgnoreCase("exit")) {
                isRunning = false;
            } else {
                customerNames.add(customerName);
                System.out.print("Current Customers: ");
                for (int iterator = 0; iterator < customerNames.size(); iterator++) {
                    System.out.print("[");
                    System.out.print(customerNames.get(iterator));
                    System.out.print("]");
                }
            }
        }
    }
}

/*Acceptance Criteria:

The Infinite List: Create a Scanner and an empty ArrayList of type String.
The Enrollment Loop: Trap the user in a while loop that asks them to "Enter a new customer name (or type 'EXIT' to stop):".
The Expansion: Every time they type a name, add it to the ArrayList.
The Bouncer: If they type 'EXIT', the loop must immediately stop (break).
The Grand Reveal: After the loop ends, write a for loop that uses .size() and .get() to print out the final roster of all enrolled customers.
 */