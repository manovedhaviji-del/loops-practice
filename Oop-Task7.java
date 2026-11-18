import java.util.Scanner;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[3];

        for (int i = 0; i < 3; i++) {
            if (!sc.hasNext()) break;
            String name = sc.next();
            if (!sc.hasNextDouble()) break;
            double price = sc.nextDouble();
            products[i] = new Product(name, price);
        }

        for (int i = 0; i < 3; i++) {
            if (products[i] != null) {
                System.out.println("Product: " + products[i].name + ", Price: " + products[i].price);
            }
        }
    }
}
