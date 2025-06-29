import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main_Task_EnrollmentSystem {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        HashMap<String, ArrayList<String>> enrollmentMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Course Enrollment System ---");
            System.out.println("1. Add Student and Courses");
            System.out.println("2. Remove Student");
            System.out.println("3. Display All Students and Courses");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    studentList.add(name);

                    ArrayList<String> courses = new ArrayList<>();
                    System.out.print("Enter number of courses to enroll: ");
                    int count = scanner.nextInt();
                    scanner.nextLine(); 

                    for (int i = 1; i <= count; i++) {
                        System.out.print("Enter course " + i + ": ");
                        String course = scanner.nextLine();
                        courses.add(course);
                    }

                    enrollmentMap.put(name, courses);
                    System.out.println("Student and courses added successfully.");
                    break;

                case 2:
                    System.out.print("Enter student name to remove: ");
                    String removeName = scanner.nextLine();
                    if (studentList.remove(removeName)) {
                        enrollmentMap.remove(removeName);
                        System.out.println("Student removed.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Enrolled Students and Their Courses ---");
                    Iterator<String> iterator = studentList.iterator();
                    while (iterator.hasNext()) {
                        String student = iterator.next();
                        System.out.println("Student: " + student);
                        ArrayList<String> enrolledCourses = enrollmentMap.get(student);
                        for (String c : enrolledCourses) {
                            System.out.println("  - " + c);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting system.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
