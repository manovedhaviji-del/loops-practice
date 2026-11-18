public class Main {
    int intVar;
    double doubleVar;
    char charVar;
    boolean boolVar;
    byte byteVar;
    short shortVar;
    long longVar;
    float floatVar;

    public static void main(String[] args) {
        Main obj = new Main();
        
        System.out.println("Default int: " + obj.intVar);
        System.out.println("Default double: " + obj.doubleVar);
        System.out.println("Default char: " + obj.charVar);
        System.out.println("Default boolean: " + obj.boolVar);
        System.out.println("Default byte: " + obj.byteVar);
        System.out.println("Default short: " + obj.shortVar);
        System.out.println("Default long: " + obj.longVar);
        System.out.println("Default float: " + obj.floatVar);
    }
}
