package MISSION.Browser;

public class BookmarkNode {
    public String title;
    public BookmarkNode newBookmark;

    //CONSTRUCTOR
    public BookmarkNode(String Title) {
        title = Title;
        newBookmark = null;
    }
}
