package MISSION;

import java.util.Scanner;

public class SmartVault {

    private int[] limitedArray = new int[5]; // Our limit-less Array
    private int currentIndex = 0;
    Scanner ask = new Scanner(System.in);

    public void main(String[] Args) {
        keepAsking();
    }

    //Method to handle the iteration
    public void keepAsking() {
        while (currentIndex < 23) {
            addElement();
        }
    }

    //Method to add element in Array
    public void addElement() {
        System.out.print("Enter element to add: ");
        int userInput = ask.nextInt();
        // To handle overflow
        if (limitedArray.length <= currentIndex) {
            System.out.println("=== ARRAY EXPANSION ===");
            int[] extendedArray = new int[limitedArray.length * 2];

            // Filling the extended Array with the data of limited Array
            for (int filler = 0; filler < limitedArray.length; filler++) {
                extendedArray[filler] = limitedArray[filler];
            }
            // Reassigning the arrays so we can keep extending
            limitedArray = extendedArray;
        }
        limitedArray[currentIndex] = userInput;
        currentIndex++;
        displayElements();
    }

    public void displayElements() {
        for (int iterator = 0; iterator < currentIndex; iterator++) {
            System.out.print("[" + limitedArray[iterator] + "]");
        }
        System.out.println();
    }
}