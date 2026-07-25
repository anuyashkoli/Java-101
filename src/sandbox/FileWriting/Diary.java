package sandbox.FileWriting;

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
            FileWriter writer = new FileWriter("Daily Log.txt");
            writer.write("Name: " + myName + "\n\n" + "Entry: " + logEntry);
            writer.close();

            System.out.println("✅ Entry has been saved successfully ");

        } catch (IOException io) {
            System.out.println("📎📃 File ke saath kuch gadbad hai !!");
        }
    }
}
