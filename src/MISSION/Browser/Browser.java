package MISSION.Browser;

import java.util.Scanner;

public class Browser implements BrowserAction {

    HistoryStack chromeHistory = new HistoryStack();
    DownloadQueue downloadQueue = new DownloadQueue();
    BookmarkBar bookmarkBar = new BookmarkBar();


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
        chromeHistory.historyStack();
    }

    @Override
    public void downloadFile(String fileName) {
        downloadQueue.enQueue(fileName);
    }

    @Override
    public void processNextDownload() {
        String ongoingDownload = downloadQueue.deQueue();
        try {
            if (ongoingDownload == null) {
                System.out.println("No Pending Downloads");
            } else {
                System.out.println("Currently Downloading: " + ongoingDownload);
            }
        } catch (NullPointerException NPE) {
            System.out.println(NPE.getMessage());
        }
    }

    // BOOKMARKs
    @Override
    public void addBookmark(String siteTitle) {
        bookmarkBar.addBookmark(siteTitle);
    }

    @Override
    public void displayBookmark() {
        bookmarkBar.displayBookmark();
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
            System.out.println("4. Start Download");
            System.out.println("5. Check Download");
            System.out.println("6. Add Bookmark");
            System.out.println("7. Show Bookmark");
            System.out.println("8. Exit");
            System.out.println("Enter your choice: ");
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
                ask.nextLine();
                String fileName = ask.nextLine();
                Chrome.downloadFile(fileName);
            } else if (userInput == 5) {
                Chrome.processNextDownload();
            } else if (userInput == 6) {
                ask.nextLine();
                String userBookmark = ask.nextLine();
                Chrome.addBookmark(userBookmark);
            } else if (userInput == 7) {
                Chrome.displayBookmark();
            } else if (userInput == 8) {
                isRunning = false;
                System.out.println("Thanks for Browsing");
            }
        }
    }
}
