package sandbox.FileWriting;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Diary {
    static Scanner ask = new Scanner(System.in);
    static boolean isWriting = true;

    public static void main(String[] Args) {
        while (isWriting) {
            System.out.println("\nSelect from the option: ");
            System.out.println("1] Write a new Entry");
            System.out.println("2] Read All Past Entries");
            System.out.println("3] Close the Diary");
            try {
                int userOption = ask.nextInt();
                ask.nextLine();

                switch (userOption) {
                    case 1:
                        System.out.print("Name: ");
                        String myName = ask.nextLine();
                        System.out.print("Your Entry: ");
                        String logEntry = ask.nextLine();

                        try {
                            FileWriter writer = new FileWriter("Diary.txt", true);
                            writer.write("\n===============\n" + myName + "\n" + logEntry);
                            writer.close();
                        } catch (IOException io) {
                            System.out.println("❌ Couldn't Read into the file");
                        }
                        break;
                    case 2:
                        try {
                            File myDiary = new File("Diary.txt");
                            Scanner reader = new Scanner(myDiary);

                            if (!reader.hasNextLine()) {
                                System.out.println("📖 Diary is Empty");
                            } else {
                                while (reader.hasNextLine()) {
                                    String currentLine = reader.nextLine();
                                    System.out.println(currentLine);
                                }
                            }
                            reader.close();
                        } catch (IOException io) {
                            System.out.println("❌ Couldn't Read out of the file");
                        }
                        break;
                    case 3:
                        System.out.println("📕 Closing Diary");
                        isWriting = false;
                        break;
                    default:
                        System.out.println("Try Again");
                }
            } catch (InputMismatchException ime) {
                System.out.println("🚫 Invalid Input");
                ask.nextLine();
            }
        }
    }
}
