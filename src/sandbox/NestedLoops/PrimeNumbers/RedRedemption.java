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