package Classmate.app;

import Classmate.model.Student;

public class Main {
    public static void main(String[] Args) {
        Student Anuyash = new Student("Anuyash", 27, 7);
        System.out.println(Anuyash.getStudentCurrentSemester());
    }
}
