package MISSION;

import java.util.Scanner;

public class SmartVault {
    Scanner ask = new Scanner(System.in);
    private int[] series = new int[5];
    private int currentIndex = 0;

    public void main(String[] args) {
        underFlow();
    }

    // Method to handle Element adding loop; Cause the adding method should only do the `adding`
    public void underFlow() {
        while (currentIndex <= series.length) {
            addInArray();
        }
    }

    // Method to add single element in array
    public void addInArray() {

        System.out.println("Enter numbers to add: ");
        int userInput = ask.nextInt();

        if (series.length <= currentIndex) {
            System.out.println("Limit Reached: " + series.length + " = " + currentIndex);
            int[] extendedSeries = new int[series.length * 2];
            for (int filler = 0; filler < series.length; filler++) {
                extendedSeries[filler] = series[filler];
            }
            series = extendedSeries;
            series[currentIndex] = userInput;
            displayArray();
            currentIndex++;
        } else {
            series[currentIndex] = userInput;
            displayArray();
            currentIndex++;
        }
    }

    public void displayArray() {
        System.out.println("Array Elements: ");
        for (int iterator = 0; iterator <= currentIndex; iterator++) {
            System.out.print("[" + series[iterator] + "]");
        }
        System.out.println();
    }
}
