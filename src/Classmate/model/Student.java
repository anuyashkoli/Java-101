package Classmate.model;

import java.util.ArrayList;

public class Student {
    //Attributes
    private String studentName;
    private int studentRollNumber;
    private int studentCurrentSemester;
    private ArrayList<Semester> academicHistory = new ArrayList<>();

    //Constructor
    public Student(String name, int rollNumber, int currentSemester) {
        studentName = name;
        studentRollNumber = rollNumber;
        studentCurrentSemester = currentSemester;
    }

    //Operations

    public boolean enrollInCourse(String courseCode) {
        return false;
    }

    public double calculateCumulativeGPA() {
        return 10.0; // Temporary
    }

    public void getSemesterRecord(int semesterID) {
        System.out.println(academicHistory.get(semesterID));
    }

    // Getter & Setter
    public String getStudentName() {
        return studentName;
    }

    public int getStudentRollNumber() {
        return studentRollNumber;
    }

    public int getStudentCurrentSemester() {
        return studentCurrentSemester;
    }
}
