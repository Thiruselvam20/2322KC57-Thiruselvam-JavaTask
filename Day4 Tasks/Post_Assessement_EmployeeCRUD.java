import java.io.*;
import java.util.*;

public class Post_Assessement_EmployeeCRUD {

    static final String FILE_NAME = "employees.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nEMPLOYEE RECORD SYSTEM");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                String id = sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Salary: ");
                String salary = sc.nextLine();
                addEmployee(id, name, salary);
            } else if (choice == 2) {
                viewEmployees();
            } else if (choice == 3) {
                System.out.print("Enter ID to update: ");
                String id = sc.nextLine();
                updateEmployee(id, sc);
            } else if (choice == 4) {
                System.out.print("Enter ID to delete: ");
                String id = sc.nextLine();
                deleteEmployee(id);
            } else if (choice == 5) {
                System.out.println("Exiting system.");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }

    public static void addEmployee(String id, String name, String salary) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(id + "," + name + "," + salary);
            writer.newLine();
            System.out.println("Employee added.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    public static void viewEmployees() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\n--- Employee Records ---");
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                System.out.println("ID: " + parts[0] + ", Name: " + parts[1] + ", Salary: " + parts[2]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No employee records found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }

    public static void updateEmployee(String id, Scanner sc) {
        List<String> lines = new ArrayList<>();
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(id)) {
                    found = true;
                    System.out.print("Enter new name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter new salary: ");
                    String salary = sc.nextLine();
                    lines.add(id + "," + name + "," + salary);
                } else {
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
            return;
        }

        if (!found) {
            System.out.println("Employee ID not found.");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String l : lines) {
                writer.write(l);
                writer.newLine();
            }
            System.out.println("Employee updated.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    public static void deleteEmployee(String id) {
        List<String> lines = new ArrayList<>();
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith(id + ",")) {
                    found = true;
                    continue;
                }
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
            return;
        }

        if (!found) {
            System.out.println("Employee ID not found.");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String l : lines) {
                writer.write(l);
                writer.newLine();
            }
            System.out.println("Employee deleted.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}
