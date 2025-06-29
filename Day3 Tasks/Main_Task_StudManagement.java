import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private int[] marks = new int[3];
    private int total;
    private double average;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void assignMarks(int mark1, int mark2, int mark3) {
        marks[0] = mark1;
        marks[1] = mark2;
        marks[2] = mark3;
        total = mark1 + mark2 + mark3;
        average = total / 3.0;
    }

    public void displayResult() {
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        if (average >= 50) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();

            System.out.print("Enter marks for 3 subjects: ");
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();
            sc.nextLine();

            students[i] = new Student(name, roll);
            students[i].assignMarks(m1, m2, m3);
        }

        for (int i = 0; i < n; i++) {
            students[i].displayResult();
        }

        sc.close();
    }
}
