package sandbox.NestedLoops.PrimeNumbers;

public class Redemption {
    public static void main(String[] args) {
        System.out.println(isPrime(541));
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