package sandbox.UserInput;

import java.util.Scanner;

import static sandbox.Arrays.ArrayMastery.divider;

public class Listener {
    public static void main() {
        Scanner inputListener = new Scanner(System.in);
        divider();
        System.out.println("Calculator");

        System.out.print("Enter First Number: ");
        float firstNumber = inputListener.nextFloat();
        System.out.print("Enter Second Number: ");
        float secondNumber = inputListener.nextFloat();

        System.out.println("Addition: " + firstNumber + secondNumber);
        System.out.println("Subtraction: " + (firstNumber - secondNumber));
        System.out.println("Multiplication: " + firstNumber * secondNumber);
        System.out.println("Division: " + firstNumber / secondNumber);

        inputListener.close();

    }
}
