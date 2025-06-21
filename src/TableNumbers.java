import java.util.Scanner;

public class TableNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to print its table number: ");
        int number = scanner.nextInt();

        // Print table from 1 to 10
        System.out.println("\nTable Numbers for " + number + ":\n");

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

