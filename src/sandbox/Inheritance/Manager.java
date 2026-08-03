package sandbox.Inheritance;

import java.io.FileWriter;
import java.io.IOException;
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

    public void syncDatabase(Map<Integer, Employee> employeeMap) {
        try {
            FileWriter writer = new FileWriter("Employees.txt");
            for (int ID : employeeMap.keySet()) {
                writer.write(ID + "," + employeeMap.get(ID).getEmployeeName() + "," + employeeMap.get(ID).getEmployeeSalary() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("🚫 Kuch toh gadbad hain, Data Sync nahi ho rela");
        }
    }

    public void exportToJSON(Map<Integer, Employee> employeeMap) {
        try {
            FileWriter writer = new FileWriter("database.json");
            for (int ID : employeeMap.keySet()) {
                writer.write("{\n" + "\"id\" : " + ID + ",\n" +
                        "\"name\" : " + "\"" + employeeMap.get(ID).getEmployeeName() + "\"" + ",\n" +
                        "\"salary\" : " + "\"" + employeeMap.get(ID).getEmployeeSalary() + "\"" + ",\n} \n");
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}