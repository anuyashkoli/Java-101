package sandbox.CommandRouter;

import java.util.Objects;

public class FlagParser {
    public static void main(String[] Args) {
        if (Args.length > 0) {
            if (Objects.equals(Args[0], "add")) {
                String title = null;
                String author = null;
                int pages = 0;

                for (int iterator = 1; iterator < Args.length; ) {

                    if (Objects.equals(Args[iterator], "--title")) {
                        if (iterator + 1 < Args.length && (!Args[iterator + 1].startsWith("--"))) {
                            title = Args[iterator + 1];
                            iterator++;
                        } else {
                            System.out.println("requires title value");
                        }
                    } else if (Objects.equals(Args[iterator], "--author")) {
                        if (iterator + 1 < Args.length && (!Args[iterator + 1].startsWith("--"))) {
                            author = Args[iterator + 1];
                            iterator++;
                        } else {
                            System.out.println("requires author value");
                        }
                    } else if (Objects.equals(Args[iterator], "--pages")) {
                        try {
                            if (iterator + 1 < Args.length && (!Args[iterator + 1].startsWith("--"))) {
                                pages = Integer.parseInt(Args[iterator + 1]);
                                iterator++;
                            } else {
                                System.out.println("requires pages value");
                            }
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("Numerical values for pages required");
                        }
                    } else {
                        System.out.println("Unknown flag or stray argument: " + Args[iterator]);
                    }
                    iterator++;
                }
                if (author != null && title != null && pages != 0) {
                    System.out.println("\nAdded: \"" + title + "\" by " + author + ", " + pages + " pages long");
                } else {
                    System.out.print("Missing Parameters: ");
                    if (title == null) {
                        System.out.print("title ");
                    }
                    if (author == null) {
                        System.out.print("author ");
                    }
                    if (pages == 0) {
                        System.out.print(" pages");
                    }
                }
            }
        }
    }
}