import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNext()) return;
        String str = sc.next();
        
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        
        if (str.length() >= 3) {
            System.out.println("Substring (First 3): " + str.substring(0, 3));
        } else {
            System.out.println("Substring (First 3): " + str);
        }
        
        System.out.println("Contains 'a': " + str.contains("a"));
    }
}
