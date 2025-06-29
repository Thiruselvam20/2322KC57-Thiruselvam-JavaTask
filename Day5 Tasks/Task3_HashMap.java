import java.util.HashMap;
import java.util.Scanner;

public class Task3_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMarks = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter name of student " + i + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter marks for " + name + ": ");
            int marks = scanner.nextInt();
            scanner.nextLine(); 

            studentMarks.put(name, marks);
        }

        System.out.println("\nStudent Marks:");
        int total = 0;
        for (String name : studentMarks.keySet()) {
            int mark = studentMarks.get(name);
            System.out.println(name + " → " + mark);
            total += mark;
        }

        double average = (n > 0) ? (double) total / n : 0;
        System.out.printf("\nAverage Marks: %.2f\n", average);

        scanner.close();
    }
}
