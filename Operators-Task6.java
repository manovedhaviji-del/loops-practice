import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNext()) return;
        String username = sc.next();
        
        if (!sc.hasNext()) return;
        String password = sc.next();
        
        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }
}
