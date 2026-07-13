package sandbox.HashMaps;

import sandbox.ObjectOrientedShift.BankAccount;

import java.util.HashMap;
import java.util.Map;

public class AadhaarDirectory {
    public static void main(String[] args) {
        // 1. Create
        Map<String, Integer> userAges = new HashMap<>();

        // 2. Add items
        userAges.put("Alice", 25);
        userAges.put("Bob", 30);

        // 3. Read an item
        System.out.println("Alice's age: " + userAges.get("Alice")); // Outputs 25

        // 4. Update an item
        userAges.put("Alice", 26);

        // 5. Check existence
        if (userAges.containsKey("Bob")) {
            System.out.println("Bob is in the map.");
        }
    }
}

/*
The Brief: Build a high-speed lookup directory.

Acceptance Criteria: Create a HashMap where the Key is an Integer (Account Number) and the Value is a BankAccount object.
Add three accounts. Ask the user to type an Account Number, and instantly print the details of that specific account without writing a single for loop.
 */