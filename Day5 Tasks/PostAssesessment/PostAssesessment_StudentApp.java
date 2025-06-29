package studentIteratorProject;

import java.util.*;

public class PostAssesessment_StudentApp {
    static ArrayList<String> studentNames = new ArrayList<>();
    static HashMap<String, ArrayList<String>> studentCourses = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- Student Management Menu ---");
            System.out.println("1. Add Student and Course");
            System.out.println("2. Search Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt(); scanner.nextLine();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: searchStudent(); break;
                case 3: deleteStudent(); break;
                case 4: displayAll(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }

        } while (choice != 5);
    }

    static void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        if (studentNames.contains(name)) {
            System.out.println("Student already exists.");
            return;
        }

        studentNames.add(name);
        ArrayList<String> courses = new ArrayList<>();

        System.out.print("Enter number of courses: ");
        int count = scanner.nextInt(); scanner.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter course " + (i + 1) + ": ");
            courses.add(scanner.nextLine());
        }

        studentCourses.put(name, courses);
        System.out.println("Student and courses added.");
    }

    static void searchStudent() {
        System.out.print("Enter student name to search: ");
        String name = scanner.nextLine();

        if (studentCourses.containsKey(name)) {
            System.out.println("Courses for " + name + ":");
            for (String course : studentCourses.get(name)) {
                System.out.println("- " + course);
            }
        } else {
            System.out.println("Student not found.");
        }
    }

    static void deleteStudent() {
        System.out.print("Enter student name to delete: ");
        String name = scanner.nextLine();

        if (studentNames.remove(name)) {
            studentCourses.remove(name);
            System.out.println("Student deleted.");
        } else {
            System.out.println("Student not found.");
        }
    }

    static void displayAll() {
        if (studentNames.isEmpty()) {
            System.out.println("No students enrolled.");
            return;
        }

        System.out.println("\nStudent List:");
        for (String name : studentNames) {
            System.out.println("Name: " + name);
            System.out.println("Courses:");
            for (String course : studentCourses.get(name)) {
                System.out.println("  - " + course);
            }
        }
    }
}
