public class FindingPrimes {
    public static void main(String[] args) {
        int currentNumber = 2; // Number analyzed
        int maxNumber = 100; // Maximum value to be checked
        int counter = 1;

        // Main loop that goes from 2 to 100
        while (counter <= maxNumber) {
            // Loop that checks all integers from 2 to the current number (starts with 2, ends with 20)
            for (int divisor = 2; divisor <= currentNumber; divisor++) {
                // We know that the number is prime if it already checked all previous divisors
                if (divisor == currentNumber) {
                    System.out.println(currentNumber + " is a prime number!");
                    counter++;
                    break;
                }
                // We know that the number is NOT prime if it can be divided by a lower integer
                if (currentNumber % divisor == 0) {
                    System.out.println(currentNumber + " is NOT a prime number!");
                    break;
                }
            }
            // After finished checking if the number is prime or not, we must proceed to the next one
            currentNumber++;
        }
    }

}

/*
The code is supposed to print the list of first 20 numbers (except 1) and state whether it's a prime number or not.
What should be placed in both placeholders, respectively, break or continue ?
*/

// Answer
// 1) continue, break
// 2) break, break