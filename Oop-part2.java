import java.util.Scanner;

class Shape {
    public void area() {
        System.out.println("Area not defined");
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        double result = Math.PI * radius * radius;
        System.out.printf("Area of Circle: %.2f\n", result);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextDouble()) return;
        double radius = sc.nextDouble();

        Shape circle = new Circle(radius);
        circle.area();
    }
}
