import java.util.Scanner;

public class Main {
    static String checkEvenOdd(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num + " is " + checkEvenOdd(num));
    }
}
