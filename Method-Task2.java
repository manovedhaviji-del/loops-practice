import java.util.Scanner;

public class Main {
    static double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        System.out.println("Area of rectangle: " + calculateArea(length, width));
    }
}
