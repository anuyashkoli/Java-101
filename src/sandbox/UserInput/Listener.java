package sandbox.UserInput;

import java.util.Scanner;

import static sandbox.Arrays.ArrayMastery.divider;

public class Listener {

    static Scanner inputListener = new Scanner(System.in);
    public static void main() {
        divider();
        theCalculator();
    }

    public static void theCalculator () {
        System.out.println("Calculator");

        System.out.print("Enter First Number: ");
        float firstNumber = inputListener.nextFloat();
        System.out.print("Enter Second Number: ");
        float secondNumber = inputListener.nextFloat();

        System.out.println("Addition: " + firstNumber + secondNumber);
        System.out.println("Subtraction: " + (firstNumber - secondNumber));
        System.out.println("Multiplication: " + firstNumber * secondNumber);
        System.out.println("Division: " + firstNumber / secondNumber);
    }


}
