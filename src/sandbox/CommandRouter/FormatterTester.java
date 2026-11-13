package sandbox.CommandRouter;

import java.util.ArrayList;

public class FormatterTester {
    public static void main(String[] args) {
        ArrayList<Book> bookShelf = new ArrayList<Book>();

        Book theFountainHead = new Book("The Fountainhead", "Ayn Rand", 704, Status.UNREAD);
        Book atomicHabit = new Book("Atomic Habit", "James Clear", 306, Status.COMPLETED);
        Book panchatantra = new Book("पंचतंत्र आणि लीडरशीप", " Luis S.R. Vas and Anita S.R. Vas", 200, Status.COMPLETED);
        Book krishnaAndSudama = new Book("अभिज्ञान", "Narendra Kohli", 163, Status.COMPLETED);

        bookShelf.add(theFountainHead);
        bookShelf.add(atomicHabit);
        bookShelf.add(panchatantra);
        bookShelf.add(krishnaAndSudama);

        for (int iterator = 0; iterator < bookShelf.size(); iterator++) {
            if (bookShelf.get(iterator).getStatus() == Status.COMPLETED) {
                System.out.printf("%25s | %20s | %6d | %10s%n", bookShelf.get(iterator).getTitle(), bookShelf.get(iterator).getAuthor(), bookShelf.get(iterator).getPages(), bookShelf.get(iterator).getStatus());
            }
        }
    }
}
