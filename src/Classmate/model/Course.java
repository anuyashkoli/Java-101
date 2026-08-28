package Classmate.model;

public class Course {
    String courseCode;
    String courseName;
    int credits;
    enum courseType {
        Core, DeptElective, InstElective, Lab, MajorProject
    }
}