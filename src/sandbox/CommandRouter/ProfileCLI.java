package sandbox.CommandRouter;

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
                    if (Args.length < 2) {
                        System.out.println("Sorry, I didn't get your name");
                    } else {
                        System.out.println("Hello, " + Args[1] + " !!");
                    }
                }
                case "register" -> {
                    if (Args.length < 3) {
                        System.out.println("Enter username and age, too, try using `help`");
                    } else {
                        try {
                            String userName = Args[1];
                            int userAge = Integer.parseInt(Args[2]);
                            System.out.println("Registered User: " + userName + " aged " + userAge);
                        } catch (NumberFormatException e) {
                            System.out.println("Requires numerical value for age");
                        }
                    }
                }
                case null, default -> System.out.println("Try running `help`");
            }
        }
    }
}