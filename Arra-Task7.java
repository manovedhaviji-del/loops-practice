import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNext()) return;
        String str = sc.next();
        
        // கேஸ் (Case) பொருட்படுத்தாமல் இருக்க lowercase-க்கு மாற்றுகிறோம்
        String original = str;
        String reversed = new StringBuilder(str).reverse().toString();
        
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
