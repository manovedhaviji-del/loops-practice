import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Square");
            System.out.println("2. Cube");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter a number: ");
                int n = sc.nextInt();
                System.out.println("Square: " + (n * n));

            } else if (choice == 2) {
                System.out.print("Enter a number: ");
                int n = sc.nextInt();
                System.out.println("Cube: " + (n * n * n));

                } else if (choice == 3) {
                System.out.println("Exiting program...");

            } else {
                System.out.println("Invalid choice");
            }

        } while (choice != 3);

        sc.close();
    }
}
