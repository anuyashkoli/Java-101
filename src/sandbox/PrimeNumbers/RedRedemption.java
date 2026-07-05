package sandbox.NestedLoops.PrimeNumbers;

public class RedRedemption {
    public static void main(String[] args) {

    }

    public static boolean prime(int number) {
        if (number <= 1) { return false; }

        for (int divisor = 2; divisor < number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}

/*
In isPrime() in Redemption.java,
for loop runs two if checks on every single pass. For 541, computer performs over 1,000 checks.

The RedRedemption, just changes the for loop to increment divisior upto divisor < number, instead of divisor <= number
*/