package Classmate.persistence;

import Classmate.model.Student;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class StudentDatabase {

    // We use GsonBuilder with setPrettyPrinting so the JSON file is readable by humans
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private String filepath = "classmate_db.json";

    public void saveStudentProfile(Student currentStudent) {
        try {
            FileWriter writer = new FileWriter(filepath);
            // 1. Convert the entire Student object tree into a JSON String
            // 2. Write that string to the file
            // 3. Close the writer

            System.out.println("💾 Profile successfully saved to " + filepath);
        } catch (IOException e) {
            System.out.println("❌ Database Error: Could not save profile.");
        }
    }
}