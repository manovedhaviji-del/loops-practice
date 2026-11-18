import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        System.out.print("Fibonacci series up to " + n + " terms:");
        
        long a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a);
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
