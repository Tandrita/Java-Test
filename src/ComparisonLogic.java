public class ComparisonLogic {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Comparison Operators
        System.out.println("Comparison Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a >= b: " + (a >= b));

        // Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        System.out.println("!(x && y): " + (!(x && y)));

        // Combined example
        System.out.println("\nCombined Logical and Comparison:");
        boolean result = (a < b) && (x == true);
        System.out.println("(a < b) && (x == true): " + result);
    }
}
