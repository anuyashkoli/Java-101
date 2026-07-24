package sandbox.Inheritance;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    private int employeeID;
    private String employeeName;
    private int employeeSalary;

    public Employee(int ID, String name, int salary) {
        employeeID = ID;
        employeeName = name;
        employeeSalary = salary;
    }


    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }
}