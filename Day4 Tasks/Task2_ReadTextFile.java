import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2_ReadTextFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name (with path if needed): ");
        String fileName = sc.nextLine();

        try {
            File file = new File(fileName);
            Scanner reader = new Scanner(file);

            System.out.println("\nFile Content:");
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please check the file name or path.");
        }

        sc.close();
    }
}
