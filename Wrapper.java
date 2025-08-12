

public class Wrapper {

    public static void main(String[] args) {
        
        // Wrapper classes in Java are used to convert primitive data types into objects.
        // This is useful when you need to use primitives in collections or when you need to pass them as objects.

        int primitiveInt = 10;
        Integer wrappedInt = Integer.valueOf(primitiveInt); // Boxing
        int unwrappedInt = wrappedInt.intValue(); // Unboxing

        double primitiveDouble = 20.5;
        Double wrappedDouble = Double.valueOf(primitiveDouble); // Boxing
        double unwrappedDouble = wrappedDouble.doubleValue(); // Unboxing

        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Unwrapped Integer: " + unwrappedInt);
        System.out.println("Wrapped Double: " + wrappedDouble);
        System.out.println("Unwrapped Double: " + unwrappedDouble);


        // Auto- boxing
        Integer obj = 100;

         Integer obj2 = Integer.valueOf(100);// 

    }
    
}
