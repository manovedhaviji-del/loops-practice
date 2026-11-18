import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNext()) return;
        String str1 = sc.next();
        
        if (!sc.hasNext()) return;
        String str2 = sc.next();
        
        System.out.println("Original String: " + str1);
        String concatenated = str1 + str2;
        System.out.println("After Concatenation: " + concatenated);
        System.out.println("Note: Strings are immutable — concatenation creates a new String object instead of modifying the original.");
    }
}
