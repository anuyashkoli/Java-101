package sandbox.CommandRouter;

public class tinyCalculator {

    public static void main(String[] Args) {
        if (Args.length == 0) {
            System.out.println("CMD se aa !!");
        } else if (Args.length <= 2) {
            System.out.println("Requires two parameters");
        } else {
            try {
                // Hardcoded Logic for Simplicity
                String operation = Args[0];
                try {
                    int firstNumber = Integer.parseInt(Args[1]);
                    int secondNumber = Integer.parseInt(Args[2]);

                    switch (operation) {
                        case "--add":
                            System.out.println("Addition: " + (firstNumber + secondNumber));
                            break;
                        case "--sub":
                            System.out.println("Substraction: " + (firstNumber - secondNumber));
                            break;
                        case "--multiply":
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
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Akade mod karayachi aahe, Akade taak !");
                }

            } catch (ArrayIndexOutOfBoundsException outBound) {
                System.out.println("Array yaar !! \n" + outBound.getMessage());
            }
        }
    }
}
