package MISSION.Browser;

import java.util.Scanner;

public class Browser implements BrowserAction {

    HistoryStack chromeHistory = new HistoryStack();

    @Override
    public String visitPage(String URL) {
        System.out.println("Visiting Page" + URL);
        Page newPage = new Page(URL);
        chromeHistory.push(newPage);
        return URL;
    }

    @Override
    public void goBack() {
        try {
            System.out.println("Going Back");
            Page currentPage = chromeHistory.pop();
            if (currentPage.url != null) {
                System.out.println("Going back to: " + currentPage.url);
            } else {
                System.out.println("Nothing to go back");
            }
        } catch (NullPointerException npe) {
            System.out.println("NULL");
        }
    }

    @Override
    public void showHistory() {
        System.out.println("Displaying History");
    }

    public static void main(String[] args) {
        Browser Chrome = new Browser();
        Scanner ask = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("=== Main Menu ===");
            System.out.println("1. Enter URL");
            System.out.println("2. Go Back");
            System.out.println("3. History");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: [1, 2, 3, 4]");
            int userInput = ask.nextInt();

            if (userInput == 1) {
                ask.nextLine();
                String userURL = ask.nextLine();
                Chrome.visitPage(userURL);
            } else if (userInput == 2) {
                Chrome.goBack();
            } else if (userInput == 3) {
                Chrome.showHistory();
            } else if (userInput == 4) {
                isRunning = false;
            }
        }
    }
}
