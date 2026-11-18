import java.util.Scanner;

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    String course;

    public Student(String name, String course) {
        super(name); // Calling parent constructor
        this.course = course;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextLine()) return;
        String name = sc.nextLine();
        
        if (!sc.hasNextLine()) return;
        String course = sc.nextLine();

        Student student = new Student(name, course);
        student.display();
    }
}
