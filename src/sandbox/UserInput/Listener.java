package sandbox.UserInput;

import java.util.Scanner;

import static sandbox.Arrays.ArrayMastery.divider;

public class Listener {

    static Scanner inputListener = new Scanner(System.in);
    public static void main(String[] args) {
        divider();
        theGreeter();
        divider();
        theCalculator();
        divider();
        notFunny();
    }

    public static void theCalculator () {
        System.out.println("Calculator");

        System.out.print("Enter First Number: ");
        float firstNumber = inputListener.nextFloat();
        System.out.print("Enter Second Number: ");
        float secondNumber = inputListener.nextFloat();

        System.out.println("Addition: " + (firstNumber + secondNumber));
        System.out.println("Subtraction: " + (firstNumber - secondNumber));
        System.out.println("Multiplication: " + firstNumber * secondNumber);
        System.out.println("Division: " + firstNumber / secondNumber);
    }

    public static void theGreeter() {
        System.out.println("What's your name ?");
        String myName = inputListener.nextLine();
        System.out.println("Hi, " + myName + ", Enjoy Java ☕");
    }

    public static void notFunny() {
        System.out.println("Aur kitni baar sorry kehna padega?");
        System.out.println("Jab tak 🫀👈se nahi nikalta tab tak, par fhilhaal ");
        int intiBaar = inputListener.nextInt();
        System.out.println(intiBaar + " baar bhi chalega");
        for (int sorryConter = 0; sorryConter < intiBaar; sorryConter++) {
            System.out.println("I'm Sorry, Arjun 🏹");
        }
    }
}

// Gemini Gyan - If you ever take a number and then need a String right after, you have to add a blank inputListener.nextLine(); in between to "eat" the garbage 'Enter' key. Keep this in mind for the future.