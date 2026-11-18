import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int a = sc.nextInt();
        
        if (!sc.hasNextInt()) return;
        int b = sc.nextInt();
        
        System.out.println(a + " > " + b + ": " + (a > b));
        System.out.println(a + " < " + b + ": " + (a < b));
        System.out.println(a + " >= " + b + ": " + (a >= b));
        System.out.println(a + " <= " + b + ": " + (a <= b));
        System.out.println(a + " == " + b + ": " + (a == b));
        System.out.println(a + " != " + b + ": " + (a != b));
        
        boolean andCheck = (a >= 10 && a <= 50);
        System.out.println("Is " + a + " between 10 and 50 (AND check): " + andCheck);
        
        boolean orCheck = (b < 10 || b > 30);
        System.out.println("Is " + b + " less than 10 OR greater than 30 (OR check): " + orCheck);
    }
}
