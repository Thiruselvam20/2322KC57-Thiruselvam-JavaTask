import java.util.Scanner;

public class Main_Task_StringAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        
        int charCount = input.length();

       
        String[] words = input.trim().split("\\s+");
        int wordCount = words.length;

        
        String reversed = new StringBuilder(input).reverse().toString();

        
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        
        System.out.println("Word Count: " + wordCount);
        System.out.println("Character Count: " + charCount);
        System.out.println("Reversed String: " + reversed);
        System.out.println("Longest Word: " + longestWord);
    }
}
