import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNext()) return;
        String name = sc.next();
        
        if (!sc.hasNextInt()) return;
        int age = sc.nextInt();
        
        if (!sc.hasNextDouble()) return;
        double height = sc.nextDouble();
        
        if (!sc.hasNextBoolean()) return;
        boolean isStudent = sc.nextBoolean();
        
        System.out.println("----- Profile Card -----");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Height : " + height + " ft");
        System.out.println("Student: " + isStudent);
        System.out.println("------------------------");
    }
}
