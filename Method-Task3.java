import java.util.Scanner;

public class Main {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        double x = sc.nextDouble(), y = sc.nextDouble();
        int p = sc.nextInt(), q = sc.nextInt(), r = sc.nextInt();

        System.out.println("add(int, int) = " + add(a, b));
        System.out.println("add(double, double) = " + add(x, y));
        System.out.println("add(int, int, int) = " + add(p, q, r));
    }
}
