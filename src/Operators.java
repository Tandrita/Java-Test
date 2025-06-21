
    public class Operators {

        public static void main(String[] args) {

            int a = 20;
            int b = 6;

            System.out.println("Arithmetic Operators:");
            System.out.println("a + b = " + (a + b));  // Addition
            System.out.println("a - b = " + (a - b));  // Subtraction
            System.out.println("a * b = " + (a * b));  // Multiplication
            System.out.println("a / b = " + (a / b));  // Division
            System.out.println("a % b = " + (a % b));  // Modulus

            // Assignment Operators
            System.out.println("\nAssignment Operators:");

            int x = 10;
            System.out.println("Initial x = " + x);

            x += 5;
            System.out.println("x += 5 → " + x);

            x -= 3;
            System.out.println("x -= 3 → " + x);

            x *= 2;
            System.out.println("x *= 2 → " + x);

            x /= 4;
            System.out.println("x /= 4 → " + x);
        }
    }
