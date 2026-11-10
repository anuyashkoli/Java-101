package sandbox.CommandRouter;

import java.util.Objects;
import java.util.SplittableRandom;

public class ProfileCLI {
    public static void main(String[] Args) {
        String version = "v1.0.0";

        // Zero Parameter Sub-commands
        if (Args.length <= 1) {

            if (Objects.equals(Args[0], "version")) {
                System.out.println("vProfile: " + version);
            } else if (Objects.equals(Args[0], "help")) {
                System.out.println("Help yourself");
            } else if (Objects.equals(Args[0], "greet")) {
                System.out.println("Sorry, I didn't get your name");
            } else if (Objects.equals(Args[0], "register")) {
                System.out.println("Enter username and age, too, try using `help`");
            } else {
                System.out.println("Try running `help`");
            }
        }

        // One Parameter Sub-commands
        if (Args.length == 2) {
            if (Objects.equals(Args[0], "greet")) {
                String yourName = Args[1];
                System.out.println("Hello, " + yourName + " !!");
            } else if (Objects.equals(Args[0], "register")) {
                System.out.println("Please specify your age, try using `help`");
            }
        } else {
            System.out.println("Try running `help`");
        }

        // Two Parameter Sub-commands
        try {
            if (Args.length == 3) {
                if (Objects.equals(Args[0], "register")) {
                    String username = Args[1];
                    int age = Integer.parseInt(Args[2]);
                    System.out.println("Registered user: " + username + " aged " + age);
                }
            }
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Please enter numerical value for age, try using `help`");
        }
    }
}
