import java.util.Scanner;

public class Main {
    // Instance variable: belongs to the object, visible in every method of the class.
    int count = 0;

    void showScope() {
        // Local variable: exists only inside this method.
        // It has the same name as the instance variable, so it shadows it here.
        // Scope rule: Java always uses the nearest (innermost) declaration of a name.
        int count = 10;

        System.out.println("Local count: " + count);
        // this.count reaches the instance variable that is hidden by the local one.
        System.out.println("Instance count: " + this.count);
        System.out.println("Note: The local variable shadows the instance variable within the method scope.");
    }

    public static void main(String[] args) {
        new Main().showScope();
    }
}
