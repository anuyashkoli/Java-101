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
                        if (iterator + 1 < Args.length) {
                            title = Args[iterator + 1];
                            iterator++;
                        } else {
                            System.out.println("requires title value");
                        }
                    } else if (Objects.equals(Args[iterator], "--author")) {
                        if (iterator + 1 < Args.length) {
                            author = Args[iterator + 1];
                            iterator++;
                        } else {
                            System.out.println("requires author value");
                        }
                    } else if (Objects.equals(Args[iterator], "--pages")) {
                        if (iterator + 1 < Args.length) {
                            pages = Integer.parseInt(Args[iterator + 1]);
                            iterator++;
                        } else {
                            System.out.println("requires pages value");
                        }
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