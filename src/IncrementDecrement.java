public class IncrementDecrement {

    public static void main(String[] args) {

        int original = 5;
        System.out.println("Original: " + original);

        int preIncrement = ++original; // 6
        System.out.println("Pre-increment: " + preIncrement);

        original = 5;
        int postIncrement = original++;
        System.out.println("Post-increment: " + original + " (returned " + postIncrement + ")");

        original = 5;
        int preDecrement = --original;
        System.out.println("Pre-decrement: " + preDecrement);

        original = 5;
        int postDecrement = original--;
        System.out.println("Post-decrement: " + original + " (returned " + postDecrement + ")");
    }
}

