package sandbox.FileWriting;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Diary {
    static Scanner ask = new Scanner(System.in);

    public static void main(String[] Args) {
        System.out.print("What's your name ? ");
        String myName = ask.nextLine();
        System.out.print("What's your daily log entry ? ");
        String logEntry = ask.nextLine();

        try {
            FileWriter writer = new FileWriter("Daily Log.txt", true); // Creates and Writes in a file
            File diary = new File("Daily Log.txt"); // For accessing the file by Scanner
            Scanner reader = new Scanner(diary); // Reads the File Contents

            writer.write("Name: " + myName + "\n" + "Entry: " + logEntry + "\n================================================================================\n");
            writer.close();
            System.out.println("✅ Entry has been saved successfully ");

            System.out.println("📜 📝 Previous Entries: ");
            while (reader.hasNextLine()) {
                String currentLine = reader.nextLine();
                System.out.println(currentLine);
            }
            reader.close();

        } catch (IOException io) {
            System.out.println("📎📃 File ke saath kuch gadbad hai !!");
        }
    }
}
