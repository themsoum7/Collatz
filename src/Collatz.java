import java.util.*;

public class Collatz {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Collatz Hypothesis:");
        System.out.print("Enter a number: ");
        int num = console.nextInt();
        System.out.println(solve(num) + " steps to reach 1");
    }

    public static int solve(int n) {
        if (n == 1) {
            return 0;
        } else if (n % 2 == 0) {
            System.out.println(n);
            return 1 + solve(n / 2);
        } else {
            System.out.println(n);
            return 1 + solve(n * 3 + 1);
        }
    }
}