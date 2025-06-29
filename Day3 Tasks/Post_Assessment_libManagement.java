import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    boolean isIssued;

    public Book(String title) {
        this.title = title;
        this.isIssued = false;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(String title) {
        books.add(new Book(title));
        System.out.println("Book added: " + title);
    }

    public void removeBook(String title) {
        boolean removed = false;
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                books.remove(book);
                System.out.println("Book removed: " + title);
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Book not found.");
        }
    }

    public void issueBook(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                if (!book.isIssued) {
                    book.isIssued = true;
                    System.out.println("Book issued: " + title);
                } else {
                    System.out.println("Book already issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library.");
            return;
        }
        System.out.println("\nBooks in Library:");
        for (Book book : books) {
            System.out.println(book.title + " - " + (book.isIssued ? "Issued" : "Available"));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\nLibrary Menu");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Show Books");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter book title to add: ");
                String title = sc.nextLine();
                library.addBook(title);
            } else if (choice == 2) {
                System.out.print("Enter book title to remove: ");
                String title = sc.nextLine();
                library.removeBook(title);
            } else if (choice == 3) {
                System.out.print("Enter book title to issue: ");
                String title = sc.nextLine();
                library.issueBook(title);
            } else if (choice == 4) {
                library.showBooks();
            } else if (choice == 5) {
                System.out.println("Exiting Library System.");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
