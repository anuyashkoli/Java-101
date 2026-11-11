package sandbox.CommandRouter;

import java.awt.geom.Area;
import java.util.Objects;

public class ProfileCLI {
    public static void main(String[] Args) {
        String version = "v1.0.0";

        if (Args.length == 0) {
            System.out.println("Try running `help`");
        } else {
            // Zero Parameter Sub-commands

            switch (Args[0]) {
                case "version" -> System.out.println("vProfile: " + version);
                case "help" -> System.out.println("Help yourself");
                case "greet" -> {
                    if (Args.length == 2) {
                        System.out.println("Hello, " + Args[1] + " !!");
                    } else {
                        System.out.println("Sorry, I didn't get your name");
                    }
                }
                case "register" -> {
                    if (Args.length == 3) {
                        System.out.println("Registered User: " + Args[1] + " aged " + Args[2]);
                    } else {
                        System.out.println("Enter username and age, too, try using `help`");
                    }
                }
                case null, default -> System.out.println("Try running `help`");
            }
        }
    }
}