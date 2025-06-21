public class ComparisonLogic {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // Comparison Operators
        System.out.println("Comparison Operators:");
        System.out.println("a == b: " + (a == b));       // false
        System.out.println("a != b: " + (a != b));       // true
        System.out.println("a < b: " + (a < b));         // true
        System.out.println("a > b: " + (a > b));         // false
        System.out.println("a <= b: " + (a <= b));       // true
        System.out.println("a >= b: " + (a >= b));       // false

        // Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));       // false (AND)
        System.out.println("x || y: " + (x || y));       // true (OR)
        System.out.println("!x: " + (!x));               // false (NOT)
        System.out.println("!(x && y): " + (!(x && y))); // true

        // Combined example
        System.out.println("\nCombined Logical and Comparison:");
        boolean result = (a < b) && (x == true);
        System.out.println("(a < b) && (x == true): " + result);  // true
    }
}
