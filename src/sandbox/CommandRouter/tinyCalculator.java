package sandbox.CommandRouter;

public class tinyCalculator {

    public static void main(String[] Args) {
        if (Args.length == 0) {
            System.out.println("CMD se aa !!");
        } else {
            try {
                // Hardcoded Logic for Simplicity
                String operation = Args[0];
                int firstNumber = Integer.parseInt(Args[1]);
                int secondNumber = Integer.parseInt(Args[2]);

                switch (operation) {
                    case "--add":
                        System.out.println("Addition: " + (firstNumber + secondNumber));
                        break;
                    case "--diff":
                        System.out.println("Substraction: " + (firstNumber - secondNumber));
                        break;
                    case "--multipy":
                        System.out.println("Multiplication: " + firstNumber * secondNumber);
                        break;
                    case "--div":
                        try {
                            System.out.println("Division: " + firstNumber / secondNumber);
                        } catch (Exception byZero) {
                            System.out.println("Can't Divide by Zero [Try using Caste or Religion]");
                        }
                        break;
                    default:
                        System.out.println("Ghee Khatam");
                        break;
                }

            } catch (ArrayIndexOutOfBoundsException outBound) {
                System.out.println("Array yaar !! \n" + outBound.getMessage());
            }
        }
    }
}
