public class Task3_SentenceSplitter {
    public static void main(String[] args) {
        String sentence = "Accept sentence split into words using Java";

        
        String[] words = sentence.split(" ");

        
        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
 }
}
}