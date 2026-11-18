import java.util.Scanner;

class Student {
    String name;
    int age;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNext()) return;
        String name = sc.next();
        
        if (!sc.hasNextInt()) return;
        int age = sc.nextInt();
        
        Student student = new Student();
        student.name = name;
        student.age = age;
        
        System.out.println("Student Name: " + student.name);
        System.out.println("Student Age: " + student.age);
    }
}
