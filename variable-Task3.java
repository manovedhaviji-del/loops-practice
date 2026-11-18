public class Main {
    public static void main(String[] args) {
        // Task requirements based on image
        double dVal = 9.75;
        int convertedInt = (int) dVal; // Narrowing casting
        
        System.out.println("Original double: " + dVal);
        System.out.println("Converted int: " + convertedInt);
        
        int smallInt = 42;
        long widenedLong = smallInt; // Widening casting
        double widenedDouble = smallInt; // Widening casting
        
        System.out.println("Original int: " + smallInt);
        System.out.println("Widened to long: " + widenedLong);
        System.out.println("Widened to double: " + widenedDouble);
    }
}
