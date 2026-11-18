import java.util.Scanner;

class LibraryBook {
    String title;
    String author;
    String isbn;
    boolean isAvailable;

    public LibraryBook(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book is not available");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Book returned successfully");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextLine()) return;
        String title = sc.nextLine();
        
        if (!sc.hasNextLine()) return;
        String author = sc.nextLine();
        
        if (!sc.hasNextLine()) return;
        String isbn = sc.nextLine();
        
        LibraryBook book = new LibraryBook(title, author, isbn);
        
        System.out.println("Book: " + book.title + " by " + book.author);
        System.out.println("Available: " + book.isAvailable);
        
        book.borrowBook();
        System.out.println("Available: " + book.isAvailable);
        
        book.returnBook();
        System.out.println("Available: " + book.isAvailable);
    }
}
