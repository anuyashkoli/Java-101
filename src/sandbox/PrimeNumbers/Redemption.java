package sandbox.NestedLoops.PrimeNumbers;

import static sandbox.NestedLoops.PrimeNumbers.RedRedemption.prime;

public class Redemption {
    public static void main(String[] args) {
        int primeCounter = 0;
        int currentNumber = 2;
        while (primeCounter < 100) {
            if (prime(currentNumber)) {
                primeCounter++;
            }
            if (primeCounter == 100) {
                break;
            }
            currentNumber++;
        }
        System.out.println(currentNumber);
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number; divisor++) {

            if (number == divisor) {
                // System.out.println(number + " Prime"); Debuggin' Lines
                return true;
            } else if (number % divisor == 0) {
                // System.out.println(number + " Composite"); Debuggin' Lines
                return false;
            }
        }
        return false;
    }

}


// Task 1 (Single Check):
/*
Write a method boolean isPrime(int number).
It takes a single number, uses a loop to see if anything divides into it cleanly, and returns true or false. */

// Task 2 (The 100th Prime):
/*
Write a while loop that keeps counting up.
Every time it finds a prime (using the method you just wrote), it adds 1 to a primeCounter.
When primeCounter hits 100, print the number and break the loop. */

// Even though I have solved this using analogies and Gemini Debugging. I don't know how the 🦆 does this program works !!!