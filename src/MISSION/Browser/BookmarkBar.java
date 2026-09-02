package MISSION.Browser;

public class BookmarkBar {
    private BookmarkNode head;

    public void addBookmark(String siteTitle) {
        BookmarkNode currentBookmark = new BookmarkNode(siteTitle);

        if (head == null) {
            head = currentBookmark;
        } else {
            BookmarkNode current = head;
            while (current.newBookmark != null) {
                current = current.newBookmark;
            }
            current.newBookmark = currentBookmark;
        }
    }

    public void displayBookmark(){
        if (head == null) {
            System.out.println("No Bookmarks");
        } else {
            BookmarkNode current = head;
            while (current != null) {
                System.out.print("[" + current.title + "]  ");
                current = current.newBookmark;
            }
            System.out.println();
        }
    }
}
