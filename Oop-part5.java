abstract class Vehicle {
    abstract void startEngine();
    
    void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

class Bike extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Bike engine started with a kick!");
    }
}

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.startEngine();
        bike.stopEngine();
    }
}
