import java.util.Scanner;

class Car {
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextLine()) return;
        String model = sc.nextLine();
        
        if (!sc.hasNextInt()) return;
        int year = sc.nextInt();
        
        Car car = new Car(model, year);
        
        System.out.println("Car Model: " + car.model);
        System.out.println("Year: " + car.year);
    }
}
