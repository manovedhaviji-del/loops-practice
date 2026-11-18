import java.util.Scanner;

class BankAccount {
    private double balance;

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Invalid balance! Cannot set negative value.");
        } else {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextDouble()) return;
        double initial = sc.nextDouble();
        
        if (!sc.hasNextDouble()) return;
        double invalid = sc.nextDouble();
        
        BankAccount account = new BankAccount();
        account.setBalance(initial);
        System.out.println("Initial Balance: " + account.getBalance());
        
        account.setBalance(invalid);
        System.out.println("Balance remains: " + account.getBalance());
    }
}
