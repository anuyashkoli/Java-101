package Tsundoku;

import sandbox.CommandRouter.Book;
import sandbox.CommandRouter.Status;

import java.util.ArrayList;

public class Library {
    public static void main(String[] Args) {

    }

    ArrayList<Book> bookShelf = new ArrayList<>();

    public void addBook(Book b) {
        bookShelf.add(b);
        System.out.println("Added: " + b.toDataString());
    }

    public void displayBooks(Status filter) {
        for (Book book : bookShelf) {
            if (filter == Status.COMPLETED) {
                System.out.printf("|%-20s | %-20s | %-5d | %-10s%n|", book.getTitle(), book.getAuthor(), book.getPages(), book.getStatus());
            } else if (filter == Status.READING) {
                System.out.printf("|%-20s | %-20s | %-5d | %-10s%n|", book.getTitle(), book.getAuthor(), book.getPages(), book.getStatus());
            } else if (filter == Status.UNREAD) {
                System.out.printf("|%-20s | %-20s | %-5d | %-10s%n|", book.getTitle(), book.getAuthor(), book.getPages(), book.getStatus());
            } else {
                System.out.println("Unexpected or Invalid Filter, Try using `UNREAD`, `READING`, `COMPLETED`");
            }
        }

    }
}
