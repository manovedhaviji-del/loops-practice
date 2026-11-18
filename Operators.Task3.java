import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int a = sc.nextInt();
        
        if (!sc.hasNextInt()) return;
        int b = sc.nextInt();
        
        System.out.println("Bitwise AND (&): " + (a & b));
        System.out.println("Bitwise OR (|): " + (a | b));
        System.out.println("Bitwise XOR (^): " + (a ^ b));
        System.out.println("Bitwise NOT (~a): " + (~a));
        System.out.println("Left Shift (<<): " + (a << 1));
        System.out.println("Right Shift (>>): " + (a >> 1));
    }
}
