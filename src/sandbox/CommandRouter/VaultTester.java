package sandbox.CommandRouter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class VaultTester {
    public static void main(String[] Args) {
        Book newBook = new Book("Dune", "Frank Herbert", 412, Status.UNREAD);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("tsundoku_library.txt", true))) {
            bufferedWriter.write(newBook.toDataString());
            bufferedWriter.newLine();
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }
}
