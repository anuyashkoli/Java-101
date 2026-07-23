package sandbox.Products.TerminalShop;

import sandbox.Inheritance.Cashier;
import sandbox.Inheritance.Employee;
import sandbox.Inheritance.Manager;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdminPanel {
    static Scanner ask = new Scanner(System.in);
    static boolean isLoggedIn = false;
    static boolean isTrying = true;
    static String pin = "1010";

    public static void main(String[] Args) {
        Map<Integer, Employee> employeeMap = new HashMap<>();

        // Preloading Employees
        Employee unemployedMe = new Employee(1, "Anuyash", 1000);
        Cashier cashier = new Cashier(2, "Ambani", 1);
        Manager manager = new Manager(3, "Modi", 1);
        employeeMap.put(unemployedMe.getEmployeeID(), unemployedMe);
        employeeMap.put(cashier.getEmployeeID(), cashier);
        employeeMap.put(manager.getEmployeeID(), manager);

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
                    int userOption = ask.nextInt();

                    switch (userOption) {
                        case 1:
                            System.out.println("--------- Employee List ----------");
                            for (int ID : employeeMap.keySet()) {

                                System.out.println("Employee Detail - " + employeeMap.get(ID).getClass());

                                System.out.println("Employee ID: " + ID);
                                System.out.println("Employee Name: " + employeeMap.get(ID).getEmployeeName());
                                System.out.println("Employee Salary: " + employeeMap.get(ID).getEmployeeSalary());
                                System.out.println("---------x----------");
                            }
                            break;

                        case 2:
                            System.out.println("Enter Candidate Details:");

                            System.out.println("ID: ");
                            int candidateID = ask.nextInt();
                            ask.nextLine();
                            System.out.println("Name: ");
                            String candidateName = ask.nextLine();
                            System.out.println("Salary: ");
                            int candidateSalary = ask.nextInt();

                            System.out.println("[New Employee]");
                            System.out.println("ID: " + candidateID);
                            System.out.println("Candidate Name: " + candidateName);
                            System.out.println("Candidate Salary: " + candidateSalary);

                            Employee newCandidate = new Employee(candidateID, candidateName, candidateSalary);
                            employeeMap.put(candidateID, newCandidate);
                            System.out.println("Welcome to the Team");
                            break;

                        case 3:
                            System.out.println("Sorry to do this");

                            System.out.println("Enter Employee ID:");
                            int userInputID = ask.nextInt();
                            System.out.println(employeeMap.get(userInputID).getEmployeeName() + " has been fired");
                            employeeMap.remove(userInputID);
                            break;

                        case 4:
                            System.out.println("Closing...........");
                            isLoggedIn = false;
                            isTrying = false;
                            break;

                        default:
                            System.out.println("Try Again");
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
