package Classmate.model;

import java.util.ArrayList;

public class Semester {
    //Attributes
    private int semesterNumber;
    private ArrayList<Course> enrolledCourses = new ArrayList<>();

    //Constructor
    public Semester(int number) {
        semesterNumber = number;
    }

    //Course Method
    public void addCourse(Course newCourse) {
        this.enrolledCourses.add(newCourse);
    }
}
