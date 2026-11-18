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
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

class Rectangle extends Shape {
    double length, width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextDouble()) return;
        double radius = sc.nextDouble();
        
        if (!sc.hasNextDouble()) return;
        double length = sc.nextDouble();
        
        if (!sc.hasNextDouble()) return;
        double width = sc.nextDouble();

        Shape shape1 = new Circle(radius);
        Shape shape2 = new Rectangle(length, width);

        shape1.area();
        shape2.area();
    }
}
