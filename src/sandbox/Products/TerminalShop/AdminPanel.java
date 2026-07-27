package sandbox.Products.TerminalShop;

import sandbox.Inheritance.Employee;
import sandbox.Inheritance.Manager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class AdminPanel {
    static Scanner ask = new Scanner(System.in);
    static boolean isLoggedIn = false;
    static boolean isTrying = true;
    static String pin = "1010";

    public static void main(String[] Args) {

        Map<Integer, Employee> employeeMap = new HashMap<>();

        Manager manager = new Manager(1, "Mr. Manager", 10000);
        employeeMap.put(manager.getEmployeeID(), manager);

        // `newGuy` - Employee Object Creating Block
        try {
            File allEmployees = new File("Employees.txt");
            Scanner reader = new Scanner(allEmployees);
            if (!reader.hasNextLine()) {
                System.out.println("No Employee Detail Exists");
            } else {
                while (reader.hasNextLine()) {
                    String currentLine = reader.nextLine();
                    String[] tokens = currentLine.split(",");
                    int ID = Integer.parseInt(tokens[0]);
                    String name = tokens[1];
                    int salary = Integer.parseInt(tokens[2]);
                    Employee newGuy = new Employee(ID, name, salary);
                    employeeMap.put(ID, newGuy);
                }
            }
            reader.close();

        } catch (IOException io) {
            System.out.println("😵‍💫 Padhne main takleef ho rahi hai");
        }

        while (isTrying) {
            System.out.println("Enter your Credentials: or 'q' for exit");
            String userPin = ask.nextLine();

            if (userPin.equalsIgnoreCase(pin)) {
                isLoggedIn = true;

                while (isLoggedIn) {
                    System.out.println("\nSelect Any One: ");
                    System.out.println("1. Show Employee Detail");
                    System.out.println("2. Hire Employee");
                    System.out.println("3. Fire Employee");
                    System.out.println("4. Exit");

                    try {
                        int userOption = ask.nextInt();

                        switch (userOption) {
                            case 1:
                                System.out.println("--------- Employee List ----------");
                                for (int employeeID : employeeMap.keySet()) {
                                    System.out.println("Employee ID: " + employeeID);
                                    System.out.println("Employee Name: " + employeeMap.get(employeeID).getEmployeeName());
                                    System.out.println("Employee Salary: " + employeeMap.get(employeeID).getEmployeeSalary());
                                    System.out.println("----------------x-----------------");
                                }
                                break;

                            case 2:
                                System.out.println("Enter Candidate Details:");
                                System.out.print("Candidate ID: ");
                                int candidateID = ask.nextInt();
                                ask.nextLine();
                                System.out.print("Candidate Name: ");
                                String candidateName = ask.nextLine();
                                System.out.print("Candidate Salary: ");
                                int candidateSalary = ask.nextInt();
                                manager.hireCandidate(employeeMap, candidateID, candidateName, candidateSalary);
                                manager.syncDatabase(employeeMap);
                                break;

                            case 3:
                                System.out.println("Enter Employee ID:");
                                int employeeID = ask.nextInt();
                                manager.fireEmployee(employeeMap, employeeID);
                                manager.syncDatabase(employeeMap);
                                break;

                            case 4:
                                System.out.println("Closing...........");
                                isLoggedIn = false;
                                isTrying = false;
                                break;

                            default:
                                System.out.println("Try Again");
                        }

                    } catch (InputMismatchException invalidInput) {
                        System.out.println("Only Numerical values are accepted");
                        ask.nextLine();
                    }
                }
            } else if (userPin.equalsIgnoreCase("q")) {
                System.out.println("Bye");
                isTrying = false;
            } else {
                System.out.println("Invalid Credentials");
            }
        }

    }
}
