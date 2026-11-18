import java.util.Scanner;

public class Main {
    static long factorial(int n) {
        if (n <= 1) {
            return 1;               // base case
        }
        return n * factorial(n - 1); // recursive case
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }
}
