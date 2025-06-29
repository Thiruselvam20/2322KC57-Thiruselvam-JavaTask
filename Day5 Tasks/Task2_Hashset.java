import java.util.HashSet;

public class Task2_Hashset {
    public static void main(String[] args) {
        HashSet<String> emailSet = new HashSet<>();

        emailSet.add("Thiru@example.com");
        emailSet.add("Hari@example.com");
        emailSet.add("Thiru@example.com"); 
        emailSet.add("Shivi@example.com");

        System.out.println("Unique Email Addresses:");
        for (String email : emailSet) {
            System.out.println(email);
        }
    }
}
