import java.util.Scanner;

public class Post_Assessment_MiniAddressBook{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int SIZE = 5; 
        String[] names = new String[SIZE];
        String[] phones = new String[SIZE];
        String[] emails = new String[SIZE];
        String[] addresses = new String[SIZE];
        int count = 0; 

        boolean running = true;

        while (running) {
            
            System.out.println("\n--- Mini Address Book ---");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine(); 
                continue;
            }

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    if (count < SIZE) {
                        System.out.print("Enter Name: ");
                        names[count] = sc.nextLine();

                        System.out.print("Enter Phone: ");
                        phones[count] = sc.nextLine();

                        System.out.print("Enter Email: ");
                        emails[count] = sc.nextLine();

                        System.out.print("Enter Address: ");
                        addresses[count] = sc.nextLine();

                        count++;
                        System.out.println("Contact added successfully!");
                    } else {
                        System.out.println("Address book is full. Cannot add more contacts.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No contacts to display.");
                    } else {
                        System.out.println("\n--- Contact List ---");
                        for (int i = 0; i < count; i++) {
                            System.out.println("\nContact " + (i + 1));
                            System.out.println("Name   : " + names[i]);
                            System.out.println("Phone  : " + phones[i]);
                            System.out.println("Email  : " + emails[i]);
                            System.out.println("Address: " + addresses[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting Address Book. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1, 2 or 3.");
            }
        }

        sc.close();
    }
}