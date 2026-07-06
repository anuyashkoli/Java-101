package sandbox.Arrays;

import java.util.Scanner;

import static sandbox.Arrays.ArrayMastery.divider;

public class InteractiveArray {

    static Scanner ask = new Scanner(System.in);
    static int[] array;
    static int size;

    public static void main (String[] Args) {
        divider();
        theArchitect();
        theBuilder();
        theLoader();
        theRevealer();
    }

    public static void theArchitect () {
        System.out.print("How many numbers do you want to store ? ");
        size = ask.nextInt();
        divider();
    }

    public static void theBuilder () {
        System.out.println("Creating array of size " + size);
        array = new int[size];
        divider();
    }

    public static void theLoader () {
        for (int iteration = 0; iteration < size; iteration++) {
            System.out.println("Enter number for " + iteration);
            array[iteration] = ask.nextInt();
        }
        divider();
    }

    public static void theRevealer () {
        divider();
        System.out.println("The Grand Reveal");
        for (int iterator = 0; iterator < size; iterator++) {
            System.out.print(array[iterator]);
            System.out.print(" ");
        }
    }

}

// Tasks
/*
Task 1 (The Architect): Ask the user: "How many numbers do you want to store?" Capture that input into an int variable named size.

Task 2 (The Builder): Create a new, empty integer array using that size variable instead of a hardcoded number.

Task 3 (The Loader): Write a for loop that runs exactly size times. Inside the loop, ask the user: "Enter number [current iteration]:", capture their input, and store it directly into the array at the current index.

Task 4 (The Reveal): Print a divider, then write one final loop to print out the fully loaded array back to the user on a single line.*/