package Classmate.model;

public abstract class Course {
    private String courseCode;
    private String courseName;
    private int courseCredit;

    public enum courseType {
        Core, DeptElective, InstElective, Lab, MajorProject
    }

    private courseType type;
    private Assessment courseAssessment = new Assessment(0, 0, 0, 0, 0);


    //Constructor
    public Course(String code, String name, int credit, courseType Type) {
        courseCode = code;
        courseName = name;
        courseCredit = credit;
        type = Type;
    }

    //Operations

    public boolean isPassed() {
        return false;
    }

    public double calculateTotalMarks() {
        return 10.0; // Temporary
    }

    public int getGradePoints() {
        return 10; //Temporary
    }

    // Getter & Setter

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public courseType getCourseType() {
        return type;
    }

    public Assessment getCourseAssessment() {
        return courseAssessment;
    }

    public void setCourseAssessment(Assessment courseAssessment) {
        this.courseAssessment = courseAssessment;
    }
}