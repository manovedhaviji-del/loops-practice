import java.util.Scanner;

public class Main {
    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;                         // base case
        }
        return (n % 10) + sumOfDigits(n / 10); // last digit + rest
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of digits: " + sumOfDigits(n));
    }
}
