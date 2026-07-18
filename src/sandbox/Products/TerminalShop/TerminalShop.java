package sandbox.Products.TerminalShop;

import java.util.HashMap;
import java.util.Map;

public class TerminalShop {
    public static void main(String[] Args) {

    }

    public static void theDatabase() {
        Map<Integer, Product> productHashMap = new HashMap<>();

        //Preloading
        Product HP = new Product("HP Laptop", 50000, 10);
        Product Lenovo = new Product("Lenovo Laptop", 55000, 10);
        Product Dell = new Product("Dell Laptop", 60000, 10);

        productHashMap.put(1, HP);
        productHashMap.put(2, Lenovo);
        productHashMap.put(3, Dell);
    }
}



/*
The Execution: TerminalShop.java

This file is your front-end UI and database.
✔️ The Database: Create a HashMap<Integer, Product>. The Integer key will act as the "Item ID" (e.g., Key 1 = A Laptop, Key 2 = Coffee). Load it with at least 3 distinct products.
The Main Loop: Trap the user in a while loop with three distinct options:
View Inventory: Use a loop to print every Item ID, its Name, Price, and current Stock.
Buy an Item: Ask the user for the Item ID they want to buy. Use .containsKey() to make sure the ID exists. If it does, trigger the buy method on that specific object.
Exit: Shut down the program.

The Armor (Exception Handling): Wrap your menu input inside a try/catch block.
If the user types a word instead of a menu number,
catch the InputMismatchException, clear the scanner buffer with ask.nextLine(),
and gracefully loop back to the menu without crashing.*/