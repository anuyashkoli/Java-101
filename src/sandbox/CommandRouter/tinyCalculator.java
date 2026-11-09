package sandbox.CommandRouter;

import java.util.Scanner;

public class tinyCalculator {
    static Scanner ask = new Scanner(System.in);

    public static void main(String[] Args) {
        if (Args.length == 0) {
            System.out.println("CMD se aa !!");
        } else {
            System.out.println("Length of the Argument: " + Args.length);
            try {
                for (String arg : Args) {
                    System.out.println(arg);
                }
            } catch (ArrayIndexOutOfBoundsException outBound) {
                System.out.println("Array yaar !! \n" + outBound.getMessage());
            }
        }
    }
}
