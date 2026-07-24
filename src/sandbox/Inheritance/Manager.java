package sandbox.Inheritance;

import java.util.Map;
import java.util.Scanner;

public class Manager extends Employee {

    static Scanner ask = new Scanner(System.in);

    // Constructor
    public Manager(int ID, String name, int Salary) {
        super(ID, name, Salary);
    }

    //Hiring Candidate
    public void hireCandidate(Map<Integer, Employee> employeeMap, int candidateID, String candidateName, int candidateSalary) {
        Employee newCandidate = new Employee(candidateID, candidateName, candidateSalary);
        employeeMap.put(candidateID, newCandidate);
    }

    // Firing Employees
    public void fireEmployee(Map<Integer, Employee> employeeMap, int employeeID) {
        System.out.println("Employee has been fired: " + employeeMap.get(employeeID).getEmployeeName());
        employeeMap.remove(employeeID);
    }
}