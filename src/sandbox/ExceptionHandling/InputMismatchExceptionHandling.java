package sandbox.ExceptionHandling;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchExceptionHandling {

    static Scanner ask = new Scanner(System.in);
    static boolean isRunning = true;

    public static void main(String[] Args) {
        ageVerification();
    }

    public static void ageVerification() {
        while (isRunning) {
            try {
                System.out.println("Enter your age: ");
                int userAge = ask.nextInt();
                if (userAge >= 18) {
                    System.out.println("You're an Adult");
                } else {
                    System.out.println("Your are minor");
                }
                isRunning = false;
            } catch (InputMismatchException e) {
                System.out.println("Enter Number");
                ask.nextLine();
            }
        }
        ask.close();
    }
}

/*
The Brief: Build a secure age-verification terminal.

Acceptance Criteria: Ask the user to enter their age as a number.
If they type a word instead of a number, the program must not crash.
It must catch the error, print "Invalid input, please type a number," and ask them again until they get it right.

(Hint: You will need to research try and catch blocks).
 */