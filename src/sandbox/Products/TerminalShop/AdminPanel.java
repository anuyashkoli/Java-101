package sandbox.Products.TerminalShop;

import com.google.gson.Gson;
import sandbox.Inheritance.Employee;
import sandbox.Inheritance.Manager;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;

public class AdminPanel {
    static Scanner ask = new Scanner(System.in);
    static boolean isLoggedIn = false;
    static boolean isTrying = true;
    static String pin = "1010";

    public static class Joke {
        String setup;
        String punchline;
    }

    public static class NetworkClient {
        public static void printDailyJoke() {
            try {
                // 1. Open a browser window (HttpClient)
                HttpClient client = HttpClient.newHttpClient();

                // 2. Type in the URL (HttpRequest)
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("https://official-joke-api.appspot.com/random_joke"))
                        .build();

                // 3. Press Enter and catch the JSON text that comes back (HttpResponse)
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                // GSON
                System.out.println("Daily Dose of Joke");
                String rawJson = response.body();

                Gson gson = new Gson();
                Joke dailyJoke = gson.fromJson(rawJson, Joke.class);

                System.out.println("Setup: " + dailyJoke.setup);
                System.out.println("Punchline: " + dailyJoke.punchline + "\n");

            } catch (IOException | InterruptedException e) {
                System.out.println("❌ Internet Connection Failed");
            }
        }
    }

    public static void main(String[] Args) {

        Map<Integer, Employee> employeeMap = new HashMap<>();

        Manager manager = new Manager(1, "Mr. Manager", 10000);
        employeeMap.put(manager.getEmployeeID(), manager);

        ArrayList<Payable> theUnifiedLedger = new ArrayList<>();

        UtilityBill IntelliJ = new UtilityBill("JetBrains", 10);
        UtilityBill Gemini = new UtilityBill("Google", 19560);

        theUnifiedLedger.add(IntelliJ);
        theUnifiedLedger.add(Gemini);
        theUnifiedLedger.add(manager);

        for (Payable item : theUnifiedLedger) {
            item.processPayment();
        }

        // `newGuy` - Employee Object Creating Block
        try {
            File allEmployees = new File("database.json");
            Scanner reader = new Scanner(allEmployees);
            if (!reader.hasNextLine()) {
                System.out.println("No Employee Detail Exists");
            } else {
                int currentID = 0;
                String currentName = "";
                int currentSalary = 0;
                System.out.println("===============================");
                while (reader.hasNextLine()) {
                    String currentLine = reader.nextLine();
                    if (currentLine.contains("\"id\"")) {
                        currentLine = currentLine.replace("\"id\"", "");
                        currentLine = currentLine.replace(":", "");
                        currentLine = currentLine.replace(",", "");
                        currentLine = currentLine.trim();
                        currentID = Integer.parseInt(currentLine);
                    } else if (currentLine.contains("\"name\"")) {
                        currentLine = currentLine.replace("\"name\"", "");
                        currentLine = currentLine.replace(":", "");
                        currentLine = currentLine.replace(",", "");
                        currentLine = currentLine.replace("\"", "");
                        currentLine = currentLine.trim();
                        currentName = currentLine;
                    } else if (currentLine.contains("\"salary\"")) {
                        currentLine = currentLine.replace("\"salary\"", "");
                        currentLine = currentLine.replace(":", "");
                        currentLine = currentLine.replace(",", "");
                        currentLine = currentLine.replace("\"", "");
                        currentLine = currentLine.trim();
                        currentSalary = Integer.parseInt(currentLine);
                    } else if (currentLine.contains("}")) {
                        Employee newGuy = new Employee(currentID, currentName, currentSalary);
                        employeeMap.put(currentID, newGuy);
                    }
                }
            }
            reader.close();

        } catch (IOException io) {
            System.out.println("😵‍💫 Padhne main takleef ho rahi hai");
        }

        NetworkClient.printDailyJoke();
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
                                manager.exportToJSON(employeeMap);
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
