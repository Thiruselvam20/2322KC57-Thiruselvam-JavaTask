import java.util.Scanner;

public class Post_Assement_StudentGrade {
    public static void printGrade(int marks) {
        if (marks >= 90 && marks <= 100) {
            System.out.println("O");
        } else if (marks >= 80) {
            System.out.println("A");
        } else if (marks >= 70) {
            System.out.println("B");
        } else if (marks >= 60) {
            System.out.println("C");
        } else if (marks >= 50) {
            System.out.println(" D");
        } else if (marks >= 0) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid marks entered.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's marks : ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks.");
        } else {
            printGrade(marks);  
        }
    }
}