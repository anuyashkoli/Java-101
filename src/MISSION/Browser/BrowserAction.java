package MISSION.Browser;

public interface BrowserAction {
    public String visitPage(String URL);
    public void goBack();
    public void showHistory();
    public void downloadFile(String fileName);
    public void processNextDownload();
    public void addBookmark(String siteTitle);
    public void displayBookmark();
}
