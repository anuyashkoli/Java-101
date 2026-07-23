package sandbox.Inheritance;

import sandbox.Products.TerminalShop.AdminPanel;

import java.util.Scanner;

import static sandbox.Products.TerminalShop.AdminPanel.*;

public class Manager extends Employee {

    static Scanner ask = new Scanner(System.in);

    // Constructor
    public Manager(int ID, String name, int Salary) {
        super(ID, name, Salary);
    }

    // Firing Employees
    public void fireEmployee() {
        System.out.println("Sorry to do this");

        System.out.println("Enter Employee ID:");
        int userInputID = ask.nextInt();
        System.out.println(employeeMap.get(userInputID).getEmployeeName() + " has been fired");
        employeeMap.remove(userInputID);
    }
}