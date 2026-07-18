package sandbox.Products.TerminalShop;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TerminalShop {
    static boolean trapped = true;
    static Scanner ask = new Scanner(System.in);
    static Map<Integer, Product> productHashMap = new HashMap<>();
    public static void main(String[] Args) {

    }

    public void theDatabase() {

        //Preloading
        Product HP = new Product("HP Laptop", 50000, 10);
        Product Lenovo = new Product("Lenovo Laptop", 55000, 10);
        Product Dell = new Product("Dell Laptop", 60000, 10);

        productHashMap.put(1, HP);
        productHashMap.put(2, Lenovo);
        productHashMap.put(3, Dell);
    }

    public void userTrap() {
        while (trapped) {
            System.out.println("1. View Inventory");
            System.out.println("2. Buy an Item");
            System.out.println("3. Exit");
            int userChoice = ask.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("Inventory ⤵️");
                    for (int mapper = 0; mapper <= productHashMap.size(); mapper++) {
                        System.out.println(productHashMap.get(mapper).getProductName()); // Product Name
                        System.out.println(productHashMap.get(mapper).getProductPrice()); // Product Price
                        System.out.println(productHashMap.get(mapper).getProductStock()); // Product Stock
                    }
            }
        }
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