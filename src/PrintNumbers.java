import java.util.Scanner;

public class PrintNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value for N: ");
        int N = scanner.nextInt();

        System.out.print("Numbers from 1 to " + N + ": ");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
    }
}
