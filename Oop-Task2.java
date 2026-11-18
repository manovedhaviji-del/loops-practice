import java.util.Scanner;

class Book {
    String title;
    double price;

    // Default constructor
    Book() {
        this.title = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Use nextLine to capture multi-word book title like "Java Basics"
        if (!sc.hasNextLine()) return;
        String title = sc.nextLine();
        
        if (!sc.hasNextDouble()) return;
        double price = sc.nextDouble();
        
        Book defaultBook = new Book();
        Book customBook = new Book(title, price);
        
        System.out.println("Default Book -> Title: " + defaultBook.title + ", Price: " + defaultBook.price);
        System.out.println("Custom Book -> Title: " + customBook.title + ", Price: " + customBook.price);
    }
}
