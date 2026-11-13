package sandbox.CommandRouter;

import java.io.*;

public class VaultTester {
    public static void main(String[] Args) {
        Book newBook = new Book("Dune", "Frank Herbert", 412, Status.UNREAD);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("tsundoku_library.txt"))) {
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
               // Split
                String[] choppedString = currentLine.split("\\|");
                //Reconstruction
                String title = choppedString[0];
                String author = choppedString[1];
                int pages = Integer.parseInt(choppedString[2]);
                Status bookStatus = Status.valueOf(choppedString[3]);
                Book brandNewBook = new Book(title, author, pages, bookStatus);
                System.out.printf("%-20s | %-15s | %-5d%n", title, author, pages);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("tsundoku_library.txt", true))) {
            // bufferedWriter.write(newBook.toDataString());
            // bufferedWriter.newLine();
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }
}
