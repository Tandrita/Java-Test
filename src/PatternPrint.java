import java.util.Scanner;

public class PatternPrint {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();

            System.out.println("\nPattern:\n");

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

