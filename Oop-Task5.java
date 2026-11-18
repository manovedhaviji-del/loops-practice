import java.util.Scanner;

class Employee {
    public String name;
    private double salary;
    protected String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextLine()) return;
        String name = sc.nextLine();
        
        if (!sc.hasNextDouble()) return;
        double salary = sc.nextDouble();
        sc.nextLine(); // consume newline
        
        if (!sc.hasNextLine()) return;
        String department = sc.nextLine();
        
        Employee emp = new Employee(name, salary, department);
        emp.displayDetails();
    }
}
