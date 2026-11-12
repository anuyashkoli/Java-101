package sandbox.CommandRouter;

public class Book {
    private String title;
    private String author;
    private int pages;
    private Status readStatus;

    public Book(String bookTitle, String bookAuthor, int bookPages, Status bookReadStatus) {
        title = bookTitle;
        author = bookAuthor;
        pages = bookPages;
        readStatus = bookReadStatus;
    }

    // Serialiser
    public String toDataString() {
        return getTitle() + "|" + getAuthor() + "|" + getPages() + "|" + getStatus();
    };

    // getter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public Status getStatus() {
        return readStatus;
    }
}