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

/*
Issues in the Current Code
1. The Gatekeeper Trap (Args.length <= 2)
By placing else if (Args.length <= 2) at the root before inspecting the command, you have locked out any command that only requires one argument (like --help or --version).
If someone enters --help, Args.length is 1.
Because 1 <= 2 is true, the program prints "Requires two parameters" and terminates.
Furthermore, the case "--help" was completely removed from your switch.
The Architectural Fix:
In a CLI, the primary command (Args[0]) dictates the validation rules, not a global gatekeeper.
Inspect Args[0] first in your switch.
Let each individual case enforce its own requirements. For example, case "--add" checks if Args.length < 3 before parsing, while case "--help" requires no extra arguments at all.

2. Redundant Exception Traps
Because your if-else chain guarantees that execution only reaches the switch when Args.length >= 3, touching Args[0], Args[1], and Args[2] will physically never throw an ArrayIndexOutOfBoundsException. The outer try-catch is completely unreachable dead code.
Either validate bounds with if (Args.length < requiredCount) or catch the boundary exception, but nesting both is redundant. Defensive bounds checking via if conditions is the standard in CLI tools.

3. Integer Division Truncation
In your --div case, dividing two int variables (e.g., 5 / 2) performs integer division and truncates the decimal, resulting in 2 instead of 2.5. Casting at least one operand to a double produces standard division output.
*/