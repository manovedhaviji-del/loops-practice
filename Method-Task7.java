import java.util.Scanner;

public class Main {
    static double add(double a, double b)      { return a + b; }
    static double subtract(double a, double b) { return a - b; }
    static double multiply(double a, double b) { return a * b; }
    static double divide(double a, double b)   { return a / b; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char op = sc.next().charAt(0);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double result;
        switch (op) {
            case '+': result = add(a, b); break;
            case '-': result = subtract(a, b); break;
            case '*': result = multiply(a, b); break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Cannot divide by zero");
                    return;
                }
                result = divide(a, b);
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println("Result: " + result);
    }
}
