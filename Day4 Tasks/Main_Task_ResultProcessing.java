import java.io.*;
import java.util.Scanner;

public class Main_Task_ResultProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input file name (e.g., marks.txt): ");
        String inputFile = sc.nextLine();

        System.out.print("Enter output file name (e.g., result.txt): ");
        String outputFile = sc.nextLine();

        try {
            File input = new File(inputFile);
            Scanner reader = new Scanner(input);
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(",");

                if (parts.length != 4) continue;

                String name = parts[0].trim();
                int m1 = Integer.parseInt(parts[1].trim());
                int m2 = Integer.parseInt(parts[2].trim());
                int m3 = Integer.parseInt(parts[3].trim());

                int total = m1 + m2 + m3;
                double avg = total / 3.0;
                String result = avg >= 50 ? "Pass" : "Fail";

                String outputLine = name + " - Total: " + total + ", Average: " + avg + ", Result: " + result;
                writer.write(outputLine);
                writer.newLine();
            }

            reader.close();
            writer.close();
            System.out.println("Result written to " + outputFile);

        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found.");
        } catch (IOException e) {
            System.out.println("Error writing to output file.");
        }

        sc.close();
    }
}
